<%@ page import="com.gui.bean.Customer" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/9/7
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% Customer c = new Customer();
    c.setName("ssad");
    c.setId(1);
    c.setB(true);
    pageContext.setAttribute("cus",c);
    pageContext.setAttribute("ceshi","hihihihi");

%>
${cus.getId()}
${cus.id}

${cus.b}
${cus.name}
${ceshi}
</body>
</html>
