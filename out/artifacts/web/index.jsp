<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/8/30
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <!--/在客户端浏览器中解析成http://ip:port/    -->
    <a href="tranServlet1">请求转发</a><br/>
    <form action="http://localhost:8080/web/parameterServlet">
      <label for="usrname">用户名:</label> <input type="text" id="usrname" name="username"><br/>
      <label for="pwd">密码:</label> <input type="password" id="pwd" name="password"><br/>
      <label>爱好:</label><input type="checkbox" name="hobby" value="java">java
      <input type="checkbox" name="hobby" value="python">python
      <input type="checkbox" name="hobby" value="cpp">c++ <br/>
      <input type="submit">
    </form>
    <%pageContext.setAttribute("key2222",123);%>
    ${pageScope.key2222}
    ${pageScope.get("key2222")}
    <%=request.getScheme()%>
    ${pageContext.request.scheme}
  </body>

</html>
