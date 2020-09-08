<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/9/5
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法</title>
    <style type="text/css">
    </style>
</head>
<body>

<h2 align="center">九九乘法表</h2>
<hr color="red"/>
<table align="center">



    <% for(int i = 1;i<10;i++){ %>
        <tr>
        <% for(int j = 1;j<=i;j++){ %>
            <td><%= j+"x"+i+"="+(i*j) %></td>
            <% } %>
        </tr>
   <% } %>


</table>

</body>
</html>
