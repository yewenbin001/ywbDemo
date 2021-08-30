package com.ywb.ywbdemo.utils;

import org.springframework.util.StringUtils;

/**
 * @author ywb
 * @description 常用正则表达式校验工具类
 * @date 2021/8/24 10:44
 * @version 1.0
 */
public class RegexCheckUtils {
  /**
   * 验证字符串是否达到相应的长度
   * @param str
   * @param length
   * @return
   */
  public static boolean isStringLengthCheck(String str, int length) {
    //空的放回false
    if (!(StringUtils.hasLength(str)&& StringUtils.hasText(str))) {
      return false;
    }
    if (str.length() < length) {
      return false;
    }
    return true;
  }
}
