<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\15 0015
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="bao6.person" contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>confirm</title>
</head>
<body>
      <h4>确认信息</h4>
      <%
          person p= (person) session.getAttribute("person");
          String books[]= (String[]) session.getAttribute("books");
      %>
      <form action="/confirmservlet" method="post">
          <table border="1" cellpadding="10" cellspacing="0">
              <tr>
                  <td>姓名：</td>
                  <%--<td><%=p.getName()%></td>--%>
                  <td>${sessionScope.person.name}</td>
              </tr>
              <tr>
                  <td>地址：</td>
                  <%--<td><%=p.getAddress()%></td>--%>
                  <td>${sessionScope.person.address}</td>
              </tr>
              <tr>
                  <td>卡号：</td>
                  <%--<td><%=p.getCard()%></td>--%>
                  <td>${sessionScope.person.card}</td>
              </tr>
              <tr>
                  <td>电话：</td>
                  <%--<td><%=p.getPhone()%></td>--%>
                  <td>${sessionScope.person.phone}</td>
              </tr>
              <tr>
                  <td>图书：</td>
                  <td>
                      <%
                          for (String book:books){
                      %>
                      <%=book%><%="  "%>
                      <%
                          }
                      %>
                  <c:forEach items="${sessionScope.books}" var="book">
                      ${book}
                  </c:forEach>
                  </td>
              </tr>
              <tr>
                  <td colspan="2"><input type="submit" value="提交"></td>
              </tr>
          </table>
      </form>
</body>
</html>
