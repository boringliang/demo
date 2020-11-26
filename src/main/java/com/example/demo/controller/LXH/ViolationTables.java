package com.example.demo.controller.LXH;

import java.util.*;

public class ViolationTables {
    private static List<String> tables = new ArrayList<>(Arrays.asList(
            "VIO_VIOLATION",
            "test"
    ));


    public static List<String> getTables() {return tables;}

    public static Map<String,String> getConlumns(String tablename){
        Map<String,String> map = new HashMap<>();
        if(tablename.equals("VIO_VIOLATION")){
            map.put("违法编号", "WFBH");
            map.put("驾驶证号", "JSZH");
            map.put("车辆分类", "CLFL");
            map.put("号牌种类", "HPZL");
            map.put("号牌号码", "HPHM");
            map.put("违法地点", "WFDD");
            map.put("违法时间", "WFSJ");
            map.put("时刻","SK");
            map.put("违法行为", "WFXW");
            map.put("事故等级", "SGDJ");
            map.put("年龄", "NL");
            map.put("性别", "XB");
        }
        return map;


    }


}
