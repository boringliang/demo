package com.example.demo.controller.LXH;


import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/viorules")
public class ViolationController {

    @RequestMapping("/index")
    public ModelAndView accident_index() {
        ModelAndView mav = new ModelAndView();
        JSONArray tables_json_array = JSONArray.fromObject(ViolationTables.getTables());
        mav.addObject("tables", tables_json_array.toString());
        mav.setViewName("LXH/vio_rules");
        return mav;
    }


    @ResponseBody
    @RequestMapping("/get_attribute" )
    public List<String> ACD_FILE_rules(HttpServletRequest request) {
        String table_selected = request.getParameter("table_selected");
//        System.out.println(table_selected);
//        System.out.println(table_selected.getClass().getName());
//        System.out.println(table_selected.equals("ACD_FILE"));
//        Map<String, String> map = AccidentTables.getConlumns(table_selected);
        Map<String, String> map = ViolationTables.getConlumns("VIO_VIOLATION");
        List<String> columnChinese = new ArrayList<>();
        for (HashMap.Entry<String, String> entry : map.entrySet()) {
            columnChinese.add(entry.getKey());
        }
        return columnChinese;
    }

    @RequestMapping("/res")
    @ResponseBody
    public List<String> accident_res(HttpServletRequest request){
        String obj = request.getParameter("choices");
        String support = request.getParameter("support");
        String confidence = request.getParameter("confidence");
        String tablename = request.getParameter("tablename").toString();
        Map<String,String> map = ViolationTables.getConlumns(tablename);

        System.out.println("tablename:"+tablename);
        System.out.println("map size:"+map.size());

        obj = obj.replace("[", "");
        obj = obj.replace("]", "");
        obj = obj.replace("\"", "");
        System.out.println("obj："+obj);
        String[] strarray=obj.split(",");
        System.out.println("strarray:");
        List<String> list = new ArrayList();

        for(String str:strarray){
            System.out.println(str);
            String column = map.get(str);
            System.out.println(column);
            list.add(column);
        }

        List<String> res = new ArrayList();

        Process proc;
        try {

            String[] args1 = new String[]{"python", "C:/Users/10356/Desktop/data_mine/test2.py",list.toString(), support,confidence,tablename};
            System.out.println(list.toString());
            System.out.println(support);
            System.out.println(confidence);
            System.out.println(tablename);

            proc = Runtime.getRuntime().exec(args1);
            //用输入输出流来截取结果
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                res.add(line);
                System.out.println(line);
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;





    }
}
