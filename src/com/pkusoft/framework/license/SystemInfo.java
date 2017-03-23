package com.pkusoft.framework.license;

import java.io.InputStream;
import java.net.InetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 系统信息
 * @author tanggj
 *
 */
public class SystemInfo {
	/**
	 * 获取Max地址
	 * @return
	 */
	public static final String getMacAddress() {
		String os = System.getProperty("os.name").toLowerCase();
		String output = null;
		try {
			String cmd = "ipconfig /all";
			if (os.indexOf("windows") < 0) {
				cmd = "ifconfig";
			}
			Process proc = Runtime.getRuntime().exec(cmd);
			Thread.sleep(100);
			InputStream is = proc.getInputStream();
			byte[] b = new byte[is.available()];
			is.read(b);
			is.close();
			output = new String(b);
		} catch (Exception ex) {
			String cmd = "ipconfig /all";
			if (os.indexOf("windows") < 0)
				cmd = "/sbin/ifconfig";
			try {
				Process proc = Runtime.getRuntime().exec(cmd);
				Thread.sleep(100);
				InputStream is = proc.getInputStream();
				byte[] b = new byte[is.available()];
				is.read(b);
				is.close();
				output = new String(b);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Pattern p = Pattern.compile("([0-9a-zA-z]{2}[\\:\\-]){5}[0-9a-zA-z]{2}", 32);
		Matcher m = p.matcher(output);
		int lastIndex = 0;
		StringBuffer sb = new StringBuffer();
		while (m.find(lastIndex)) {
			if (lastIndex != 0) {
				sb.append(",");
			}
			sb.append(m.group(0));
			lastIndex = m.end();
		}
		return sb.toString();
	}

	public static final void main(String[] args) {
		try {
			System.out.println("  Operating System: " + System.getProperty("os.name"));
			System.out.println("  IP/Localhost: "
					+ InetAddress.getLocalHost().getHostAddress());
			System.out.println("  MAC Address: " + getMacAddress());
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}