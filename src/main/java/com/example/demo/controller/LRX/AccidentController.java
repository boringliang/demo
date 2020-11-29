package com.example.demo.controller.LRX;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.po.LRX.fenye;
import com.example.demo.po.LRX.getcolumns;
import org.apache.jena.base.Sys;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AccidentController {

    @RequestMapping("")
    @ResponseBody
    public ModelAndView keyArea(HttpServletRequest request) {                  //流量检测异常的重点区域列表
        //HttpServletRequest request
        //String areaId = request.getParameter("areaId");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
//        mav.addObject("keyAreaList");
        return mav;
    }

    @RequestMapping("/index.html")
    @ResponseBody
    public ModelAndView zhengzha(HttpServletRequest request) {                  //流量检测异常的重点区域列表
        //HttpServletRequest request
        //String areaId = request.getParameter("areaId");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
//        mav.addObject("keyAreaList");
        return mav;
    }

    @RequestMapping("/accident")
    @ResponseBody
    public ModelAndView accident(HttpServletRequest request) {                  //流量检测异常的重点区域列表
        //HttpServletRequest request
        //String areaId = request.getParameter("areaId");
        Map<String, String> tablenamemap = new HashMap<>();
        tablenamemap.put("ACD_DUTY", "一般事故认定书");
        tablenamemap.put("ACD_DUTYSIMPLE", "简易事故主表");
        tablenamemap.put("ACD_FILE", "一般事故主表");
        tablenamemap.put("ANLYS_MAJORCAR_ACCIDENT_DATA", "重点车辆事故分析数据表");
        tablenamemap.put("ANLYS_POLICE_CASE_HOUR", "警情分析小时统计表");
        tablenamemap.put("ANLYS_SG_INFO", "事故信息表");
        tablenamemap.put("BLACK_ALERT_INFO", "报警信息表");
        tablenamemap.put("DEVICE_SECTION", "事件检测设备路段关联表");
        tablenamemap.put("POLICE_CASE", "警情表");
        tablenamemap.put("TRAFFIC_INFO", "交通信息表");
        tablenamemap.put("PIS_INFO_BASE", "情报信息表");
        tablenamemap.put("PIS_INFO_DETAILS", "情报附属信息表");
        tablenamemap.put("PIS_INFO_GROUP_RELATION", "情报组关联情报表");

        JSONObject json = new JSONObject(tablenamemap);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("accident");
        mav.addObject("tablename", json);
        System.out.println(json);
        return mav;
    }

    @RequestMapping("/intelligen")
    @ResponseBody
    public ModelAndView intelligen(HttpServletRequest request) {                  //流量检测异常的重点区域列表
        //HttpServletRequest request
        //String areaId = request.getParameter("areaId");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("intelligen");
//        mav.addObject("keyAreaList");
        return mav;
    }

    @RequestMapping("/lrx/gettablename")
    @ResponseBody
    public Map gettablename(HttpServletRequest request) {
        Map<String, String> tablenamemap = new HashMap<>();
        tablenamemap.put("ACD_DUTY", "一般事故认定书");
        tablenamemap.put("ACD_DUTYSIMPLE", "简易事故主表");
        tablenamemap.put("ACD_FILE", "一般事故主表");
        tablenamemap.put("ANLYS_MAJORCAR_ACCIDENT_DATA", "重点车辆事故分析数据表");
        tablenamemap.put("ANLYS_POLICE_CASE_HOUR", "警情分析小时统计表");
        tablenamemap.put("ANLYS_SG_INFO", "事故信息表");
        tablenamemap.put("BLACK_ALERT_INFO", "报警信息表");
        tablenamemap.put("DEVICE_SECTION", "事件检测设备路段关联表");
        tablenamemap.put("POLICE_CASE", "警情表");
        tablenamemap.put("TRAFFIC_INFO", "交通信息表");
        tablenamemap.put("PIS_INFO_BASE", "情报信息表");
        tablenamemap.put("PIS_INFO_DETAILS", "情报附属信息表");
        tablenamemap.put("PIS_INFO_GROUP_RELATION", "情报组关联情报表");

        String tablename = request.getParameter("data");
        System.out.println(request.getParameter("data"));
        System.out.println(request.getParameter("pagenum"));
        System.out.println(request.getParameter("pagerange"));
        int pagenum = Integer.parseInt(request.getParameter("pagenum"));
        int pagerange = Integer.parseInt(request.getParameter("pagerange"));
        System.out.println(tablename);
        String tablekey = "";
        for (Map.Entry<String, String> entry : tablenamemap.entrySet()) {
            if (entry.getValue().equals(tablename)) {
                tablekey = entry.getKey();
                break;
            }
        }
        //System.out.println(tablekey);
        List resultlist = new fenye().selectByPage(pagenum,pagerange,"lrx." + tablekey);
        System.out.println("********************************************");
        System.out.println(resultlist);
//        for(int i=0;i<resultlist.size();i++){
//            System.out.println(resultlist.get(i));
//        }
        getcolumns gc = new getcolumns();
        List finallist = new ArrayList();
        finallist.add(gc.getcolumns(tablekey));
        finallist.add(resultlist);

        fenye fy = new fenye();
        int datacount = fy.count("LRX."+tablekey);
        System.out.println(datacount);
        Map<String,Object> map = new HashMap<>();
        System.out.println("********************************************");
        System.out.println(datacount);
        map.put("maxcount",datacount);
        map.put("finallist",finallist);

        return map;
    }

    @RequestMapping("/lrx/lietable")
    @ResponseBody
    public Map lietable(HttpServletRequest request) {                  //流量检测异常的重点区域列表
        //HttpServletRequest request
        String tablename = request.getParameter("tablename");
        int pagenum = Integer.parseInt(request.getParameter("pagenumber"));
        int pagerange = Integer.parseInt(request.getParameter("pagerange"));
        JSONArray collist = JSON.parseArray(request.getParameter("collist"));
//        System.out.println(tablename + "\t" + pagenum + "\t" + pagerange + "\t" + collist);
//        System.out.println(collist.get(1));
        Map<String,Object> map = new HashMap<>();

        List<String> collist1 = new ArrayList<>();
        collist1.add("ROWNO");
        for(int i=0;i<collist.size();i++){
            collist1.add(collist.get(i).toString());
        }
        List resultlist = new fenye().selectByPage(pagenum,pagerange,"lrx." + tablename, collist1);
        System.out.println(resultlist);
        map.put("datalist", resultlist);

        return map;
    }

    @RequestMapping("/lrx/barchart")
    @ResponseBody
    public List barchart(HttpServletRequest request){
        List<List> result = new ArrayList<>();
        String colname = request.getParameter("colname");
        String tablename = request.getParameter("tablename");
        fenye fy = new fenye();
        result = fy.countByCol(colname,tablename);
        return result;
    }

    @RequestMapping("/lrx/parallel")
    @ResponseBody
    public List parallel(HttpServletRequest request){
        List result = new ArrayList();
        fenye fy = new fenye();
        result = fy.parallel();
        System.out.println(result);
        return result;
    }

    @RequestMapping("/lrx/3Dbar")
    @ResponseBody
    public List sanweibar(HttpServletRequest request){
        List result = new ArrayList();
        fenye fy = new fenye();
        List arealist = fy.selectBySql("select distinct XZQH from LRX.ACD_FILE");
        List acciTypelist = fy.selectBySql("select distinct SGLX from LRX.ACD_FILE");
        for(int y=0;y<acciTypelist.size();y++){
            for(int x=0;x<arealist.size();x++){
                String sql = "select count(*) from LRX.ACD_FILE where XZQH="+((List)arealist.get(x)).get(0)+
                        " and SGLX="+((List)acciTypelist.get(y)).get(0);
                System.out.println(sql);
                List count = fy.selectBySql(sql);
                List linshi = new ArrayList();
                linshi.add(y);
                linshi.add(x);
                linshi.add(((List)count.get(0)).get(0));
                result.add(linshi);
            }
        }
//        result = fy.selectBySql("select count XZQH from LRX.ACD_FILE");
//        System.out.println(result);
        return result;
    }

}
