<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\12 0012
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%--利用 Cookie 实现 "您浏览过的图书有: x, y, z", 只显示最近浏览的 3 本图书的信息--%>
        <%--且支持 Cookie 的持久化. 其余的 Cookie 被删除: 调用其 setMaxAge() 方法, 传入--%>
        <%--0 即可。--%>
        <h4>Books Page</h4>

        <a href="book.jsp?book=JavaWeb">Java Web</a><br><br>
        <a href="book.jsp?book=Java">Java</a><br><br>
        <a href="book.jsp?book=Oracle">Oracle</a><br><br>
        <a href="book.jsp?book=Ajax">Ajax</a><br><br>
        <a href="book.jsp?book=JavaScript">JavaScript</a><br><br>
        <a href="book.jsp?book=Android">Android</a><br><br>
        <a href="book.jsp?book=Jbpm">Jbpm</a><br><br>
        <a href="book.jsp?book=Struts">Struts</a><br><br>
        <a href="book.jsp?book=Hibernate">Hibernate</a><br><br>
        <a href="book.jsp?book=Spring">Spring</a><br><br>

        <br><br>

        <%
            PrintWriter printWriter=response.getWriter();
            StringBuilder books=new StringBuilder("");
            Cookie cookies[]=request.getCookies();
            if (cookies!=null&&cookies.length>0)
            {
                for (Cookie cookie:cookies)
                {
                    String name=cookie.getName();
                    String value=cookie.getValue();
                    if (name.startsWith("book_"))
                    {
                       books.append(value+"  ");
                    }
                }
            }
            if (!books.toString().equals(""))
            {
                printWriter.print("浏览的商品："+books.toString());
            }
        %>
</body>
</html>
