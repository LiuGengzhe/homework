package com.gui.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet2 extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        //如果重写init()方法一定要加super.init()调用父类的方法，不然会出问题(无法获取到SerletConfig)
        super.init(config);
        ServletConfig servletConfig = this.getServletConfig();
        System.out.println("初始化做了一些改变");
        System.out.println(servletConfig.getInitParameter("username"));
        System.out.println("===========================");
        System.out.println("工程路径"+servletConfig.getServletContext().getContextPath());

        //??????斜杠的意思     斜杠在服务器中解析成http://ip:port/工程路径
        System.out.println("绝对路径"+servletConfig.getServletContext().getRealPath("/helloServlet2"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HttpServlet2的doGet方法执行");
        ServletConfig servletConfig = this.getServletConfig();
        String username = servletConfig.getInitParameter("username");
        System.out.println(username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HttpServlet2的doPost方法执行");
    }
}
