package com.ywb.ywbdemo.utils;

/**
 * 英文字母大小转化工具类 2021082401
 *
 * @author ywb
 */
public class LetterConversionUtils {

    /**
     * 字符串转为小写
     *
     * @param str PRICE_UNIT
     * @return priceUnit
     */
    public static String toLowerCase(String str) {
        // str字符串转小写
        String lowerCaseStr = str.toLowerCase();
        char[] charArray = lowerCaseStr.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < charArray.length; i++) {
            // 判断是否是大写字母
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
            if (charArray[i] != '_') {
                stringBuffer.append(charArray[i]);
            }
        }
        return stringBuffer.toString();
    }

    /**
     * 字符串转为大写
     *
     * @param str priceUnit
     * @return PRICE_UNIT
     */
    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < charArray.length; i++) {
            // 判断是否是大写字母
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                stringBuffer.append("_");
            }
            // 判断是否是小写字母
            else if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
            stringBuffer.append(charArray[i]);
        }
        return stringBuffer.toString();
    }
}
