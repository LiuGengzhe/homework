package com.gui.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TranServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("中转站执行");
        request.setAttribute("seal","中转站");

        //注意path的写法   ./ 和/都可以具体,但是什么意义不太清楚。
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("./tranServlet2");//请求转发
//        System.out.println(requestDispatcher.toString());
        System.out.println("===============================");
        requestDispatcher.forward(request,response);
    }
}
