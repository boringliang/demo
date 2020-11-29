package com.example.demo.controller.LRX;

import net.sf.json.JSONArray;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.stream.Collectors;

@Controller
@MapperScan("com.example.demo.mapper.LYWMapper")
public class acd_eventsimlarity {
    private String utl(String s) {
        //把HAT_HAM这样的字符串变成HatHam
        String[] string_list = s.split("_");
        String result = "";
        for (int i = 0; i < string_list.length; i++) {
            string_list[i] = string_list[i].replace("LRX.", "");
            string_list[i] = string_list[i].substring(0, 1) + string_list[i].substring(1).toLowerCase();
            result = result + string_list[i];
        }
        return result;
    }

    private String date_format(String date) {
        //把2013-1-4这样的数据变成2013-01-04
        String[] l = date.split("-");
        for (int i = 0; i < l.length; i++) {
            if (l[i].length() < 2) {
                l[i] = "0" + l[i];
            }
        }
        return String.join("-", l);
    }

    private String mul2String(String mul) {
        String[] ids = mul.split(",");
        for (int i = 0; i < ids.length; i++) {
            ids[i] = "'" + ids[i] + "'";
        }
        return String.join(",", ids);
    }
    @ResponseBody
    @RequestMapping("/lrx/acd_eventgraph")
    ModelAndView VIOLATION_eventgraph_Controller(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("LRX/acd_eventgraph");
        return mav;
    }
    @ResponseBody
    @RequestMapping("/lrx/acd_eventgraph_ajax")
    Map<String, JSONArray> VIOLATION_eventgraph_ajax(HttpServletRequest request) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.73:1521:ORCL", "sys as sysdba", "123");
        Statement statement = connection.createStatement();

        String a = request.getParameter("time1");
        String b = request.getParameter("time2");
        Date aa = new Date(a);
        Date bb = new Date(b);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time1 = sdf.format(aa);
        String time2 = sdf.format(bb);
        System.out.println(time1);
        System.out.println(time2);
        String sql = "select * from ACD_DATABASE.ACD_FILE_BASE "+
                "where " +
                "SGFSSJ between to_date('%s','yyyy-mm-dd hh24:mi:ss') and to_date('%s','yyyy-mm-dd hh24:mi:ss') and " +
                "rownum<100";
        System.out.println(String.format(sql, time1, time2));
        ResultSet resultSet = statement.executeQuery(String.format(sql, time1, time2));
        List<String> SGBH = new ArrayList<>();
        List<String> XZQH = new ArrayList<>();
        List<String> DJBH = new ArrayList<>();
        List<String> KSKCSJ = new ArrayList<>();
        List<String> JSKCSJ = new ArrayList<>();
        List<String> LH = new ArrayList<>();
        List<String> LM = new ArrayList<>();
        List<String> GLS = new ArrayList<>();
        List<String> MS = new ArrayList<>();
        List<String> JDWZ = new ArrayList<>();
        List<String> SGDD = new ArrayList<>();
        List<String> ZHDMWZ = new ArrayList<>();
        List<String> JTXHFS = new ArrayList<>();
        List<String> FHSSLX = new ArrayList<>();
        List<String> DLWLGL = new ArrayList<>();
        List<String> LMZK = new ArrayList<>();
        List<String> LBQK = new ArrayList<>();
        List<String> LMJG = new ArrayList<>();
        List<String> LKLDLX = new ArrayList<>();
        List<String> DLXX = new ArrayList<>();
        List<String> DLLX = new ArrayList<>();
        List<String> KCR1 = new ArrayList<>();
        List<String> KCR2 = new ArrayList<>();
        List<String> BAR1 = new ArrayList<>();
        List<String> BAR2 = new ArrayList<>();
        List<String> SWRS = new ArrayList<>();
        List<String> SZRS = new ArrayList<>();
        List<String> ZSRS = new ArrayList<>();
        List<String> QSRS = new ArrayList<>();
        List<String> SSRS = new ArrayList<>();
        List<String> JDCSL = new ArrayList<>();
        List<String> XRSL = new ArrayList<>();
        List<String> ZJCCSS = new ArrayList<>();
        List<String> SGLX = new ArrayList<>();
        List<String> CCYYFL = new ArrayList<>();
        List<String> RDYYFL = new ArrayList<>();
        List<String> JYAQ = new ArrayList<>();
        List<String> TQ = new ArrayList<>();
        List<String> NJD = new ArrayList<>();
        List<String> XC = new ArrayList<>();
        List<String> SGXT = new ArrayList<>();
        List<String> CLJSG = new ArrayList<>();
        List<String> DX = new ArrayList<>();
        List<String> ZMTJ = new ArrayList<>();
        List<String> YZWXP = new ArrayList<>();
        List<String> CCLRSJ = new ArrayList<>();
        List<String> JLLX = new ArrayList<>();
        List<String> SCSJD = new ArrayList<>();
        List<String> JBR = new ArrayList<>();
//        List<String> GXGJ = new ArrayList<>();
        List<String> SSZD = new ArrayList<>();
        List<String> GLXZDJ = new ArrayList<>();
        List<String> SB = new ArrayList<>();
        List<String> GLBM = new ArrayList<>();
        List<String> BADW = new ArrayList<>();
//        List<String> JYM = new ArrayList<>();
        List<String> SFDXSG = new ArrayList<>();
        List<String> DLAQYHDJ = new ArrayList<>();
        List<String> DSRZS = new ArrayList<>();
        List<String> FSJG = new ArrayList<>();

