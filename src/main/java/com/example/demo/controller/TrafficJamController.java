package com.example.demo.controller;

//import com.alibaba.fastjson.JSONArray;

import lombok.SneakyThrows;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.DefaultDefaultValueProcessor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//import com.mysql.cj.protocol.Resultset;

@Controller
@MapperScan("com.example.demo.mapper.LYWMapper")
public class TrafficJamController {
    private static int number = 0;


//    @ResponseBody
//    @RequestMapping("/traffic_jam_INDEX_ROAD_INDEX")
//    ModelAndView INDEX_ROAD_INDEX_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有ROAD_ID用来放入下拉框
//        IndexRoadIndexExample example = new IndexRoadIndexExample();
//        IndexRoadIndexExample.Criteria where = example.createCriteria();
//        List<String> ids = indexRoadIndexMapper.getUniqueROAD_ID();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//        //得到所有的时间用来放入下拉框,这里直接注释掉吧，因为用到的就那几个值，直接写在页面里也行
////        List<Date> dates = indexRoadIndexMapper.getUniqueINSERT_TIME();
////        Set<Integer> days = new HashSet<>();
////        Set<Integer> months = new HashSet<>();
////        Set<Integer> years = new HashSet<>();
////        for (Date d : dates) {
////            days.add(d.getDate());
////            months.add(d.getMonth());
////            years.add(d.getYear());
////        }
//        List<Integer> days = new ArrayList<>();
//        for (int i = 0; i <= 31; i++) {
//            days.add(i);
//        }
//        List<Integer> months = new ArrayList<Integer>(Arrays.asList(3, 4, 5));//因为默认从0开始
//        List<Integer> years = new ArrayList<>(Arrays.asList(120));//因为默认从1900开始
//        JSONArray days_json_array = JSONArray.fromObject(days);
//        JSONArray months_json_array = JSONArray.fromObject(months);
//        JSONArray years_json_array = JSONArray.fromObject(years);
//        mav.addObject("days", days_json_array.toString());
//        mav.addObject("months", months_json_array.toString());
//        mav.addObject("years", years_json_array.toString());
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
////        if (request.getParameter("day") != null) {
////            String year = request.getParameter("year");
////            String month_got = request.getParameter("month");
////            String month = month_got.length()==2 ? month_got : "0" + month_got;
////            String day_got = request.getParameter("day");
////            String day = day_got.length()==2 ? day_got : "0" + day_got;
////            String ROAD_ID = request.getParameter("ROAD_ID");
////            System.out.println(year);
////            System.out.println(month);
////            System.out.println(day);
////            List<Double> INDEY = indexRoadIndexMapper.getINDEY(year, month, day, ROAD_ID);
////            System.out.println(INDEY);
////            JSONArray INDEY_json_array = JSONArray.fromObject(INDEY);
////
////            List<String> astrings = new ArrayList<>();
////            astrings.add("a fuck ");
////            astrings.add("you!");
////            JSONArray astrings_json_array = JSONArray.fromObject(astrings);
////            mav.addObject("astrings", astrings_json_array.toString());
////            System.out.println(astrings_json_array.toString());
////            System.out.println(astrings_json_array);
////
////            mav.addObject("INDEY", INDEY_json_array.toString());
////            System.out.println(INDEY_json_array.toString());
////        }
//
//        mav.setViewName("LYW_templates/INDEX_ROAD_INDEX");
//        System.out.println(request.getParameter("year"));
//        System.out.println(request.getParameter("month"));
//        System.out.println(request.getParameter("day"));
//        System.out.println(request.getParameter("ROAD_ID"));
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/INDEX_ROAD_INDEX_getdata")
//    Map<String, JSONArray> INDEX_ROAD_INDEX_getdata(HttpServletRequest request) {
//        Map<String, JSONArray> result = new HashMap<>();
//
//        String year = request.getParameter("year");
//        String month_got = request.getParameter("month");
//        String month = month_got.length() == 2 ? month_got : "0" + month_got;
//        String day_got = request.getParameter("day");
//        String day = day_got.length() == 2 ? day_got : "0" + day_got;
//        String ROAD_ID = request.getParameter("ROAD_ID");
//        String week = request.getParameter("week");
//        String INSERT_TIME_concated = String.join("-", year, month, day);
//
//        List<Double> INDEY = indexRoadIndexMapper.getINDEY(year, month, day, ROAD_ID, week, INSERT_TIME_concated);
//        JSONArray INDEY_json_array = JSONArray.fromObject(INDEY);
//        List<Double> INDEY_FLOAT = indexRoadIndexMapper.getINDEY_FLOAT(year, month, day, ROAD_ID, week, INSERT_TIME_concated);
//        JSONArray INDEY_FLOAT_json_array = JSONArray.fromObject(INDEY_FLOAT);
//        List<Double> SPEED = indexRoadIndexMapper.getSPEED(year, month, day, ROAD_ID, week, INSERT_TIME_concated);
//        JSONArray SPEED_json_array = JSONArray.fromObject(SPEED);
//        List<Date> INSERT_TIME = indexRoadIndexMapper.getINSERT_TIME(year, month, day, ROAD_ID, week, INSERT_TIME_concated);
//        List<String> INSERT_TIME_formatted = new ArrayList<>();
//        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        for (Date date : INSERT_TIME) {
//            INSERT_TIME_formatted.add(fmt.format(date));
//        }
//        JSONArray INSERT_TIME_json_array = JSONArray.fromObject(INSERT_TIME_formatted);
//
//        result.put("INSERT_TIME", INSERT_TIME_json_array);
//        result.put("INDEY", INDEY_json_array);
//        result.put("INDEY_FLOAT", INDEY_FLOAT_json_array);
//        result.put("SPEED", SPEED_json_array);
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_TRAFFIC_STATISTICS")
//    ModelAndView TRAFFIC_STATISTICS_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = trafficStatisticsMapper.getUniqueAREA_ID();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//        //得到所有的时间用来放入下拉框,这里直接注释掉吧，因为用到的就那几个值，直接写在页面里也行
//        String min_time_string = trafficStatisticsMapper.getMinCOMPUTETIME();
//        String max_time_string = trafficStatisticsMapper.getMaxCOMPUTETIME();
//        min_time_string.replace('/', '-');
//        max_time_string.replace('/', '-');
//        Date min_time = new Date(min_time_string);
//        Date max_time = new Date(max_time_string);
//
//        List<Integer> years = new ArrayList<>();
//        for (int i = min_time.getYear(); i <= max_time.getYear(); i++) {
//            years.add(i + 1900);
//        }
//        JSONArray years_json_array = JSONArray.fromObject(years);
//
//        mav.addObject("years", years_json_array.toString());
//        mav.addObject("min_time", min_time_string);
//        mav.addObject("max_time", max_time_string);
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//        mav.setViewName("LYW_templates/TRAFFIC_STATISTICS");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/TRAFFIC_STATISTICS_getdata")
//    Map<String, JSONArray> TRAFFIC_STATISTICS_getdata(HttpServletRequest request) {
//        Map<String, JSONArray> result = new HashMap<>();
//
//        String year = request.getParameter("year");
//        String month_got = request.getParameter("month");
//        String month = month_got.length() == 2 ? month_got : "0" + month_got;
//        String day_got = request.getParameter("day");
//        String day = day_got.length() == 2 ? day_got : "0" + day_got;
//        String AREA_ID = request.getParameter("AREA_ID");
//        String week = request.getParameter("week");
//        String time = String.join("-", year, month, day);
//
//        List<Double> AVERAGESPEED = trafficStatisticsMapper.getAVERAGESPEED(time, week, AREA_ID);
//        List<Double> JAMLENGTH = trafficStatisticsMapper.getJAMLENGTH(time, week, AREA_ID);
//        List<String> COMPUTETIME_get = trafficStatisticsMapper.getCOMPUTETIME(time, week, AREA_ID);
//        List<String> COMPUTETIME = new ArrayList<>();
//        for (String s : COMPUTETIME_get) {
//            COMPUTETIME.add(s.replace('/', '-'));
//        }
//        result.put("AVERAGESPEED", JSONArray.fromObject(AVERAGESPEED));
//        result.put("JAMLENGTH", JSONArray.fromObject(JAMLENGTH));
//        result.put("COMPUTETIME", JSONArray.fromObject(COMPUTETIME));
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_ANLYS_GS_SECTION_COMPUTE")
//    ModelAndView ANLYS_GS_SECTION_COMPUTE_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = anlysGsSectionComputeMapper.getUniqueSECTIONID();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//        String min_time_string = anlysGsSectionComputeMapper.getMinCOMPUTETIME();
//        String max_time_string = anlysGsSectionComputeMapper.getMaxCOMPUTETIME();
//        min_time_string.replace('/', '-');
//        max_time_string.replace('/', '-');
//        Date min_time = new Date(min_time_string);
//        Date max_time = new Date(max_time_string);
//
//        List<Integer> years = new ArrayList<>();
//        for (int i = min_time.getYear(); i <= max_time.getYear(); i++) {
//            years.add(i + 1900);
//        }
//        JSONArray years_json_array = JSONArray.fromObject(years);
//
//        mav.addObject("years", years_json_array.toString());
//        mav.addObject("min_time", min_time_string);
//        mav.addObject("max_time", max_time_string);
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//        mav.setViewName("LYW_templates/ANLYS_GS_SECTION_COMPUTE");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/ANLYS_GS_SECTION_COMPUTE_getdata")
//    Map<String, JSONArray> ANLYS_GS_SECTION_COMPUTE_getdata(HttpServletRequest request) {
//        Map<String, JSONArray> result = new HashMap<>();
//
//        String year = request.getParameter("year");
//        String month_got = request.getParameter("month");
//        String month = month_got.length() == 2 ? month_got : "0" + month_got;
//        String day_got = request.getParameter("day");
//        String day = day_got.length() == 2 ? day_got : "0" + day_got;
//        String SECTIONID = request.getParameter("SECTIONID");
//        String week = request.getParameter("week");
//        String time = String.join("-", year, month, day);
//
//        List<Double> INDEY = anlysGsSectionComputeMapper.getINDEY(time, week, SECTIONID);
//        List<Double> RUNNINGSPEED = anlysGsSectionComputeMapper.getRUNNINGSPEED(time, week, SECTIONID);
//        List<Double> TRAVELTIME = anlysGsSectionComputeMapper.getTRAVELTIME(time, week, SECTIONID);
//        List<String> STATUS = anlysGsSectionComputeMapper.getSTATUS(time, week, SECTIONID);
//        List<String> COMPUTETIME_get = anlysGsSectionComputeMapper.getCOMPUTETIME(time, week, SECTIONID);
//        List<String> COMPUTETIME = new ArrayList<>();
//        for (String s : COMPUTETIME_get) {
//            COMPUTETIME.add(s.replace('/', '-'));
//        }
//        result.put("INDEY", JSONArray.fromObject(INDEY));
//        result.put("RUNNINGSPEED", JSONArray.fromObject(RUNNINGSPEED));
//        result.put("TRAVELTIME", JSONArray.fromObject(TRAVELTIME));
//        result.put("STATUS", JSONArray.fromObject(STATUS));
//        result.put("COMPUTETIME", JSONArray.fromObject(COMPUTETIME));
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_SECTION_COMPUTER_HOUR")
//    ModelAndView SECTION_COMPUTER_HOUR_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = sectionComputerHourMapper.getUniqueSECTIONID();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//        String min_time_string = sectionComputerHourMapper.getMinCOMPUTERTIME();
//        String max_time_string = sectionComputerHourMapper.getMaxCOMPUTERTIME();
//        min_time_string.replace('/', '-');
//        max_time_string.replace('/', '-');
//        Date min_time = new Date(min_time_string);
//        Date max_time = new Date(max_time_string);
//
//        List<Integer> years = new ArrayList<>();
//        for (int i = min_time.getYear(); i <= max_time.getYear(); i++) {
//            years.add(i + 1900);
//        }
//        JSONArray years_json_array = JSONArray.fromObject(years);
//
//        mav.addObject("years", years_json_array.toString());
//        mav.addObject("min_time", min_time_string);
//        mav.addObject("max_time", max_time_string);
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//        mav.setViewName("LYW_templates/SECTION_COMPUTER_HOUR");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/SECTION_COMPUTER_HOUR_getdata")
//    Map<String, JSONArray> SECTION_COMPUTER_HOUR_getdata(HttpServletRequest request) {
//        Map<String, JSONArray> result = new HashMap<>();
//
//        String year = request.getParameter("year");
//        String month_got = request.getParameter("month");
//        String month = month_got.length() == 2 ? month_got : "0" + month_got;
//        String day_got = request.getParameter("day");
//        String day = day_got.length() == 2 ? day_got : "0" + day_got;
//        String SECTIONID = request.getParameter("SECTIONID");
//        String week = request.getParameter("week");
//        String time = String.join("-", year, month, day);
//
//        List<Double> INDEY = sectionComputerHourMapper.getINDEY(time, week, SECTIONID);
//        List<Double> ROADCONGESTIONTIME = sectionComputerHourMapper.getROADCONGESTIONTIME(time, week, SECTIONID);
//        List<String> COMPUTERTIME_get = sectionComputerHourMapper.getCOMPUTERTIME(time, week, SECTIONID);
//        List<String> COMPUTERTIME = new ArrayList<>();
//        for (String s : COMPUTERTIME_get) {
//            COMPUTERTIME.add(s.replace('/', '-'));
//        }
//        result.put("INDEY", JSONArray.fromObject(INDEY));
//        result.put("ROADCONGESTIONTIME", JSONArray.fromObject(ROADCONGESTIONTIME));
//        result.put("COMPUTERTIME", JSONArray.fromObject(COMPUTERTIME));
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_SECTION_JAM_LENGTH")
//    ModelAndView SECTION_JAM_LENGTH_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = sectionJamLengthMapper.getUniqueSECTIONID();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//        String min_time_string = sectionJamLengthMapper.getMinRECEIVETIME();
//        String max_time_string = sectionJamLengthMapper.getMaxRECEIVETIME();
//        min_time_string.replace('/', '-');
//        max_time_string.replace('/', '-');
//        Date min_time = new Date(min_time_string);
//        Date max_time = new Date(max_time_string);
//
//        List<Integer> years = new ArrayList<>();
//        for (int i = min_time.getYear(); i <= max_time.getYear(); i++) {
//            years.add(i + 1900);
//        }
//        JSONArray years_json_array = JSONArray.fromObject(years);
//
//        mav.addObject("years", years_json_array.toString());
//        mav.addObject("min_time", min_time_string);
//        mav.addObject("max_time", max_time_string);
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//        mav.setViewName("LYW_templates/SECTION_JAM_LENGTH");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/SECTION_JAM_LENGTH_getdata")
//    Map<String, JSONArray> SECTION_JAM_LENGTH_getdata(HttpServletRequest request) {
//        Map<String, JSONArray> result = new HashMap<>();
//
//        String year = request.getParameter("year");
//        String month_got = request.getParameter("month");
//        String month = month_got.length() == 2 ? month_got : "0" + month_got;
//        String day_got = request.getParameter("day");
//        String day = day_got.length() == 2 ? day_got : "0" + day_got;
//        String SECTIONID = request.getParameter("SECTIONID");
//        String week = request.getParameter("week");
//        String time = String.join("-", year, month, day);
//
//        List<Double> JAMLEVEL = sectionJamLengthMapper.getJAMLEVEL(time, week, SECTIONID);
//        List<Double> STARTJAMPOINT = sectionJamLengthMapper.getSTARTJAMPOINT(time, week, SECTIONID);
//        List<Double> JAMLENGTH = sectionJamLengthMapper.getJAMLENGTH(time, week, SECTIONID);
//        List<String> RECEIVETIME_get = sectionJamLengthMapper.getRECEIVETIME(time, week, SECTIONID);
//        List<String> RECEIVETIME = new ArrayList<>();
//        for (String s : RECEIVETIME_get) {
//            RECEIVETIME.add(s.replace('/', '-'));
//        }
//        result.put("JAMLEVEL", JSONArray.fromObject(JAMLEVEL));
//        result.put("STARTJAMPOINT", JSONArray.fromObject(STARTJAMPOINT));
//        result.put("RECEIVETIME", JSONArray.fromObject(RECEIVETIME));
//        result.put("JAMLENGTH", JSONArray.fromObject(JAMLENGTH));
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_BURST_EVENT")
//    ModelAndView BURST_EVENT_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = burstEventMapper.getUniqueLOCATION();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//
//        String min_time_string = burstEventMapper.getMinEVENTTIME();
//        String max_time_string = burstEventMapper.getMaxEVENTTIME();
//        min_time_string.replace('/', '-');
//        max_time_string.replace('/', '-');
//        Date min_time = new Date(min_time_string);
//        Date max_time = new Date(max_time_string);
//
//        List<Integer> years = new ArrayList<>();
//        for (int i = min_time.getYear(); i <= max_time.getYear(); i++) {
//            years.add(i + 1900);
//        }
//        JSONArray years_json_array = JSONArray.fromObject(years);
//
//        mav.addObject("years", years_json_array.toString());
//        mav.addObject("min_time", min_time_string);
//        mav.addObject("max_time", max_time_string);
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//        mav.setViewName("LYW_templates/BURST_EVENT");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/BURST_EVENT_getdata")
//    JSONArray BURST_EVENT_getdata(HttpServletRequest request) {
//        String year = request.getParameter("year");
//        String month_got = request.getParameter("month");
//        String month = month_got.length() == 2 ? month_got : "0" + month_got;
//        String day_got = request.getParameter("day");
//        String day = day_got.length() == 2 ? day_got : "0" + day_got;
//        String LOCATION = request.getParameter("LOCATION");
//        String week = request.getParameter("week");
//        String time = String.join("-", year, month, day);
//
//        List<BurstEvent> burstEvents = burstEventMapper.getBurstEvent(time, week, LOCATION);
//        return JSONArray.fromObject(burstEvents);
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_MONITOR_SECTION")
//    ModelAndView MONITOR_SECTION_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = monitorSectionMapper.getUniquesectionname();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//        List<String> roadids = monitorSectionMapper.getUniqueroadid();
//        JSONArray roadids_json_array = JSONArray.fromObject(roadids);
//        mav.addObject("roadids", roadids_json_array.toString());
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//
//        mav.setViewName("LYW_templates/MONITOR_SECTION");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/MONITOR_SECTION_getdata")
//    com.alibaba.fastjson.JSONArray MONITOR_SECTION_getdata(HttpServletRequest request) {
//
//        String sectionname = request.getParameter("sectionname");
//        String roadid = request.getParameter("roadid");
//
//        if (roadid != "0") {
//            List<MonitorSection> monitorSections = monitorSectionMapper.getMonitorSectionByRoadid(roadid);
//            com.alibaba.fastjson.JSONArray result = new com.alibaba.fastjson.JSONArray();
//
//            for (MonitorSection m : monitorSections) {
//                JSONObject jo = new JSONObject();
//                jo.put("sectionid", m.getSectionid());
//                jo.put("sectionname", m.getSectionname());
//                jo.put("downpointid", m.getDownpointid());
//                jo.put("uppointid", m.getUppointid());
//                jo.put("roadid", m.getRoadid());
//                jo.put("approachdirt", m.getApproachdirt());
//                jo.put("width", m.getWidth());
//                jo.put("lanes", m.getLanes());
//                jo.put("crossflag", m.getCrossflag());
//                jo.put("leftpktlanes", m.getLeftpktlanes());
//                jo.put("rightpktlanes", m.getRightpktlanes());
//                jo.put("fulllanelen", m.getFulllanelen());
//                jo.put("leftpktlanelen", m.getLeftpktlanelen());
//                jo.put("rightpktlanelen", m.getRightpktlanelen());
//                jo.put("stdflux", m.getStdflux());
//                jo.put("expflux", m.getExpflux());
//                jo.put("jamflux", m.getJamflux());
//                jo.put("stdspeed", m.getStdspeed());
//                jo.put("expspeed", m.getExpspeed());
//                jo.put("jamspeed", m.getJamspeed());
//                jo.put("stdtime", m.getStdtime());
//                jo.put("exptime", m.getExptime());
//                jo.put("jamtime", m.getJamtime());
////            jo.put("remark", m.getRemark());
//                jo.put("effect", m.getEffect());
//                jo.put("addroadid", m.getAddroadid());
//                jo.put("huanxian", m.getHuanxian());
//                jo.put("maxflux", m.getMaxflux());
//                jo.put("avgflux", m.getAvgflux());
//                jo.put("maxspeed", m.getMaxspeed());
//                jo.put("avgspeed", m.getAvgspeed());
//                jo.put("mintime", m.getMintime());
//                jo.put("avgtime", m.getAvgtime());
//                jo.put("uproadid", m.getUproadid());
//                jo.put("downroadid", m.getDownroadid());
//                jo.put("rxdkd", m.getRxdkd());
//                jo.put("bxshyz", m.getBxshyz());
//                jo.put("dltcbwgs", m.getDltcbwgs());
//                jo.put("isdxcd", m.getIsdxcd());
//                jo.put("dxstarttime", m.getDxstarttime());
//                jo.put("dxendtime", m.getDxendtime());
//                jo.put("isgjcd", m.getIsgjcd());
//                jo.put("sourcttype", m.getSourcetype());
//                jo.put("ared_id", m.getAreaId());
//                jo.put("length", m.getLength());
//                jo.put("sectionlevel", m.getSectionlevel());
//                result.add(jo);
//            }
//            return result;
//        } else {
//            List<MonitorSection> monitorSections = monitorSectionMapper.getMonitorSection(sectionname);
//            com.alibaba.fastjson.JSONArray result = new com.alibaba.fastjson.JSONArray();
//
//            for (MonitorSection m : monitorSections) {
//                JSONObject jo = new JSONObject();
//                jo.put("sectionid", m.getSectionid());
//                jo.put("sectionname", m.getSectionname());
//                jo.put("downpointid", m.getDownpointid());
//                jo.put("uppointid", m.getUppointid());
//                jo.put("roadid", m.getRoadid());
//                jo.put("approachdirt", m.getApproachdirt());
//                jo.put("width", m.getWidth());
//                jo.put("lanes", m.getLanes());
//                jo.put("crossflag", m.getCrossflag());
//                jo.put("leftpktlanes", m.getLeftpktlanes());
//                jo.put("rightpktlanes", m.getRightpktlanes());
//                jo.put("fulllanelen", m.getFulllanelen());
//                jo.put("leftpktlanelen", m.getLeftpktlanelen());
//                jo.put("rightpktlanelen", m.getRightpktlanelen());
//                jo.put("stdflux", m.getStdflux());
//                jo.put("expflux", m.getExpflux());
//                jo.put("jamflux", m.getJamflux());
//                jo.put("stdspeed", m.getStdspeed());
//                jo.put("expspeed", m.getExpspeed());
//                jo.put("jamspeed", m.getJamspeed());
//                jo.put("stdtime", m.getStdtime());
//                jo.put("exptime", m.getExptime());
//                jo.put("jamtime", m.getJamtime());
////            jo.put("remark", m.getRemark());
//                jo.put("effect", m.getEffect());
//                jo.put("addroadid", m.getAddroadid());
//                jo.put("huanxian", m.getHuanxian());
//                jo.put("maxflux", m.getMaxflux());
//                jo.put("avgflux", m.getAvgflux());
//                jo.put("maxspeed", m.getMaxspeed());
//                jo.put("avgspeed", m.getAvgspeed());
//                jo.put("mintime", m.getMintime());
//                jo.put("avgtime", m.getAvgtime());
//                jo.put("uproadid", m.getUproadid());
//                jo.put("downroadid", m.getDownroadid());
//                jo.put("rxdkd", m.getRxdkd());
//                jo.put("bxshyz", m.getBxshyz());
//                jo.put("dltcbwgs", m.getDltcbwgs());
//                jo.put("isdxcd", m.getIsdxcd());
//                jo.put("dxstarttime", m.getDxstarttime());
//                jo.put("dxendtime", m.getDxendtime());
//                jo.put("isgjcd", m.getIsgjcd());
//                jo.put("sourcttype", m.getSourcetype());
//                jo.put("ared_id", m.getAreaId());
//                jo.put("length", m.getLength());
//                jo.put("sectionlevel", m.getSectionlevel());
//                result.add(jo);
//            }
//            return result;
//        }
////        JSONArray result = JSONArray.fromObject(monitorSections);
////        com.alibaba.fastjson.JSONArray result = new com.alibaba.fastjson.JSONArray();
////
////        for (MonitorSection m : monitorSections) {
////            JSONObject jo = new JSONObject();
////            jo.put("sectionid", m.getSectionid());
////            jo.put("sectionname", m.getSectionname());
////            jo.put("downpointid", m.getDownpointid());
////            jo.put("uppointid", m.getUppointid());
////            jo.put("roadid", m.getRoadid());
////            jo.put("approachdirt", m.getApproachdirt());
////            jo.put("width", m.getWidth());
////            jo.put("lanes", m.getLanes());
////            jo.put("crossflag", m.getCrossflag());
////            jo.put("leftpktlanes", m.getLeftpktlanes());
////            jo.put("rightpktlanes", m.getRightpktlanes());
////            jo.put("fulllanelen", m.getFulllanelen());
////            jo.put("leftpktlanelen", m.getLeftpktlanelen());
////            jo.put("rightpktlanelen", m.getRightpktlanelen());
////            jo.put("stdflux", m.getStdflux());
////            jo.put("expflux", m.getExpflux());
////            jo.put("jamflux", m.getJamflux());
////            jo.put("stdspeed", m.getStdspeed());
////            jo.put("expspeed", m.getExpspeed());
////            jo.put("jamspeed", m.getJamspeed());
////            jo.put("stdtime", m.getStdtime());
////            jo.put("exptime", m.getExptime());
////            jo.put("jamtime", m.getJamtime());
//////            jo.put("remark", m.getRemark());
////            jo.put("effect", m.getEffect());
////            jo.put("addroadid", m.getAddroadid());
////            jo.put("huanxian", m.getHuanxian());
////            jo.put("maxflux", m.getMaxflux());
////            jo.put("avgflux", m.getAvgflux());
////            jo.put("maxspeed", m.getMaxspeed());
////            jo.put("avgspeed", m.getAvgspeed());
////            jo.put("mintime", m.getMintime());
////            jo.put("avgtime", m.getAvgtime());
////            jo.put("uproadid", m.getUproadid());
////            jo.put("downroadid", m.getDownroadid());
////            jo.put("rxdkd", m.getRxdkd());
////            jo.put("bxshyz", m.getBxshyz());
////            jo.put("dltcbwgs", m.getDltcbwgs());
////            jo.put("isdxcd", m.getIsdxcd());
////            jo.put("dxstarttime", m.getDxstarttime());
////            jo.put("dxendtime", m.getDxendtime());
////            jo.put("isgjcd", m.getIsgjcd());
////            jo.put("sourcttype", m.getSourcetype());
////            jo.put("ared_id", m.getAreaId());
////            jo.put("length", m.getLength());
////            jo.put("sectionlevel", m.getSectionlevel());
////            result.add(jo);
////        }
////        return result;
//
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_TRAFFIC_STATUS_RESULT")
//    ModelAndView TRAFFIC_STATUS_RESULT_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = trafficStatusResultMapper.getUniqueID();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//        mav.setViewName("LYW_templates/TRAFFIC_STATUS_RESULT");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/TRAFFIC_STATUS_RESULT_getdata")
//    JSONArray TRAFFIC_STATUS_RESULT_getdata(HttpServletRequest request) {
//
////        String ID = request.getParameter("ID");
////
////
////        List<TrafficStatusResult> trafficStatusResults = trafficStatusResultMapper.getTrafficStatusResult(ID);
//        List<TrafficStatusResult> trafficStatusResults = trafficStatusResultMapper.getAll();
//        JsonConfig jsonConfig = new JsonConfig();
//        jsonConfig.registerDefaultValueProcessor(Short.class, new DefaultDefaultValueProcessor() {
//            public Object getDefaultValue(Class type) {
//                return "null";
//            }
//        });
//        JSONArray result = JSONArray.fromObject(trafficStatusResults, jsonConfig);
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_SECTION_STATUS_DATA")
//    ModelAndView SECTION_STATUS_DATA_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = sectionStatusDataMapper.getUniqueSECTIONNAME();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//
//        String min_time_string = sectionStatusDataMapper.getMinCOLLECTIONTIME();
//        String max_time_string = sectionStatusDataMapper.getMaxCOLLECTIONTIME();
//        System.out.println(min_time_string);
//        System.out.println(max_time_string);
//        min_time_string.replace('/', '-');
//        max_time_string.replace('/', '-');
//        //不知道为什么，就查询的时候最后min_time_string最后会多一个.0
//        min_time_string = min_time_string.substring(0, 19);
//        max_time_string = max_time_string.substring(0, 19);
//        System.out.println(min_time_string);
//        System.out.println(max_time_string);
//
//        List<Integer> years = new ArrayList<>();
//        for (int i = Integer.parseInt(min_time_string.substring(0, 4)); i <= Integer.parseInt(max_time_string.substring(0, 4)); i++) {
//            years.add(i);
//        }
//        JSONArray years_json_array = JSONArray.fromObject(years);
//
//        mav.addObject("years", years_json_array.toString());
//        mav.addObject("min_time", min_time_string);
//        mav.addObject("max_time", max_time_string);
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//        mav.setViewName("LYW_templates/SECTION_STATUS_DATA");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/SECTION_STATUS_DATA_getdata")
//    JSONArray SECTION_STATUS_DATA_getdata(HttpServletRequest request) {
//        String year = request.getParameter("year");
//        String month_got = request.getParameter("month");
//        String month = month_got.length() == 2 ? month_got : "0" + month_got;
//        String day_got = request.getParameter("day");
//        String day = day_got.length() == 2 ? day_got : "0" + day_got;
//        String SECTIONNAME = request.getParameter("SECTIONNAME");
//        String week = request.getParameter("week");
//        String time = String.join("-", year, month, day);
//
//        List<SectionStatusData> sectionStatusDatas = sectionStatusDataMapper.getSectionStatusData(time, week, SECTIONNAME);
//        JSONArray result = JSONArray.fromObject(sectionStatusDatas);
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_ANLYS_NATURE_SECTION")
//    ModelAndView ANLYS_NATURE_SECTION_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_SECTIONNAME用来放入下拉框
//        List<String> ids = anlysNatureSectionMapper.getUniqueSECTIONNAME();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//        mav.setViewName("LYW_templates/ANLYS_NATURE_SECTION");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/ANLYS_NATURE_SECTION_getdata")
//    JSONArray ANLYS_NATURE_SECTION_getdata(HttpServletRequest request) {
//
//        List<AnlysNatureSection> anlysNatureSections = anlysNatureSectionMapper.getAll();
////        JsonConfig jsonConfig = new JsonConfig();
////        jsonConfig.registerDefaultValueProcessor(Short.class, new DefaultDefaultValueProcessor() {
////            public Object getDefaultValue(Class type) {
////                return "null";
////            }
////        });
//        JSONArray result = JSONArray.fromObject(anlysNatureSections);
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_ANLYS_SECTION_COMPUTE_DAY")
//    ModelAndView ANLYS_SECTION_COMPUTE_DAY_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = anlysSectionComputeDayMapper.getUniqueSECTIONID();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//        //得到所有的时间用来放入下拉框,这里直接注释掉吧，因为用到的就那几个值，直接写在页面里也行
//        String min_time_string = anlysSectionComputeDayMapper.getMinCOMPUTETIME();
//        String max_time_string = anlysSectionComputeDayMapper.getMaxCOMPUTETIME();
//        min_time_string.replace('/', '-');
//        max_time_string.replace('/', '-');
//
//        List<Integer> years = new ArrayList<>();
//        for (int i = Integer.parseInt(min_time_string.substring(0, 4)); i <= Integer.parseInt(max_time_string.substring(0, 4)); i++) {
//            years.add(i);
//        }
//        JSONArray years_json_array = JSONArray.fromObject(years);
//
//        mav.addObject("years", years_json_array.toString());
//        mav.addObject("min_time", min_time_string);
//        mav.addObject("max_time", max_time_string);
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//        mav.setViewName("LYW_templates/ANLYS_SECTION_COMPUTE_DAY");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/ANLYS_SECTION_COMPUTE_DAY_getdata")
//    JSONArray ANLYS_SECTION_COMPUTE_DAY_getdata(HttpServletRequest request) {
//        String year = request.getParameter("year");
//        String month_got = request.getParameter("month");
//        String month = month_got.length() == 2 ? month_got : "0" + month_got;
//        String day_got = request.getParameter("day");
//        String day = day_got.length() == 2 ? day_got : "0" + day_got;
//        String SECTIONID = request.getParameter("SECTIONID");
//        String week = request.getParameter("week");
//        String time = String.join("-", year, month, day);
//
//        List<AnlysSectionComputeDay> anlysSectionComputeDays = anlysSectionComputeDayMapper.getAnlysSectionComputeDay(time, week, SECTIONID);
//        JSONArray result = JSONArray.fromObject(anlysSectionComputeDays);
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/traffic_jam_TRAFFIC_INFO")
//    ModelAndView TRAFFIC_INFO_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        //得到所有AREA_ID用来放入下拉框
//        List<String> ids = trafficInfoMapper.getUniqueNAME();
//        JSONArray ids_json_array = JSONArray.fromObject(ids);
//        mav.addObject("ids", ids_json_array.toString());
//
//        //得到所有的时间用来放入下拉框,这里直接注释掉吧，因为用到的就那几个值，直接写在页面里也行
//        String min_time_string = trafficInfoMapper.getMaxCREATTIME();
//        String max_time_string = trafficInfoMapper.getMinCREATTIME();
//        min_time_string.replace('/', '-');
//        max_time_string.replace('/', '-');
//
//        List<Integer> years = new ArrayList<>();
//        for (int i = Integer.parseInt(min_time_string.substring(0, 4)); i <= Integer.parseInt(max_time_string.substring(0, 4)); i++) {
//            years.add(i);
//        }
//        JSONArray years_json_array = JSONArray.fromObject(years);
//
//        mav.addObject("years", years_json_array.toString());
//        mav.addObject("min_time", min_time_string);
//        mav.addObject("max_time", max_time_string);
//        JSONArray tables_json_array = JSONArray.fromObject(Tables.getTables());
//        mav.addObject("tables", tables_json_array.toString());
//
//        mav.setViewName("LYW_templates/TRAFFIC_INFO");
//        return mav;
//    }
//
//    @ResponseBody
//    @RequestMapping("/TRAFFIC_INFO_getdata")
//    JSONArray TRAFFIC_INFO_getdata(HttpServletRequest request) {
//        String year = request.getParameter("year");
//        String month_got = request.getParameter("month");
//        String month = month_got.length() == 2 ? month_got : "0" + month_got;
//        String day_got = request.getParameter("day");
//        String day = day_got.length() == 2 ? day_got : "0" + day_got;
//        String NAME = request.getParameter("NAME");
//        String week = request.getParameter("week");
//        String time = String.join("-", year, month, day);
//
//        List<TrafficInfo> trafficInfos = trafficInfoMapper.getTrafficInfo(time, week, NAME);
//        JSONArray result = new JSONArray();
//
//        for (TrafficInfo t : trafficInfos) {
//            JSONObject o = new JSONObject();
//            o.put("id", t.getId());
//            o.put("code", t.getCode());
//            o.put("name", t.getName());
//            o.put("createid", t.getCreateid());
//            o.put("updateid", t.getUpdateid());
//            o.put("updatetime", t.getUpdatetime());
//            o.put("remark", t.getRemark());
//            o.put("direction", t.getDirection());
//            o.put("dadept", t.getDadept());
//            o.put("zhongdept", t.getZhongdept());
//            o.put("auditor", t.getAuditor());
//            o.put("auditTime", t.getAuditTime());
//            o.put("auditSuggestion", t.getAuditSuggestion());
//            o.put("status", t.getStatus());
//            o.put("type", t.getType());
//            o.put("dldm", t.getDldm());
//            o.put("startpoint", t.getStartpoint());
//            o.put("endpoint", t.getEndpoint());
//            o.put("lancount", t.getLancount());
//            o.put("length", t.getLength());
//            o.put("lightflag", t.getLightflag());
//            o.put("pic1", t.getPic1());
//            o.put("pic2", t.getPic2());
//            o.put("gsgl", t.getGsgl());
//            o.put("servicelevel", t.getServicelevel());
//            o.put("alleywaytype", t.getAlleywaytype());
//            o.put("alleywayto", t.getAlleywayto());
//            o.put("alleywaycode", t.getAlleywaycode());
//            o.put("intollcount", t.getIntollcount());
//            o.put("outtollcount", t.getOuttollcount());
//            o.put("etc", t.getEtc());
//            o.put("delflag", t.getDelflag());
//            o.put("managementdept", t.getManagementdept());
//            o.put("pointcode", t.getPointcode());
//            o.put("indirection", t.getIndirection());
//            o.put("outdirection", t.getOutdirection());
//            o.put("onstatus", t.getOnstatus());
//            o.put("inlanecount", t.getInlanecount());
//            o.put("outlanecount", t.getOutlanecount());
//            result.add(o);
//        }
//        return result;
////        return JSONArray.fromObject(trafficInfos);
//    }
//
//
//    @ResponseBody
//    @RequestMapping("/testreflect")
//    void testreflect(HttpServletRequest request) throws IllegalAccessException {
//        INDEX_ROAD_INDEX i = new INDEX_ROAD_INDEX();
//        i.setID("123");
//        i.setINDEY(1.0);
//        i.setINDEY_FLOAT(2.0);
//        i.setROAD_ID("road");
//        i.setSPEED(3.0);
//        i.setINSERT_TIME("now");
//        Field[] dfields = i.getClass().getDeclaredFields();
//        Field[] fields = i.getClass().getFields();
//        Method[] methods = i.getClass().getDeclaredMethods();
//        AccessibleObject.setAccessible(fields, true);
//        AccessibleObject.setAccessible(dfields, true);
//        for (Field f : dfields) {
//            System.out.println(f.getName() + "" + f.get(i));
//        }
//        for (Method m : methods) {
//            System.out.println(m.getName());
//        }
//        System.out.println("next");
//        for (Field f : fields) {
//            System.out.println(f.getName() + "" + f.get(i));
//        }
//    }

//    @ResponseBody
//    @RequestMapping("/traffic_jamtest")
//    ModelAndView TRAFFIC_JAM_Controller(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("LYW_templates/traffic_jam");
//        return mav;
//    }

//    @ResponseBody
//    @RequestMapping("/table1")
//    JSONArray table(HttpServletRequest request) throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
//        String table = request.getParameter("table1");
//        String[] table_list = table.split("_");
//        table = "";
//        for (int i = 0; i < table_list.length; i++) {
//            table_list[i] = table_list[i].substring(0,1) + table_list[i].substring(1).toLowerCase();
//            table = table + table_list[i];
//        }
//        String mapper_string = "com.example.demo.mapper.LYWMapper." + table + "Mapper";
//        Class cls = Class.forName(mapper_string);
//        Method method = cls.getDeclaredMethod("getFieldsName");
////        for (Method m : cls.getDeclaredMethods()) {
////            System.out.println(m.getName());
////        }
////        return new JSONArray();
//        List<String> result = trafficInfoMapper.getFieldsName();
//        System.out.println(result);
//        return new JSONArray();
//    }


