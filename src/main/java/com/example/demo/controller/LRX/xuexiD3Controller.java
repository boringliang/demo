package com.example.demo.controller.LRX;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@Controller
public class xuexiD3Controller {
    @ResponseBody
    @RequestMapping("/lrx/d3")
    ModelAndView xuexi_D3(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("LRX/test2d3");
        return mav;
    }
}
