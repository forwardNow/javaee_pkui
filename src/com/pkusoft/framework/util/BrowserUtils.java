package com.pkusoft.framework.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

/**
 * 浏览器工具类
 * @author tanggj
 *
 */
public class BrowserUtils {
	private final static String IE12 = "MSIE 12.0";
	private final static String IE11 = "MSIE 11.0";
	private final static String IE10 = "MSIE 10.0";
	private final static String IE9 = "MSIE 9.0";
	private final static String IE8 = "MSIE 8.0";
	private final static String IE7 = "MSIE 7.0";
	private final static String IE6 = "MSIE 6.0";
	private final static String MAXTHON = "Maxthon";
	private final static String QQ = "QQBrowser";
	private final static String GREEN = "GreenBrowser";
	private final static String SE360 = "360SE";
	private final static String FIREFOX = "Firefox";
	private final static String OPERA = "Opera";
	private final static String CHROME = "Chrome";
	private final static String SAFARI = "Safari";
	private final static String OTHER = "其它";
	
	/**
	 * 判断是否是IE
	 * @param request
	 * @return
	 */
	public static boolean isIE(HttpServletRequest request) {
		return request.getHeader("USER-AGENT").toLowerCase().indexOf("msie") > 0 ? true : false;
	}

	/**
	 * 获取IE版本
	 * 
	 * @param request
	 * @return
	 */
	public static Double getIEversion(HttpServletRequest request) {
		Double version = 0.0;
		if(isIE(request)){
			if (isBrowserType(request, "msie 12.0")) {
				version = 12.0;
			}else if (isBrowserType(request, "msie 11.0")) {
				version = 11.0;
			}else if (isBrowserType(request, "msie 10.0")) {
				version = 10.0;
			}else if (isBrowserType(request, "msie 9.0")) {
				version = 9.0;
			}else if (isBrowserType(request, "msie 8.0")) {
				version = 8.0;
			}else if (isBrowserType(request, "msie 7.0")) {
				version = 7.0;
			}else if (isBrowserType(request, "msie 6.0")) {
				version = 6.0;
			}
		}
		return version;
	}

	/**
	 * 获取浏览器类型
	 * 
	 * @param request
	 * @return
	 */
	public static BrowserType getBrowserType(HttpServletRequest request) {
		BrowserType browserType = null;
		if (isBrowserType(request, "msie 12.0")) {
			browserType = BrowserType.IE12;
		}else if (isBrowserType(request, "msie 11.0")) {
			browserType = BrowserType.IE11;
		}else if (isBrowserType(request, "msie 10.0")) {
			browserType = BrowserType.IE10;
		}else if (isBrowserType(request, "msie 9.0")) {
			browserType = BrowserType.IE9;
		}else if (isBrowserType(request, "msie 8.0")) {
			browserType = BrowserType.IE8;
		}else if (isBrowserType(request, "msie 7.0")) {
			browserType = BrowserType.IE7;
		}else if (isBrowserType(request, "msie 6.0")) {
			browserType = BrowserType.IE6;
		}else if (isBrowserType(request, "Firefox")) {
			browserType = BrowserType.Firefox;
		}else if (isBrowserType(request, "Safari")) {
			browserType = BrowserType.Safari;
		}else if (isBrowserType(request, "Chrome")) {
			browserType = BrowserType.Chrome;
		}else if (isBrowserType(request, "Opera")) {
			browserType = BrowserType.Opera;
		}else if (isBrowserType(request, "Camino")) {
			browserType = BrowserType.Camino;
		}
		return browserType;
	}

	/**
	 * 判断浏览器类型
	 * @param request
	 * @param brosertype
	 * @return
	 */
	private static boolean isBrowserType(HttpServletRequest request, String brosertype) {
		return request.getHeader("USER-AGENT").toLowerCase().indexOf(brosertype) > 0 ? true : false;
	}

	/**
	 * 获取浏览器厂商
	 * @param request
	 * @return
	 */
	public static String getBrowserVendor(HttpServletRequest request) {
		String userAgent=request.getHeader("USER-AGENT");
		if (regex(OPERA, userAgent))
			return OPERA;
		if (regex(CHROME, userAgent))
			return CHROME;
		if (regex(FIREFOX, userAgent))
			return FIREFOX;
		if (regex(SAFARI, userAgent))
			return SAFARI;
		if (regex(SE360, userAgent))
			return SE360;
		if (regex(GREEN, userAgent))
			return GREEN;
		if (regex(QQ, userAgent))
			return QQ;
		if (regex(MAXTHON, userAgent))
			return MAXTHON;
		if (regex(IE12, userAgent))
			return IE12;
		if (regex(IE11, userAgent))
			return IE11;
		if (regex(IE10, userAgent))
			return IE10;
		if (regex(IE9, userAgent))
			return IE9;
		if (regex(IE8, userAgent))
			return IE8;
		if (regex(IE7, userAgent))
			return IE7;
		if (regex(IE6, userAgent))
			return IE6;
		return OTHER;
	}

	public static boolean regex(String regex, String str) {
		Pattern p = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher m = p.matcher(str);
		return m.find();
	}

}