    @ResponseBody
    @RequestMapping("/table1")
//返回所有的字段的名字
    JSONArray table(HttpServletRequest request) throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String table = request.getParameter("table1");
        table = utl(table);
//        String[] table_list = table.split("_");
//        table = "";
//        for (int i = 0; i < table_list.length; i++) {
//            table_list[i] = table_list[i].replace("LRX.", "");
//            table_list[i] = table_list[i].substring(0,1) + table_list[i].substring(1).toLowerCase();
//            table = table + table_list[i];
//        }
        String po_string = "com.example.demo.po.LYWpo." + table;
        Field[] f = Class.forName(po_string).getDeclaredFields();
        List<String> fields = new ArrayList<>();
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < f.length; i++) {
            String name = f[i].getName();
//            System.out.println("this is from po: " + name);
            idx.clear();
            for (int j = 0; j < name.length(); j++) {
                if (Character.isUpperCase(name.charAt(j))) {
                    idx.add(j);
                }
            }
            if (idx.size() == 0) {
                fields.add(name.toUpperCase());
                continue;
            }
//            System.out.println("this is idx: " + idx);
            name = name.toUpperCase();
//            System.out.println("this is upper case name: "+ name);
            StringBuffer stringBuffer = new StringBuffer(name);
//            System.out.println(stringBuffer.toString());
            for (int k = idx.size() - 1; k > -1; k--) {
                stringBuffer.insert(idx.get(k), "_");
            }
            fields.add(stringBuffer.toString());
        }
        System.out.println("下面是这个表下所有的字段");
        for (String s : fields) {
            System.out.println(s);
        }
        System.out.println("所有字段如上");
        return JSONArray.fromObject(fields);
    }

    @ResponseBody
    @RequestMapping("/table11")
