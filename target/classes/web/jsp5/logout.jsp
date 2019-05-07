<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\12 0012
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>logout</title>
</head>
<body>
        sessionid:<%=session.getId()%><br>
        isnew:<%=session.isNew()%><br>
        maxinactiveinterval:<%=session.getMaxInactiveInterval()%><br>
        createtime:<%=session.getCreationTime()%><br>
        lastaccesstime:<%=session.getLastAccessedTime()%><br><br>

        <a href="login.jsp">登录</a>
        <%
            session.invalidate();
        %>
</body>
</html>
