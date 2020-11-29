package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.AcdFile;
import com.example.demo.entity.VioCoderoad;
import com.example.demo.entity.VioViolation;
import com.example.demo.mapper.AcdFileMapper;
import com.example.demo.mapper.VioCoderoadMapper;
import com.example.demo.mapper.VioViolationMapper;
import org.apache.jena.base.Sys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import weka.associations.Apriori;
import weka.associations.AssociationRule;
import weka.associations.FPGrowth;
import weka.clusterers.HierarchicalClusterer;
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
public class Association {
    @Autowired(required = false)
    private VioViolationMapper vioViolationMapper;
    @Autowired(required = false)
    private VioCoderoadMapper vioCoderoadMapper;
    @Autowired(required = false)
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
    @RequestMapping("association")
    ModelAndView association() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/LYW_templates/association");
        QueryWrapper<VioViolation> queryWrapper = new QueryWrapper<>();
        List<VioViolation> res = vioViolationMapper.selectList(queryWrapper.select("distinct wfdd"));
        List<String> wfdds = res.stream().map(r -> r.getWfdd()).collect(Collectors.toList());
//        List<VioCoderoad> vioCoderoads = vioCoderoadMapper.selectList(new QueryWrapper<VioCoderoad>().select("*"));
//        List<String> wfdds = wfddss.stream().map(o -> {
//            for (VioCoderoad vioCoderoad : vioCoderoads) {
//                if (vioCoderoad.getDldm().equals(o)) {
//                    String temp = vioCoderoad.getDlmc();
//                    temp.replace('(', ',');
//                    temp.replace(')', ',');
//                    return temp;
//                }
//            }
//            return o;
//        }).collect(Collectors.toList());
        modelAndView.addObject("wfdds", wfdds.toString());
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("association_ajax")
    JSONArray association_ajax(HttpServletRequest request) throws Exception {
//        List<String> fields = Arrays.asList(new String[] {"Jszh", "Zjcx", "Drs", "Clfl", "Hpzl",
//        "Hphm", "Jdcsyr", "Syxz", "Jtfs", "Xzqh", "Dllx", "Wfdd", "Lddm", "Wfxw", "Wfjfs", "Fkje",
//        "Fxjg", "Cljg", "Jkbj", "Sgdj"});
        Map<String, String> table= new HashMap<>();
        table.put("jszh", "驾驶证号");
        table.put("zjcx", "准驾车型");
        table.put("dsr", "当事人");
        table.put("clfl", "车辆分类");
        table.put("hpzl", "号牌种类");
        table.put("hphm", "号牌号码");
        table.put("jdcsyr", "机动车所有人");
        table.put("syxz", "使用性质");
        table.put("jtfs", "驾驶证号");
        table.put("xzqh", "行政区划");
        table.put("dllx", "道路类型");
        table.put("wfdd", "违法地点");
        table.put("lddm", "路段代码");
        table.put("wfxw", "违法行为");
        table.put("wfjfs", "违法记分数");
        table.put("fkje", "罚款金额");
        table.put("fxjg", "发现机关");
        table.put("cljg", "处理机关");
        table.put("jkbj", "交款标记");
        table.put("sgdj", "事故等级");
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
        String fields_string = request.getParameter("fields");
        List<String> fields = Arrays.asList(fields_string.split(","));
        List<VioViolation> res;
        if (wfdds_string.equals("all")) {
//            fields = Arrays.asList(fields_string.split(","));
            res = vioViolationMapper.selectList(queryWrapper.between("WFSJ", aa, bb)
                    .between("TO_CHAR(WFSJ, 'hh24:mi:ss')", date_format(c), date_format(d)));
        }
        else {
            List<String> wfdds = Arrays.asList(wfdds_string.split(","));
//            fields = Arrays.asList(fields_string.split(","));
            res = vioViolationMapper.selectList(queryWrapper.between("WFSJ", aa, bb)
                    .between("TO_CHAR(WFSJ, 'hh24:mi:ss')", date_format(c), date_format(d))
                    .in("WFDD", wfdds));
        }

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
            List<String> temp = values.stream().map(o -> o == null ? "none" : o).collect(Collectors.toList());
//            System.out.println(temp);
            attributes.add(new Attribute(table.get(field), temp));
        }
        //构造数据集
        Instances instances = new Instances("Vioviolation", attributes, 0);
        for (VioViolation vioViolation : res) {
            Instance instance = new DenseInstance(fields.size());
            for (int i = 0; i < fields.size(); i++) {
                JSONObject jsonObject = (JSONObject) JSONObject.toJSON(vioViolation);
                instance.setValue(attributes.get(i), jsonObject.getString(fields.get(i)) == null ? "none" : jsonObject.getString(fields.get(i)));
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
        System.out.println("data transfered.");
        return jsonArray;
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
//        List<String> out = Arrays.asList(new String[] {"jszh"});
    }

    @ResponseBody
    @RequestMapping("association_acd")
    ModelAndView association_acd() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/LYW_templates/association_acd");
        QueryWrapper<AcdFile> queryWrapper = new QueryWrapper<>();
        List<AcdFile> res = acdFileMapper.selectList(queryWrapper.select("distinct lh"));
        List<String> lhs = res.stream().map(r -> r.getLh()).collect(Collectors.toList());
        modelAndView.addObject("lhs", lhs.toString());
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("association_acd_ajax")
    JSONArray association_acd_ajax(HttpServletRequest request) throws Exception {
        Map<String, String> table= new HashMap<>();
        table.put("tq", "天气");
        table.put("njd", "能见度");
        table.put("xc", "现场");
        table.put("zmtj", "照明条件");
        table.put("dx", "地形");
        table.put("fhsslx", "防护设施类型");
        table.put("dlwlgl", "道路物理隔离");
        table.put("sglx", "事故类型");
        table.put("sgccyy", "事故初查原因");
        table.put("ccyyfl", "事故初查原因分类");
        table.put("sgrdyy", "事故认定原因");
        table.put("rdyyfl", "事故认定原因分类");
        table.put("sgxt", "事故形态");
        table.put("badw", "办案单位");
        table.put("fsjg", "发送机关");
        table.put("lh", "路号");
        //得到数据
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
        String lhs_string = request.getParameter("lhs");
        String fields_string = request.getParameter("fields");
        List<String> fields = Arrays.asList(fields_string.split(","));
        List<AcdFile> res;
        if (lhs_string.equals("all")) {
            res = acdFileMapper.selectList(queryWrapper.between("SGFSSJ", aa, bb)
                    .between("TO_CHAR(SGFSSJ, 'hh24:mi:ss')", date_format(c), date_format(d)));
        }
        else {
            List<String> lhs = Arrays.asList(lhs_string.split(","));
            res = acdFileMapper.selectList(queryWrapper.between("SGFSSJ", aa, bb)
                    .between("TO_CHAR(SGFSSJ, 'hh24:mi:ss')", date_format(c), date_format(d))
                    .in("LH", lhs));
        }

        //设置数据集的属性
        ArrayList<Attribute> attributes = new ArrayList<>();
        for (String field : fields) {
            Set<String> s = new HashSet<>();
            for (AcdFile v : res) {
                JSONObject jsonObject = (JSONObject) JSONObject.toJSON(v);
                s.add((String) jsonObject.getString(field));
            }
            List<String> values = new ArrayList<>(s);
            List<String> temp = values.stream().map(o -> o == null ? "none" : o).collect(Collectors.toList());
            attributes.add(new Attribute(table.get(field), temp));
        }
        //构造数据集
        Instances instances = new Instances("AcdFile", attributes, 0);
        for (AcdFile acdFile : res) {
            Instance instance = new DenseInstance(fields.size());
            for (int i = 0; i < fields.size(); i++) {
                JSONObject jsonObject = (JSONObject) JSONObject.toJSON(acdFile);
                instance.setValue(attributes.get(i), jsonObject.getString(fields.get(i)) == null ? "none" : jsonObject.getString(fields.get(i)));
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
        System.out.println(apriori.getAssociationRules().getNumRules());
        List<AssociationRule> rules = apriori.getAssociationRules().getRules();
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
        System.out.println("data transfered.");

        return jsonArray;
    }



}
