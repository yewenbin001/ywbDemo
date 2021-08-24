package com.ywb.ywbdemo.utils;

/**
 * @author ywb
 * @description 常用正则表达式校验工具类
 * @date 2021/8/24 10:44
 * @version 1.0
 */
public class RegexCheckUtils {
  /**
   * @param str
   * @param length
   * @return
   */
  public static boolean isStringLengthCheck(String str, int length) {
    if (str.length() < 4) {
      return false;
    }
    return true;
  }
}
