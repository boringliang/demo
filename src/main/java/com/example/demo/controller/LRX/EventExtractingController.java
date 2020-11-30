package com.example.demo.controller.LRX;

import com.example.demo.po.LRX.fenye;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EventExtractingController {

    @RequestMapping("/lrx/ee")
    @ResponseBody
    public ModelAndView ee(HttpServletRequest request) {                  //流量检测异常的重点区域列表

        String areaId = request.getParameter("areaId");

        String sql="SELECT \"ACD_DATABASE\".\"ACD_FILE_BASE_SLIM\".*,ROWID \"NAVICAT_ROWID\" " +
                "FROM \"ACD_DATABASE\".\"ACD_FILE_BASE_SLIM\" " +
                "OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY";
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        for (List l:result){
            System.out.println(l.toString());
        }

        ModelAndView mav = new ModelAndView();
        mav.setViewName("/LRX/eventextraction");
        //mav.addObject("result",result);
        return mav;
    }
    @RequestMapping("/lrx/eegetbasetable")
    @ResponseBody
    public List eegetbasetable(HttpServletRequest request) {                  //流量检测异常的重点区域列表

        String sql="SELECT \"ACD_DATABASE\".\"ACD_FILE_BASE_SLIM\".*,ROWID \"NAVICAT_ROWID\" " +
                "FROM \"ACD_DATABASE\".\"ACD_FILE_BASE_SLIM\" " +
                "OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY";
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        for (List l:result){
            System.out.println(l.toString());
        }

        return result;
    }
    @RequestMapping("/lrx/addresstable")
    @ResponseBody
    public List addresstable(HttpServletRequest request) {
        String sgbh = request.getParameter("sgbh");
        System.out.println(sgbh);
        String sql="SELECT * FROM ACD_DATABASE.ADDRESS WHERE SGBH="+sgbh;
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        System.out.println(result);

        return result;
    }
    @RequestMapping("/lrx/carajax")
    @ResponseBody
    public List carajaxtable(HttpServletRequest request) {
        String sgbh = request.getParameter("sgbh");
        System.out.println(sgbh);
        String sql="SELECT * FROM ACD_DATABASE.CAR WHERE SGBH="+sgbh;
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        System.out.println(result);

        return result;
    }

    @RequestMapping("/lrx/consequenceajax")
    @ResponseBody
    public List consequenceajaxtable(HttpServletRequest request) {
        String sgbh = request.getParameter("sgbh");
        System.out.println(sgbh);
        String sql="SELECT * FROM ACD_DATABASE.consequense WHERE SGBH="+sgbh;
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        System.out.println(result);
        return result;
    }

    @RequestMapping("/lrx/departmentajax")
    @ResponseBody
    public List departmentajaxtable(HttpServletRequest request) {
        String sgbh = request.getParameter("sgbh");
        System.out.println(sgbh);
        String sql="SELECT * FROM ACD_DATABASE.department WHERE SGBH="+sgbh;
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        System.out.println(result);
        return result;
    }

    @RequestMapping("/lrx/timeajax")
    @ResponseBody
    public List timeajaxtable(HttpServletRequest request) {
        String sgbh = request.getParameter("sgbh");
        System.out.println(sgbh);
        String sql="SELECT * FROM ACD_DATABASE.time WHERE SGBH="+sgbh;
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        System.out.println(result);
        return result;
    }

    @RequestMapping("/lrx/TQajax")
    @ResponseBody
    public List TQajaxtable(HttpServletRequest request) {
        String sgbh = request.getParameter("sgbh");
        System.out.println(sgbh);
        String sql="SELECT * FROM ACD_DATABASE.WEATHER WHERE SGBH="+sgbh;
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        System.out.println(result);
        return result;
    }

    @RequestMapping("/lrx/eenextpage")
    @ResponseBody
    public List eenextpage(HttpServletRequest request) {
        String currentPage = request.getParameter("currentPage");
        System.out.println(currentPage);
        String sql="SELECT \"ACD_DATABASE\".\"ACD_FILE_BASE_SLIM\".*,ROWID \"NAVICAT_ROWID\" " +
                "FROM \"ACD_DATABASE\".\"ACD_FILE_BASE_SLIM\" " +
                "OFFSET " + (Integer.parseInt(currentPage)+1)*10 + "ROWS FETCH NEXT 10 ROWS ONLY";
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        System.out.println(result);
        return result;
    }
    @RequestMapping("/lrx/eepreviouspage")
    @ResponseBody
    public List eepreviouspage(HttpServletRequest request) {
        String currentPage = request.getParameter("currentPage");
        System.out.println(currentPage);
        String sql="SELECT \"ACD_DATABASE\".\"ACD_FILE_BASE_SLIM\".*,ROWID \"NAVICAT_ROWID\" " +
                "FROM \"ACD_DATABASE\".\"ACD_FILE_BASE_SLIM\" " +
                "OFFSET " + (Integer.parseInt(currentPage)-1)*10 + "ROWS FETCH NEXT 10 ROWS ONLY";
        fenye fy=new fenye();
        List<List> result = fy.selectBySql(sql);
        System.out.println(result);
        return result;
    }
}
