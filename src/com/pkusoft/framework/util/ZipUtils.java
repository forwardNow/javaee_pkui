package com.pkusoft.framework.util;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * zip压缩，解压缩
 * @author tanggj
 *
 */
public class ZipUtils {
	/**
	 * zip压缩字符串
	 * @param str 需要压缩的字符串
	 * @return zip压缩后的字符串
	 * @throws IOException
	 */
	public static String compress(String str) throws IOException {
		if (str == null || str.length() == 0) {
			return str;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(out);
		gzip.write(str.getBytes());
		gzip.close();
		return out.toString("ISO-8859-1");
	}

	/**
	 * zip解压字符串
	 * 
	 * @param str 被zip压缩过的字符串
	 * @return 解压后的字符串
	 * @throws IOException
	 */
	public static String uncompress(String str) throws IOException {
		if (str == null || str.length() == 0) {
			return str;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(str
				.getBytes("ISO-8859-1"));
		GZIPInputStream gunzip = new GZIPInputStream(in);
		byte[] buffer = new byte[256];
		int n;
		while ((n = gunzip.read(buffer)) >= 0) {
			out.write(buffer, 0, n);
		}
		// toString()使用平台默认编码，也可以显式的指定如toString("GBK")
		return out.toString();
	}
	
	/**
	 * 压缩文件或文件夹到指定文件
	 * 
	 * @param srcFile 文件或文件夹
	 * @param destFile 压缩后的文件
	 * @throws IOException
	 */
	public static void zip(File srcFile, File destFile) throws IOException {
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(destFile));
		BufferedOutputStream bo = new BufferedOutputStream(out);

		zip(out, srcFile, srcFile.getName(), bo);

		bo.close();
		out.close();
	}

	private static void zip(ZipOutputStream out, File file, String base, BufferedOutputStream bo) throws IOException {
		if (file.isDirectory()) {
			File[] fl = file.listFiles();
			if (fl.length == 0) {
				// 创建zip压缩进入点base
				out.putNextEntry(new ZipEntry(base + "/"));
			}else{
				for (int i = 0; i < fl.length; i++) {
					// 递归遍历子文件夹
					zip(out, fl[i], base + "/" + fl[i].getName(), bo);
				}
			}
		} else {
			// 创建zip压缩进入点base
			out.putNextEntry(new ZipEntry(base));

			FileInputStream in = new FileInputStream(file);
			BufferedInputStream bi = new BufferedInputStream(in);
			int b;
			while ((b = bi.read()) != -1) {
				// 将字节流写入当前zip目录
				bo.write(b);
			}

			bi.close();
			in.close();
		}
	}

	/**
	 * 解压缩文件到指定文件夹。
	 * 
	 * @param zipFile 压缩文件	
	 * @param destDir 解压到目录  
	 * @throws IOException 
	 */
	public static void unzip(File zipFile, File destDir) throws IOException {
		ZipFile zip = new ZipFile(zipFile);
		Enumeration en = zip.entries();
		int bufSize = 8196;

		while (en.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) en.nextElement();
			File file = (destDir != null) ? new File(destDir, entry.getName())
					: new File(entry.getName());
			if (entry.isDirectory()) {
				if (!file.mkdirs()) {
					if (file.isDirectory() == false) {
						throw new IOException("Error creating directory: "
								+ file);
					}
				}
			} else {
				File parent = file.getParentFile();
				if (parent != null && !parent.exists()) {
					if (!parent.mkdirs()) {
						if (file.isDirectory() == false) {
							throw new IOException("Error creating directory: "
									+ parent);
						}
					}
				}

				InputStream in = zip.getInputStream(entry);
				try {
					OutputStream out = new BufferedOutputStream(
							new FileOutputStream(file), bufSize);
					try {
						copyPipe(in, out, bufSize);
					} finally {
						out.close();
					}
				} finally {
					in.close();
				}
			}
		}
	}
	
	private static void copyPipe(InputStream in, OutputStream out,
			int bufSizeHint) throws IOException {
		int read = -1;
		byte[] buf = new byte[bufSizeHint];
		while ((read = in.read(buf, 0, bufSizeHint)) >= 0) {
			out.write(buf, 0, read);
		}
		out.flush();
	}

}