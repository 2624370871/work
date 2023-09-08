<%--
  Created by IntelliJ IDEA.
  User: ht
  Date: 2023/3/12
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
    <h2>客户列表</h2>
    <table border="1">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td>${customer.custId}</td>
                <td>${customer.name}</td>
                <td>${customer.age}</td>
            </tr>
        </c:forEach>
    </table>
    </body>
</html>
