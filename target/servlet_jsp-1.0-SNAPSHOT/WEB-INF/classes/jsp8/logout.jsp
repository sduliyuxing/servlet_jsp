<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\16 0016
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>logout</title>
</head>
<body><center>
      退出
      <br><br>
      <%
          session.invalidate();
      %>
      <a href="login.jsp">登录</a></center>
</body>
</html>
