<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\11 0011
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>boot.contro.hello</title>
</head>
<body>
    <h4>boot.contro.hello</h4>
    page boot.contro.hello
    <br><br>
    <%=request.getAttribute("name")%>
    <br><br>
    <%=request.getAttribute("passward")%>
</body>
</html>
