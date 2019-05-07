<%@ page import="bao8.person" language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="bao8.authority"%>
<%@ page import="bao8.dao"%>
<%@ page import="java.util.*"%>
<html>
<head>
    <title>manager</title>
</head>
<body>
    <center><br><br>
        <form action="/authoritymanager?method=get" method="post">
          用户名:<input type="text" name="username" value="${sessionScope.p.name==null?"":sessionScope.p.name}"><br><br>
          <input type="submit" value="提交">
       </form>
        <%
            if (session.getAttribute("p")!=null){
        %>
           ${sessionScope.p.name}的权限为：<br><br><br>
        <form action="/authoritymanager?method=update" method="post">
            <input type="hidden" name="username" value="${sessionScope.p.name}">
            <%
                dao d=new dao();
                person p1= (person) session.getAttribute("p");
                List<authority> list0= (List<authority>) session.getAttribute("authorities");
                List<authority> list1= p1.getList();
                for (authority auth:list1){
                    for (authority au:list0){
                        if (au.getUrl()==(auth.getUrl())){
                            au.setFlag(1);
                        }
                    }
                }
            %>
            <%
                for (authority a:list1){
            %>
            <%=a.getAuthorityname()%><input type="checkbox" name="authority" value="<%=a.getUrl()%>" checked="checked"><br>
            <%
                }
            %>--------------------
            <br>
            <%
                for (authority a:list0){
                    int flag=a.getFlag();
                    if (flag==0){
            %>
            <%=a.getAuthorityname()%><input type="checkbox" name="authority" value="<%=a.getUrl()%>"><br>
            <%
                } }
            %><br>
            <input type="submit" value="更新">
          </form>
        <%
            }
        %>
        <br><br><br><a href="list.jsp">进入权限系统</a>
        <br><br><br><a href="logout.jsp">退出系统</a>
    </center>
</body>
</html>
