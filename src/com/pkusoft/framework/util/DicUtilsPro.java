package com.pkusoft.framework.util;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.framework.util.DicXmlResultPro.DicXmlDtoPro;

public class DicUtilsPro extends DicUtils {
	private static Logger logger = LoggerFactory.getLogger(DicUtilsPro.class);
	
	//获取项目发布路径
	public static String getDicRealPath1(){
		String dicRealPath = WebUtils.getWebApplicationContext().getServletContext().getRealPath("/");
		if(dicRealPath == null){
			try {
				dicRealPath = WebUtils.getWebApplicationContext().getServletContext().getResource("/").getPath();
				System.out.println(dicRealPath);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return (dicRealPath.endsWith("/") || dicRealPath.endsWith("\\"))?dicRealPath:(dicRealPath+System.getProperty("file.separator"));
	}
	
	//得到生成xml文件路径
	public static String getDicFileName1(String dicName){
	    return getDicRealPath1() +"static"+System.getProperty("file.separator")+"dic"+ System.getProperty("file.separator")+dicName + ".xml";
	}
	
	//根据dic名称和列表生成xml方法(仅用于字典表)
	public static boolean createDicXml(String dicName, List<SysDicItem> itemList){
		DicXmlResultPro dxr = new DicXmlResultPro();
		List<DicXmlResultPro.DicXmlDtoPro> list = new ArrayList<DicXmlResultPro.DicXmlDtoPro>();
		for (int i = 0; i < itemList.size(); i++) {
			SysDicItem source = itemList.get(i);
			DicXmlDtoPro dto = new DicXmlDtoPro();
			dto.setCode(source.getItemCode());
		    dto.setText(source.getItemValue());
		    
            // 识别多音字
            PinyinUtilsPro.convertChineseToPinyin(source.getItemValue());
            dto.setSpell(PinyinUtilsPro.getHeadPinyin());
            dto.setAspell(PinyinUtilsPro.getPinyin());
            // dto.setSpell(source.getItemSpell());
            // dto.setAspell(source.getItemAspell());
            dto.setPerm(source.getVisiable());
            list.add(dto);
		}
		dxr.setList(list);
		
		return DicUtilsPro.createDicXml1(dicName, dxr);
	}
	
	//根据字典名称和标准xml对象生成xml文件
	public static boolean createDicXml1(String dicName, DicXmlResultPro dxr) {
		try {
			//File file = new File(getDicFileName(dicName));
			File file = new File(getDicFileName1(dicName));
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(
					file));
			marshal(dxr, dos);
			dos.flush();
			dos.close();

			return true;
		} catch (Exception e) {
			logger.error("生成字典文件失败", e);
		}
		return false;
	}
	
	private static void marshal(Object res, OutputStream os) throws Exception {
	    JAXBContext context = JAXBContext.newInstance(new Class[] { res.getClass() });

	    Marshaller m = context.createMarshaller();
	    m.setProperty("jaxb.fragment", Boolean.valueOf(true));
	    m.setProperty("jaxb.encoding", "UTF-8");
	    m.setProperty("jaxb.formatted.output", Boolean.valueOf(true));
	    os.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes("UTF-8"));
	    
	    m.marshal(res, os);
	  }
	
    /**
     * 创建字典文件，在工程目录static/dic下生成xml文件
     * 
     * @param dicName
     *            字典名称，如：DIC_CODE
     * @param data
     *            字典条目列表，可以是任意列表。需要指定code、text值对应的属性字段
     * @param codeFieldName
     *            字典编码对应属性字段
     * @param textFieldName
     *            字典文本对应属性字段
     * @return 是否成功
     */
    public static boolean createDicXml(String dicName, List<?> data,
            String codeFieldName, String textFieldName, String textPrem) {
        try {
            DicXmlResultPro dxr = toDicXmlResult(data, codeFieldName,
                    textFieldName, textPrem);
            return createDicXml1(dicName, dxr);
        } catch (Exception e) {
            logger.error("转换字典条目列表出错", e);
            return false;
        }
    }

    /**
     * 将列表数据转换成字典XML数据对象
     * 
     * @param list
     *            列表数据
     * @param codeFieldName
     *            字典code字段名
     * @param textFieldName
     *            字典text字段名
     * @return 字典结果XML对象
     */
    public static DicXmlResultPro toDicXmlResult(List<?> list,
            String codeFieldName, String textFieldName, String textFieldPrem) {
        try {
            List<DicXmlResultPro.DicXmlDtoPro> dicList = new ArrayList<DicXmlResultPro.DicXmlDtoPro>();
            Object source;
            for (int i = 0; i < list.size(); i++) {
                source = list.get(i);
                Object codeValue;
                Object textValue;
                Object textPrem;
                if (source instanceof Map) {
                    codeValue = ((Map<?, ?>) source).get(codeFieldName);
                    textValue = ((Map<?, ?>) source).get(textFieldName);
                    textPrem = ((Map<?, ?>) source).get(textFieldPrem);
                } else {
                    codeValue = PropertyUtils.getSimpleProperty(source,
                            codeFieldName);
                    textValue = PropertyUtils.getSimpleProperty(source,
                            textFieldName);
                    textPrem = PropertyUtils.getSimpleProperty(source,
                            textFieldPrem);
                }
                String code = String.valueOf(codeValue);
                String text = String.valueOf(textValue);
                String prem = String.valueOf(textPrem);
                /** 此方法用于生成地址信息字典,需要判断使用状态代码 */
                if ("syztdm".equals(textFieldPrem)) {
                    if (XtDicCode.SYZTDM_SYZ.equals(prem)) {
                        prem = "1";
                    } else {
                        prem = "0";
                    }
                }
                DicXmlResultPro.DicXmlDtoPro dto = new DicXmlResultPro.DicXmlDtoPro();
                dto.setCode(code);
                dto.setText(text);
                PinyinUtilsPro.convertChineseToPinyin(text);
                dto.setSpell(PinyinUtilsPro.getHeadPinyin());
                dto.setAspell(PinyinUtilsPro.getPinyin());
                dto.setPerm(prem);

                dicList.add(dto);
            }
            DicXmlResultPro dxr = new DicXmlResultPro();
            dxr.setList(dicList);
            return dxr;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("转换字典列表出错", e);
        }
    }
}
