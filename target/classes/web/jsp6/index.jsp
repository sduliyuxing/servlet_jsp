<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\12 0012
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <h4>登录</h4>
     <form action="/checkservlet" method="post">
         姓名:<input type="text" name="name"><br><br>
         密码：<input type="password" name="passward"><br><br>
         验证码:<input type="text" name="checkname"><br><br>
         <img src="/validatecolorservlet" alt=""><br><br>
         <input type="submit" value="提交">
     </form>
     <font color="red">
         ${sessionScope.no==null?"":sessionScope.no}
         <%--<%=session.getAttribute("no")==null?"":session.getAttribute("no")%>--%>
         <%session.setAttribute("no","");%>
             ${sessionScope.message==null?"":sessionScope.message}
         <%--<%=session.getAttribute("message")==null? "":session.getAttribute("message")%>--%>
         <%session.setAttribute("message","");%>
         ${sessionScope.mo==null?"":sessionScope.mo}
         <%session.setAttribute("mo","");%>
     </font>
</body>
</html>
