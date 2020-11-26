package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.VioViolation;
import com.example.demo.mapper.VioViolationMapper;
import org.apache.jena.base.Sys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import weka.associations.Apriori;
import weka.associations.AssociationRule;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


@Controller
public class association {
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
    @RequestMapping("association")
    ModelAndView association() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/LYW_templates/association");
        QueryWrapper<VioViolation> queryWrapper = new QueryWrapper<>();
        List<VioViolation> res = vioViolationMapper.selectList(queryWrapper.select("distinct wfdd"));
        List<String> wfdds = res.stream().map(r -> r.getWfdd()).collect(Collectors.toList());
        modelAndView.addObject("wfdds", wfdds.toString());
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("association_ajax")
    JSONArray association_ajax(HttpServletRequest request) throws Exception {
        //得到数据
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
        String wfdds_string = request.getParameter("wfdds");
        List<String> wfdds = Arrays.asList(wfdds_string.split(","));
        String fields_string = request.getParameter("fields");
        List<String> fields = Arrays.asList(fields_string.split(","));
        List<VioViolation> res = vioViolationMapper.selectList(queryWrapper.between("WFSJ", aa, bb)
                .between("TO_CHAR(WFSJ)", date_format(c), date_format(d))
                .in("WFDD", wfdds));

//        //关联规则用到的字段
//        List<String> fields = Arrays.asList(new String[] {"Jszh", "Zjcx", "Drs", "Clfl", "Hpzl",
//        "Hphm", "Jdcsyr", "Syxz", "Jtfs", "Xzqh", "Dllx", "Wfdd", "Lddm", "Wfxw", "Wfjfs", "Fkje",
//        "Fxjg", "Cljg", "Jkbj", "Sgdj"});
//        //设置数据集的属性
//        ArrayList<Attribute> attributes = new ArrayList<>();
//        for (String field : fields) {
//            List<String> s = new ArrayList<>();
//            for (VioViolation v : res) {
//                Class aClass = v.getClass();
//                Method method = aClass.getDeclaredMethod("get" + field);
//                System.out.println(aClass.getDeclaredConstructor().newInstance(v));
//                System.out.println(method.invoke(aClass.getDeclaredConstructor().newInstance(v)));
//                s.add((String) method.invoke(aClass.getDeclaredConstructor().newInstance(v)));
//            }
////            System.out.println("get" + field);
////            System.out.println(s);
//            attributes.add(new Attribute(field.toUpperCase(), s));
//        }
//        //构造数据集
//        Instances instances = new Instances("Vioviolation", attributes, 0);
//        for (VioViolation vioViolation : res) {
//            Instance instance = new DenseInstance(fields.size());
//            for (int i = 0; i < fields.size(); i++) {
//                Class aClass = vioViolation.getClass();
//                Method method = aClass.getDeclaredMethod("get" + fields.get(i));
//                instance.setValue(attributes.get(i), (String) method.invoke(aClass.getDeclaredConstructor().newInstance(vioViolation)));
//            }
//            instance.setDataset(instances);
//            instances.add(instance);
//        }
//        //关联规则算法
//        Apriori apriori = new Apriori();
//        apriori.buildAssociations(instances);
//        System.out.println(apriori.canProduceRules());
//        System.out.println(apriori.getAssociationRules().getProducer());
//        System.out.println(apriori.getAssociationRules().getNumRules());
//        List<AssociationRule> rules = apriori.getAssociationRules().getRules();
//        for (AssociationRule r : rules) {
//            String premise = r.getPremise().toString();
//            String consequence = r.getConsequence().toString();
//            System.out.println(premise + "=>" + consequence);
        //关联规则用到的字段
//        List<String> fields = Arrays.asList(new String[] {"zjcx", "dsr", "clfl", "hpzl",
//        "hphm", "jdcsyr", "syxz", "jtfs", "xzqh", "dllx", "wfdd", "lddm", "wfxw", "wfjfs", "fkje",
//        "fxjg", "cljg", "jkbj", "sgdj"});
        List<String> out = Arrays.asList(new String[] {"jszh"});
        //设置数据集的属性
        ArrayList<Attribute> attributes = new ArrayList<>();
        for (String field : fields) {
//            List<String> s = new ArrayList<>();
            Set<String> s = new HashSet<>();
            for (VioViolation v : res) {
                JSONObject jsonObject = (JSONObject) JSONObject.toJSON(v);
//                System.out.println(jsonObject);
                s.add((String) jsonObject.getString(field));
//                System.out.println(jsonObject.getString(field));
            }
            List<String> values = new ArrayList<>(s);
            attributes.add(new Attribute(field, values));
        }
        //构造数据集
        Instances instances = new Instances("Vioviolation", attributes, 0);
        for (VioViolation vioViolation : res) {
            Instance instance = new DenseInstance(fields.size());
            for (int i = 0; i < fields.size(); i++) {
                JSONObject jsonObject = (JSONObject) JSONObject.toJSON(vioViolation);
                instance.setValue(attributes.get(i), (String) jsonObject.getString(fields.get(i)));
            }
            instance.setDataset(instances);
            instances.add(instance);
        }
        //关联规则算法
        Apriori apriori = new Apriori();
        apriori.setNumRules(Integer.parseInt(request.getParameter("num_rules")));
        apriori.setMinMetric(Double.parseDouble(request.getParameter("confidence")));
        apriori.setLowerBoundMinSupport(Double.parseDouble(request.getParameter("support")));
        apriori.buildAssociations(instances);
//        System.out.println(apriori.canProduceRules());
//        System.out.println(apriori.getAssociationRules().getProducer());
        System.out.println(apriori.getAssociationRules().getNumRules());
        List<AssociationRule> rules = apriori.getAssociationRules().getRules();
//        for (AssociationRule r : rules) {
//            String premise = r.getPremise().toString();
//            String consequence = r.getConsequence().toString();
//            System.out.println(r.toString());
//        }
        JSONArray jsonArray = new JSONArray();
        for (AssociationRule associationRule : rules) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("premise", associationRule.getPremise().toString());
            jsonObject.put("consequence", associationRule.getConsequence().toString());
            double[] metrics = associationRule.getMetricValuesForRule();
            jsonObject.put("confidence", metrics[0]);
            jsonObject.put("lift", metrics[1]);
            jsonObject.put("leverage", metrics[2]);
            jsonObject.put("conviction", metrics[3]);
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }
}
