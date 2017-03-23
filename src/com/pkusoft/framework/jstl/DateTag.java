package com.pkusoft.framework.jstl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import com.pkusoft.framework.util.StringUtils;

/**
 * 日期格式，将long类型转成date字符串
 * 
 * @author tanggj
 *
 */
public class DateTag extends TagSupport {

    private static final long serialVersionUID = 1L;
    
    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    private static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    
    private String value;
    
    private Long longValue;
    
    private String pattern;
    
    
    public int doStartTag() throws JspException {
    	if(!StringUtils.hasText(pattern)){
    		pattern = DEFAULT_DATE_FORMAT;
    	}
    	if(StringUtils.hasText(value)){
    		if(DEFAULT_DATE_FORMAT.equals(pattern)){
    			value = value.substring(0,4) + "-" + value.substring(4, 6) + "-" + value.substring(6, 8);
    		}else{
    			value = value.substring(0,4) + "-" + value.substring(4, 6) + "-" + value.substring(6, 8) + " " + value.substring(8, 10) + ":" + value.substring(10, 12) + ":" + value.substring(12, 14);
    		}
    		try {
	            pageContext.getOut().write(value);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
    	}else if(longValue != null){
	        Calendar c = Calendar.getInstance();
	        c.setTimeInMillis(longValue);
	        SimpleDateFormat dateformat =new SimpleDateFormat(pattern);
	        String s = dateformat.format(c.getTime());
	        try {
	            pageContext.getOut().write(s);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
    	}
        return super.doStartTag();
    }


    public void setValue(String value) {
    	this.value = value;
    }
    
    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }
    
    public void setPattern(String pattern) {
		this.pattern = pattern;
	}

}

