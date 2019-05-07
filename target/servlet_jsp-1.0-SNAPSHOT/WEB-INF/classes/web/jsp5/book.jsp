<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\12 0012
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>book</title>
</head>
<body>
    <h4>book</h4>
    book:<%=request.getParameter("book")%><br><br>

    <a href="books.jsp">return</a>

    <%
        String book=request.getParameter("book");
        Cookie temp=null;
        List<Cookie> books=new ArrayList<Cookie>();
        Cookie cookies[]=request.getCookies();
        if (cookies!=null&&cookies.length>0)
        {
            for (Cookie cookie:cookies)
            {
                String name=cookie.getName();
                if (name.startsWith("book_"))
                {
                    books.add(cookie);
                    String value=cookie.getValue();
                    if (value.equals(book))
                    {
                        temp=cookie;
                    }
                }
            }
        }
     if (books.size()==5)
     {
         if (temp==null)
         {
             temp=books.get(0);
         }
//         删除第一个
         temp.setMaxAge(0);
//         保存客户端
         response.addCookie(temp);
     }
     Cookie cookie=new Cookie("book_"+book,book);
        response.addCookie(cookie);
    %>

</body>
</html>