//返回每个字段的值
    JSONArray table11(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        String table1 = request.getParameter("table1");
        String field11 = request.getParameter("field11");
        String field111 = request.getParameter("field111");
//        String field = field11;
        String field = table1.equals("LRX.MONITOR_SECTION") ? field11.toLowerCase() : field11;
        if (field.contains("time") || field.contains("TIME")) {
            List<String> a = Arrays.asList("time");
            return JSONArray.fromObject(a);
        }
        System.out.println("confine11选中的是这个非时间字段:" + field);
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();
        String sql = String.format("select distinct \"%s\" from %s", field, table1);
        System.out.println("用这个语句查询这个字段下的所有值" + sql);
        ResultSet resultSet = statement.executeQuery(sql);
        List<String> result = new ArrayList<>();
        while (resultSet.next()) {
            result.add(resultSet.getString(1) == null ? "空值" : resultSet.getString(1));
        }
        return JSONArray.fromObject(result);
    }

    @ResponseBody
    @RequestMapping("/table111")
//返回每个字段的值
    JSONArray table111(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        String table1 = request.getParameter("table1");
        String field11 = request.getParameter("field11");
        String field111 = request.getParameter("field111");
//        String field = field111;
        String field = table1.equals("LRX.MONITOR_SECTION") ? field111.toLowerCase() : field111;
        if (field.contains("time") || field.contains("TIME")) {
            List<String> a = Arrays.asList("time");
            return JSONArray.fromObject(a);
        }
        System.out.println("confine11选中的是这个非时间字段:" + field);
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();
        String sql = String.format("select distinct \"%s\" from %s", field, table1);
        System.out.println("用这个语句查询这个字段下的所有值" + sql);
        ResultSet resultSet = statement.executeQuery(sql);
        List<String> result = new ArrayList<>();
        while (resultSet.next()) {
            result.add(resultSet.getString(1) == null ? "空值" : resultSet.getString(1));
        }
        return JSONArray.fromObject(result);
    }


    @SneakyThrows
    @ResponseBody
    @RequestMapping("/creat_chart_data")
    Map<String, JSONArray> create_chart_data(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        String table = request.getParameter("table");
        String type = request.getParameter("type");
        String field1 = request.getParameter("field1");
        field1 = table.equals("LRX.MONITOR_SECTION") ? field1.toLowerCase() : field1;
        String field11 = request.getParameter("field11");
        field11 = table.equals("LRX.MONITOR_SECTION") ? field11.toLowerCase() : field11;
        String field111 = request.getParameter("field111");
        field111 = table.equals("LRX.MONITOR_SECTION") ? field111.toLowerCase() : field111;
        String confine11 = request.getParameter("confine11");
        String confine111 = request.getParameter("confine111");
        System.out.println("从网页得到的用来画图的数据来源在下面");
        System.out.println(table);
        System.out.println(type);
        System.out.println(field1);
        System.out.println(field11);
        System.out.println(field111);
        System.out.println(confine11);
        System.out.println(confine111);
        System.out.println("上面的是全部了");
        String pattern = "\\d{4}-\\d{2}-\\d{2}";
        if (date_format(confine11.split(",")[0]).matches(pattern)) {
            confine11 = date_format(confine11);
            String[] b = confine111.split(",");
            for (int i = 0; i < b.length; i++) {
                b[i] = "'" + b[i] + "'";
            }
            String[] a = confine11.split(",");
            for (int i = 0; i < a.length; i++) {
                a[i] = "'" + a[i] + "'";
            }
            confine111 = String.join(",", b);


            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
            Statement statement = connection.createStatement();

            ResultSet r = statement.executeQuery(String.format("select \"%s\" from %s where rownum <= 1", field11, table));
            r.next();
            String rr = r.getString(1);
            String x_sql, y_sql, sql;
            if (rr.indexOf("/") != -1) {
//                y_sql = String.format("select %s from %s where to_date(%s, 'yyyy-mm-dd hh24:mi:ss') between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd') and %s in (%s) and %s is not null",
//                        field1, table, field11, a[0], a[1], field111, confine111, field1);
//                x_sql = String.format("select %s from %s where to_date(%s, 'yyyy-mm-dd hh24:mi:ss') between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd')",
//                        field11, table, field11, a[0], a[1]);
                sql = String.format("select \"%s\",\"%s\" from %s where to_date(\"%s\", 'yyyy-mm-dd hh24:mi:ss') between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd') and \"%s\" in (%s) and \"%s\" is not null order by \"%s\" asc",
                        field1, field11, table, field11, a[0], a[1], field111, confine111, field1, field11);
            } else {
//                y_sql = String.format("select %s from %s where %s between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd') and %s in (%s) and %s is not null",
//                        field1, table, field11, a[0], a[1], field111, confine111, field1);
//                x_sql = String.format("select %s from %s where %s between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd')",
//                        field11, table, field11, a[0], a[1]);
                sql = String.format("select \"%s\",\"%s\" from %s where to_date(\"%s\", 'yyyy-mm-dd hh24:mi:ss') between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd') and \"%s\" in (%s) and \"%s\" is not null order by \"%s\" asc",
                        field1, field11, table, field11, a[0], a[1], field111, confine111, field1, field11);
            }

            Map<String, JSONArray> result = new HashMap<>();

//            System.out.println("excute " + x_sql);
//            ResultSet x_resultSet = statement.executeQuery(x_sql);
//            List<String> x_result = new ArrayList<>();
//            while (x_resultSet.next()) {
//                x_result.add(x_resultSet.getString(1));
//            }

//            System.out.println("excute " + y_sql);
//            ResultSet y_resultSet = statement.executeQuery(y_sql);
//            List<String> y_result = new ArrayList<>();
//            while (y_resultSet.next()) {
//                y_result.add(y_resultSet.getString(1));
//            }

            System.out.println("excute " + sql);
            ResultSet resultSet = statement.executeQuery(sql);
            List<String> x_result = new ArrayList<>();
            List<String> y_result = new ArrayList<>();
            while (resultSet.next()) {
                x_result.add(resultSet.getString(2));
                y_result.add(resultSet.getString(1));
            }

            result.put("x_value", JSONArray.fromObject(x_result));
            result.put("y_value", JSONArray.fromObject(y_result));
            result.put("x_name", JSONArray.fromObject(Arrays.asList(field11)));
            result.put("y_name", JSONArray.fromObject(Arrays.asList(field1)));
            result.put("type", JSONArray.fromObject(Arrays.asList(type)));
            result.put("id", JSONArray.fromObject(Arrays.asList("" + Math.random())));
            return result;
        } else if (date_format(confine111.split(",")[0]).matches(pattern)) {
            confine111 = date_format(confine111);
            String[] b = confine111.split(",");
            for (int i = 0; i < b.length; i++) {
                b[i] = "'" + b[i] + "'";
            }
            String[] a = confine11.split(",");
            for (int i = 0; i < a.length; i++) {
                a[i] = "'" + a[i] + "'";
            }
            confine11 = String.join(",", a);


            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
            Statement statement = connection.createStatement();

            ResultSet r = statement.executeQuery(String.format("select \"%s\" from %s where rownum <= 1", field111, table));
            r.next();
            String rr = r.getString(1);
            String x_sql, y_sql, sql;
            if (rr.indexOf("/") != -1) {
//                y_sql = String.format("select %s from %s where to_date(%s, 'yyyy-mm-dd hh24:mi:ss') between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd') and %s in (%s) and %s is not null",
//                        field1, table, field111, b[0], b[1], field11, confine11, field1);
//                x_sql = String.format("select %s from %s where to_date(%s, 'yyyy-mm-dd hh24:mi:ss') between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd')",
//                        field111, table, field111, b[0], b[1]);
                sql = String.format("select \"%s\",\"%s\" from %s where to_date(\"%s\", 'yyyy-mm-dd hh24:mi:ss') between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd') and \"%s\" in (%s) and \"%s\" is not null order by \"%s\" asc",
                        field1, field111, table, field111, b[0], b[1], field11, confine11, field1, field111);
            } else {
//                y_sql = String.format("select %s from %s where %s between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd') and %s in (%s) and %s is not null",
//                        field1, table, field111, b[0], b[1], field11, confine11, field1);
//                x_sql = String.format("select %s from %s where %s between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd')",
//                        field111, table, field111, b[0], b[1]);
                sql = String.format("select \"%s\",\"%s\" from %s where \"%s\" between to_date(%s,'yyyy-mm-dd') and to_date(%s,'yyyy-mm-dd') and \"%s\" in (%s) and \"%s\" is not null order by \"%s\" asc",
                        field1, field111, table, field111, b[0], b[1], field11, confine11, field1, field111);
            }


            Map<String, JSONArray> result = new HashMap<>();

//            System.out.println("excute " + x_sql);
//            ResultSet x_resultSet = statement.executeQuery(x_sql);
//            List<String> x_result = new ArrayList<>();
//            while (x_resultSet.next()) {
//                x_result.add(x_resultSet.getString(1));
//            }

//            System.out.println("excute " + y_sql);
//            ResultSet y_resultSet = statement.executeQuery(y_sql);
//            List<String> y_result = new ArrayList<>();
//            while (y_resultSet.next()) {
//                y_result.add(y_resultSet.getString(1));
//            }

            System.out.println("excute " + sql);
            ResultSet resultSet = statement.executeQuery(sql);
            List<String> x_result = new ArrayList<>();
            List<String> y_result = new ArrayList<>();
            while (resultSet.next()) {
                x_result.add(resultSet.getString(2));
                y_result.add(resultSet.getString(1));
            }

            result.put("x_value", JSONArray.fromObject(x_result));
            result.put("y_value", JSONArray.fromObject(y_result));
            result.put("x_name", JSONArray.fromObject(Arrays.asList(field111)));
            result.put("y_name", JSONArray.fromObject(Arrays.asList(field1)));
            result.put("type", JSONArray.fromObject(Arrays.asList(type)));
            result.put("id", JSONArray.fromObject(Arrays.asList("" + Math.random())));
            return result;
        } else {
            String[] a = confine11.split(",");
            for (int i = 0; i < a.length; i++) {
                a[i] = "'" + a[i] + "'";
            }
            confine11 = String.join(",", a);
            String[] b = confine111.split(",");
            for (int i = 0; i < b.length; i++) {
                b[i] = "'" + b[i] + "'";
            }
            confine111 = String.join(",", b);

            String sql = String.format("select \"%s\" from %s where \"%s\" in (%s) and \"%s\" in (%s) and \"%s\" is not null",
                    field1, table, field11, confine11, field111, confine111, field1);
            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
            Statement statement = connection.createStatement();
            System.out.println("excute " + sql);
            ResultSet resultSet = statement.executeQuery(sql);
            Map<String, JSONArray> result = new HashMap<>();
            List<String> aresult = new ArrayList<>();
            while (resultSet.next()) {
                aresult.add(resultSet.getString(1));
            }
            result.put("x_value", JSONArray.fromObject(aresult));
            result.put("y_value", JSONArray.fromObject(aresult));
            result.put("x_name", JSONArray.fromObject(Arrays.asList(field1)));
            result.put("y_name", JSONArray.fromObject(Arrays.asList(field1)));
            result.put("type", JSONArray.fromObject(Arrays.asList(type)));
            result.put("id", JSONArray.fromObject(Arrays.asList("" + Math.random())));
            System.out.println(result.get("x_value"));
            System.out.println(result.get("y_value"));
            return result;
        }
    }


    private String utl(String s) {
        //把HAT_HAM这样的字符串变成HatHam
        String[] string_list = s.split("_");
        String result = "";
        for (int i = 0; i < string_list.length; i++) {
            string_list[i] = string_list[i].replace("LRX.", "");
            string_list[i] = string_list[i].substring(0, 1) + string_list[i].substring(1).toLowerCase();
            result = result + string_list[i];
        }
        return result;
    }

    private String date_format(String date) {
        //把2013-1-4这样的数据变成2013-01-04
        String[] l = date.split("-");
        for (int i = 0; i < l.length; i++) {
            if (l[i].length() < 2) {
                l[i] = "0" + l[i];
            }
        }
        return String.join("-", l);
    }

    private String mul2String(String mul) {
        String[] ids = mul.split(",");
        for (int i = 0; i < ids.length; i++) {
            ids[i] = "'" + ids[i] + "'";
        }
        return String.join(",", ids);
    }

    private List<String> carnumber_extractor(String s) {
        String carnumber_pattern = "[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1}";
        Pattern pattern = Pattern.compile(carnumber_pattern);
        Matcher matcher = pattern.matcher(s);
        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            result.add(matcher.group(0));
        }
        return result;
    }