        while (resultSet.next()) {
            SGBH.add(resultSet.getString("SGBH"));
            XZQH.add(resultSet.getString("XZQH"));
            DJBH.add(resultSet.getString("DJBH"));
            KSKCSJ.add(resultSet.getString("KSKCSJ"));
            JSKCSJ.add(resultSet.getString("JSKCSJ"));
            LH.add(resultSet.getString("LH"));
            LM.add(resultSet.getString("LM"));
            GLS.add(resultSet.getString("GLS"));
            MS.add(resultSet.getString("MS"));
            JDWZ.add(resultSet.getString("JDWZ"));
            ZHDMWZ.add(resultSet.getString("ZHDMWZ"));
            JTXHFS.add(resultSet.getString("JTXHFS"));
            FHSSLX.add(resultSet.getString("FHSSLX"));
            DLWLGL.add(resultSet.getString("DLWLGL"));
            LBQK.add(resultSet.getString("LBQK"));
            LMJG.add(resultSet.getString("LMJG"));
            LMZK.add(resultSet.getString("LMZK"));
            LKLDLX.add(resultSet.getString("LKLDLX"));
            DLXX.add(resultSet.getString("DLXX"));
            DLLX.add(resultSet.getString("DLLX"));
            KCR1.add(resultSet.getString("KCR1"));
            KCR2.add(resultSet.getString("KCR2"));
            BAR1.add(resultSet.getString("BAR1"));
            BAR2.add(resultSet.getString("BAR2"));
            SWRS.add(resultSet.getString("SWRS"));
            SZRS.add(resultSet.getString("SZRS"));
            QSRS.add(resultSet.getString("QSRS"));
            SSRS.add(resultSet.getString("SSRS"));
            ZSRS.add(resultSet.getString("ZSRS"));
            JDCSL.add(resultSet.getString("JDCSL"));
            XRSL.add(resultSet.getString("XRSL"));
            SGLX.add(resultSet.getString("SGLX"));
            ZJCCSS.add(resultSet.getString("ZJCCSS"));
            RDYYFL.add(resultSet.getString("RDYYFL"));
            JYAQ.add(resultSet.getString("JYAQ"));
            CCYYFL.add(resultSet.getString("CCYYFL"));
            TQ.add(resultSet.getString("TQ"));
            NJD.add(resultSet.getString("NJD"));
            XC.add(resultSet.getString("XC"));
            SGXT.add(resultSet.getString("SGXT"));
            CLJSG.add(resultSet.getString("CLJSG"));
            DX.add(resultSet.getString("DX"));
            ZMTJ.add(resultSet.getString("ZMTJ"));
            YZWXP.add(resultSet.getString("YZWXP"));
            CCLRSJ.add(resultSet.getString("CCLRSJ"));
            JLLX.add(resultSet.getString("JLLX"));
            SCSJD.add(resultSet.getString("SCSJD"));
            JBR.add(resultSet.getString("JBR"));
//            GXGJ.add(resultSet.getString("GXGJ"));
            SSZD.add(resultSet.getString("SSZD"));
            SB.add(resultSet.getString("SB"));
            GLBM.add(resultSet.getString("GLBM"));
            BADW.add(resultSet.getString("BADW"));
//            JYM.add(resultSet.getString("JYM"));
            SFDXSG.add(resultSet.getString("SFDXSG"));
            DLAQYHDJ.add(resultSet.getString("DLAQYHDJ"));
            DSRZS.add(resultSet.getString("DSRZS"));
            FSJG.add(resultSet.getString("FSJG"));
            SGDD.add(resultSet.getString("SGDD"));
            GLXZDJ.add(resultSet.getString("GLXZDJ"));
        }
        SGBH = SGBH.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        XZQH = XZQH.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        DJBH = DJBH.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        DLLX = DLLX.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        KSKCSJ = KSKCSJ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        LM = LM.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        LH = LH.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        LM = LM.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        MS = MS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        JDWZ = JDWZ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SGDD = SGDD.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        ZHDMWZ = ZHDMWZ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        JTXHFS = JTXHFS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        FHSSLX = FHSSLX.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        DLWLGL = DLWLGL.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        LMZK = LMZK.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        LBQK = LBQK.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        LMJG = LMJG.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        LKLDLX = LKLDLX.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        DLXX = DLXX.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        KCR1 = KCR1.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        KCR2 = KCR2.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        BAR1 = BAR1.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        BAR2 = BAR2.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SWRS = SWRS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SZRS = SZRS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        ZSRS = ZSRS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        QSRS = QSRS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SSRS = SSRS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        JDCSL = JDCSL.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        XRSL = XRSL.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        ZJCCSS = ZJCCSS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SGLX = SGLX.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        CCYYFL = CCYYFL.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        RDYYFL = RDYYFL.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        JYAQ = JYAQ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        TQ = TQ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        NJD = NJD.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        XC = XC.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SGXT = SGXT.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        CLJSG = CLJSG.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        DX = DX.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        ZMTJ = ZMTJ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        YZWXP = YZWXP.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        CCLRSJ = CCLRSJ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        JLLX = JLLX.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SCSJD = SCSJD.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        JBR = JBR.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
//        GXGJ = GXGJ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SSZD = SSZD.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        GLXZDJ = GLXZDJ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SB = SB.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        GLBM = GLBM.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        BADW = BADW.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
//        JYM = JYM.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        SFDXSG = SFDXSG.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        DLAQYHDJ = DLAQYHDJ.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        DSRZS = DSRZS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());
        FSJG = DSRZS.stream().map(o -> o == null || o.equals("null") ? "无" : o).collect(Collectors.toList());


