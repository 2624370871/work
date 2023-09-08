<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/5/6
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
${msg}<br>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名:<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
