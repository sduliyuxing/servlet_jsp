<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\19 0019
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body><center>
   <form action="/uploadservlet" method="post" enctype="multipart/form-data">
       file:<input type="file" name="file"><br><br>
       desc:<input type="text" name="desc"><br><br>
       <%--<input type="checkbox" name="interesting" value="Reading"/>Reading--%>
       <%--<input type="checkbox" name="interesting" value="Party"/>Party--%>
       <%--<input type="checkbox" name="interesting" value="Sports"/>Sports--%>
       <%--<input type="checkbox" name="interesting" value="Shopping"/>Shopping--%>
       <%--<br><br>--%>
       <input type="submit" name="submit">
</center>
   </form>
</body>
</html>
