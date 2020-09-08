package com.powernode.jdbc;


import java.sql.*;

public class JDBCRe {
    public static void main(String[] args){
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/bjpowernode";
        String user = "root";
        String pwd = "root";
        //2.获取连接
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url,user,pwd);
            ps = conn.prepareStatement("select * from emp where ename=?");
            ps.setString(1,"smith");
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("empno")+","+rs.getString("ename"));
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
            if (ps != null) {
                try {
                    ps.close();
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
