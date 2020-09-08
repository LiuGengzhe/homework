package com.powernode.jdbc;
import java.sql.*;
import java.util.*;

public class JDBCLogin {
    public static void main(String[] args) {
        System.out.print("请输入用户名和密码（员工编号）:");
        Scanner s = new Scanner(System.in);
        String inUsr = s.next();
        int inNo = s.nextInt();
        String url = "jdbc:mysql://localhost:3306/bjpowernode";
        String usr = "root";
        String pw ="root";
        Map<String,Integer> login = new HashMap<>();


        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;



//        System.out.println(inUsr+" "+inNo);
        try{
            //使用反射机制注册数据库驱动
            //1.注册数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            //使用DriverManager类的registerDriver静态方法来注册数据库驱动
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //2.获取数据库连接
            conn = DriverManager.getConnection(url,usr,pw);
            //3.获取数据库操作对象
            stat = conn.createStatement();
            //4.执行sql语句
            rs = stat.executeQuery("select empno,ename from emp");
            //5.处理查询结果集
            while(rs.next()){
                String ename = rs.getString("ename");
                Integer empno = rs.getInt("empno");
                login.put(ename,empno);



            }



        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //6.关闭资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        Set<Map.Entry<String,Integer>> lin = login.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = lin.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> me = iterator.next();
//            System.out.println(me.getKey()+" "+me.getValue());
            if(inUsr.equalsIgnoreCase(me.getKey())){
                if (inNo == me.getValue()){
                    System.out.println("登录成功！欢迎"+inUsr+"用户");
                    return;
                }
            }
        }
        System.out.println("用户名不存在或密码错误！");






    }
}
