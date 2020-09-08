package com.powernode.jdbc;

import java.io.IOException;
import java.sql.*;

public class JDBCTest03 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/bjpowernode";
        String usr = "root";
        String pw = "root";
        try {

            conn = DriverManager.getConnection(url,usr,pw);
            stat = conn.createStatement();
            rs = stat.executeQuery("select ename,sal from emp where sal>(select sal from emp where ename='SMITH')");
            while(rs.next()){
                String ename = rs.getString("ename");
                double sal = rs.getDouble("sal");
                System.out.println(ename+" "+sal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stat != null) {
                try{
                    stat.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try{
                    conn.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
