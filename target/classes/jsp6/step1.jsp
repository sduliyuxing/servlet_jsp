<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\15 0015
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>step1</title>
</head>
<body>
     <h4>选择购买的图书</h4>
     <form action="/step1servlet" method="post">
         <table border="1" cellpadding="10" cellspacing="0">
             <tr>
                 <td>编号</td>
                 <td>书名</td>
                 <td>购买</td>
             </tr>
             <tr>
                 <td>1</td>
                 <td>java</td>
                 <td><input type="checkbox" name="books" value="java"></td>
             </tr>
             <tr>
                 <td>2</td>
                 <td>c++</td>
                 <td><input type="checkbox" name="books" value="c++"></td>
             </tr>
             <tr>
                 <td>3</td>
                 <td>math</td>
                 <td><input type="checkbox" name="books" value="math"></td>
             </tr>
             <tr>
                 <td>4</td>
                 <td>physics</td>
                 <td><input type="checkbox" name="books" value="physics"></td>
             </tr>
             <tr>
                 <td>5</td>
                 <td>python</td>
                 <td><input type="checkbox" name="books" value="python"></td>
             </tr>
             <tr>
                 <td colspan="3"><input type="submit" value="提交"></td>
             </tr>
         </table>
     </form>
</body>
</html>
