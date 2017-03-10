package com.pkusoft.framework.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;


/**
 * 拼音操作工具类, 依赖pinyin4j
 * @author tanggj
 *
 */
public class PinyinUtils {

    /**
     * 将字符串转换成拼音数组
     * 
     * @param src
     * @return 拼音数组
     */
    public static String[] stringToPinyin(String src) {
        return stringToPinyin(src, false, null);
    }
    /**
     * 将字符串转换成拼音数组
     * 
     * @param src
     * @return 拼音数组
     */
    public static String[] stringToPinyin(String src,String separator) {
        return stringToPinyin(src, true, separator);
    }

    /**
     * 将字符串转换成拼音数组
     * 
     * @param src
     * @param isPolyphone
     *            是否查出多音字的所有拼音
     * @param separator
     *            多音字拼音之间的分隔符
     * @return 拼音数组
     */
    public static String[] stringToPinyin(String src, boolean isPolyphone,
            String separator) {
        // 判断字符串是否为空
        if ("".equals(src) || null == src) {
            return null;
        }
        char[] srcChar = src.toCharArray();
        int srcCount = srcChar.length;
        String[] srcStr = new String[srcCount];

        for (int i = 0; i < srcCount; i++) {
            srcStr[i] = charToPinyin(srcChar[i], isPolyphone, separator);
        }
        return srcStr;
    }

    /**
     * 将单个字符转换成拼音
     * 
     * @param src 
     * @param isPolyphone
     * @param separator
     * @return 拼音
     */
    public static String charToPinyin(char src, boolean isPolyphone,
            String separator) {
        // 创建汉语拼音处理类
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        // 输出设置，大小写，音标方式
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);

        StringBuffer tempPinying = new StringBuffer();
        

        // 如果是中文
        if (src > 128) {
            try {
                // 转换得出结果
                String[] strs = PinyinHelper.toHanyuPinyinStringArray(src, defaultFormat);
                if(strs != null){
	                // 是否查出多音字，默认是查出多音字的第一个字符
	                if (isPolyphone && null != separator) {
	                    for (int i = 0; i < strs.length; i++) {
	                        tempPinying.append(strs[i]);
	                        if (strs.length != (i + 1)) {
	                            // 多音字之间用特殊符号间隔起来
	                            tempPinying.append(separator);
	                        }
	                    }
	                } else {
	            		tempPinying.append(strs[0]);
	                }
                }

            } catch (BadHanyuPinyinOutputFormatCombination e) {
                e.printStackTrace();
            }
        } else {
            tempPinying.append(src);
        }

        return tempPinying.toString();

    }

    
    /**
     * 汉字转拼音
     * @param hanzi
     * @return 拼音
     */
    public static String hanziToPinyin(String hanzi){
        return hanziToPinyin(hanzi," ");
    }
    /**
     * 将汉字转换成拼音
     * @param hanzi
     * @param separator
     * @return 拼音
     */
    public static String hanziToPinyin(String hanzi,String separator){
            // 创建汉语拼音处理类
            HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
            // 输出设置，大小写，音标方式
            defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
            defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
            
            String pinyingStr="";
            try {
                pinyingStr=PinyinHelper.toHanyuPinyinString(hanzi, defaultFormat, separator);
            } catch (BadHanyuPinyinOutputFormatCombination e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }    
            return pinyingStr;
    }
    /**
     * 将字符串数组转换成字符串
     * @param str 
     * @param separator 各个字符串之间的分隔符
     * @return 转换后的字符串
     */
    public static String stringArrayToString(String[] str, String separator) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
            if (str.length != (i + 1)) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
    /**
     * 简单的将各个字符数组之间连接起来
     * @param str
     * @return 连接后的字符串
     */
    public  static String stringArrayToString(String[] str){
        return stringArrayToString(str,"");
    }
    /**
     * 将字符数组转换成字符串
     * @param ch 
     * @param separator 各个字符串之间的分隔符
     * @return 转换后的字符串
     */
    public static String charArrayToString(char[] ch, String separator) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
            if (ch.length != (i + 1)) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
    
    /**
     * 将字符数组转换成字符串
     * @param ch 
     * @return 转换后的字符串
     */
    public static String charArrayToString(char[] ch) {
        return charArrayToString(ch," ");
    }

    /**
     * 取汉字的首字母
     * @param src
     * @param isCapital 是否是大写
     * @return 首字母
     */
    public static char[]  getHeadByChar(char src,boolean isCapital){
        //如果不是汉字直接返回
        if (src <= 128) {
            return new char[]{src};
        }
        //获取所有的拼音
        String[] pinyingStr = PinyinHelper.toHanyuPinyinStringArray(src);
        if(pinyingStr == null){
        	return new char[]{src};
        }
        
        //创建返回对象
        int polyphoneSize=pinyingStr.length;
        char [] headChars=new char[polyphoneSize];
        int i=0;
        //截取首字符
        for(String s:pinyingStr){
            char headChar=s.charAt(0);
            //首字母是否大写，默认是小写
            if(isCapital){
                headChars[i]=Character.toUpperCase(headChar);
             }else{
                headChars[i]=headChar;
             }
            i++;
        }
        
        return headChars;
    }
    /**
     * 取汉字的首字母(默认是小写)
     * @param src
     * @return 首字母
     */
    public static char[]  getHeadByChar(char src){
        return getHeadByChar(src,false);
    }
    /**
     * 查找字符串首字母
     * @param src 
     * @return 首字母
     */
    public  static String[] getHeadByString(String src){
        return getHeadByString( src, false);
    }
    /**
     * 查找字符串首字母
     * @param src 
     * @param isCapital 是否大写
     * @return 字符串首字母
     */
    public  static String[] getHeadByString(String src,boolean isCapital){
        return getHeadByString( src, isCapital,null);
    }
    /**
     * 查找字符串首字母
     * @param src 
     * @param isCapital 是否大写
     * @param separator 分隔符
     * @return 字符串首字母
     */
    public static String[] getHeadByString(String src,boolean isCapital,String separator){
        char[]chars=src.toCharArray();
        String[] headString=new String[chars.length];
        int i=0;
        for(char ch:chars){
            
            char[]chs=getHeadByChar(ch,isCapital);
            StringBuffer sb=new StringBuffer();
            if(null!=separator){
                int j=1;
                
                for(char ch1:chs){
                    sb.append(ch1);
                    if(j!=chs.length){
                        sb.append(separator);
                    }
                    j++;
                }
            }else{
                sb.append(chs[0]);
            }
            headString[i]=sb.toString();
            i++;
        }
        return headString;
    }
    
    /**
     * 获取小写字母拼音头
     * @param str 汉字字符串
     * @return 小写字母拼音头
     */
    public static String getHeadPinyin(String str){
    	return stringArrayToString(getHeadByString(str));
    }
    
    /**
     * 获取小写字母全拼
     * @param str 汉字字符串
     * @return 小写字母全拼
     */
    public static String getPinyin(String str){
    	return stringArrayToString(stringToPinyin(str));
    }

}