package com.ywb.ywbdemo.utils;

import cn.hutool.core.date.DateTime;

import java.util.Calendar;
import java.util.Date;

/**
 * @author ywb
 * @version 1.0
 * @description 获取本月第一秒和最后一秒、获取今天第一秒和最后一秒
 * @date 2021/9/6 20:21
 */
public class DateUtils {
    /**
     * 获取本月第一秒
     * @return
     */
    public static Date startTimeMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateTime.now());
        //设置为1号,当前日期既为本月第一天
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        calendar.set(Calendar.MINUTE, 0);
        //将秒至0
        calendar.set(Calendar.SECOND, 0);
        //将毫秒至0
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取本月最后一秒
     * @return
     */
    public static Date endTimeMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateTime.now());
        //设置为当月最后一天
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        //将小时至23
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        calendar.set(Calendar.MINUTE, 59);
        //将秒至59
        calendar.set(Calendar.SECOND, 59);
        //将毫秒至999
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    /**
     * 获取当天第一秒
     * @return
     */
    public static Date startTimeDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateTime.now());
        //将小时至0
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        calendar.set(Calendar.MINUTE, 0);
        //将秒至0
        calendar.set(Calendar.SECOND, 0);
        //将毫秒至0
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
    /**
     * 获取当天最后一秒
     * @return
     */
    public static Date endTimeDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateTime.now());
        //将小时至23
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        calendar.set(Calendar.MINUTE, 59);
        //将秒至59
        calendar.set(Calendar.SECOND, 59);
        //将毫秒至999
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }
}
