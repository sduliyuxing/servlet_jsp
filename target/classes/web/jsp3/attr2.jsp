<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\11 0011
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>attr2</title>
</head>
<body>
        <h4>attr2</h4><br><br>
        pagecontext:<%=pageContext.getAttribute("pagecontext")%><br>
        request:<%=request.getAttribute("request")%><br>
        session:<%=session.getAttribute("sesssion")%><br>
        application:<%=application.getAttribute("application")%><br>
</body>
</html>
