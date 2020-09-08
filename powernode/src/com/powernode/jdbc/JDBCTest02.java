package com.powernode.jdbc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.ResourceBundle;

public class JDBCTest02 {
    public static void main(String[] args) {
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Properties pr = new Properties();
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        System.out.println( rb.getString("driver"));
        String path = Thread.currentThread().getContextClassLoader().getResource("jdbc.properties").getPath();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            pr.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
//        String url = "jdbc:mysql://localhost:3306/bjpowernode";
//        String usr = "root";
//        String pw = "root";
        String driver = pr.getProperty("driver");
        String url = pr.getProperty("url");
        String usr = pr.getProperty("usr");
        String pw = pr.getProperty("pw");
        try {
            //1.注册数据库驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            //2.获取数据库连接
            conn = DriverManager.getConnection(url,usr,pw);
            //3.获取数据库操作对象
            stat = conn.createStatement();
//            rs = stat.executeQuery("select deptno,dname,loc from dept");
            System.out.println(stat.executeUpdate("update emp set ename='SMITH' where empno=7369 "));
            //4.执行sql语句
            rs = stat.executeQuery(pr.getProperty("sql"));
            //5.对查询结果集进行处理
            while (rs.next()){
                System.out.println(rs.getInt("deptno")+" "+rs.getString("dname")+" "+rs.getString("loc"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //6.关闭连接
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
