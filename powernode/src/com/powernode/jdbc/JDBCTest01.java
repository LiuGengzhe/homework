package com.powernode.jdbc;
import com.mysql.jdbc.Driver;
import java.sql.*;
public class JDBCTest01 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/bjpowernode";
        String use = "root";
        String pw = "root";
        conn = DriverManager.getConnection(url,use,pw);
        stat = conn.createStatement();
        rs = stat.executeQuery("select * from emp");
        System.out.println(conn);
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        rs.close();
        stat.close();
        conn.close();

    }
}
