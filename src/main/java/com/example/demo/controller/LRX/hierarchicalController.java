package com.example.demo.controller.LRX;

import org.apache.jena.base.Sys;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Controller
public class hierarchicalController {
    @RequestMapping("/lrx/hierarchical")
    @ResponseBody
    public ModelAndView zhengzha(HttpServletRequest request) {                  //流量检测异常的重点区域列表
        //HttpServletRequest request
        //String areaId = request.getParameter("areaId");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("/LRX/hierarchical");
//        mav.addObject("keyAreaList");
        return mav;
    }

    @RequestMapping("/lrx/hierarchicalajax")
    @ResponseBody
    public List<String> ja2py(HttpServletRequest request){
        List<String> res = new ArrayList<>();
        Process proc;
        try{
//            C:\Users\LRX\Desktop\test.py
//            C:\Users\LRX\Desktop\lll\hierarchical.py
            String[] args1 = new String[]{"python",
                    "C:\\Users\\LRX\\Desktop\\lll\\hierarchical.py",
                    "1"};
            proc = Runtime.getRuntime().exec(args1);

            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(),"GB2312"));
            BufferedReader er = new BufferedReader(new InputStreamReader(proc.getErrorStream(),"GB2312"));
            String line2= null;
            while ((line2 = er.readLine()) != null){
                System.out.println(line2);
            }

            String line = null;

            while ((line = in.readLine()) != null){
                res.add(line);
//                System.out.println("******************************************");
                System.out.println(line);
            }
            in.close();
            proc.waitFor();
        } catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return res;
    }
}
