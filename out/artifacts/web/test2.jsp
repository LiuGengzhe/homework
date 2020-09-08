<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/9/4
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test2</title>
</head>
<body>
pageContext是:<%=pageContext.getAttribute("pageContext")%><br/>
requset是:<%=request.getAttribute("request")%><br/>
session是:<%=session.getAttribute("session")%><br/>
application是:<%=application.getAttribute("application")%><br/>
</body>
</html>
