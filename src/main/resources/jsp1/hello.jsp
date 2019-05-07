<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\10 0010
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="bao1.person" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>boot.contro.hello</title>
</head>
<body>
      boot.contro.hello
      <br>
      <%person p=new person();
        String n=p.test();%>
      <%=n%>
      <br>
      <a href="/helloservlet">helloservlet</a>
      <br>
      :::::<%=request.getContextPath()%>
</body>
</html>
