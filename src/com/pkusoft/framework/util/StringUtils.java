package com.pkusoft.framework.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils extends org.springframework.util.StringUtils{
	
	/**
	 * 驼峰转下划线
	 * @param args
	 * @return 转换后的字符串
	 */
	public static String toUnderline(String args) {
		Pattern p = Pattern.compile("[A-Z]");
		if (args == null || args.equals("")) {
			return "";
		}
		StringBuilder builder = new StringBuilder(args);
		Matcher mc = p.matcher(args);
		int i = 0;
		while (mc.find()) {
			builder.replace(mc.start() + i, mc.end() + i, "_"
					+ mc.group().toLowerCase());
			i++;
		}

		if ('_' == builder.charAt(0)) {
			builder.deleteCharAt(0);
		}
		return builder.toString();
	}
	
}
