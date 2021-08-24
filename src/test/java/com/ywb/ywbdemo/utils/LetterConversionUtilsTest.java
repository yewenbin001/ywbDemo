package com.ywb.ywbdemo.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterConversionUtilsTest {

    @Test
    void toLowerCase() {
        String s = LetterConversionUtils.toLowerCase("BID_SECTION_NAME\n" +
                "TENDER_PROJECT_CODE\n" +
                "BID_SECTION_CODE\n");
        System.out.println(s.toString());
    }

    @Test
    void toUpperCase() {
        String s1 = LetterConversionUtils.toUpperCase("contractId\n" +
                "tenderProjectCode\n" +
                "bidSectionCode");
        System.out.println(s1);
    }
}