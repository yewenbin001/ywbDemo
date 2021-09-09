package com.ywb.ywbdemo.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ywb
 * @version 1.0
 * @description TODO
 * @date 2021/9/6 20:26
 */
class DateUtilsTest {

    @Test
    void startTimeMonth() {
        System.out.println("A: "+DateUtils.startTimeMonth());
    }

    @Test
    void endTimeMonth() {
        System.out.println("B: "+DateUtils.endTimeMonth());
    }

    @Test
    void startTimeDay() {
        System.out.println("C: "+DateUtils.startTimeDay());
    }

    @Test
    void endTimeDay() {
        System.out.println("D: "+DateUtils.endTimeDay());
    }
}