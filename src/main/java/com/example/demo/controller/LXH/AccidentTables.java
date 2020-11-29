package com.example.demo.controller.LXH;

import org.apache.commons.collections.map.HashedMap;

import java.util.*;

public class AccidentTables {
    private static List<String> tables = new ArrayList<>(Arrays.asList(
            "请选择表",
            "test",
            "ACD_FILE"

    ));


    public static List<String> getTables() {return tables;}

    public static Map<String, String> getConlumns(String tablename){
        Map<String,String> map = new HashMap<>();
        Map<String, Map<String, String>> checkbox = new HashedMap();

        if(tablename.equals("ACD_FILE")){
            map.clear();
            map.put("开始勘察时间","KSKCSJ");
            map.put("结束勘察时间","JSKCSJ");
            map.put("事故发生时间","SGFSSJ");
            map.put("初次录入时间", "CCLRSJ");
            map.put("更新时间", "GXSJ");
            map.put("星期","XQ");
            map.put("月份", "MONTH");
            map.put("时刻", "SK");
            map.put("事故地点","SGDD");
            map.put("路名","LM");
            map.put("路号","LH");
            map.put("所辖乡镇","SXXZ");
            map.put("绝对位置","JDWZ");
            map.put("天气", "TQ");
            map.put("能见度", "NJD");
            map.put("照明条件", "ZMTJ");
            map.put("地形", "DX");
            map.put("防护设施类型", "FHSSLX");
            map.put("道路物理隔离", "DLWLGL");
            map.put("路面状况", "DLZK");
            map.put("路面结构", "LMJG");
            map.put("路口路段类型", "LKLDLX");
            map.put("路表情况", "LBQK");
            map.put("事故类型","SGLX");
            map.put("事故初查原因", "SGCCYY");
            map.put("事故认定原因", "SGRDYY");
            map.put("事故初查原因分类", "CCYYFL");
            map.put("事故认定原因分类", "RDYYFL");
            map.put("事故形态", "SGXT");
            map.put("车辆间事故碰撞形态", "CLJSG");
            map.put("办案单位", "BADW");
            map.put("发送机关", "FSJG");
            map.put("现场", "XC");



        }

        if(tablename.equals("test")){
            checkbox.clear();
            Map<String,String> map1 = new HashMap<>();
            map1.put("开始勘察时间","KSKCSJ");
            map1.put("结束勘察时间","JSKCSJ");
            map1.put("事故发生时间","SGFSSJ");
            map1.put("初次录入时间", "CCLRSJ");
            map1.put("更新时间", "GXSJ");
            map1.put("星期","XQ");
            map1.put("时刻", "SK");
            checkbox.put("时间信息", map1);

            Map<String,String> map2 = new HashMap<>();
            map2.put("事故地点","SGDD");
            map2.put("路名","SGDD");
            map2.put("路号","SGDD");
            map2.put("所辖乡镇","SXXZ");
            map2.put("绝对位置","JDWZ");
            checkbox.put("地点信息", map2);

            Map<String,String> map3 = new HashMap<>();
            map.put("天气", "TQ");
            map.put("能见度", "NJD");
            map.put("照明条件", "ZMTJ");
            map.put("地形", "DX");
            map.put("防护设施类型", "FHSSLX");
            map.put("道路物理隔离", "DLWLGL");
            map.put("路面状况", "DLZK");
            map.put("路面结构", "LMJG");
            map.put("路口路段类型", "LKLDLX");
            map.put("路表情况", "LBQK");

            checkbox.put("环境信息", map3);

            Map<String,String> map4 = new HashMap<>();
            map4.put("事故类型","SGBH");

            map4.put("事故初查原因", "SGCCYY");
            map4.put("事故认定原因", "SGRDYY");
            map4.put("事故初查原因分类", "CCYYFL");
            map4.put("事故认定原因分类", "RDYYFL");
            map4.put("事故形态", "SGXT");
            map4.put("车辆间事故碰撞形态", "CLJSG");
            map4.put("办案单位", "BADW");
            map4.put("发送机关", "fsjg");
            checkbox.put("事故信息", map4);

        }


        return map;
    }

}
