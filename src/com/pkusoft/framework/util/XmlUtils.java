package com.pkusoft.framework.util;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

/**
 * xml工具类
 * @author tanggj
 *
 */
public class XmlUtils {
	/**
	 * javabean转为xml字符串
	 * @param bean javabean对象，必须要含有@XmlRootElement
	 * @return xml字符串
	 */
	public static String toXml(Object bean) {
		ByteArrayOutputStream xmlData = new ByteArrayOutputStream();
		try {
			marshal(bean, xmlData);
			return xmlData.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				xmlData.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * javabean转为xml字符串
	 * @param bean javabean对象
	 * @return xml字符串
	 */
	public static String toXmlByNonElement(Object bean) {
		ByteArrayOutputStream xmlData = new ByteArrayOutputStream();
		try {
			marshalByNonElement(bean, xmlData);
			return xmlData.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				xmlData.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 序列化对象，将javabean输出到os
	 * @param bean 没有@XmlRootElement注入标签的javabean
	 * @param os 输出流
	 * @throws Exception
	 */
	public static void marshalByNonElement(Object bean,OutputStream os) throws Exception{
		JAXBContext context = JAXBContext.newInstance(bean.getClass());

		Marshaller m = context.createMarshaller();
		
		m.setProperty(Marshaller.JAXB_FRAGMENT, true); // 去掉头信息
		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); // 编码
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // 格式化
		
		os.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes("UTF-8"));
		
		String name = bean.getClass().getSimpleName();
		name = name.substring(0,1).toLowerCase() + name.substring(1);
		m.marshal(new JAXBElement(new QName("",name),bean.getClass(), bean), os);
	}
	
	/**
	 * 序列化对象，将javabean输出到os
	 * @param bean javabean必须注入@XmlRootElement标签
	 * @param os 输出流
	 * @throws Exception
	 */
	public static void marshal(Object bean,OutputStream os) throws Exception{
		JAXBContext context = JAXBContext.newInstance(bean.getClass());

		Marshaller m = context.createMarshaller();
		
		m.setProperty(Marshaller.JAXB_FRAGMENT, true); // 去掉头信息
		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); // 编码
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // 格式化
		
		os.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes("UTF-8"));
		m.marshal(bean, os);
	}
	
	/**
	 * 将xml转成javabean
	 * @param xml xml字符串
	 * @param clazz 转成的bean类型
	 * @return javabean对象
	 * @throws Exception
	 */
	public static <T> T toBean(String xml,Class<T> clazz) throws Exception{
		JAXBContext context = JAXBContext.newInstance(clazz);
		
		
		Unmarshaller um = context.createUnmarshaller();
		
		return (T)um.unmarshal(new StringReader(xml));
		
	}

}
