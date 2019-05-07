<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\15 0015
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
      <h4>图书购买成功</h4>
      <%
          session.invalidate();
      %>
      <a href="index.jsp">退出系统</a>
</body>
</html>