//    @ResponseBody
//    @RequestMapping("/update")
//    void updatebase() throws ClassNotFoundException, SQLException {
//        Class.forName("oracle.jdbc.OracleDriver");
//        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
//        Statement statement = connection.createStatement();
//        statement.executeUpdate("")
//        System.out.println(carnumber_extractor("报称 奔驰鲁BK57B8 堵门 请交警联系车主移车奥迪鲁B9K5K0与货车鲁L992M5车损，追尾"));
//    }
    //    private String varchar_to_date_format(String d) {
//        //把2013/5/25 2:13:9这样的数据变成标准的格式
//        String a = d.split(" ")[0];
//        String b = d.split(" ")[1];
//        String[] as = a.split("/");
//        String[] bs = b.split(":");
//        for (int i = 0; i < as.length; i++) {
//            if (as[i].length() != 2) {
//                as[i] = "0" + as[i];
//            }
//        }
//        for (int i = 0; i < bs.length; i++) {
//            if (bs[i].length() != 2) {
//                bs[i] = "0" + bs[i];
//            }
//        }
//        return String.join("-", as) + " " + String.join(":", bs);
//    }
//
    @ResponseBody
    @RequestMapping("/yongdu")
    ModelAndView TRAFFIC_JAM_Controller1(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("LYW_templates/traffic_jam1");


//        Class.forName("oracle.jdbc.OracleDriver");
//        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
//        Statement statement = connection.createStatement();
//        //anlys_gs_section_compute
//        List<String> SECTIONID = anlysGsSectionComputeMapper.getUniqueSECTIONID();
//        JSONArray SECTIONID_JSONArray = JSONArray.fromObject(SECTIONID);
//        mav.addObject("SECTIONID", SECTIONID_JSONArray.toString());
//        List<String> COMPUTETIME = new ArrayList<>();
//        List<String> RUNNINGSPEED = new ArrayList<>();
//        List<String> TRAVELTIME = new ArrayList<>();
//        ResultSet resultSet = statement.executeQuery("select to_date(computetime, 'yy-mm-dd hh24-mi-ss'), runningspeed, traveltime from LRX.ANLYS_GS_SECTION_COMPUTE where sectionid=95000002 and rownum<200 order by to_date(computetime, 'yy-mm-dd hh24-mi-ss')");
//        while (resultSet.next()) {
//            COMPUTETIME.add(resultSet.getString(1));
//            RUNNINGSPEED.add(resultSet.getString(2));
//            TRAVELTIME.add(resultSet.getString(3));
//        }
//        mav.addObject("COMPUTETIME", JSONArray.fromObject(COMPUTETIME).toString());
//        mav.addObject("RUNNINGSPEED", JSONArray.fromObject(RUNNINGSPEED).toString());
//        mav.addObject("TRAVELTIME", JSONArray.fromObject(TRAVELTIME).toString());
//        //section_jam_length
//        List<String> SECTIONID_SECTION_JAM_LENGTH = sectionJamLengthMapper.getUniqueSECTIONID();
//        mav.addObject("SECTIONID_SECTION_JAM_LENGTH", JSONArray.fromObject(SECTIONID_SECTION_JAM_LENGTH).toString());
//        List<String> RECEIVETIME = new ArrayList<>();
//        List<String> JAMLENGTH = new ArrayList<>();
//        resultSet = statement.executeQuery("select to_date(receivetime, 'yy-mm-dd hh24-mi-ss'), jamlength from LRX.SECTION_JAM_LENGTH where sectionid=02000459 and rownum<200 order by to_date(receivetime, 'yy-mm-dd hh24-mi-ss')");
//        while (resultSet.next()) {
//            RECEIVETIME.add(resultSet.getString(1));
//            JAMLENGTH.add(resultSet.getString(2));
//        }
//        mav.addObject("RECEIVETIME", JSONArray.fromObject(RECEIVETIME).toString());
//        mav.addObject("JAMLENGTH", JSONArray.fromObject(JAMLENGTH).toString());
//        //section_computer_hour
//        List<String> SECTIONID_SECTION_COMPUTER_HOUR = sectionComputerHourMapper.getUniqueSECTIONID();
//        mav.addObject("SECTIONID_SECTION_COMPUTER_HOUR", JSONArray.fromObject(SECTIONID_SECTION_COMPUTER_HOUR).toString());
//        List<String> COMPUTERTIME = new ArrayList<>();
//        List<String> ROADCONGESTIONTIME = new ArrayList<>();
//        resultSet = statement.executeQuery("select to_date(COMPUTERTIME, 'yy-mm-dd hh24-mi-ss'), ROADCONGESTIONTIME from LRX.SECTION_COMPUTER_HOUR where sectionid=02000459 and rownum<200 order by to_date(COMPUTERTIME, 'yy-mm-dd hh24-mi-ss')");
//        while (resultSet.next()) {
//            COMPUTERTIME.add(resultSet.getString(1));
//            ROADCONGESTIONTIME.add(resultSet.getString(2));
//        }
//        mav.addObject("COMPUTERTIME", JSONArray.fromObject(COMPUTERTIME).toString());
//        mav.addObject("ROADCONGESTIONTIME", JSONArray.fromObject(ROADCONGESTIONTIME).toString());
//        //section_status_data
////        List<String> SECTIONID_SECTION_STATUS_DATA = sectionStatusDataMapper.getUniqueSECTIONID();
//        List<String> SECTIONID_SECTION_STATUS_DATA = Arrays.asList("03000115", "03000243", "03000359", "03000239", "13000230", "05000092", "05000213", "13000157", "13000091", "13000245", "13000173", "03000279", "05000261", "05000245", "13000107", "13000089", "03000060", "03000141", "13000109", "03000343", "03000140", "03000341", "13000136", "05000046", "13000049", "05000131", "03000186", "13000226", "03000127", "03000130", "13000183", "05000066", "02000126", "03000147", "03000085", "13000101", "03000011", "03000353", "13000233", "13000228", "03000016", "03000206", "13000273", "03000306", "03000118", "03000030", "03000370", "13000135", "13000055", "05000260", "03000203", "13000119", "03000051", "05000061", "03000165", "03000193", "05000114", "03000094", "03000175", "03000093", "03000151", "13000196", "03000124", "03000217", "03000218", "03000059", "05000136", "13000351", "03000299", "03000084", "13000102", "13000155", "03000109", "03000012", "03000013", "03000261", "13000097", "03000156", "05000212", "13000161", "13000071", "13000235", "03000293", "03000122", "03000067", "05000013", "05000196", "13000242", "13000177", "13000246", "13000348", "13000090", "03000113", "02000122", "03000024", "13000108", "13000054", "03000066", "03000021", "03000161", "05000298", "13000095", "03000001", "03000202", "03000195", "03000178", "05000062", "05000132", "13000250", "02000530", "03000222", "13000200", "13000063", "03000373", "03000296", "13000160", "03000117", "03000031", "03000289", "03000137", "03000214", "03000072", "03000227", "03000176", "03000240", "13000223", "03000260", "13000238", "13000237", "13000120", "13000012", "03000075", "03000086", "03000043", "05000045", "03000305", "05000181", "03000110", "03000023", "02000397", "02000246", "13000199", "02000330", "03000074", "05000116", "13000110", "13000072", "03000050", "03000119", "05000244", "03000154", "13000056", "13000011", "13000182", "03000264", "03000042", "03000087", "03000194", "05000113", "05000180", "03000183", "05000070", "13000252", "03000125", "03000006", "02000398", "02000227", "13000138", "03000188", "03000378", "03000242", "13000159", "03000295", "03000138", "05000091", "05000223", "13000236", "03000174", "03000082", "05000115", "13000074", "13000274", "03000145", "13000178", "03000241", "13000181", "13000064", "03000265", "03000120", "03000338", "03000129", "03000020", "02000252", "03000126", "13000251", "03000092", "03000103", "02000135", "03000184", "13000169", "13000053", "13000137", "03000116", "05000178", "03000010", "13000162", "13000006", "03000139", "03000291", "03000083", "03000160", "05000014", "13000005", "13000158", "13000241", "03000037", "03000036", "13000140", "13000174", "03000027", "03000204", "03000216", "03000215", "03000061", "03000213", "03000230", "13000139", "13000267", "05000299", "05000069", "03000098", "02000467", "03000104", "05000065", "02000031", "05000135", "13000352", "03000337", "03000025", "13000321", "03000101", "03000026", "13000197", "13000229", "03000274", "05000222", "13000092", "03000275", "03000153", "03000210", "03000362", "13000027", "03000371", "03000336", "13000347", "05000333", "03000068", "05000197", "03000177", "02000123", "13000249", "03000342", "03000144", "13000313", "13000050", "03000185", "03000039", "03000041", "03000114", "03000022", "13000035");
//        mav.addObject("SECTIONID_SECTION_STATUS_DATA", JSONArray.fromObject(SECTIONID_SECTION_STATUS_DATA).toString());
//        System.out.println(SECTIONID_SECTION_STATUS_DATA);
//
//
//        connection.close();
//
        return mav;
    }

    @SneakyThrows
    @ResponseBody
    @RequestMapping("/TRAFFIC_JAM_Controller1_ANLYS_GS_SECTION_COMPUTE")
    Map<String, JSONArray> TRAFFIC_JAM_Controller1_ANLYS_GS_SECTION_COMPUTE(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        System.out.println(request.getParameter("SECTIONID"));
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        String[] ids = request.getParameter("SECTIONID").split(",");
        for (int i = 0; i < ids.length; i++) {
            ids[i] = "'" + ids[i] + "'";
        }
        String id = String.join(",", ids);
        String begin = request.getParameter("begin_time");
        String end = request.getParameter("end_time");
        List<String> COMPUTETIME = new ArrayList<>();
        List<String> RUNNINGSPEED = new ArrayList<>();
        List<String> TRAVELTIME = new ArrayList<>();

        String sql = "select to_date(computetime, 'yyyy-mm-dd hh24-mi-ss'), runningspeed, traveltime from LRX.ANLYS_GS_SECTION_COMPUTE " +
                "where to_date(computetime, 'yyyy-mm-dd hh24-mi-ss') between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd') " +
                "and sectionid in (%s) order by to_date(computetime, 'yyyy-mm-dd hh24-mi-ss')";
        System.out.println(String.format(sql, date_format(begin), date_format(end), id));
        ResultSet resultSet = statement.executeQuery(String.format(sql, date_format(begin), date_format(end), id));
        while (resultSet.next()) {
            COMPUTETIME.add(resultSet.getString(1));
            RUNNINGSPEED.add(resultSet.getString(2));
            TRAVELTIME.add(resultSet.getString(3));
        }
        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("COMPUTETIME", JSONArray.fromObject(COMPUTETIME));
        out.put("RUNNINGSPEED", JSONArray.fromObject(RUNNINGSPEED));
        out.put("TRAVELTIME", JSONArray.fromObject(TRAVELTIME));
        return out;
    }

    @SneakyThrows
    @ResponseBody
    @RequestMapping("/TRAFFIC_JAM_Controller1_SECTION_JAM_LENGTH")
    Map<String, JSONArray> TRAFFIC_JAM_Controller1_SECTION_JAM_LENGTH(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        String[] ids = request.getParameter("SECTIONID").split(",");
        for (int i = 0; i < ids.length; i++) {
            ids[i] = "'" + ids[i] + "'";
        }
        String id = String.join(",", ids);
        String begin = request.getParameter("begin_time");
        String end = request.getParameter("end_time");
        List<String> RECEIVETIME = new ArrayList<>();
        List<String> JAMLENGTH = new ArrayList<>();

        String sql = "select to_date(RECEIVETIME, 'yyyy-mm-dd hh24-mi-ss'), JAMLENGTH from LRX.SECTION_JAM_LENGTH " +
                "where to_date(RECEIVETIME, 'yyyy-mm-dd hh24-mi-ss') between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd') " +
                "and sectionid in (%s) order by to_date(RECEIVETIME, 'yyyy-mm-dd hh24-mi-ss')";
        System.out.println(String.format(sql, date_format(begin), date_format(end), id));
        ResultSet resultSet = statement.executeQuery(String.format(sql, date_format(begin), date_format(end), id));
        while (resultSet.next()) {
            RECEIVETIME.add(resultSet.getString(1));
            JAMLENGTH.add(resultSet.getString(2));
        }
        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("RECEIVETIME", JSONArray.fromObject(RECEIVETIME));
        out.put("JAMLENGTH", JSONArray.fromObject(JAMLENGTH));
        return out;
    }

    @SneakyThrows
    @ResponseBody
    @RequestMapping("/TRAFFIC_JAM_Controller1_SECTION_COMPUTER_HOUR")
    Map<String, JSONArray> TRAFFIC_JAM_Controller1_SECTION_COMPUTER_HOUR(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        String[] ids = request.getParameter("SECTIONID").split(",");
        for (int i = 0; i < ids.length; i++) {
            ids[i] = "'" + ids[i] + "'";
        }
        String id = String.join(",", ids);
        String begin = request.getParameter("begin_time");
        String end = request.getParameter("end_time");
        List<String> COMPUTERTIME = new ArrayList<>();
        List<String> ROADCONGESTIONTIME = new ArrayList<>();

        String sql = "select to_date(COMPUTERTIME, 'yyyy-mm-dd hh24-mi-ss'), ROADCONGESTIONTIME from LRX.SECTION_COMPUTER_HOUR " +
                "where to_date(COMPUTERTIME, 'yyyy-mm-dd hh24-mi-ss') between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd') " +
                "and sectionid in (%s) order by to_date(COMPUTERTIME, 'yyyy-mm-dd hh24-mi-ss')";
        System.out.println(String.format(sql, date_format(begin), date_format(end), id));
        ResultSet resultSet = statement.executeQuery(String.format(sql, date_format(begin), date_format(end), id));
        while (resultSet.next()) {
            COMPUTERTIME.add(resultSet.getString(1));
            ROADCONGESTIONTIME.add(resultSet.getString(2));
        }
        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("COMPUTERTIME", JSONArray.fromObject(COMPUTERTIME));
        out.put("ROADCONGESTIONTIME", JSONArray.fromObject(ROADCONGESTIONTIME));
        return out;
    }

    @SneakyThrows
    @ResponseBody
    @RequestMapping("/TRAFFIC_JAM_Controller1_SECTION_STATUS_DATA")
    Map<String, JSONArray> TRAFFIC_JAM_Controller1_SECTION_STATUS_DATA(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        String[] ids = request.getParameter("SECTIONID").split(",");
        for (int i = 0; i < ids.length; i++) {
            ids[i] = "'" + ids[i] + "'";
        }
        String id = String.join(",", ids);
        String[] laneids = request.getParameter("LANEID").split(",");
        for (int i = 0; i < laneids.length; i++) {
            laneids[i] = "'" + laneids[i] + "'";
        }
        String laneid = String.join(",", laneids);
        String[] directionids = request.getParameter("DIRECTIONID").split(",");
        for (int i = 0; i < directionids.length; i++) {
            directionids[i] = "'" + directionids[i] + "'";
        }
        String directionid = String.join(",", directionids);

        String begin = request.getParameter("begin_time");
        String end = request.getParameter("end_time");
        List<String> COLLECTIONTIME = new ArrayList<>();
        List<String> VOLUME = new ArrayList<>();
        List<String> OCCUPANCY = new ArrayList<>();
        List<String> SPEED = new ArrayList<>();
        List<String> TRAVELTIME = new ArrayList<>();
        List<String> LANEID = new ArrayList<>();
        List<String> DIRECTIONID = new ArrayList<>();
        List<String> SMALLCOUNT = new ArrayList<>();
        List<String> LARGECOUNT = new ArrayList<>();
        List<String> COMMCOUNT = new ArrayList<>();

        String sql = "select COLLECTIONTIME, VOLUME,OCCUPANCY,SPEED,TRAVELTIME from SECTION_STATUS_DATA " +
                "where COLLECTIONTIME between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd') " +
                "and sectionid in (%s) and LANEID in (%s) and DIRECTIONID in (%s) order by COLLECTIONTIME";
        System.out.println(String.format(sql, date_format(begin), date_format(end), id, laneid, directionid));
        ResultSet resultSet = statement.executeQuery(String.format(sql, date_format(begin), date_format(end), id, laneid, directionid));
        while (resultSet.next()) {
            COLLECTIONTIME.add(resultSet.getString(1));
            VOLUME.add(resultSet.getString(2));
            OCCUPANCY.add(resultSet.getString(3));
            SPEED.add(resultSet.getString(4));
            TRAVELTIME.add(resultSet.getString(5));
        }

        String sql1 = "select LANEID, DIRECTIONID, SUM(SMALLCOUNT),SUM(LARGECOUNT),SUM(COMMCOUNT) from SECTION_STATUS_DATA" +
                " where COLLECTIONTIME between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd')" +
                " and  SECTIONID in (%s) and LANEID in (%s) and DIRECTIONID in (%s) group by LANEID, DIRECTIONID";
        System.out.println(String.format(sql1, date_format(begin), date_format(end), id, laneid, directionid));
        ResultSet aresultSet = statement.executeQuery(String.format(sql1, date_format(begin), date_format(end), id, laneid, directionid));
        while (aresultSet.next()) {
            LANEID.add(aresultSet.getString(1));
            DIRECTIONID.add(aresultSet.getString(2));
            SMALLCOUNT.add(aresultSet.getString(3));
            LARGECOUNT.add(aresultSet.getString(4));
            COMMCOUNT.add(aresultSet.getString(5));
        }

        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("COLLECTIONTIME", JSONArray.fromObject(COLLECTIONTIME));
        out.put("VOLUME", JSONArray.fromObject(VOLUME));
        out.put("OCCUPANCY", JSONArray.fromObject(OCCUPANCY));
        out.put("SPEED", JSONArray.fromObject(SPEED));
        out.put("TRAVELTIME", JSONArray.fromObject(TRAVELTIME));
        out.put("LANEID", JSONArray.fromObject(LANEID));
        out.put("DIRECTIONID", JSONArray.fromObject(DIRECTIONID));
        out.put("SMALLCOUNT", JSONArray.fromObject(SMALLCOUNT));
        out.put("LARGECOUNT", JSONArray.fromObject(LARGECOUNT));
        out.put("COMMCOUNT", JSONArray.fromObject(COMMCOUNT));
        System.out.println("Data transed.");
        return out;
    }

    @ResponseBody
    @RequestMapping("/PIS_INFO")
    ModelAndView PIS_INFO_Controller(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("LYW_templates/PIS_INFO");


//        Class.forName("oracle.jdbc.OracleDriver");
//        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
//        Statement statement = connection.createStatement();
//        //anlys_gs_section_compute
//        List<String> COMPUTETIME = new ArrayList<>();
//        List<String> RUNNINGSPEED = new ArrayList<>();
//        List<String> TRAVELTIME  = new ArrayList<>();
//        ResultSet resultSet = statement.executeQuery("select to_date(computetime, 'yy-mm-dd hh24-mi-ss'), runningspeed, traveltime from LRX.ANLYS_GS_SECTION_COMPUTE where sectionid=95000002 and rownum<200 order by to_date(computetime, 'yy-mm-dd hh24-mi-ss')");
//        while (resultSet.next()) {
//            COMPUTETIME.add(resultSet.getString(1));
//            RUNNINGSPEED.add(resultSet.getString(2));
//            TRAVELTIME.add(resultSet.getString(3));
//        }
//        mav.addObject("COMPUTETIME", JSONArray.fromObject(COMPUTETIME).toString());
//        mav.addObject("RUNNINGSPEED", JSONArray.fromObject(RUNNINGSPEED).toString());
//        mav.addObject("TRAVELTIME", JSONArray.fromObject(TRAVELTIME).toString());
//        connection.close();

        return mav;
    }

    @SneakyThrows
    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping("/PIS_INFO_ajax")
    Map<String, JSONArray> PIS_INFO_ajax(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        String begin = request.getParameter("begin_time");
        String end = request.getParameter("end_time");
        List<String> INFO_TIME = new ArrayList<>();
        List<String> INFO_TYPE = new ArrayList<>();
        List<String> INFO_LEVEL = new ArrayList<>();
        List<String> INFO_ADDRESS = new ArrayList<>();
        List<String> INFO_TOPIC = new ArrayList<>();
        List<String> INFO_TYPE_FOR_COUNT = new ArrayList<>();
        List<String> INFO_LEVEL_FOR_COUNT = new ArrayList<>();
        List<String> INFO_COUNT = new ArrayList<>();
        List<String> INFO_departmentid = new ArrayList<>();
        List<String> INFO_CARNUMBER = new ArrayList<>();
        List<String> INFO_COORDINATE = new ArrayList<>();
        System.out.println(request.getParameter("begin_time"));
        System.out.println(request.getParameter("end_time"));
        System.out.println(request.getParameter("INFO_TYPE"));
        System.out.println(request.getParameter("INFO_LEVEL"));

        String sql = "select * from LRX.PIS_INFO_BASE" +
                " WHERE INFO_TIME between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd')" +
                " and INFO_TYPE in (%s)" +
                " and INFO_LEVEL in (%s) and INFO_COORDINATE is not null";
        String e = String.format(sql, date_format(begin), date_format(end), mul2String(request.getParameter("INFO_TYPE")),
                mul2String(request.getParameter("INFO_LEVEL")));
        System.out.println(e);
        ResultSet resultSet = statement.executeQuery(e);
        while (resultSet.next()) {
            INFO_TIME.add(resultSet.getString("INFO_TIME"));
            INFO_TYPE.add(resultSet.getString("INFO_TYPE"));
            INFO_LEVEL.add(resultSet.getString("INFO_LEVEL"));
            INFO_ADDRESS.add(resultSet.getString("INFO_ADDRESS"));
            INFO_TOPIC.add(resultSet.getString("INFO_TOPIC"));
            INFO_departmentid.add(resultSet.getString("INFO_DEPTID"));
            INFO_COORDINATE.add(resultSet.getString("INFO_COORDINATE"));
        }
        INFO_TIME = INFO_TIME.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_TYPE = INFO_TYPE.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_LEVEL = INFO_LEVEL.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_ADDRESS = INFO_ADDRESS.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_TOPIC = INFO_TOPIC.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_departmentid = INFO_departmentid.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_COORDINATE = INFO_COORDINATE.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());

        String sqll = "select INFO_TYPE, INFO_LEVEL, count(INFO_ID) from LRX.PIS_INFO_BASE" +
                " WHERE INFO_TIME between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd')" +
                " and INFO_TYPE in (%s)" +
                " and INFO_LEVEL in (%s) group by INFO_TYPE, INFO_LEVEL";
        String ee = String.format(sqll, date_format(begin), date_format(end), mul2String(request.getParameter("INFO_TYPE")),
                mul2String(request.getParameter("INFO_LEVEL")));
        System.out.println(ee);
        ResultSet aresultSet = statement.executeQuery(ee);
        while (aresultSet.next()) {
            INFO_TYPE_FOR_COUNT.add(aresultSet.getString(1));
            INFO_LEVEL_FOR_COUNT.add(aresultSet.getString(2));
            INFO_COUNT.add(aresultSet.getString(3));
        }
        INFO_TYPE_FOR_COUNT = INFO_TYPE_FOR_COUNT.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_LEVEL_FOR_COUNT = INFO_LEVEL_FOR_COUNT.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());

        System.out.println(INFO_TIME.size());
        System.out.println(INFO_TYPE.size());
        System.out.println(INFO_LEVEL.size());
        System.out.println(INFO_ADDRESS.size());
        System.out.println(INFO_TOPIC.size());

        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("INFO_TIME", JSONArray.fromObject(INFO_TIME));
        out.put("INFO_TYPE", JSONArray.fromObject(INFO_TYPE));
        out.put("INFO_LEVEL", JSONArray.fromObject(INFO_LEVEL));
        out.put("INFO_ADDRESS", JSONArray.fromObject(INFO_ADDRESS));
        out.put("INFO_TOPIC", JSONArray.fromObject(INFO_TOPIC));
        out.put("INFO_TYPE_FOR_COUNT", JSONArray.fromObject(INFO_TYPE_FOR_COUNT));
        out.put("INFO_LEVEL_FOR_COUNT", JSONArray.fromObject(INFO_LEVEL_FOR_COUNT));
        out.put("INFO_COUNT", JSONArray.fromObject(INFO_COUNT));
        out.put("INFO_departmentid", JSONArray.fromObject(INFO_departmentid));
        out.put("INFO_COORDINATE", JSONArray.fromObject(INFO_COORDINATE));
        return out;
        
    }

    @SneakyThrows
    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping("/PIS_INFO_realtime_ajax")
    Map<String, JSONArray> PIS_INFO_realtime_ajax(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        String begin = request.getParameter("begin_time");
        String end = request.getParameter("end_time");
        List<String> INFO_TIME = new ArrayList<>();
        List<String> INFO_TYPE = new ArrayList<>();
        List<String> INFO_LEVEL = new ArrayList<>();
        List<String> INFO_ADDRESS = new ArrayList<>();
        List<String> INFO_TOPIC = new ArrayList<>();
        List<String> INFO_TYPE_FOR_COUNT = new ArrayList<>();
        List<String> INFO_LEVEL_FOR_COUNT = new ArrayList<>();
        List<String> INFO_COUNT = new ArrayList<>();
        List<String> INFO_departmentid = new ArrayList<>();
        List<String> INFO_CARNUMBER = new ArrayList<>();
        List<String> INFO_COORDINATE = new ArrayList<>();
        System.out.println(request.getParameter("begin_time"));
        System.out.println(request.getParameter("end_time"));
        System.out.println(request.getParameter("INFO_TYPE"));
        System.out.println(request.getParameter("INFO_LEVEL"));

//        String sql = "select * from LRX.PIS_INFO_BASE" +
//                " WHERE INFO_TIME between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd')" +
//                " and INFO_TYPE in (%s)" +
//                " and INFO_LEVEL in (%s) and INFO_COORDINATE is not null";
        String sql = "select * from LRX.PIS_INFO_BASE" +
                "where INFO_TIME between (sysdate-5/1440) and sysdate";
//        String e = String.format(sql, date_format(begin), date_format(end), mul2String(request.getParameter("INFO_TYPE")),
//                mul2String(request.getParameter("INFO_LEVEL")));
//        System.out.println(e);
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            INFO_TIME.add(resultSet.getString("INFO_TIME"));
            INFO_TYPE.add(resultSet.getString("INFO_TYPE"));
            INFO_LEVEL.add(resultSet.getString("INFO_LEVEL"));
            INFO_ADDRESS.add(resultSet.getString("INFO_ADDRESS"));
            INFO_TOPIC.add(resultSet.getString("INFO_TOPIC"));
            INFO_departmentid.add(resultSet.getString("INFO_DEPTID"));
            INFO_COORDINATE.add(resultSet.getString("INFO_COORDINATE"));
        }
        INFO_TIME = INFO_TIME.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_TYPE = INFO_TYPE.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_LEVEL = INFO_LEVEL.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_ADDRESS = INFO_ADDRESS.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_TOPIC = INFO_TOPIC.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_departmentid = INFO_departmentid.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_COORDINATE = INFO_COORDINATE.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());

