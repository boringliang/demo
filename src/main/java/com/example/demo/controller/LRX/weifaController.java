package com.example.demo.controller.LRX;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.po.LRX.fenye;
import com.example.demo.po.LRX.getcolumns;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class weifaController {

    @RequestMapping("/weifa")
    @ResponseBody
    public ModelAndView keyArea(HttpServletRequest request) {                  //流量检测异常的重点区域列表
        //HttpServletRequest request
        //String areaId = request.getParameter("areaId");
        Map<String, String> tablenamemap = new HashMap<>();
        tablenamemap.put("VIO_VIOLATION", "违法表");
        tablenamemap.put("ANLYS_ILLEGAL_DATA_HOUR", "违法数据小时汇总表");
        tablenamemap.put("ANLYS_MOTORBUS_VIOLATION_DATA", "大客车违规运行数据表");
        tablenamemap.put("ANLYS_MAJORCAR_ACCIDENT_DATA", "客车违规运行预处理中间表");
        tablenamemap.put("ILLEGAL_DATA_GEOMETRY", "违法地理信息表");
        tablenamemap.put("ILLEGAL_VIOACTION_LOCAL", "区间测速违法代码表");
        tablenamemap.put("MAJORCAR_ILL", "重点车辆违法表");

        JSONObject json = new JSONObject(tablenamemap);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("weifa");
        mav.addObject("tablename", json);
//        mav.addObject("keyAreaList");
        return mav;
    }

    @RequestMapping("/lrx/WFgettablename")
    @ResponseBody
    public Map gettablename(HttpServletRequest request) {
        Map<String, String> tablenamemap = new HashMap<>();
        tablenamemap.put("VIO_VIOLATION", "违法表");
        tablenamemap.put("ANLYS_ILLEGAL_DATA_HOUR", "违法数据小时汇总表");
        tablenamemap.put("ANLYS_MOTORBUS_VIOLATION_DATA", "大客车违规运行数据表");
        tablenamemap.put("ANLYS_MAJORCAR_ACCIDENT_DATA", "客车违规运行预处理中间表");
        tablenamemap.put("ILLEGAL_DATA_GEOMETRY", "违法地理信息表");
        tablenamemap.put("ILLEGAL_VIOACTION_LOCAL", "区间测速违法代码表");
        tablenamemap.put("MAJORCAR_ILL", "重点车辆违法表");

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

    @RequestMapping("/lrx/WFlietable")
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

    @RequestMapping("/lrx/WFbarchart")
    @ResponseBody
    public List barchart(HttpServletRequest request){
        List<List> result = new ArrayList<>();
        String colname = request.getParameter("colname");
        String tablename = request.getParameter("tablename");
        fenye fy = new fenye();
        result = fy.countByCol(colname,tablename);
        return result;
    }
}
