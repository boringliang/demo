package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.VioViolation;
import com.example.demo.mapper.VioViolationMapper;
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

/**
 * <p>
 * 违法记录表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Controller
public class VioViolationController {
    @Autowired(required = false)
    private VioViolationMapper vioViolationMapper;

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
    @RequestMapping("test")
    List<VioViolation> test() {
        QueryWrapper<VioViolation> q = new QueryWrapper<>();
        return vioViolationMapper.selectList(q.lt("WFSJ", new Date()).
                last(" and rownum < 3"));
    }

    @ResponseBody
    @RequestMapping("VIOLATIONDatagrid")
    ModelAndView VioviolationDatagrid() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/LYW_templates/VIOLATION_datagrid");
        return mav;
    }

    @ResponseBody
    @RequestMapping("dataGridAjax")
    List<VioViolation> VioviolationDatagridAjax(HttpServletRequest request) {
        QueryWrapper<VioViolation> queryWrapper = new QueryWrapper<>();
        int n = Integer.parseInt(request.getParameter("cur_page"));
        int m = Integer.parseInt(request.getParameter("data_every_page"));
        String last = "offset %s rows fetch next %s rows only";
        return vioViolationMapper.selectList(queryWrapper.last(String.format(last, m*n, m)));
    }

    @ResponseBody
    @RequestMapping("VIOLATIONEventgraph")
    ModelAndView VIOLATIONEventgraph() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/LYW_templates/VIOLATION_eventgraph");
        return mav;
    }

    @ResponseBody
    @RequestMapping("VIOLATION_eventgraph_ajax")
    List<VioViolation> VioviolationEventgraphAjax(HttpServletRequest request) {
        QueryWrapper<VioViolation> queryWrapper = new QueryWrapper<>();
        String a = request.getParameter("time1");
        String b = request.getParameter("time2");
        String c = request.getParameter("time_range1");
        String d = request.getParameter("time_range2");
        Date aa = new Date(a);
        Date bb = new Date(b);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time1 = sdf.format(aa);
        String time2 = sdf.format(bb);
//        String sql = "select * from LRX.VIO_VIOLATION where WFSJ between to_date('%s','yyyy-mm-dd hh24:mi:ss') and to_date('%s','yyyy-mm-dd hh24:mi:ss') " +
//                " and TO_CHAR(WFSJ, 'hh24:mi:ss') between '%s' and '%s' order by dbms_random.value";
//        String sqll = String.format(sql, time1, time2, date_format(c), date_format(d));
//        System.out.println(sqll);
//        List<VioViolation> res = vioViolationMapper.selectList(queryWrapper.inSql("WFBH", sqll).last(" and rownum < 3"));
//        List<VioViolation> res = vioViolationMapper.selectList(queryWrapper.last("where WFBH in (" + sqll + ")" + " and rownum < 3"));
        List<VioViolation> res = vioViolationMapper.selectList(queryWrapper.between("WFSJ", aa, bb)
        .between("TO_CHAR(WFSJ, 'hh24:mi:ss')", date_format(c), date_format(d))
        .last(" and rownum < 100"));
        return res;
    }

//    @ResponseBody
//    @RequestMapping("testweka")
//    String testweka() {
//        QueryWrapper<VioViolation> q = new QueryWrapper<>();
//        VioViolation res = vioViolationMapper.selectOne(q.lt("WFSJ", new Date()).
//                last(" and rownum < 2"));
//        JSONObject ajson = (JSONObject) JSONObject.toJSON(res);
//        JSONNode jsonNode = new JSONNode();
//        jsonNode.addArrayElement(ajson);
//        return JSONInstances.toHeader(jsonNode).toString();
//    }

//    @ResponseBody
//    @RequestMapping("testjavaml")
//    void testjavaml() throws IOException {
//        Dataset data = new DefaultDataset();
//        for (int i = 0; i < 10; i++) {
//            Instance tmpInstance = InstanceTools.randomInstance(25);
//            data.add(tmpInstance);
//        }
//        Clusterer km = new KMeans();
//        Dataset[] clusters = km.cluster(data);
//        for (Dataset d : clusters) {
//            System.out.println(d.toString());
//        }
//    }

    @ResponseBody
    @RequestMapping("testwekaassociation")
    void testwekaassociation() throws Exception {
        ArrayList<Attribute> attributes = new ArrayList<>();

        List<String> labelss = new ArrayList<>();
        labelss.add("cake");
        labelss.add("doctor");
        labelss.add("anyone");
        labelss.add("dead");
        labelss.add("weather");
        labelss.add("wuhu");
        labelss.add("nice");
        attributes.add(new Attribute("number", labelss));

        List<String> labels = new ArrayList<>();
        labels.add("fuck");
        labels.add("youth");
        labels.add("sake");
        labels.add("mamimi");
        labels.add("takun");
        labels.add("haru");
        attributes.add(new Attribute("class", labels));

        List<String> labelsss = new ArrayList<>();
        labelsss.add("fuck");
        labelsss.add("doke");
        labelsss.add("sake");
        labelsss.add("mamimi");
        labelsss.add("takun");
        labelsss.add("haru");
        attributes.add(new Attribute("cclass", labelsss));

        List<String> labelssss = new ArrayList<>();
        labelssss.add("fuck");
        labelssss.add("mai");
        labelssss.add("sake");
        labelssss.add("mamimi");
        labelssss.add("takun");
        labelssss.add("haru");
        attributes.add(new Attribute("cllass", labelssss));

        Instances instances = new Instances("test", attributes, 0);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            Instance instance = new DenseInstance(4);
            instance.setValue(attributes.get(0), labelss.get(random.nextInt(1)));
            instance.setValue(attributes.get(1), labels.get(random.nextInt(1)));
            instance.setValue(attributes.get(2), labelssss.get(random.nextInt(5)));
            instance.setValue(attributes.get(3), labels.get(random.nextInt(5)));
            instance.setDataset(instances);
            instances.add(instance);
        }
        SimpleKMeans clusterer = new SimpleKMeans();
        clusterer.buildClusterer(instances);
        System.out.println(clusterer.getNumClusters());
        System.out.println("--------------------");
        System.out.println(clusterer.toString());
        for (weka.core.Instance i : instances) {
            System.out.println(clusterer.clusterInstance(i));
        }
        Apriori fpGrowth = new Apriori();
//        FPGrowth fpGrowth = new FPGrowth();
        fpGrowth.buildAssociations(instances);
        System.out.println(fpGrowth.canProduceRules());
        System.out.println(fpGrowth.getAssociationRules().getProducer());
        System.out.println(fpGrowth.getAssociationRules().getNumRules());
        List<AssociationRule> rules = fpGrowth.getAssociationRules().getRules();
        for (AssociationRule r : rules) {
            String a = r.getPremise().toString();
            String b = r.getConsequence().toString();
            System.out.println(a + "=>" + b);
        }
//        System.out.println(fpGrowth.graph(fpGrowth.));
    }

    @ResponseBody
    @RequestMapping("testwekacluster")
    void testwekacluster() throws Exception {
        ArrayList<Attribute> attributes = new ArrayList<>();
        attributes.add(new Attribute("first"));
        attributes.add(new Attribute("second"));
        List<String> temp = Arrays.asList(new String[] {"first", "sectond"});
        attributes.add(new Attribute("string", temp));
        Instances instances = new Instances("testcluster", attributes, 0);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Instance instance = new DenseInstance(3);
            instance.setValue(0, random.nextDouble());
            instance.setValue(1, random.nextDouble());
            instance.setValue(2, temp.get(random.nextInt(1)));
            instance.setDataset(instances);
            instances.add(instance);
        }
        EM em = new EM();
        em.buildClusterer(instances);
        List<Integer> clusters = new ArrayList<>();
        for (Instance i : instances) {
            clusters.add(em.clusterInstance(i));
        }
        System.out.println(clusters);
    }

//    @RequestMapping("testd3") ModelAndView testd3() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("test");
//        return modelAndView;
//    }
}
