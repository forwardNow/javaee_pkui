package com.pkusoft.framework.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

/**
 * ID生成器
 * @author tanggj
 *
 */
public class IDGenerator {
	private final static String chars64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789^~abcdefghijklmnopqrstuvwxyz";

	/**
	 * 返回一个唯一的16位字符串。 基于： 32位当前时间，32位对象的identityHashCode和32位随机数
	 * 
	 * @param o Object对象
	 * @return 一个16位的字符串
	 */
	public final static String generateChar16(Object o) {
		long id1 = System.currentTimeMillis() & 0xFFFFFFFFL;
		long id2 = System.identityHashCode(o);
		long id3 = randomLong(-0x80000000L, 0x80000000L) & 0xFFFFFFFFL;
		id1 <<= 16;
		id1 += (id2 & 0xFFFF0000L) >> 16;
		id3 += (id2 & 0x0000FFFFL) << 32;
		String out = convert(id1, 6, chars64)
				+ convert(id3, 6, chars64);
		out = out.replaceAll(" ", "o");
		return out;
	}

	public final static String generateNumber(Object o) {
		long id1 = System.currentTimeMillis() & 0xFFFFFFFFL;
		long id2 = System.identityHashCode(o);
		long id3 = randomLong(-0x80000000L, 0x80000000L) & 0xFFFFFFFFL;
		id1 <<= 16;
		id1 += (id2 & 0xFFFF0000L) >> 16;
		id3 += (id2 & 0x0000FFFFL) << 32;
		return "" + id1 + id3;
	}

	public final static String generatePrefixHost(Object o) {
		long id1 = System.currentTimeMillis() & 0xFFFFFFFFL;
		long id2 = System.identityHashCode(o);
		long id3 = randomLong(-0x80000000L, 0x80000000L) & 0xFFFFFFFFL;
		id1 <<= 16;
		id1 += (id2 & 0xFFFF0000L) >> 16;
		id3 += (id2 & 0x0000FFFFL) << 32;
		return getLocalHostName() + "@" + id1 + id3;
	}

	/**
	 * 返回10个随机字符（基于目前时间和一个随机字符串）
	 * 
	 * @return String
	 */
	public final static String generate() {
		long id1 = System.currentTimeMillis() & 0x3FFFFFFFL;
		long id3 = randomLong(-0x80000000L, 0x80000000L) & 0x3FFFFFFFL;
		String out = convert(id1, 6, chars64)
				+ convert(id3, 6, chars64);
		out = out.replaceAll(" ", "o");
		return out;
	}

	private static long randomLong(long min, long max) {
		return min + (long) (Math.random() * (max - min));
	}
	
	private static String convert(long x, int n, String d) {
		if (x == 0) {
			return "0";
		}
		String r = "";
		int m = 1 << n;
		m--;
		while (x != 0) {
			r = d.charAt((int) (x & m)) + r;
			x = x >>> n;
		}
		return r;
	}
	
	private static String getLocalHostName() {
		String localHostname = "";
		try {
			localHostname = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			localHostname = "UnknownHost";
		}
		return localHostname;
	}
	
	/**
	 * 生成36位标准的UUID，格式如xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx的字符串，其中每个 x 是 0-9 或 a-f 范围内的一个4位十六进制数。例如：6F9619FF-8B86-D011-B42D-00C04FC964FF 即为有效的 GUID值
	 * @return 返回36位字符串
	 */
	public static String generateUUID(){
		UUID uuid = UUID.randomUUID();
        
        return uuid.toString().toUpperCase();
	}
}
