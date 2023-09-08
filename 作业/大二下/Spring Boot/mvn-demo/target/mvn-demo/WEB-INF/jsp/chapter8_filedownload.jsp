<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/5/10
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>下载页面</title>
</head>
<a href="${pageContext.request.contextPath}/chapter8/fileDownload1?filename=测试文件1.txt">测试文件1</a>
<br>
<a href="${pageContext.request.contextPath}/chapter8/fileDownload1?filename=1.png">下载图片</a>
<br>
<a href="${pageContext.request.contextPath}/chapter8/fileDownload2?filename=测试文档.docx">测试文档</a>
</body>
</html>
