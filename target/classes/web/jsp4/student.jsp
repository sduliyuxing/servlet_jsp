<%@ page import="bao4.student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\11 0011
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询</title>
</head>
<body>
      <%
          List<student> list= (List<student>) request.getAttribute("students");
      %>

      <table border="1" cellpadding="15" cellspacing="0">
          <tr>
              <th>id</th>
              <th>name</th>
              <th>passward</th>
              <th>delete</th>
          </tr>
          <%
              for(student s:list){
          %>
          <tr>
              <td><%=s.getId()%></td>
              <td><%=s.getName()%></td>
              <td><%=s.getPassward()%></td>
              <td><a href="/deletebyid?id=<%=s.getId()%>">delete</a> </td>
          </tr>
          <%
              }
          %>
      </table>

</body>
</html>
