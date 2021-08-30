package com.ywb.ywbdemo.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterConversionUtilsTest {

    @Test
    void toLowerCase() {
        String s = LetterConversionUtils.toLowerCase("CONTRACT_TYPE\n" +
                "START_DATE\n" +
                "CONSTRUCTION_PERIOD_DAYS\n" +
                "SCALE_CONSTRUCTION\n" +
                "BIDDER_LEGAL_CARD_TYPE\n" +
                "BIDDER_LEGAL_SUPERVISOR_CARD_NO\n" +
                "CONSORTIUM_NAME\n" +
                "CONSORTIUM_CODE\n");
        System.out.println(s.toString());
    }

    @Test
    void toUpperCase() {
        String s1 = LetterConversionUtils.toUpperCase("agencyName");
        System.out.println(s1);
    }
}