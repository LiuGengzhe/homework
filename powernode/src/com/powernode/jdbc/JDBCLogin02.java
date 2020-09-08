package com.powernode.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JDBCLogin02 {
    public static void main(String[] args) {
        Map<String,String> insertAccount;
        insertAccount = loginUI();
//        Set<Map.Entry<String,String>> set = insertAccount.entrySet();
//        for (Map.Entry<String,String> data:set){
//            System.out.println(data.getKey()+"\\"+data.getValue());
//        }

        boolean flag = makeSure(insertAccount);
        if (flag){
            System.out.println("登陆成功");
        }
        else {
            System.out.println("登录失败");
        }
    }

    private static boolean makeSure(Map<String,String> insertAccount) {
        boolean flag = false;
        String inUsr = insertAccount.get("账号");
        String inPwd = insertAccount.get("密码");
//        System.out.println(inUsr+":"+inPwd);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode";
        String usr = "root";
        String pwd = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,usr,pwd);
            String sql = "select usrId,usrPwd from user_login where usrId = ? and usrPwd = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,inUsr);
            ps.setString(2,inPwd);
            rs = ps.executeQuery();
            if(rs.next()){
                flag = true;
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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

        return flag;
    }

    private static Map<String, String> loginUI() {
        Map<String,String> insertAccount = new HashMap<>();
        Scanner s = new Scanner(System.in);
        System.out.print("请输入账号：");
        String usrId = s.nextLine();
        System.out.print("请输入密码：");
        String usrPwd = s.nextLine();
        s.close();
        insertAccount.put("账号",usrId);
        insertAccount.put("密码",usrPwd);
        return insertAccount;
    }
}
