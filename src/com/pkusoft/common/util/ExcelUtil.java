package com.pkusoft.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.Test;

import com.pkusoft.admin.model.SysDicItem;

/**
 * 
 * @author 吴钦飞
 * 
 */
public class ExcelUtil {
	/**
	 * 将 beanList 填充到 Excel（xls），请执行该类的 testFillData() 方法进行测试。
	 * @param beanList
	 * @param outputStream
	 * @param header 表头，如 { "条目编号(itemCode)", "条目名称(itemValue)", "是否有效(visiable)" }
	 * @param propertyName 要填充的bean属性名，跟表头一一对应，如 { "itemCode", "itemValue", "visiable" }
	 * @return 是否成功
	 */
	public static <T> boolean fillData( List<T> beanList, OutputStream outputStream, String[] header, String[] propertyName ) {
		HSSFWorkbook wb = null;
		Sheet sheet = null;
		// String[] header = { "条目编号(itemCode)", "条目名称(itemValue)", "是否有效(visiable)" };
		// String[] propertyName = { "itemCode", "itemValue", "visiable" };
		Field[] fields = new Field[ propertyName.length ];

		try {
			Class<?> beanClass = beanList.get( 0 ).getClass();
			for ( int i = 0; i < propertyName.length; i++ ) {
				Field field = beanClass.getDeclaredField( propertyName[ i ] );
				field.setAccessible( true );
				fields[ i ] = field;
			}

			wb = new HSSFWorkbook();
			sheet = wb.createSheet( "sheet-1" );

			/************** 重置预设的颜色 **************/
			
			// 字体颜色 BLACK => #333
			resetHSSFColor( wb, HSSFColor.BLACK.index, ( byte ) 51, ( byte ) 51, ( byte ) 51 );
			
		    // 表头背景色 LIGHT_BLUE 
			resetHSSFColor( wb, HSSFColor.LIGHT_BLUE.index, (byte) 81, (byte) 130, (byte) 187 );
			
			// 奇数行背景色 LIGHT_CORNFLOWER_BLUE
			resetHSSFColor( wb, HSSFColor.LIGHT_CORNFLOWER_BLUE.index, (byte) 185, (byte) 204, (byte) 227 );
			
		    // 偶数行背景色 ROYAL_BLUE
			resetHSSFColor( wb, HSSFColor.ROYAL_BLUE.index, (byte) 220, (byte) 230, (byte) 241 );
		    
			/************** 字体 **************/
			
			// 字体 - 表头单元格
			Font headerFont = getFont( wb,  ( short ) 16, "Microsoft YaHei", HSSFColor.WHITE.index );

			// 字体 - 内容单元格
			Font contentFont = getFont( wb,  ( short ) 14, "Microsoft YaHei", HSSFColor.BLACK.index );

			/************** 样式 **************/
			
			// 样式 - 表头单元格
			CellStyle headerStyle = 
					getStyle( wb, headerFont, HSSFColor.LIGHT_BLUE.index, VerticalAlignment.CENTER, HSSFColor.WHITE.index  );
			
			// 样式 - 内容单元格（奇数行）
			CellStyle oddRowContentStyle = 
					getStyle( wb, contentFont, HSSFColor.LIGHT_CORNFLOWER_BLUE.index, VerticalAlignment.CENTER, HSSFColor.WHITE.index  );
			
			// 样式 - 内容单元格（偶数行）
			CellStyle evenRowContentStyle =
					getStyle( wb, contentFont, HSSFColor.ROYAL_BLUE.index, VerticalAlignment.CENTER, HSSFColor.WHITE.index  );

			/************** 表头 **************/ 
			
			Row headerRow = sheet.createRow( 0 );
			headerRow.setHeightInPoints( 30 );
			for ( int i = 0; i < header.length; i++ ) {
				Cell headerCell = headerRow.createCell( i );
				headerCell.setCellValue( header[ i ] );
				headerCell.setCellStyle( headerStyle );
			}

			/************** 内容 **************/ 
			for ( int i = 0; i < beanList.size(); i++ ) {
				short rowNum = ( short ) ( i + 1 );
				Row contentRow = sheet.createRow( rowNum );
				contentRow.setHeightInPoints( 24 );
				T bean = beanList.get( i );
				CellStyle contentStyle = ( i % 2 == 0 ? oddRowContentStyle : evenRowContentStyle ); 
				for ( int columnIndex = 0; columnIndex < propertyName.length; columnIndex++ ) {
					Cell contentCell = contentRow.createCell( columnIndex );
					contentCell.setCellStyle( contentStyle );
					Field field = fields[ columnIndex ];
					Class<?> type = field.getType();
					Object value = field.get( bean );
					if ( type == String.class ) {
						contentCell.setCellValue( ( String ) value );
					} else if ( type == Integer.class ) {
						contentCell.setCellValue( ( Integer ) value );
					} else if ( type == Date.class ) {
						contentCell.setCellValue( ( Date ) value );
					}
				}
			}

			// 调整列宽 以适应单元格内容
			sheet.autoSizeColumn( 0 );
			sheet.autoSizeColumn( 1 );
			sheet.autoSizeColumn( 2 );

			// 冻结表头
			sheet.createFreezePane( 0, 1, 0, 1 );

			wb.write( outputStream );
			wb.close();
			
			return true;
		} catch ( IOException | NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e ) {
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * 设置样式
	 * @param wb
	 * @param font
	 * @param backgroundColor
	 * @param verticalAlignment
	 * @param borderColor
	 * @return
	 */
	private static CellStyle getStyle( HSSFWorkbook wb, Font font, short backgroundColor, VerticalAlignment verticalAlignment, short borderColor ) {
		CellStyle style = wb.createCellStyle();
		style.setFont( font );
		style.setFillForegroundColor( backgroundColor );
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setVerticalAlignment( verticalAlignment );
		
		style.setBorderTop( BorderStyle.THIN );
		style.setTopBorderColor( HSSFColor.WHITE.index );
		style.setBorderRight( BorderStyle.THIN );
		style.setRightBorderColor( HSSFColor.WHITE.index );
		style.setBorderBottom( BorderStyle.THIN );
		style.setBottomBorderColor( HSSFColor.WHITE.index );
		style.setBorderLeft( BorderStyle.THIN );
		style.setLeftBorderColor( HSSFColor.WHITE.index );
		return style;
	}
	/**
	 * 获取字体
	 * @param wb
	 * @param fontPoints
	 * @param fontFamily
	 * @param HSSFColorndex
	 * @return
	 */
	private static Font getFont( HSSFWorkbook wb, short fontPoints, String fontFamily, short HSSFColorndex ) {
		Font font = wb.createFont();
		font.setFontHeightInPoints( fontPoints );
		font.setFontName( fontFamily );
		font.setColor( HSSFColorndex );
		return font;
	}
	/**
	 * 重置预设的颜色
	 * @param wb
	 * @param colorIndex
	 * @param red
	 * @param green
	 * @param blue
	 */
	private static void resetHSSFColor( HSSFWorkbook wb, short colorIndex, byte red, byte green, byte blue ) {
		HSSFPalette palette = wb.getCustomPalette();
	    palette.setColorAtIndex(colorIndex, red, green, blue );
	}
	/**
	 * 读取 Excel（xls），将其装入指定类型的 List<T>
	 * @param beanClass bean Class
	 * @param inputStream
	 * @param header 表头，如 { "条目编号(itemCode)", "条目名称(itemValue)", "是否有效(visiable)" }
	 * @param propertyName 要填充的bean属性名，跟表头一一对应，如 { "itemCode", "itemValue", "visiable" }
	 * @return 读取后的 List<T>
	 * @throws RuntimeException 错误异常，通过 e.getMessage() 获取是哪行哪列出错
	 */
	public static <T> List<T> readData( Class<T> beanClass, InputStream inputStream, String[] header,String[] propertyName  ) {
		List<T> beanList = new ArrayList<T>();
		
		HSSFWorkbook wb = null;
		Sheet sheet = null;
		// String[] header = { "条目编号(itemCode)", "条目名称(itemValue)", "是否有效(visiable)" };
		// String[] propertyName = { "itemCode", "itemValue", "visiable" };
		Field[] fields = new Field[ propertyName.length ];
		
		int rowNum = 1;
		int columnNum = 0;

		try {
			for ( int i = 0; i < propertyName.length; i++ ) {
				Field field = beanClass.getDeclaredField( propertyName[ i ] );
				field.setAccessible( true );
				fields[ i ] = field;
			}

			wb = new HSSFWorkbook( inputStream );
			sheet = wb.getSheetAt( 0 );
			
			int firstRowNum = 1; // 跳过表头
			int lastRowNum = sheet.getLastRowNum(); // 从 0 开始

			for ( rowNum = firstRowNum; rowNum <= lastRowNum; rowNum++ ) {
				
				Row row = sheet.getRow( rowNum );
				
				T bean = beanClass.newInstance();
				
				if ( row == null ) {
					// TODO 错误处理
					continue;
				}
				
				beanList.add( bean );
				
				int lastColumnNum = row.getLastCellNum(); // 从 1 开始

				for ( columnNum = 0; columnNum < lastColumnNum; columnNum++ ) {
					Cell cell = row.getCell( columnNum, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL );
					Field field = fields[ columnNum ];
					Class<?> type = field.getType();
					Object value = null;
					if ( cell == null ) {
						// TODO 错误处理
					} else {
						if ( type == String.class ) {
							value = cell.getStringCellValue();
						} else if ( type == Integer.class ) {
							value = cell.getNumericCellValue();
						} else if ( type == Date.class ) {
							value = cell.getDateCellValue();
						}
						field.set( bean, value );
					}
				}
			}
			
			
			wb.close();
			
		} catch ( Exception e ) {
			e.printStackTrace();
			throw new RuntimeException( "处理 第[" + ( rowNum + 1 ) + "]行 第[" + ( columnNum + 1 ) + "]列 时出错。" );
		}
		
		return beanList;
	}

	
	@Test
	public void testReadData() throws FileNotFoundException {
		String[] header = { "条目编号(itemCode)", "条目名称(itemValue)", "是否有效(visiable)" };
		String[] propertyName = { "itemCode", "itemValue", "visiable" };
		InputStream inputStream = new FileInputStream( new File( "/Users/forwardNow/Desktop/test.xls" ) );
		List<SysDicItem> sysDicItemList = null;
		try {
			sysDicItemList = ExcelUtil.readData( SysDicItem.class, inputStream, header, propertyName );
		} catch ( Exception e ) {
			System.out.println( e.getMessage() );
		}
		System.out.println( sysDicItemList );
	}
	@Test
	public void testFillData() throws FileNotFoundException, IOException {
		List<SysDicItem> beanList = new ArrayList<SysDicItem>();

		for ( int i = 0; i < 100; i++ ) {
			SysDicItem sysDicItem = new SysDicItem();
			sysDicItem.setItemCode( i + "" );
			sysDicItem.setItemValue( "值" + i );
			sysDicItem.setVisiable( "1" );
			beanList.add( sysDicItem );
		}

		String[] header = { "条目编号(itemCode)", "条目名称(itemValue)", "是否有效(visiable)" };
		String[] propertyName = { "itemCode", "itemValue", "visiable" };
		OutputStream outputStream = new FileOutputStream( new File( "/Users/forwardNow/Desktop/test.xls" ) );
		
		ExcelUtil.fillData( beanList, outputStream, header, propertyName );
		
		outputStream.close();
	}
}
