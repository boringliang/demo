package com.example.demo.po.LRX;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class getcolumns {
    private String url = "jdbc:oracle:thin:@192.168.100.59:1521:ORCL"; //链接字符串
    public Map<String, List> getcolumns(String tablename)
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
        Map<String, List> map = new HashMap<>();
        List<String> columnName = new ArrayList<>();
        List<String> columnType = new ArrayList<>();
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user, password);
            String sql = "desc " + tablename;

            //2. 下面就是获取表的信息。
            DatabaseMetaData m_DBMetaData = con.getMetaData();
            ResultSet colRet = m_DBMetaData.getColumns(null, "%", tablename, "%");
            while (colRet.next()) {
                columnName.add(colRet.getString("COLUMN_NAME"));
                columnType.add(colRet.getString("TYPE_NAME"));
                int datasize = colRet.getInt("COLUMN_SIZE");
                int digits = colRet.getInt("DECIMAL_DIGITS");
                int nullable = colRet.getInt("NULLABLE");
                //System.out.println(columnName + " " + columnType + " " + datasize + " " + digits + " " + nullable);
            }
//            System.out.println(sql);
//            pstm =con.prepareStatement(sql);
//            rs = pstm.executeQuery();

//            System.out.println(rs);

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
        map.put("columnName",columnName);
        map.put("columnType",columnType);
        return map;

    }
}
