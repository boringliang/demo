package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.VioViolation;
import com.example.demo.mapper.VioCoderoadMapper;
import com.example.demo.mapper.VioViolationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class Cluster {
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
    @RequestMapping("violation_cos_cluster")
    ModelAndView violation_cluster() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/LYW_templates/violation_cos_cluster");
        QueryWrapper<VioViolation> queryWrapper = new QueryWrapper<>();
        List<VioViolation> res = vioViolationMapper.selectList(queryWrapper.select("distinct wfdd"));
        List<String> wfdds = res.stream().map(r -> r.getWfdd()).collect(Collectors.toList());
        modelAndView.addObject("wfdds", wfdds.toString());
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("violation_cos_cluster_ajax")
    JSONArray violation_cluster_ajax(HttpServletRequest request) {
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
            res = vioViolationMapper.selectList(queryWrapper.between("WFSJ", aa, bb)
                    .between("TO_CHAR(WFSJ, 'hh24:mi:ss')", date_format(c), date_format(d)));
        }
        else {
            List<String> wfdds = Arrays.asList(wfdds_string.split(","));
            res = vioViolationMapper.selectList(queryWrapper.between("WFSJ", aa, bb)
                    .between("TO_CHAR(WFSJ, 'hh24:mi:ss')", date_format(c), date_format(d))
                    .in("WFDD", wfdds));
        }
        //变成onehot

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
        return new JSONArray();
    }
}
