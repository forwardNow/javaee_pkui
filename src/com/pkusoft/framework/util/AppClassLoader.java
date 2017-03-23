package com.pkusoft.framework.util;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 自己定义一个类加载器继承classLoader 实现findClass和definedclass
 * 需要注意的是这个类加载器并没有实现委托加载模式
 * @author tanggj
 *
 */
public class AppClassLoader extends ClassLoader{
	
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		if("com.pkusoft.framework.license.LicenseInfo".equals(name)){
			try {
				InputStream fis = getStream(name);
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				cypher(fis, bos);
				byte[] bytes = bos.toByteArray();
				fis.close();
				bos.close();
				return defineClass(null, bytes, 0, bytes.length);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}else{
			return Thread.currentThread().getContextClassLoader().loadClass(name);
		}
	}
	
	/**
	 * 解密算法
	 * @param in
	 * @param out
	 * @throws Exception
	 */
	public static void cypher(InputStream in,OutputStream out)throws Exception{
		int b=-1;
		while((b=in.read())!=-1){
			out.write(b^0xff);
		}
	}
	
	public InputStream getStream(String clazzName){
		String path = clazzName.replaceAll("\\.", "/");
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
		return is;
	}
	
	
}