<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\12 0012
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>aaa</title>
</head>
<body>
<h4>aaa page</h4>

        <%
            String x="plmokn";
            request.setAttribute("x",x);
        %>
        <%--<%@include file="b.jsp"%>--%>
        <%--<jsp:include page="b.jsp">--%>
        <%--<jsp:param name="users" value="098765"/>--%>
        <%--</jsp:include>--%>

      <jsp:forward page="b.jsp">
          <jsp:param name="users" value="456789"/>
      </jsp:forward>
</body>
</html>
