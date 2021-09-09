package com.ywb.ywbdemo.utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ywb
 * @version 1.0
 * @description TODO
 * @date 2021/8/31 9:41
 */
class PoiUtilTest {

    @Test
    void writeIntoExcel() {
        ArrayList<String> tableHeader =new ArrayList<>();
        tableHeader.add("表名");
        tableHeader.add("表名注释");
        tableHeader.add("字段名(大)");
        tableHeader.add("字段名(小)");
        tableHeader.add("字段注释");
        tableHeader.add("字段类型");
        Map<String, Object> rowData =new HashMap<>();
        ArrayList<String> rowHeader =new ArrayList<>();
        rowHeader.add("T_LOG_OPER");
        rowHeader.add("用户操作日志");
        rowHeader.add("LOG_ID");
        rowHeader.add("LOG_ID");
        rowHeader.add("日志编码");
        rowHeader.add("varchar(32)");
        ArrayList<String> rowHeader1 =new ArrayList<>();
        rowHeader.add("T_LOG_OPER");
        rowHeader.add("用户操作日志");
        rowHeader.add("USER_ID");
        rowHeader.add("USER_ID");
        rowHeader.add("操作用户编码");
        rowHeader.add("varchar(32)");
        rowData.put("T_LOG_OPER:LOG_ID",rowHeader);
        rowData.put("T_LOG_OPER:USER_ID",rowHeader1);
//        boolean b = PoiUtil.writeIntoExcel("D:\\test\\test1.xlsx", "测试数据库", tableHeader, rowData);
//        System.out.println(b);
    }
}