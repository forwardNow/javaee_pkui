package com.pkusoft.framework.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInputStream;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.JDKX509CertificateFactory;
import org.bouncycastle.x509.X509V3CertificateGenerator;

import sun.misc.BASE64Encoder;


/**
 * 证书工具类
 * @author tanggj
 *
 */
public class CertUtils {
	/**
	 * 生成密钥对
	 * @return KeyPair
	 * @throws Exception
	 */
	public static KeyPair generateRSAKeyPair() throws Exception {
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
		
		KeyPairGenerator gen = KeyPairGenerator.getInstance("RSA", "BC");
		gen.initialize(1024, new SecureRandom());
		return gen.generateKeyPair();
	}
	
	// issuerDN = "C=CN, O=Development, OU=Unknow, CN=LicenseCA, L=WuHan, S=HuBei"
	public static X509Certificate createCert(PublicKey pubKey, PrivateKey privKey, String issuerDN, int limit) throws Exception {
		X509V3CertificateGenerator v3CertGen = new X509V3CertificateGenerator();
		v3CertGen.setSerialNumber(BigInteger.valueOf(System.currentTimeMillis()));
		X509Principal dn = new X509Principal(issuerDN);
		v3CertGen.setIssuerDN(dn);
		v3CertGen.setSubjectDN(dn);

		Date today = new Date(System.currentTimeMillis());
		Date endDay = DateTimeUtils.addMonths(today, limit);
		v3CertGen.setNotBefore(today);
		v3CertGen.setNotAfter(endDay);
		v3CertGen.setPublicKey(pubKey);
		v3CertGen.setSignatureAlgorithm("SHA1WithRSA");

		ByteArrayInputStream bIn = new ByteArrayInputStream(pubKey.getEncoded());
		SubjectPublicKeyInfo info = new SubjectPublicKeyInfo((ASN1Sequence) new DERInputStream(bIn).readObject());
		v3CertGen.addExtension(X509Extensions.SubjectKeyIdentifier, false,new SubjectKeyIdentifier(info));
		v3CertGen.addExtension(X509Extensions.AuthorityKeyIdentifier, false,new AuthorityKeyIdentifier(info));
		v3CertGen.addExtension(X509Extensions.BasicConstraints, false,new BasicConstraints(true));
		v3CertGen.addExtension(X509Extensions.KeyUsage, false, new KeyUsage(6));

		X509Certificate cert = v3CertGen.generate(privKey, "BC");
		cert.checkValidity(new Date());
		cert.verify(pubKey);
		
		return cert;
	}
	
	public static String toBase64Cert(X509Certificate cert) throws Exception{
		String str =  new BASE64Encoder().encodeBuffer(cert.getEncoded());
		/*Pattern p = Pattern.compile("\t|\r|\n");
		Matcher m = p.matcher(str);
		str = m.replaceAll("");*/
		return str;
	}
	
	/**
	 * 获取证书数据
	 * @param issuerDN 如："C=CN, O=Development, OU=Unknow, CN=LicenseCA, L=WuHan, S=HuBei"
	 * @param limit 距今有效月数
	 * @return
	 * @throws Exception
	 */
	/*public static String getCertString(String issuerDN, int limit) throws Exception{
		KeyPair keyPair = generateRSAKeyPair();
		RSAPublicKey pubKey = (RSAPublicKey) keyPair.getPublic();
		RSAPrivateKey priKey = (RSAPrivateKey) keyPair.getPrivate();
		
		X509Certificate cert = createCert(pubKey,priKey, issuerDN, limit);
		return toBase64Cert(cert);
	}*/
	
	/**
	 * 生成公钥
	 * 
	 * @param modulus
	 * @param publicExponent
	 * @return RSAPublicKey
	 * @throws Exception
	 */
	public static RSAPublicKey generateRSAPublicKey(byte[] modulus, byte[] publicExponent) throws Exception {
		KeyFactory keyFac = null;
		try {
			keyFac = KeyFactory.getInstance("RSA",
					new org.bouncycastle.jce.provider.BouncyCastleProvider());
		} catch (NoSuchAlgorithmException ex) {
			throw new Exception(ex.getMessage());
		}

		RSAPublicKeySpec pubKeySpec = new RSAPublicKeySpec(new BigInteger(
				modulus), new BigInteger(publicExponent));
		try {
			return (RSAPublicKey) keyFac.generatePublic(pubKeySpec);
		} catch (InvalidKeySpecException ex) {
			throw new Exception(ex.getMessage());
		}
	}
	
