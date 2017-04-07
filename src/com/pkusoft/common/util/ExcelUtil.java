package com.pkusoft.common.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * 
 * @author 吴钦飞
 * 
 */
public class ExcelUtil {

	public static String TEMPLATE_DIR = "/template/";

	public static void fillData( List<?> beanList, String templateName, OutputStream outputStream ) throws Exception {
		Workbook wb = new HSSFWorkbook();
		
		// ....
		
		
	    wb.write(outputStream);
	    wb.close();
	}
	
	public static <T> List<T> readData( Class<T> beanClass, String templateName, InputStream inputStream ) throws Exception {
		List<T> list = new ArrayList<T>();
		return list;
	}

	
}
