<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/3/22
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取用户数据</title>
</head>
<body>
<table border="1">
  <h2>表头文件</h2>
  <tr>
    <th>编号</th>
    <th>姓名</th>
  </tr>
  <c:forEach items="${list}" var="l">
    <tr>
      <td>${l.id}</td>
      <td>${l.name}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
