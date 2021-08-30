package com.ywb.ywbdemo.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ywb
 * @version 1.0
 * @description TODO
 * @date 2021/8/30 9:00
 */
class RegexCheckUtilsTest {
    @Test
    void isStringLengthCheck() {
        boolean check = RegexCheckUtils.isStringLengthCheck("", 4);
        System.out.println(check);
    }

}