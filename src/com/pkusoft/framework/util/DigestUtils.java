package com.pkusoft.framework.util;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.StringUtils;

public class DigestUtils {
	/**
	 * 加入盐值以及迭代次数
	 * @param digest
	 *            信息摘要对象
	 * @param data
	 *            需要加工的数据
	 * @param salt
	 *            盐值
	 * @param hashIterations
	 *            Hash迭代次数
	 * @return 加入盐值后的数据
	 */
	private static byte[] digest(MessageDigest digest, byte[] data,
			byte[] salt, int hashIterations) {
		if (salt != null) {
			digest.reset();
			digest.update(salt);
		}
		byte[] hashed = digest.digest(data);
		for (int i = 1; i < hashIterations; i++) {
			digest.reset();
			hashed = digest.digest(hashed);
		}
		return hashed;
	}

	/**
	 * 返回经过sha-1算法计算后的带盐值数据
	 * @param data 数据
	 * @param salt 盐值
	 * @param hashIterations hash迭代次数
	 * @return 经过sha-1计算后的带盐值数据
	 */
	public static byte[] sha1(byte[] data, byte[] salt, int hashIterations) {
		return digest(
				org.apache.commons.codec.digest.DigestUtils.getSha1Digest(),
				data, salt, hashIterations);
	}

	/**
	 * 返回经过sha-1算法计算后的带盐值数据,默认hash迭代次数为1
	 * @param data 数据
	 * @param salt 盐值
	 * @return 经过sha-1计算后的带盐值数据
	 */
	public static byte[] sha1(byte[] data, byte[] salt) {
		return sha1(data, salt, 1);
	}

	/**
	 * 返回经过sha-1算法计算后的带盐值数据
	 * @param data 数据
	 * @param salt 盐值
	 * @param hashIterations hash迭代次数
	 * @return 经过sha-1计算后的带盐值数据
	 */
	public static byte[] sha1(String data, String salt, int hashIterations) {
		return sha1(StringUtils.getBytesUtf8(data),
				StringUtils.getBytesUtf8(salt), hashIterations);
	}

	/**
	 * 返回经过sha-1算法计算后的带盐值数据,默认hash迭代次数为1
	 * @param data 数据
	 * @param salt 盐值
	 * @return 经过sha-1计算后的带盐值数据
	 */
	public static byte[] sha1(String data, String salt) {
		return sha1(data, salt, 1);
	}

	/**
	 * 返回经过sha-1算法计算后的带盐值字符串数据
	 * @param data 数据
	 * @param salt 盐值
	 * @param hashIterations hash迭代次数
	 * @return 经过sha-1计算后的带盐值字符串数据
	 */
	public static String sha1Hax(byte[] data, byte[] salt, int hashIterations) {
		return Hex.encodeHexString(sha1(data, salt, hashIterations));
	}
	
	/**
	 * 返回经过sha-1算法计算后的带盐值字符串数据,默认hash迭代次数为1
	 * @param data 数据
	 * @param salt 盐值
	 * @return 经过sha-1计算后的带盐值字符串数据
	 */
	public static String sha1Hax(byte[] data, byte[] salt) {
		return sha1Hax(data, salt, 1);
	}

	/**
	 * 返回经过sha-1算法计算后的带盐值字符串数据
	 * @param data 数据
	 * @param salt 盐值
	 * @param hashIterations hash迭代次数
	 * @return 经过sha-1计算后的带盐值字符串数据
	 */
	public static String sha1Hex(String data, String salt, int hashIterations) {
		return sha1Hax(StringUtils.getBytesUtf8(data),
				StringUtils.getBytesUtf8(salt), hashIterations);
	}
	/**
	 * 返回经过sha-1算法计算后的带盐值字符串数据,默认hash迭代次数为1
	 * @param data 数据
	 * @param salt 盐值
	 * @return 经过sha-1计算后的带盐值字符串数据
	 */
	public static String sha1Hex(String data, String salt) {
		return sha1Hex(data, salt, 1);
	}

	public static byte[] md5(byte[] data, byte[] salt, int hashIterations) {
		return digest(
				org.apache.commons.codec.digest.DigestUtils.getMd5Digest(),
				data, salt, hashIterations);
	}

	public static byte[] md5(byte[] data, byte[] salt) {
		return sha1(data, salt, 1);
	}

	public static byte[] md5(String data, String salt, int hashIterations) {
		return sha1(StringUtils.getBytesUtf8(data),
				StringUtils.getBytesUtf8(salt), hashIterations);
	}

	public static byte[] md5(String data, String salt) {
		return sha1(data, salt, 1);
	}

	public static String md5Hax(byte[] data, byte[] salt, int hashIterations) {
		return Hex.encodeHexString(sha1(data, salt, hashIterations));
	}

	public static String md5Hax(byte[] data, byte[] salt) {
		return sha1Hax(data, salt, 1);
	}

	public static String md5Hex(String data, String salt, int hashIterations) {
		return sha1Hax(StringUtils.getBytesUtf8(data),
				StringUtils.getBytesUtf8(salt), hashIterations);
	}

	public static String md5Hex(String data, String salt) {
		return sha1Hex(data, salt, 1);
	}
}
