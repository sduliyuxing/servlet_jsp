<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\12 0012
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     sessionid:<%=session.getId()%><br>
     isnew:<%=session.isNew()%><br>
     maxinactiveinterval:<%=session.getMaxInactiveInterval()%><br>
     createtime:<%=session.getCreationTime()%><br>
     lastaccesstime:<%=session.getLastAccessedTime()%><br><br>

     boot.contro.hello:<%=request.getParameter("name")%><br>
     <%
         session.setAttribute("name",request.getParameter("name"));
     %>
     <br><br>
     <a href="<%=response.encodeURL("login.jsp")%>">登录</a><br><br>
     <a href="<%=response.encodeURL("logout.jsp")%>">注销</a>
</body>
</html>