	/**
	 * 生成私钥
	 * 
	 * @param modulus
	 * @param privateExponent
	 * @return RSAPrivateKey
	 * @throws Exception
	 */
	public static RSAPrivateKey generateRSAPrivateKey(byte[] modulus, byte[] privateExponent) throws Exception {
		KeyFactory keyFac = null;
		try {
			keyFac = KeyFactory.getInstance("RSA", new org.bouncycastle.jce.provider.BouncyCastleProvider());
		} catch (NoSuchAlgorithmException ex) {
			throw new Exception(ex.getMessage());
		}

		RSAPrivateKeySpec priKeySpec = new RSAPrivateKeySpec(new BigInteger(
				modulus), new BigInteger(privateExponent));
		try {
			return (RSAPrivateKey) keyFac.generatePrivate(priKeySpec);
		} catch (InvalidKeySpecException ex) {
			throw new Exception(ex.getMessage());
		}
	}
	
	/**
	 * 解密
	 * 
	 * @param key
	 *            解密的密钥
	 * @param raw
	 *            已经加密的数据
	 * @return 解密后的明文
	 * @throws Exception
	 */
	public static byte[] decrypt(Key key, byte[] raw) throws Exception {
		try {
			Cipher cipher = Cipher.getInstance("RSA", new org.bouncycastle.jce.provider.BouncyCastleProvider());
			cipher.init(cipher.DECRYPT_MODE, key);
			int blockSize = cipher.getBlockSize();
			ByteArrayOutputStream bout = new ByteArrayOutputStream(64);
			int i = 0;

			while (raw.length - i * blockSize > 0) {
				bout.write(cipher.doFinal(raw, i * blockSize, blockSize));
				i++;
			}
			return bout.toByteArray();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	
	/**
	 * 加密
	 * 
	 * @param key 加密的密钥(私钥)
	 * @param data 待加密的明文数据
	 * @return 加密后的数据
	 * @throws Exception
	 */
	public static byte[] encrypt(Key key, byte[] data) throws Exception {
		try {
			Cipher cipher = Cipher.getInstance("RSA", new org.bouncycastle.jce.provider.BouncyCastleProvider());
			cipher.init(Cipher.ENCRYPT_MODE, key);
			int blockSize = cipher.getBlockSize();// 获得加密块大小，如：加密前数据为128个byte，而key_size=1024
													// 加密块大小为127
													// byte,加密后为128个byte;因此共有2个加密块，第一个127
													// byte第二个为1个byte
			int outputSize = cipher.getOutputSize(data.length);// 获得加密块加密后块大小
			int leavedSize = data.length % blockSize;
			int blocksSize = leavedSize != 0 ? data.length / blockSize + 1
					: data.length / blockSize;
			byte[] raw = new byte[outputSize * blocksSize];
			int i = 0;
			while (data.length - i * blockSize > 0) {
				if (data.length - i * blockSize > blockSize)
					cipher.doFinal(data, i * blockSize, blockSize, raw, i
							* outputSize);
				else
					cipher.doFinal(data, i * blockSize, data.length - i
							* blockSize, raw, i * outputSize);
				// 这里面doUpdate方法不可用，查看源代码后发现每次doUpdate后并没有什么实际动作除了把byte[]放到ByteArrayOutputStream中，而最后doFinal的时候才将所有的byte[]进行加密，可是到了此时加密块大小很可能已经超出了OutputSize所以只好用dofinal方法。

				i++;
			}
			return raw;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	/**
	 * 解密
	 * @param base64Cert base64证书
	 * @param base64PrivStr 已经加密的数据
	 * @return 解密后的明文
	 * @throws Exception 
	 * @throws Exception
	 */
	public static byte[] decrypt(byte[] cert, byte[] encryptData) throws Exception{
		JDKX509CertificateFactory certificatefactory = new JDKX509CertificateFactory();
		X509Certificate cer = (X509Certificate) certificatefactory.engineGenerateCertificate(new ByteArrayInputStream(cert));
		return decrypt(cer.getPublicKey(), encryptData);
	}
}
