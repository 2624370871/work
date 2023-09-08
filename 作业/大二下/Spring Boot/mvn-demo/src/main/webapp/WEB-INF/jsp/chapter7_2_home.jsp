<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/5/6
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>系统主页</title>
</head>
<body>
<c:if test="${USER_SESSION.username==null}">
    用户未登录，请重新<a href="${pageContext.request.contextPath}/loginview">登录</a>！
</c:if>
<c:if test="${USER_SESSION.username!=null}">
    用户登录信息为${USER_SESSION.username}<br>
    <a href="${pageContext.request.contextPath}/logout">登出</a>
</c:if>
</body>
</html>
