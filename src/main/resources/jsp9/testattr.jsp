<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\18 0018
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("abc","boot.run");
        request.setAttribute("abc","456");
        request.removeAttribute("abc");
    %>
</body>
</html>
