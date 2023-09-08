<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/4/10
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>展示图片</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body style="text-align: center">
<h2>静态资源测试结果</h2>
<img alt="图片加载失败" src="${pageContext.request.contextPath}/image/image.jpg" width="200px">
<br>
说明：${msg}
</body>
</html>
