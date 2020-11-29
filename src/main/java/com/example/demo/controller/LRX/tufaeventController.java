package com.example.demo.controller.LRX;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class tufaeventController {
    @RequestMapping("/tufaevent")
    @ResponseBody
    public ModelAndView keyArea(HttpServletRequest request){                  //流量检测异常的重点区域列表
        //HttpServletRequest request
        //String areaId = request.getParameter("areaId");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("tufaevent");
//        mav.addObject("keyAreaList");
        return mav;
    }
}
