<%--User: 16545
    Date: 2022/10/12
    Time: 18:59
--%>
<%@ page
        contentType="text/html;charset=UTF-8"
        language="java" %>
<html>
<head>
    <title>
        Title</title>
</head>
<body>

<%
    String name = request.getParameter("username");
    out.print("zhe");
%>
<div>
<h3>
    欢迎<%= name%>的登录
</h3>
</div>
<a href="login.jsp"> 返回登录</a>
</body>
</html>

