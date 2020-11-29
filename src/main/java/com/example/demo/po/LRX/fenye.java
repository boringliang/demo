package com.example.demo.po.LRX;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class fenye {
    private String url = "jdbc:oracle:thin:@192.168.100.73:1521:ORCL"; //链接字符串
    public List<Object> selectByPage(int pagenumber, int pagerange, String tablename, List<String> collist){
        String driver = "oracle.jdbc.driver.OracleDriver";    //驱动标识符
        //String url = "jdbc:oracle:thin:@192.168.100.19:1521:ORCL"; //链接字符串
        // url ="jdbc:oracle:thin:@10.0.30.64:1521:orcl";  // 连接远程的数据库可以这么写
        String user = "sys as sysdba";         //数据库的用户名
        String password = "123";     //数据库的密码
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean flag = false;
        int page = pagenumber;
        int range = pagerange;
        List<Object> irilist = new ArrayList<>();
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user, password);
            String str = "";
            for (int i=0;i<collist.size();i++){
                str += collist.get(i) + ",";
            }
            str = str.substring(0, str.length()-1);
            String sql = "select " + str + " from " +
                    "(select rownum as rowno, t.* from " + tablename + " t where rownum <=" + ((page-1)*range + range) + ")" +
                    "where rowno >=" + (1+(page-1)*range);
            System.out.println(sql);
            pstm =con.prepareStatement(sql);
            rs = pstm.executeQuery();
            List list = new ArrayList();
            for (int i=0;i<rs.getMetaData().getColumnCount();i++){
                list.add(rs.getMetaData().getColumnName(i+1));
            }
            irilist.add(list);

            while(rs.next()) {
                List list1 = new ArrayList();
                for(int i=0;i<rs.getMetaData().getColumnCount();i++){
                    list1.add(rs.getString(i+1));
                    //System.out.println(rs.getString(i+1));
                }
                irilist.add(list1);
//                String id = rs.getString("ID");
//                String road_id =rs.getString("ROAD_ID");
//                BigDecimal indey = rs.getBigDecimal("INDEY");
//                BigDecimal indey_float =rs.getBigDecimal("INDEY_FLOAT");
//                BigDecimal speed = rs.getBigDecimal("SPEED");
//                Date insert_time = rs.getDate("INSERT_TIME");
//                System.out.println(id +"\t"+
//                        road_id +"\t"+
//                        indey +"\t"+
//                        indey_float +"\t"+
//                        speed +"\t"+
//                        insert_time +"\t");
//                IndexRoadIndex iri = new IndexRoadIndex();
//                iri.setId(id);
//                iri.setIndey(indey);
//                iri.setIndeyFloat(indey_float);
//                iri.setInsertTime(insert_time);
//                iri.setRoadId(road_id);
//                iri.setSpeed(speed);
//                irilist.add(iri);
            }
            flag = true;
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭执行通道
            if(pstm !=null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭连接通道
            try {
                if(con != null &&(!con.isClosed())) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(flag) {
            System.out.println("执行成功！");
        } else {
            System.out.println("执行失败！");
        }

        return irilist;
    }

    public List<Object> selectByPage(int pagenumber, int pagerange, String tablename)
    {
        String driver = "oracle.jdbc.driver.OracleDriver";    //驱动标识符
        //String url = "jdbc:oracle:thin:@192.168.100.19:1521:ORCL"; //链接字符串
        // url ="jdbc:oracle:thin:@10.0.30.64:1521:orcl";  // 连接远程的数据库可以这么写
        String user = "sys as sysdba";         //数据库的用户名
        String password = "123";     //数据库的密码
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean flag = false;
        int page = pagenumber;
        int range = pagerange;
        List<Object> irilist = new ArrayList<>();
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user, password);
            String sql = "select * from " +
                    "(select rownum as rowno, t.* from " + tablename + " t where rownum <=" + ((page-1)*range + range) + ")" +
                    "where rowno >=" + (1+(page-1)*range);
            System.out.println(sql);
            pstm =con.prepareStatement(sql);
            rs = pstm.executeQuery();
            List list = new ArrayList();
            for (int i=0;i<rs.getMetaData().getColumnCount();i++){
                list.add(rs.getMetaData().getColumnName(i+1));
            }
            irilist.add(list);

            while(rs.next()) {
                List list1 = new ArrayList();
                for(int i=0;i<rs.getMetaData().getColumnCount();i++){
                    list1.add(rs.getString(i+1));
                }
                irilist.add(list1);
            }
            flag = true;
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭执行通道
            if(pstm !=null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭连接通道
            try {
                if(con != null &&(!con.isClosed())) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(flag) {
            System.out.println("执行成功！");
        } else {
            System.out.println("执行失败！");
        }

        return irilist;
    }

    public List<List> countByCol(String colname,String tablename){
        List<List> resultlist = new ArrayList<>();
        String driver = "oracle.jdbc.driver.OracleDriver";    //驱动标识符
        //String url = "jdbc:oracle:thin:@192.168.100.19:1521:ORCL"; //链接字符串
        // url ="jdbc:oracle:thin:@10.0.30.64:1521:orcl";  // 连接远程的数据库可以这么写
        String user = "sys as sysdba";         //数据库的用户名
        String password = "123";     //数据库的密码
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean flag = false;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user, password);
            //select CBR1,count(*) from lrx.ACD_DUTY group by CBR1;
            String sql = "select " + colname + ",count(*) from LRX." + tablename +
                    " group by " + colname;
            System.out.println(sql);
            pstm =con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()) {
                List list1 = new ArrayList();
                for(int i=0;i<rs.getMetaData().getColumnCount();i++){
                    list1.add(rs.getString(i+1));
                }
                resultlist.add(list1);
            }
            flag = true;
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭执行通道
            if(pstm !=null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭连接通道
            try {
                if(con != null &&(!con.isClosed())) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(flag) {
            System.out.println("执行成功！");
        } else {
            System.out.println("执行失败！");
        }
        return resultlist;
    }
    public int count(String tablename)
    {
        String driver = "oracle.jdbc.driver.OracleDriver";    //驱动标识符
        //String url = "jdbc:oracle:thin:@192.168.100.19:1521:ORCL"; //链接字符串
        // url ="jdbc:oracle:thin:@10.0.30.64:1521:orcl";  // 连接远程的数据库可以这么写
        String user = "sys as sysdba";         //数据库的用户名
        String password = "123";     //数据库的密码
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean flag = false;
        List<Object> irilist = new ArrayList<>();
        int datacount = 0;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user, password);
            String sql = "select count(*) from " + tablename;
            System.out.println(sql);
            pstm =con.prepareStatement(sql);
            rs = pstm.executeQuery();
            rs.next();
            datacount = rs.getInt(1);
            flag = true;
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭执行通道
            if(pstm !=null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭连接通道
            try {
                if(con != null &&(!con.isClosed())) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(flag) {
            System.out.println("执行成功！");
        } else {
            System.out.println("执行失败！");
        }

        return datacount;
    }

    public List parallel()
    {
        String driver = "oracle.jdbc.driver.OracleDriver";    //驱动标识符
        //String url = "jdbc:oracle:thin:@192.168.100.19:1521:ORCL"; //链接字符串
        // url ="jdbc:oracle:thin:@10.0.30.64:1521:orcl";  // 连接远程的数据库可以这么写
        String user = "sys as sysdba";         //数据库的用户名
        String password = "123";     //数据库的密码
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean flag = false;
        List resultlist = new ArrayList();
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user, password);

            String sql = "select distinct SGLX from LRX.ACD_FILE";

            pstm =con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                String SGLX = rs.getString(1);
                sql = "select ZHDMWZ,FHSSLX,LMZK,LBQK,LMJG,DLXX,DLLX,SWRS30,SSRS30,SGRDYY," +
                        "TQ,NJD,SGXT,DX,ZMTJ,DLAQYHDJ from LRX.ACD_FILE " +
                        "where SGLX=" + SGLX;
                sql = "select SSRS30,SGRDYY," +
                        "TQ,NJD,SGXT,DX,ZMTJ from LRX.ACD_FILE " +
                        "where SGLX=" + SGLX;
                System.out.println(sql);
                pstm =con.prepareStatement(sql);
                ResultSet rs2 = pstm.executeQuery();
                List linshi3 = new ArrayList();
                while (rs2.next()){
                    List linshi = new ArrayList();
                    for (int j=0;j<7;j++){
                        linshi.add(rs2.getString(j+1));
                    }
                    linshi3.add(linshi);
                }
                List linshi2 = new ArrayList();
                linshi2.add(SGLX);
                linshi2.add(linshi3);
                resultlist.add(linshi2);
            }
            flag = true;
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭执行通道
            if(pstm !=null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭连接通道
            try {
                if(con != null &&(!con.isClosed())) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(flag) {
            System.out.println("执行成功！");
        } else {
            System.out.println("执行失败！");
        }

        return resultlist;
    }

    public List selectBySql(String sql)
    {
        String driver = "oracle.jdbc.driver.OracleDriver";    //驱动标识符
        //String url = "jdbc:oracle:thin:@192.168.100.19:1521:ORCL"; //链接字符串
        // url ="jdbc:oracle:thin:@10.0.30.64:1521:orcl";  // 连接远程的数据库可以这么写
        String user = "sys as sysdba";         //数据库的用户名
        String password = "123";     //数据库的密码
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean flag = false;
        List resultlist = new ArrayList();
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user, password);
            System.out.println(sql);
            pstm =con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                List linshi = new ArrayList();
                for (int i=0;i<rs.getMetaData().getColumnCount();i++){
                    linshi.add(rs.getString(i+1));
                }
                resultlist.add(linshi);
            }
            flag = true;
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭执行通道
            if(pstm !=null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 关闭连接通道
            try {
                if(con != null &&(!con.isClosed())) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(flag) {
            System.out.println("执行成功！");
        } else {
            System.out.println("执行失败！");
        }

        return resultlist;
    }

}
