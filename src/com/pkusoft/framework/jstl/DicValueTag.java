package com.pkusoft.framework.jstl;


import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.springframework.util.StringUtils;

import com.pkusoft.common.cache.DicCache;


/**
 * 字典翻译标签，根据字典名称和字典条目编码获取字典条目值，或根据字典名称和字典条目值获取字典条目编码
 * @author tanggj
 *
 */
public class DicValueTag extends BodyTagSupport {
	private static final long serialVersionUID = 1L;
	private String dicName;
	private String itemCode;
	private String itemValue;
	public String getDicName() {
		return dicName;
	}
	public void setDicName(String dicName) {
		this.dicName = dicName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemValue() {
		return itemValue;
	}
	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}
	
	public int doStartTag() throws JspException {
		if(StringUtils.hasText(dicName)){
			if(StringUtils.hasText(itemCode)){
				String val = DicCache.getDicText(dicName, itemCode);
				if(StringUtils.hasText(val)){
					try {
						pageContext.getOut().write(val);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}else if(StringUtils.hasText(itemValue)){
				String val = DicCache.getDicCode(dicName, itemValue);
				if(StringUtils.hasText(val)){
					try {
						pageContext.getOut().write(val);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return SKIP_BODY;
	}
}