//        String sqll = "select INFO_TYPE, INFO_LEVEL, count(INFO_ID) from LRX.PIS_INFO_BASE" +
//                " WHERE INFO_TIME between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd')" +
//                " and INFO_TYPE in (%s)" +
//                " and INFO_LEVEL in (%s) group by INFO_TYPE, INFO_LEVEL";
//        String ee = String.format(sqll, date_format(begin), date_format(end), mul2String(request.getParameter("INFO_TYPE")),
//                mul2String(request.getParameter("INFO_LEVEL")));
//        System.out.println(ee);
//        ResultSet aresultSet = statement.executeQuery(ee);
//        while (aresultSet.next()) {
//            INFO_TYPE_FOR_COUNT.add(aresultSet.getString(1));
//            INFO_LEVEL_FOR_COUNT.add(aresultSet.getString(2));
//            INFO_COUNT.add(aresultSet.getString(3));
//        }
//        INFO_TYPE_FOR_COUNT = INFO_TYPE_FOR_COUNT.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
//        INFO_LEVEL_FOR_COUNT = INFO_LEVEL_FOR_COUNT.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());

        System.out.println(INFO_TIME.size());
        System.out.println(INFO_TYPE.size());
        System.out.println(INFO_LEVEL.size());
        System.out.println(INFO_ADDRESS.size());
        System.out.println(INFO_TOPIC.size());

        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("INFO_TIME", JSONArray.fromObject(INFO_TIME));
        out.put("INFO_TYPE", JSONArray.fromObject(INFO_TYPE));
        out.put("INFO_LEVEL", JSONArray.fromObject(INFO_LEVEL));
        out.put("INFO_ADDRESS", JSONArray.fromObject(INFO_ADDRESS));
        out.put("INFO_TOPIC", JSONArray.fromObject(INFO_TOPIC));
        out.put("INFO_TYPE_FOR_COUNT", JSONArray.fromObject(INFO_TYPE_FOR_COUNT));
        out.put("INFO_LEVEL_FOR_COUNT", JSONArray.fromObject(INFO_LEVEL_FOR_COUNT));
        out.put("INFO_COUNT", JSONArray.fromObject(INFO_COUNT));
        out.put("INFO_departmentid", JSONArray.fromObject(INFO_departmentid));
        out.put("INFO_COORDINATE", JSONArray.fromObject(INFO_COORDINATE));
        return out;

    }

    //    @SneakyThrows
