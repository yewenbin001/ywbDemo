package com.ywb.ywbdemo.utils;

import cn.hutool.core.date.DateTime;
import org.apache.poi.ss.usermodel.DateUtil;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class LetterConversionUtilsTest {

    @Test
    void toLowerCase() {
        String s = LetterConversionUtils.toLowerCase("`TITLE_LEVEL`,\n" +
                "        `TITLE_PROFESSIONAL`,\n" +
                "        `REGISTRATION_TYPE_LEVEL`,\n" +
                "        `PROFESSIONAL_NAME`");
        System.out.println(s.toString());

    }

    @Test
    void toUpperCase() {
        String s1 = LetterConversionUtils.toUpperCase("LegalReprCardType,ContactCardType");
        System.out.println(s1);
    }
}