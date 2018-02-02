package com.pkusoft.common.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

public class ImageUtils {

	/**
	 * 根据设置的宽高等比例压缩图片文件<br>
	 * 先保存原文件，再压缩、上传
	 * 
	 * @param srcImageInputStream
	 *            要进行压缩的文件
	 * @param compressedImageOutputStrem
	 *            新文件
	 * @param imageType
	 *            新图片的类型（png，jpg，...）
	 * @param width
	 *            宽度 //设置宽度时（高度传入0，等比例缩放）
	 * @param height
	 *            高度 //设置高度时（宽度传入0，等比例缩放）
	 */
	public static void compressImage( InputStream srcImageInputStream, OutputStream compressedImageOutputStrem, String imageType, int width, int height ) {
		try {
			Image srcImage = ImageIO.read( srcImageInputStream );

			BufferedImage targetImage = null;
			
			if ( imageType.equals( "png" ) ) {
				targetImage = new BufferedImage( width, height, BufferedImage.TYPE_INT_ARGB );
			} else {
				targetImage = new BufferedImage( width, height, BufferedImage.TYPE_INT_RGB );
			}
 
            Graphics2D graphics2D = targetImage.createGraphics();  
 
            targetImage = graphics2D.getDeviceConfiguration().createCompatibleImage(width, height, Transparency.TRANSLUCENT);
 
            graphics2D.dispose();  
 
            graphics2D = targetImage.createGraphics();  
 
            Image from = srcImage.getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);  
            graphics2D.drawImage(from, 0, 0, null);
            graphics2D.dispose();  
			
			ImageIO.write( targetImage, imageType, compressedImageOutputStrem );
			
		} catch ( Exception e ) {
			e.printStackTrace();
			throw new RuntimeException( "图片压缩失败。详情：" + e.getMessage() );
		}

	}
	public static void main( String[] args ) throws Exception {
		// 绝对路径前缀：/Users/forwardNow/develop/workspace
		String pathPrefix = "/Users/forwardNow/develop/workspace";
		String dirPath = pathPrefix + "/pkui/WebContent/static/desktop/images/apps";
		String imageBasePath_24x24 =  pathPrefix + "/pkui/WebContent/static/desktop/images/icon/24x24";
//		String imageBasePath_76x76 =  pathPrefix + "/pkui/WebContent/static/desktop/images/icon/76x76";
		
		// 1. 读取 /pkui/WebContent/static/desktop/images/apps 目录里的所有png图片
		File imageDir = new File( "/Users/forwardNow/Downloads/201711/136517-file-types/png" );
		File[] imageFileList = imageDir.listFiles();
		
		for ( int i = 0; i < imageFileList.length; i++ ) {
			File imageFile = imageFileList[ i ];
			String fileName = imageFile.getName();
			InputStream srcImageInputStream = new FileInputStream( imageFile );
			OutputStream compressedImageOutputStrem_24x24 = new FileOutputStream( "/Users/forwardNow/Downloads/201711/png_110/" + fileName );
//			OutputStream compressedImageOutputStrem_76x76 = new FileOutputStream( imageBasePath_76x76 + "/" + fileName );
			
			if ( fileName.indexOf( ".png" ) == -1 ) {
				continue;
			}
			
			// 2. 压缩为 24x24 存入 /pkui/WebContent/static/desktop/images/icon/24x24
			ImageUtils.compressImage( srcImageInputStream, compressedImageOutputStrem_24x24, "png", 110, 110 );
			
			// 3. 压缩为 76x76 存入 /pkui/WebContent/static/desktop/images/icon/76x76
//			srcImageInputStream = new FileInputStream( imageFile );
//			ImageUtils.compressImage( srcImageInputStream, compressedImageOutputStrem_76x76, "png", 76, 76 );
		}
		
		
	}
}
