package com.pkusoft.framework.util;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.framework.model.DicXmlResult;

/**
 * 字典工具类
 * 
 * @author tanggj
 *
 */
public class DicUtils {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(DicUtils.class);
	
	private static String dicRealPath;
	
	/**
	 * 获取字典目录绝对路径
	 * @return 工程static/dic目录绝对路径
	 */
	public static String getDicRealPath(){
		if(dicRealPath == null){
			ServletContext servletContext = WebUtils.getSession().getServletContext();
			dicRealPath = servletContext.getRealPath("static/dic");
		}
		return dicRealPath;
	}
	
	/**
	 * 获取字典文件绝对路径
	 * @param dicName 字典名称
	 * @return 字典绝对路径
	 */
	public static String getDicFileName(String dicName){
		return getDicRealPath() + "/" + dicName + ".xml";
	}
	
	private static void marshal(Object res,OutputStream os) throws Exception{
		JAXBContext context = JAXBContext.newInstance(res.getClass());
		
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FRAGMENT, true); // 去掉头信息
		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); // 编码
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // 格式化
		
		os.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes("UTF-8"));
		m.marshal(res, os);
	}
	
	/**
	 * 将字典条目列表转成字典xml结果对象
	 * @param data 字典条目列表
	 * @return
	 */
	private static DicXmlResult toDicXmlResult(List<SysDicItem> data){
		List<DicXmlResult.DicXmlDto> dicList = new ArrayList<DicXmlResult.DicXmlDto>();
		SysDicItem source;
		for (int i = 0; i < data.size(); i++) {
			source = data.get(i);
			String code = source.getItemCode();
			String text = source.getItemValue();
			
			DicXmlResult.DicXmlDto dto = new DicXmlResult.DicXmlDto();
			dto.setCode(code);
			dto.setText(text);
			dto.setSpell(PinyinUtils.getHeadPinyin(text));
			dto.setAspell(PinyinUtils.getPinyin(text));
			
			dicList.add(dto);
		}
		DicXmlResult dxr = new DicXmlResult();
		dxr.setList(dicList); 
		
		return dxr;
	}
	
	/**
	 * 创建字典文件，在工程目录static/dic下生成xml文件
	 * @param dicName 字典名称
	 * @param dxr 字典XML对象
	 * @return 是否成功
	 */
	public static boolean createDicXml(String dicName,DicXmlResult dxr){
		try {
			File file = new File(getDicFileName(dicName));
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
			marshal(dxr,dos);
			dos.flush();
			dos.close();
			
			return true;
		} catch (Exception e) {
			logger.error("生成字典文件失败", e);
			return false;
		}
	}
	
	/**
	 * 创建字典文件，在工程目录static/dic下生成xml文件
	 * @param dicName 字典名称，如：DIC_CODE
	 * @param data 字典条目列表，可以是任意列表。需要指定code、text值对应的属性字段
	 * @param codeFieldName 字典编码对应属性字段
	 * @param textFieldName 字典文本对应属性字段
	 * @return 是否成功
	 */
	public static boolean createDicXml(String dicName,List<?> data, String codeFieldName,String textFieldName){
		try {
			DicXmlResult dxr = MapUtils.toDicXmlResult(data, codeFieldName, textFieldName);
			
			return createDicXml(dicName, dxr);
		} catch (Exception e) {
			logger.error("转换字典条目列表出错", e);
			return false;
		}
	}
	
	/**
	 * 创建字典文件，在工程目录static/dic下生成xml文件
	 * @param dicName 字典名称，如：DIC_CODE
	 * @param data 字典条目列表，标准的字典条目对象列表
	 * @return 是否成功
	 */
	public static boolean createDicXml(String dicName,List<SysDicItem> data){
		try {
			DicXmlResult dxr = toDicXmlResult(data);
			
			return createDicXml(dicName, dxr);
		} catch (Exception e) {
			logger.error("转换字典条目列表出错", e);
			return false;
		}
	}
}
