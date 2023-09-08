<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023/4/17
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Car Info</title>
</head>
<body>
<form action="carBase">

  <label for="id">编号:</label>
  <input type="text" name="id" id="id"/><br/>

  <label for="price">价格:</label>
  <input type="text" name="price" id="price"/><br/>

  <label for="age">年龄:</label>
  <input type="text" name="age" id="age"/><br/>

  <label for="color">颜色:</label>
  <input type="text" name="color" id="color"/><br/>

  <label for="brand">品牌:</label>
  <input type="text" name="brand" id="brand"/><br/>

  <input type="submit" value="提交"/>
</form>
</body>
</html>
