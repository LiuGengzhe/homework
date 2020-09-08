package com.gui.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("1.构造方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3.HelloServlet 被访问");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        System.out.println("-----"+method+"-----");
        System.out.println("==================");
        if("GET".equals(method)){
            this.doGet();

        }
        else {
            this.doPost();
        }
    }

    public void doGet(){
        System.out.println("GET方式");
        System.out.println("GET方式");
        System.out.println("GET方式");
        System.out.println("GET方式");

    }
    public void doPost(){
        System.out.println("POST方式");
        System.out.println("POST方式");
        System.out.println("POST方式");
        System.out.println("POST方式");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.destroy销毁方法");
    }
}
