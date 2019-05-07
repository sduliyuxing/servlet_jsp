<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\10 0010
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="/loginservlet" method="post">

        user: <input type="text" name="user"/>
        password: <input type="password" name="password"/>

        <br><br>

        interesting:
        <input type="checkbox" name="interesting" value="reading"/>reading
        <input type="checkbox" name="interesting" value="game"/>game
        <input type="checkbox" name="interesting" value="party"/>party
        <input type="checkbox" name="interesting" value="shopping"/>shopping
        <input type="checkbox" name="interesting" value="sport"/>sport
        <input type="checkbox" name="interesting" value="tv"/>tv

        <input type="submit" value="提交"/>

    </form>

</body>
</html>
