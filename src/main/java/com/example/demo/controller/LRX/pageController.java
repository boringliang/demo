package com.example.demo.controller.LRX;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.po.LRX.fenye;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class pageController {

    @RequestMapping("/lrx/pageandpagenumber")
    @ResponseBody
    public Map<String,Object> givedata(HttpServletRequest request){
        String pagenumber = request.getParameter("pagenumber");
        String pagerange = request.getParameter("pagerange");
        String tablename = request.getParameter("tablename");
        String col = request.getParameter("col");
        String where = request.getParameter("where");
        System.out.println(pagenumber +"\t"+ pagerange +"\t"+ tablename +"\t"+ col  +"\t"+ "where");

        int Maxpage;
        List<String> datalist = new ArrayList();

//        UserExample example = new UserExample();
//        Criteria criteria = example.createCriteria();
//        criteria.andUsernameEqualTo("wyw");
//        int count = XxxMapper.countByExample(example);
//        相当于：select count(*) from user where username='wyw'
        JSONArray arry = JSON.parseArray(col);
        List collist = new ArrayList();
        collist.add("ROWNO");
        for (int i=0;i<arry.size();i++){
            collist.add(arry.get(i));
        }

        fenye fy = new fenye();
        List result = new ArrayList();
        result = fy.selectByPage(Integer.parseInt(pagenumber),Integer.parseInt(pagerange),"LRX."+tablename,collist);
        System.out.println(result);
        Map<String,Object> resultmap = new HashMap<>();
        resultmap.put("list",result);
        return resultmap;
    }
}
