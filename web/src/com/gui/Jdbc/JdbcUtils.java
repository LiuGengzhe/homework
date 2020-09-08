package com.gui.Jdbc;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtils {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConn(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public static <T> List<T> searchSql(Class<T> clazz, Connection conn, String sql, Object ...args ) {
        //回传的List集合
        List<T> list = new ArrayList<T>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = conn.prepareStatement(sql);

            //填充sql语句
            for(int i = 0;i<args.length;i++){
                preparedStatement.setObject(i+1,args[i]);
            }

            //执行sql获取结果集对象
            resultSet = preparedStatement.executeQuery();
            //获取结果集元数据对象
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取查询出来的列数
            int colCount = metaData.getColumnCount();
            while (resultSet.next()){
                //新建bean对象
                T o = clazz.newInstance();
                for (int j = 1;j<=colCount;j++){
                    //获取列名
                    String columnLabel = metaData.getColumnLabel(j);
                    //获取列名该列所对应的数据
                    Object object = resultSet.getObject(columnLabel);
                    //通过反射来给bean对象属性赋值
                    Field field = clazz.getDeclaredField(columnLabel);
                    //防止对象属性为私有无法赋值
                    field.setAccessible(true);
                    field.set(o,object);
                }
                list.add(o);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭结果集合对象prepareStatement对象
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


    public static <T> T getValue(Connection conn,String sql,Object ...args) {
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1,args[i]);
            }

            resultSet = ps.executeQuery();
            if(resultSet.next()){
                Object object = resultSet.getObject(1);
                return (T) object;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
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
        }
        return null;
    }

}