//    @ResponseBody
//    @RequestMapping("/testsql")
//    List<String> testsql(HttpServletRequest request) throws ClassNotFoundException, SQLException {
//        PlainSql s = new PlainSql();
//        ResultSet resultSet = s.statement.executeQuery("select count(ID) from LRX.MONITOR_SECTION_POINT");
//        List<String> result = new ArrayList<>();
//        while (resultSet.next()) {
//            result.add(resultSet.getString(1));
//        }
//        s.close();
//        return result;
//    }
    @ResponseBody
    @RequestMapping("/PIS_INFO_charts")
    ModelAndView PIS_INFO_charts_Controller(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("LYW_templates/PIS_INFO_charts");


//        Class.forName("oracle.jdbc.OracleDriver");
//        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
//        Statement statement = connection.createStatement();
//        //anlys_gs_section_compute
//        List<String> COMPUTETIME = new ArrayList<>();
//        List<String> RUNNINGSPEED = new ArrayList<>();
//        List<String> TRAVELTIME  = new ArrayList<>();
//        ResultSet resultSet = statement.executeQuery("select to_date(computetime, 'yy-mm-dd hh24-mi-ss'), runningspeed, traveltime from LRX.ANLYS_GS_SECTION_COMPUTE where sectionid=95000002 and rownum<200 order by to_date(computetime, 'yy-mm-dd hh24-mi-ss')");
//        while (resultSet.next()) {
//            COMPUTETIME.add(resultSet.getString(1));
//            RUNNINGSPEED.add(resultSet.getString(2));
//            TRAVELTIME.add(resultSet.getString(3));
//        }
//        mav.addObject("COMPUTETIME", JSONArray.fromObject(COMPUTETIME).toString());
//        mav.addObject("RUNNINGSPEED", JSONArray.fromObject(RUNNINGSPEED).toString());
//        mav.addObject("TRAVELTIME", JSONArray.fromObject(TRAVELTIME).toString());
//        connection.close();

        return mav;
    }

    @SneakyThrows
    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping("/PIS_INFO_charts_ajax")
    Map<String, JSONArray> PIS_INFO_charts_ajax(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        String begin = request.getParameter("begin_time");
        String end = request.getParameter("end_time");
        List<String> INFO_TIME = new ArrayList<>();
        List<String> INFO_TYPE = new ArrayList<>();
        List<String> INFO_LEVEL = new ArrayList<>();
        List<String> INFO_departmentid = new ArrayList<>();
//        List<String> INFO_ADDRESS = new ArrayList<>();
//        List<String> INFO_TOPIC = new ArrayList<>();
        List<String> INFO_TYPE_FOR_COUNT = new ArrayList<>();
        List<String> INFO_LEVEL_FOR_COUNT = new ArrayList<>();
        List<String> INFO_COUNT = new ArrayList<>();
        System.out.println(request.getParameter("begin_time"));
        System.out.println(request.getParameter("end_time"));
        System.out.println(request.getParameter("INFO_TYPE"));
        System.out.println(request.getParameter("INFO_LEVEL"));

        String sql = "select INFO_TIME, INFO_TYPE, INFO_LEVEL, INFO_CONTENT from LRX.PIS_INFO_BASE" +
                " WHERE INFO_TIME between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd')" +
                " and INFO_TYPE in (%s)" +
                " and INFO_LEVEL in (%s)";
        String e = String.format(sql, date_format(begin), date_format(end), mul2String(request.getParameter("INFO_TYPE")),
                mul2String(request.getParameter("INFO_LEVEL")));
        System.out.println(e);
        ResultSet resultSet = statement.executeQuery(e);
        while (resultSet.next()) {
            INFO_TIME.add(resultSet.getString(1));
            INFO_TYPE.add(resultSet.getString(2));
            INFO_LEVEL.add(resultSet.getString(3));
            INFO_departmentid.add(resultSet.getString(4));
//            INFO_ADDRESS.add(resultSet.getString(4));
//            INFO_TOPIC.add(resultSet.getString(5));
        }
        INFO_TIME = INFO_TIME.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_TYPE = INFO_TYPE.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_LEVEL = INFO_LEVEL.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_departmentid = INFO_departmentid.stream().map(o -> JSONObject.fromObject(o).getString("departmentid")).collect(Collectors.toList());
//        INFO_ADDRESS = INFO_ADDRESS.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
//        INFO_TOPIC = INFO_TOPIC.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
//        System.out.println(JSONObject.fromObject(INFO_CONTENT.get(0)).getString("areaid"));

        String sqll = "select INFO_TYPE, INFO_LEVEL, count(INFO_ID) from LRX.PIS_INFO_BASE" +
                " WHERE INFO_TIME between to_date('%s', 'yyyy-mm-dd') and to_date('%s', 'yyyy-mm-dd')" +
                " and INFO_TYPE in (%s)" +
                " and INFO_LEVEL in (%s) group by INFO_TYPE, INFO_LEVEL";
        String ee = String.format(sqll, date_format(begin), date_format(end), mul2String(request.getParameter("INFO_TYPE")),
                mul2String(request.getParameter("INFO_LEVEL")));
        System.out.println(ee);
        ResultSet aresultSet = statement.executeQuery(ee);
        while (aresultSet.next()) {
            INFO_TYPE_FOR_COUNT.add(aresultSet.getString(1));
            INFO_LEVEL_FOR_COUNT.add(aresultSet.getString(2));
            INFO_COUNT.add(aresultSet.getString(3));
        }
        INFO_TYPE_FOR_COUNT = INFO_TYPE_FOR_COUNT.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_LEVEL_FOR_COUNT = INFO_LEVEL_FOR_COUNT.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());

        System.out.println(INFO_TIME.size());
        System.out.println(INFO_TYPE.size());
        System.out.println(INFO_LEVEL.size());
