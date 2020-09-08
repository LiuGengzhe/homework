package com.gui.Jdbc;

import com.gui.bean.Customer;
import com.gui.bean.User;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class TestJDBC {
    @Test
    public void connDemo(){
        Connection conn = JdbcUtils.getConn();
        System.out.println(conn);
        JdbcUtils.closeConn(conn);
    }


    @Test
    public void searchDemo() throws Exception{
        Connection conn = JdbcUtils.getConn();
        String sql = "select id,phone from t_user where id>?";
        List<User> list = JdbcUtils.searchSql(User.class,conn,sql,"1");
        JdbcUtils.closeConn(conn);
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void searchDemo2() throws Exception{
        Connection conn = JdbcUtils.getConn();
        String sql = "select id,t_name name,viplevel VIPLevel from t_customer where id>0";
        List<Customer> list = JdbcUtils.searchSql(Customer.class, conn, sql);
        JdbcUtils.closeConn(conn);
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    @Test
    public void demo() throws Exception{
        Class clazz = Class.forName("com.gui.bean.B");
        String typeName;
//        System.out.println(typeName);
    }

    @Test
    public void demoValue(){
        Connection conn = JdbcUtils.getConn();
        String sql = "select max(viplevel) from t_customer";
        Object value = JdbcUtils.getValue(conn, sql);
        Class c = value.getClass();
        System.out.println(c);
        System.out.println(value);
    }
}
