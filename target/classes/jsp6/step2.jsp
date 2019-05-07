<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\15 0015
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>step2</title>
</head>
<body>
     <h4>填写信息</h4>
     <form action="/step2servlet" method="post">
         <table border="1" cellpadding="10" cellspacing="0">
             <tr>
                 <td>姓名：</td>
                 <td><%=session.getAttribute("name")%></td>
             </tr>
             <tr>
                 <td>地址：</td>
                 <td><input type="text" name="address"></td>
             </tr>
             <tr>
                 <td>银行卡号：</td>
                 <td><input type="text" name="card"></td>
             </tr>
             <tr>
                 <td>电话：</td>
                 <td><input type="text" name="phone"></td>
             </tr>
             <tr>
                 <td colspan="2"><input type="submit" value="提交"></td>
             </tr>
         </table>
     </form>
</body>
</html>
