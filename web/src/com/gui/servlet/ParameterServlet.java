package com.gui.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class ParameterServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        System.out.println("被访问");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setCharacterEncoding("utf-8");//设置编码，防止中文乱码
        System.out.println("---------doPost--------");
        String username = request.getParameter("username");
        String password = request.getParameter("password"); //获取单个请求参数
        String[] hobbies = request.getParameterValues("hobby");//获取多个请求参数
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        System.out.println("爱好："+ Arrays.toString(hobbies));
        System.out.println("或者");
        System.out.println("爱好："+ Arrays.asList(hobbies));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("----------doGet---------");
        String username = request.getParameter("username");
        String password = request.getParameter("password"); //获取单个请求参数
        String[] hobbies = request.getParameterValues("hobby");//获取多个请求参数
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        System.out.println("爱好："+ Arrays.toString(hobbies));
        System.out.println("或者");
        System.out.println("爱好："+ Arrays.asList(hobbies));
    }
}
