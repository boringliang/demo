package com.example.demo.controller.LRX;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.AcdFile;
import com.example.demo.entity.VioViolation;
import com.example.demo.mapper.AcdFileMapper;
import com.example.demo.mapper.VioViolationMapper;
//import com.sun.org.apache.xpath.internal.operations.Mod;
//import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.jena.base.Sys;
import org.apache.jena.rdf.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
//import sun.text.normalizer.NormalizerBase;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import weka.associations.Apriori;
import weka.associations.AssociationRule;
import weka.clusterers.EM;
import weka.clusterers.HierarchicalClusterer;
import weka.clusterers.SimpleKMeans;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

@Controller
public class AccGraphController {
    @Autowired(required = false)
//    private VioViolationMapper vioViolationMapper;
    private AcdFileMapper acdFileMapper;

    private String date_format(String date) {
        String[] l = date.split(":");
        for (int i = 0; i < l.length; i++) {
            if (l[i].length() < 2) {
                l[i] = "0" + l[i];
            }
        }
        return String.join(":", l);
    }

    @ResponseBody
    @RequestMapping("/lrx/test")
    List<AcdFile> test() {
        QueryWrapper<AcdFile> q = new QueryWrapper<>();
        return acdFileMapper.selectList(q.lt("SGFSSJ", new Date()).
                last(" and rownum < 3"));
    }

    @ResponseBody
    @RequestMapping("/lrx/AccidentDatagrid")
    ModelAndView acdFileMapperDatagrid() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/LRX/Accident_datagrid");
        return mav;
    }

    @ResponseBody
    @RequestMapping("/lrx/dataGridAjax")
    List<AcdFile> AcdFileDatagridAjax(HttpServletRequest request) {
        QueryWrapper<AcdFile> queryWrapper = new QueryWrapper<>();
        int n = Integer.parseInt(request.getParameter("cur_page"));
        int m = Integer.parseInt(request.getParameter("data_every_page"));
        String last = "offset %s rows fetch next %s rows only";
        return acdFileMapper.selectList(queryWrapper.last(String.format(last, m*n, m)));
    }

    @ResponseBody
    @RequestMapping("/lrx/AccidentEventgraph")
    ModelAndView VIOLATIONEventgraph() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/LRX/Accident_eventgraph");
        return mav;
    }

    @ResponseBody
    @RequestMapping("/lrx/VIOLATION_eventgraph_ajax")
    List<AcdFile> AcdFileEventgraphAjax(HttpServletRequest request) {
        QueryWrapper<AcdFile> queryWrapper = new QueryWrapper<>();
        String a = request.getParameter("time1");
        String b = request.getParameter("time2");
        String c = request.getParameter("time_range1");
        String d = request.getParameter("time_range2");
        Date aa = new Date(a);
        Date bb = new Date(b);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time1 = sdf.format(aa);
        String time2 = sdf.format(bb);
        List<AcdFile> res = acdFileMapper.selectList(queryWrapper.between("SGFSSJ", aa, bb)
                .between("TO_CHAR(SGFSSJ, 'hh24:mi:ss')", date_format(c), date_format(d))
                .last(" and rownum < 100"));
        System.out.println(res.toString());
        return res;
    }

}