//        System.out.println(INFO_ADDRESS.size());
//        System.out.println(INFO_TOPIC.size());

        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("INFO_TIME", JSONArray.fromObject(INFO_TIME));
        out.put("INFO_TYPE", JSONArray.fromObject(INFO_TYPE));
        out.put("INFO_LEVEL", JSONArray.fromObject(INFO_LEVEL));
//        out.put("INFO_ADDRESS", JSONArray.fromObject(INFO_ADDRESS));
//        out.put("INFO_TOPIC", JSONArray.fromObject(INFO_TOPIC));
        out.put("INFO_TYPE_FOR_COUNT", JSONArray.fromObject(INFO_TYPE_FOR_COUNT));
        out.put("INFO_LEVEL_FOR_COUNT", JSONArray.fromObject(INFO_LEVEL_FOR_COUNT));
        out.put("INFO_COUNT", JSONArray.fromObject(INFO_COUNT));
        out.put("INFO_departmentid", JSONArray.fromObject(INFO_departmentid));
        return out;
    }

    @ResponseBody
    @RequestMapping("/PIS_INFO_datagrid")
    ModelAndView PIS_INFO_datagrid_Controller(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("LYW_templates/PIS_INFO_datagrid");
        return mav;
    }

    @SneakyThrows
    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping("/PIS_INFO_datagrid_ajax")
    Map<String, JSONArray> PIS_INFO_datagrid_ajax(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        int n = Integer.parseInt(request.getParameter("cur_page")) + 1;
        int m = Integer.parseInt(request.getParameter("data_every_page"));
        List<String> Row = new ArrayList<>();
        List<String> INFO_CHANNEL = new ArrayList<>();
        List<String> INFO_SOURCE = new ArrayList<>();
        List<String> INFO_FEATURE = new ArrayList<>();
        List<String> INFO_TIME = new ArrayList<>();
        List<String> INFO_TYPE = new ArrayList<>();
        List<String> INFO_LEVEL = new ArrayList<>();
        List<String> INFO_departmentid = new ArrayList<>();
        List<String> INFO_DESC = new ArrayList<>();
        List<String> INFO_TOPIC = new ArrayList<>();
        List<String> data_numbers = new ArrayList<>();
        List<String> INFO_ADDRESS = new ArrayList<>();
        List<String> INFO_CONTENT = new ArrayList<>();
        List<String> INFO_COORDINATE = new ArrayList<>();

        System.out.println(request.getParameter("INFO_TYPE"));
        System.out.println(request.getParameter("INFO_LEVEL"));
        System.out.println(request.getParameter("INFO_SOURCE"));
        System.out.println(request.getParameter("data_every_page"));
        System.out.println(request.getParameter("cur_page"));

        //每页显示m条数据，查询第n页数据
//        String sql = "select * from (select rownum r,e. * from LRX.PIS_INFO_BASE e where rownum<=%s) t where r>%s";
        String sql = "select * from " +
                "(select rownum r,e. * from " +
                "(select * from LRX.PIS_INFO_BASE where INFO_TYPE in (%s) and INFO_LEVEL in (%s) and INFO_SOURCE in (%s) and INFO_DEPTID in (%s) and INFO_CHANNEL in (%s)) e " +
                "where rownum<=%s) t " +
                "where r>%s";
        String asql = String.format(sql, mul2String(request.getParameter("INFO_TYPE")), mul2String(request.getParameter("INFO_LEVEL")), mul2String(request.getParameter("INFO_SOURCE")), mul2String(request.getParameter("DEPT_ID")), mul2String(request.getParameter("INFO_CHANNEL")), m*n, m*n-m);
        String ssql = "select count(INFO_ID) from LRX.PIS_INFO_BASE where INFO_TYPE in (%s) and INFO_LEVEL in (%s) and INFO_SOURCE in (%s) and INFO_DEPTID in (%s) and INFO_CHANNEL in (%s)";
        String assql = String.format(ssql, mul2String(request.getParameter("INFO_TYPE")), mul2String(request.getParameter("INFO_LEVEL")), mul2String(request.getParameter("INFO_SOURCE")), mul2String(request.getParameter("DEPT_ID")), mul2String(request.getParameter("INFO_CHANNEL")));
        System.out.println(asql);

        ResultSet resultSet = statement.executeQuery(asql);
        while (resultSet.next()) {
            INFO_TIME.add(resultSet.getString("INFO_TIME"));
            INFO_TYPE.add(resultSet.getString("INFO_TYPE"));
            INFO_LEVEL.add(resultSet.getString("INFO_LEVEL"));
            INFO_departmentid.add(resultSet.getString("INFO_DEPTID"));
            INFO_CHANNEL.add(resultSet.getString("INFO_CHANNEL"));
            INFO_SOURCE.add(resultSet.getString("INFO_SOURCE"));
            INFO_DESC.add(resultSet.getString("INFO_DESC"));
            INFO_TOPIC.add(resultSet.getString("INFO_TOPIC"));
            Row.add(resultSet.getString(1));
            INFO_ADDRESS.add(resultSet.getString("INFO_ADDRESS"));
            INFO_CONTENT.add(resultSet.getString("INFO_CONTENT"));
            INFO_FEATURE.add(resultSet.getString("INFO_FEATURE"));
            INFO_COORDINATE.add(resultSet.getString("INFO_COORDINATE"));
        }
        System.out.println(data_numbers);
        INFO_TIME = INFO_TIME.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_TYPE = INFO_TYPE.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_LEVEL = INFO_LEVEL.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_departmentid = INFO_departmentid.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_CHANNEL = INFO_CHANNEL.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_SOURCE = INFO_SOURCE.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_DESC = INFO_DESC.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_TOPIC = INFO_TOPIC.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_ADDRESS = INFO_ADDRESS.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_CONTENT = INFO_CONTENT.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_FEATURE = INFO_FEATURE.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_COORDINATE = INFO_COORDINATE.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());

        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("INFO_TIME", JSONArray.fromObject(INFO_TIME));
        out.put("INFO_TYPE", JSONArray.fromObject(INFO_TYPE));
        out.put("INFO_LEVEL", JSONArray.fromObject(INFO_LEVEL));
        out.put("INFO_departmentid", JSONArray.fromObject(INFO_departmentid));
        out.put("INFO_CHANNEL", JSONArray.fromObject(INFO_CHANNEL));
        out.put("INFO_SOURCE", JSONArray.fromObject(INFO_SOURCE));
        out.put("INFO_DESC", JSONArray.fromObject(INFO_DESC));
        out.put("INFO_TOPIC", JSONArray.fromObject(INFO_TOPIC));
        out.put("Row", JSONArray.fromObject(Row));
        out.put("INFO_ADDRESS", JSONArray.fromObject(INFO_ADDRESS));
        out.put("INFO_CHANNEL", JSONArray.fromObject(INFO_CHANNEL));
        out.put("INFO_CONTENT", JSONArray.fromObject(INFO_CONTENT));
        out.put("INFO_FEATURE", JSONArray.fromObject(INFO_FEATURE));
        out.put("INFO_COORDINATE", JSONArray.fromObject(INFO_COORDINATE));
        return out;
    }

    @ResponseBody
    @RequestMapping("/update")
    void update(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();
        Statement statement1 = connection.createStatement();

        ResultSet resultSet =  statement.executeQuery("select * from LRX.PIS_INFO_SOURCE_05");
        int count = 0;
        while (resultSet.next()) {
            String infoid = resultSet.getString("INFO_ID");
            String infocontent = resultSet.getString("INFO_CONTENT");
            JSONObject a = JSONObject.fromObject(infocontent);
            String sql = "update LRX.PIS_INFO_SOURCE_05 set ROADID = '%s', ROADNAME = '%s', DEVICEID = '%s', CARNUMBER = '%s', POINTNAME = '%s' where INFO_ID = '%s'";
            System.out.println(++count);
            String deviceid = "n";
            if (a.containsKey("deviceid")) {
                deviceid = ((String) a.get("deviceid")).length() == 0 ? "null" : (String) a.get("deviceid");
            }
            String roadid = "n";
            if (a.containsKey("roadid")) {
                roadid = ((String) a.get("roadid")).length() == 0 ? "null" : (String) a.get("roadid");
            }
            String roadname = "n";
            if (a.containsKey("roadname")) {
                roadname = ((String) a.get("roadname")).length() == 0 ? "null" : (String) a.get("roadname");
            }
            String carnumber = "n";
            if (a.containsKey("carnumber")) {
                carnumber = ((String) a.get("carnumber")).length() == 0 ? "null" : (String) a.get("carnumber");
            }
            String pointname = "n";
            if (a.containsKey("pointname")) {
                pointname = ((String) a.get("pointname")).length() == 0 ? "null" : (String) a.get("pointname");
            }
            String q = String.format(sql,
                    roadid,
                    roadname,
                    deviceid,
                    carnumber,
                    pointname,
                    infoid);
            System.out.println(q);
            statement1.executeUpdate(q);
        }
        System.out.println("Done.");


        connection.close();
    }

    @ResponseBody
    @RequestMapping("/update02")
    void update02(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();
        Statement statement1 = connection.createStatement();

        ResultSet resultSet =  statement.executeQuery("select * from LRX.PIS_INFO_SOURCE_02 OFFSET 63599 ROWS");
        int count = 63599;
        while (resultSet.next()) {
            String infoid = resultSet.getString("INFO_ID");
            String infotopic = resultSet.getString("INFO_TOPIC");
            List<String> carnumbers = carnumber_extractor(infotopic == null ? "" : infotopic);
            String carnumber = "";
            for (String c : carnumbers) {
                carnumber += c;
                carnumber += " ";
            }
            String sql = "update LRX.PIS_INFO_SOURCE_02 set CARNUMBER = '%s' where INFO_ID = '%s'";
            System.out.println(++count);
            String q = String.format(sql,
                    carnumber,
                    infoid);
            System.out.println(q);
            statement1.executeUpdate(q);
        }
        System.out.println("Done.");

        connection.close();
    }

    @ResponseBody
    @RequestMapping("/PIS_INFO_event_datagrid")
    ModelAndView PIS_INFO_event_datagrid_Controller(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("LYW_templates/PIS_INFO_event_datagrid");
        return mav;
    }

    @ResponseBody
    @RequestMapping("/PIS_INFO_event_datagrid_ajax")
    Map<String, JSONArray> PIS_INFO_event_datagrid_ajax(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        int n = Integer.parseInt(request.getParameter("cur_page")) + 1;
        int m = Integer.parseInt(request.getParameter("data_every_page"));
        String source = request.getParameter("source");
        String time_field = "INFO_TIME";
        String address_field = "INFO_COORDINATE";
        String entity_field = "CARNUMBER";
        String type_field = "INFO_TYPE";
        String trigger_field = "INFO_SUBTYPE";
        String sql = "select * from " +
                "(select rownum r,e. * from " +
                "(select * from LRX.PIS_INFO_SOURCE_" + source +
                " where INFO_COORDINATE is not null " +
                "and INFO_COORDINATE <> 'null' " +
                "and INFO_TYPE is not null " +
                "and INFO_SUBTYPE is not null ) e " +
                "where rownum<=%s) t " +
                "where r>%s";
        ResultSet resultSet = statement.executeQuery(String.format(sql, m*n, m*n-m));
        List<String> time = new ArrayList<>();
        List<String> address = new ArrayList<>();
        List<String> entity = new ArrayList<>();
        List<String> type = new ArrayList<>();
        List<String> trigger = new ArrayList<>();
        List<String> Row = new ArrayList<>();
        List<String> INFO_ID = new ArrayList<>();
        while (resultSet.next()) {
            time.add(resultSet.getString(time_field));
            address.add(resultSet.getString(address_field));
            type.add(resultSet.getString(type_field));
            trigger.add(resultSet.getString(trigger_field));
            INFO_ID.add(resultSet.getString("INFO_ID"));
            Row.add(resultSet.getString(1));
            if (source.equals("02")) {
                entity.add(resultSet.getString(entity_field));
            }
            else {
                entity.add("无");
            }
        }

        time = time.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        address = address.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        type = type.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        trigger = trigger.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        entity = entity.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("time", JSONArray.fromObject(time));
        out.put("address", JSONArray.fromObject(address));
        out.put("type", JSONArray.fromObject(type));
        out.put("trigger", JSONArray.fromObject(trigger));
        out.put("Row", JSONArray.fromObject(Row));
        out.put("entity", JSONArray.fromObject(entity));
        out.put("INFO_ID", JSONArray.fromObject(INFO_ID));

        return out;
    }

    @ResponseBody
    @RequestMapping("/update02coor")
    ModelAndView update02coor(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("LYW_templates/update02coor");
        return mav;
    }

    @ResponseBody
    @RequestMapping("/update02coorajax")
    Map<String, JSONArray> update02coorajax(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        String sql = "select * from LRX.PIS_INFO_SOURCE_02 where INFO_ADDRESS is not null and INFO_COORDINATE='null'";
//        String sql = "select * from " +
//                "(select rownum r,e. * from " +
//                "(select * from LRX.PIS_INFO_SOURCE_02" +
//                " where INFO_COORDINATE is not null) e " +
//                "where rownum<=10000) t " +
//                "where r>9000";
        System.out.println(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        List<String> INFO_ID = new ArrayList<>();
        List<String> INFO_ADDRESS = new ArrayList<>();
        while (resultSet.next()) {
            INFO_ID.add(resultSet.getString("INFO_ID"));
            INFO_ADDRESS.add(resultSet.getString("INFO_ADDRESS"));
        }

        INFO_ID = INFO_ID.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());
        INFO_ADDRESS = INFO_ADDRESS.stream().map(o -> o == null ? "空值" : o).collect(Collectors.toList());

        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("INFO_ID", JSONArray.fromObject(INFO_ID));
        out.put("INFO_ADDRESS", JSONArray.fromObject(INFO_ADDRESS));
        System.out.println("数据传到页面");
        return out;
    }

    @ResponseBody
    @RequestMapping("/writecoordinate")
    synchronized void  writecoordinate(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();
        String INFO_ID = request.getParameter("INFO_ID");
        String INFO_COORDINATE = request.getParameter("INFO_COORDINATE");
        System.out.println("update LRX.PIS_INFO_SOURCE_02 set INFO_COORDINATE=" + INFO_COORDINATE + " where INFO_ID=" + INFO_ID);
        System.out.println(number);
        statement.executeUpdate("update LRX.PIS_INFO_SOURCE_02 set INFO_COORDINATE='" + INFO_COORDINATE + "' where INFO_ID='" + INFO_ID + "'");
        connection.close();
        number++;
    }

    @ResponseBody
    @RequestMapping("/fk")
    void  fk(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();
        Statement statement1 = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select ADDRESS_ID from \"vio_database.ADDRESS_TREE\"");
        int i = 1;
        while (resultSet.next()) {
            String wfbh = resultSet.getString(1);
//            statement1.executeUpdate("update \"vio_database.VIO_VIOLATION_BASE_VIOLATION\" set CAR_ID=" + i++ + " where WFBH=" + wfbh);
//            statement1.executeUpdate("update \"vio_database.VIO_VIOLATION_BASE_VIOLATION\" set PERSON_ID=" + i++ + " where WFBH=" + wfbh);
//            statement1.executeUpdate("update \"vio_database.VIO_VIOLATION_BASE_VIOLATION\" set DEPARTMENT_ID=" + i++ + " where WFBH=" + wfbh);
            statement1.executeUpdate("update \"vio_database.ADDRESS_TREE\" set ID=" + i++ + " where WFBH=" + wfbh);
            System.out.println(i);
        }

        connection.close();
    }
}