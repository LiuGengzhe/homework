<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/9/4
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test1</title>
</head>
<body>
<%
    
    //四大域对象
    pageContext.setAttribute("pageContext","pageContext");
    request.setAttribute("request","request");
    session.setAttribute("session","session");
    application.setAttribute("application","application");
%>

pageContext是:<%=pageContext.getAttribute("pageContext")%><br/>
requset是:<%=request.getAttribute("request")%><br/>
session是:<%=session.getAttribute("session")%><br/>
application是:<%=application.getAttribute("application")%><br/>
<%
   request.getRequestDispatcher("/test2.jsp").forward(request,response);
%>
</body>
</html>