        connection.close();
        Map<String, JSONArray> out = new HashMap<>();
        out.put("SGBH", JSONArray.fromObject(SGBH));
        out.put("XZQH", JSONArray.fromObject(XZQH));
        out.put("DJBH", JSONArray.fromObject(DJBH));
        out.put("KSKCSJ", JSONArray.fromObject(KSKCSJ));
        out.put("JSKCSJ", JSONArray.fromObject(JSKCSJ));
        out.put("LH", JSONArray.fromObject(LH));
        out.put("LM", JSONArray.fromObject(LM));
        out.put("GLS", JSONArray.fromObject(GLS));
        out.put("MS", JSONArray.fromObject(MS));
        out.put("JDWZ", JSONArray.fromObject(JDWZ));
        out.put("SGDD", JSONArray.fromObject(SGDD));
        out.put("ZHDMWZ", JSONArray.fromObject(ZHDMWZ));
        out.put("JTXHFS", JSONArray.fromObject(JTXHFS));
        out.put("FHSSLX", JSONArray.fromObject(FHSSLX));
        out.put("DLWLGL", JSONArray.fromObject(DLWLGL));
        out.put("LMZK", JSONArray.fromObject(LMZK));
        out.put("LBQK", JSONArray.fromObject(LBQK));
        out.put("LMJG", JSONArray.fromObject(LMJG));
        out.put("LKLDLX", JSONArray.fromObject(LKLDLX));
        out.put("DLXX", JSONArray.fromObject(DLXX));
        out.put("DLLX", JSONArray.fromObject(DLLX));
        out.put("KCR1", JSONArray.fromObject(KCR1));
        out.put("KCR2", JSONArray.fromObject(KCR2));
        out.put("BAR1", JSONArray.fromObject(BAR1));
        out.put("BAR2", JSONArray.fromObject(BAR2));
        out.put("SWRS", JSONArray.fromObject(SWRS));
        out.put("SZRS", JSONArray.fromObject(SZRS));
        out.put("ZSRS", JSONArray.fromObject(ZSRS));
        out.put("QSRS", JSONArray.fromObject(QSRS));
        out.put("SSRS", JSONArray.fromObject(SSRS));
        out.put("JDCSL", JSONArray.fromObject(JDCSL));
        out.put("XRSL", JSONArray.fromObject(XRSL));
        out.put("ZJCCSS", JSONArray.fromObject(ZJCCSS));
        out.put("SGLX", JSONArray.fromObject(SGLX));
        out.put("CCYYFL", JSONArray.fromObject(CCYYFL));
        out.put("RDYYFL", JSONArray.fromObject(RDYYFL));
        out.put("JYAQ", JSONArray.fromObject(JYAQ));
        out.put("TQ", JSONArray.fromObject(TQ));
        out.put("NJD", JSONArray.fromObject(NJD));
        out.put("XC", JSONArray.fromObject(XC));
        out.put("SGXT", JSONArray.fromObject(SGXT));
        out.put("CLJSG", JSONArray.fromObject(CLJSG));
        out.put("DX", JSONArray.fromObject(DX));
        out.put("ZMTJ", JSONArray.fromObject(ZMTJ));
        out.put("YZWXP", JSONArray.fromObject(YZWXP));
        out.put("CCLRSJ", JSONArray.fromObject(CCLRSJ));
        out.put("JLLX", JSONArray.fromObject(JLLX));
        out.put("SCSJD", JSONArray.fromObject(SCSJD));
        out.put("JBR", JSONArray.fromObject(JBR));
//        out.put("GXGJ", JSONArray.fromObject(GXGJ));
        out.put("SSZD", JSONArray.fromObject(SSZD));
        out.put("GLXZDJ", JSONArray.fromObject(GLXZDJ));
        out.put("SB", JSONArray.fromObject(SB));
        out.put("GLBM", JSONArray.fromObject(GLBM));
        out.put("BADW", JSONArray.fromObject(BADW));
//        out.put("JYM", JSONArray.fromObject(JYM));
        out.put("SFDXSG", JSONArray.fromObject(SFDXSG));
        out.put("DLAQYHDJ", JSONArray.fromObject(DLAQYHDJ));
        out.put("DSRZS", JSONArray.fromObject(DSRZS));
        out.put("FSJG", JSONArray.fromObject(FSJG));
        System.out.println(out);


        return out;
    }
}
