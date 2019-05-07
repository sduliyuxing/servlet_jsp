<%@ page import="java.awt.*" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\11 0011
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>attr1</title>
</head>
<body>
<%--        pageContext: 属性的作用范围仅限于当前 JSP 页面--%>
<%--        request:  属性的作用范围仅限于同一个请求.--%>
<%--        session: 属性的作用范围限于一次会话: 浏览器打开直到关闭称之为一次会话(在此期间会话不失效)--%>
<%--        application: 属性的作用范围限于当前 WEB 应用. 是范围最大的属性作用范围, 只要在一处设置属性, 在其他各处的 JSP 或 Servlet 中--%>
<%
        pageContext.setAttribute("pagecontext","pagecontext...");
        request.setAttribute("request","request...");
        session.setAttribute("session","session...");
        application.setAttribute("application","application...");
%>
        <h4>attr1</h4><br><br>
        pagecontext:<%=pageContext.getAttribute("pagecontext")%><br>
        request:<%=request.getAttribute("request")%><br>
        session:<%=session.getAttribute( "session")%><br>
        application:<%=application.getAttribute("application")%><br>

        <a href="attr2.jsp">to attr2</a><br>
        <a href="/testattr">to testattr</a>

        <%--<%--%>
            <%--request.getRequestDispatcher("attr2.jsp").forward(request,response);--%>
        <%--%>--%>

</body>
</html>
