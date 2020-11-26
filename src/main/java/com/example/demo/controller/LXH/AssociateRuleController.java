package com.example.demo.controller.LXH;


import net.sf.json.JSONArray;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

@Controller
@RequestMapping("/rule")
public class AssociateRuleController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        JSONArray tables_json_array = JSONArray.fromObject(JamTables.getTables());
        mav.addObject("tables", tables_json_array.toString());
        mav.setViewName("LXH/AssociateRules");
        return mav;
    }


    @ResponseBody
    @RequestMapping("/jamres")
    public List<String> res(HttpServletRequest request) {
        String support = request.getParameter("support");
        String start_time = request.getParameter("start_time");
        String end_time = request.getParameter("end_time");
        String confidence = request.getParameter("confidence");
        String table_selected = request.getParameter("table_selected");
        System.out.println(support + start_time + end_time + confidence);

        List<String> list = new ArrayList<>();
        Process proc;

        try {

            String[] args1 = new String[]{"python", "C:/Users/10356/Desktop/data_mine/test.py", start_time, end_time, confidence, support, table_selected};
            System.out.println(start_time);
            System.out.println(end_time);
            System.out.println(confidence);
            System.out.println(support);
            System.out.println(table_selected);

            proc = Runtime.getRuntime().exec(args1);
            //用输入输出流来截取结果
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(),"GB2312"));
            String line = null;
            while ((line = in.readLine()) != null) {
                list.add(line);
                System.out.println(line);
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return list;
    }


//
//    @ResponseBody
//    @RequestMapping("/acd_file_res")
//    public ModelAndView ACF_FILE_rules(HttpServletRequest request){
//
//        ModelAndView mav = new ModelAndView();
//
//        JSONArray tables_json_array = JSONArray.fromObject(JamTables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//        String table_selected =request.getParameter("table_selected");
////        JamTables.getConlumns(table_selected);
//
//        Map<String,String> map = JamTables.getConlumns("ACD_FILE");
//        List<String> columnChinese = new ArrayList<>();
//        Set<String> keys=map.keySet();
//        for(HashMap.Entry<String,String> entry : map.entrySet()) {
//            columnChinese.add(entry.getKey());
//        }
//
//
//
//
//        mav.addObject("columns", columnChinese);
//        mav.setViewName("accident_rules");
//        return mav;
//
//
////    }
//    @ResponseBody
//    @RequestMapping("/acd_file_res1")
//    public List<String> ACF_FILE_rules1(HttpServletRequest request){
//
//        JSONArray tables_json_array = JSONArray.fromObject(JamTables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//        String table_selected =request.getParameter("table_selected");
////        JamTables.getConlumns(table_selected);
//
//        Map<String,String> map = JamTables.getConlumns("ACD_FILE");
//        List<String> columnChinese = new ArrayList<>();
//        for(HashMap.Entry<String,String> entry : map.entrySet()) {
//            columnChinese.add(entry.getKey());
//        }
//
//        return columnChinese;
//
//
//    }

//    @RequestMapping("/accidentindex")
//    public ModelAndView accident_index() {
//        ModelAndView mav = new ModelAndView();
//        JSONArray tables_json_array = JSONArray.fromObject(AccidentTables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//        mav.setViewName("accident_rules");
//        return mav;
//    }
//
//
//    @ResponseBody
//    @RequestMapping("/acd_file_attribute" )
//    public List<String> ACF_FILE_rules(HttpServletRequest request) {
//        String table_selected = request.getParameter("table_selected");
//        System.out.println(table_selected);
//        System.out.println(table_selected.getClass().getName());
//        System.out.println(table_selected.equals("ACD_FILE"));
//
//        Map<String, String> map = AccidentTables.getConlumns("ACD_FILE");
//        List<String> columnChinese = new ArrayList<>();
//        Set<String> keys = map.keySet();
//        for (HashMap.Entry<String, String> entry : map.entrySet()) {
//            columnChinese.add(entry.getKey());
//        }
//        return columnChinese;
//    }
//
//    @RequestMapping("/accident_res")
//    @ResponseBody
//    public List<String> accident_res(HttpServletRequest request){
//        String obj = request.getParameter("choices");
//
//        Map<String,String> map = JamTables.getConlumns("ACD_FILE");
//
//        JSONArray jsonArray = JSONArray.fromObject(obj);
//        List<String> list = new ArrayList();
//        //遍历jsonarray数组，将值赋给list
//        for(int i = 0;i < jsonArray.size(); i++) {
//            String str = jsonArray.getString(i);
//            String column = map.get(str);
//            System.out.println(column);
//            list.add(column);
//        }
//        System.out.println(list.toString());
////        Process proc;
////        try {
////
////            String[] args1 = new String[]{"python", "/Users/liuxuhui/PycharmProjects/data_mine/test1.py",list.toString(), "ACD_FILE"};
////            proc = Runtime.getRuntime().exec(args1);
////            //用输入输出流来截取结果
////            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
////            String line = null;
////            while ((line = in.readLine()) != null) {
////                list.add(line);
////                System.out.println(line);
////            }
////            in.close();
////            proc.waitFor();
////        } catch (IOException e) {
////            e.printStackTrace();
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
//
//        return list;
//
//
//
//
//
//    }





    }

