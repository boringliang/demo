package com.example.demo.controller.LXH;

import java.util.*;

public class ViolationTables {
    private static List<String> tables = new ArrayList<>(Arrays.asList(
            "选择表",
            "VIO_VIOLATION",
            "test"
    ));


    public static List<String> getTables() {return tables;}

    public static Map<String,String> getConlumns(String tablename){
        Map<String,String> map = new HashMap<>();
        if(tablename.equals("VIO_VIOLATION")){
            map.clear();
            map.put("决定书类别","JDSLB");
            map.put("人员分类","RYFL");
            map.put("准驾车型","ZJCX");
            map.put("当事人","DSR");
            map.put("住所行政区划","ZSXZQH");
            map.put("车辆分类","clfl");
            map.put("号牌种类","HPZL");
            map.put("号牌号码","HPHM");
            map.put("交通方式","JTFS");
            map.put("违法时间","WFSJ");
            map.put("行政区划","XZQH");
            map.put("道路类型", "DLLX");
            map.put("违法地点","WFDD");
            map.put("路口路段代码","LDDM");
            map.put("违法行为", "WFXW");
            map.put("违法记分数","WFJFS");
            map.put("时刻","SK");
            map.put("月份","MONTH");

            map.put("发现机关","FXJG");
            map.put("发现机关名称","FXJGMC");
            map.put("处理机关","CLJG");
            map.put("处理机关名称","CLJGMC");
            map.put("事故等级","SGDJ");
            map.put("处理对象标记 0-本地;1-本省外地市;2-外省","CLDXBJ");
            map.put("年龄", "NL");
            map.put("性别", "XB");
            map.put("驾驶人性质","JSRXZ");
            map.put("车辆用途","CLYT");
        }

        return map;
    }


}
