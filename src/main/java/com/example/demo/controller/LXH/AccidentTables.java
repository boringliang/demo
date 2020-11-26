package com.example.demo.controller.LXH;

import java.util.*;

public class AccidentTables {
    private static List<String> tables = new ArrayList<>(Arrays.asList(
            "ACD_FILE"
    ));


    public static List<String> getTables() {return tables;}

    public static Map<String,String> getConlumns(String tablename){
        Map<String,String> map = new HashMap<>();
        if(tablename.equals("ACD_FILE")){
            map.put("天气", "TQ");
            map.put("能见度", "NJD");
            map.put("事故类型","SGBH");
            map.put("时刻", "SK");
            map.put("失踪人数", "SZRS");
            map.put("重伤人数", "ZSRS");
            map.put("轻伤人数", "QSRS");
            map.put("受伤人数", "SSRS");
            map.put("机动车数量", "JDCSL");
            map.put("非机动车数量", "FJDCSL");
            map.put("行人数量", "XRSL");
            map.put("刑事管理部门", "XSGLBM");
            map.put("刑事办案单位", "XSBADW");
            map.put("刑事办案人", "XSBAR");
            map.put("路外事故类型", "LWSGLX");
            map.put("碰撞方式", "PZFS");
            map.put("单车事故", "DCSG");
            map.put("照明条件", "ZMTJ");
            map.put("事故发生时间", "SGFSSJ");
            map.put("路号", "LH");
            map.put("路名", "LM");
            map.put("事故地点", "SGDD");

        }
        return map;
    }

}
