<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\16 0016
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
 <center>
 <form action="/login_servlet?method=login" method="post">
        用户名：<input type="text" name="username"><br><br>
        <input type="submit" value="提交">
     <br><br>${sessionScope.message==null?"":sessionScope.message}
     <%session.setAttribute("message","");%>
    </form>
 </center>
</body>
</html>
