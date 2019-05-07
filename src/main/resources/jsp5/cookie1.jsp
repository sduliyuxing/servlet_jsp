<%@ page import="java.io.PrintWriter" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\12 0012
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookie</title>
</head>
<body>
     <%
         PrintWriter printWriter=response.getWriter();
//         Cookie cookies[]=request.getCookies();
//         if (cookies!=null&&cookies.length>0) {
//             for (Cookie cookie : cookies) {
//                printWriter.print(cookie.getName()+"      "+cookie.getValue());
//                printWriter.print("<br>");
//                cookie.setMaxAge(10);
//             }
//         }else {
             printWriter.print("cookie正在创建中");
             printWriter.print("<br>");
               Cookie cookie=new Cookie("name","value");
             //setMaxAge: 设置 Cookie 的最大时效, 以秒为单位, 若为 0 , 表示立即删除该 Cookie
             //若为负数, 表示不存储该 Cookie, 若为正数, 表示该 Cookie 的存储时间.
               printWriter.print(i+": ");
              printWriter.print(cookie.getName()+"  "+cookie.getValue());
               printWriter.print("<br>");
//             调用 response 的一个方法把 Cookie 传给客户端.
             response.addCookie(cookie);

     %>
</body>
</html>
