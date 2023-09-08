
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>填写个人信息</title>
</head>
<body>
<h3>欢迎</h3>
<form action="pojo.do">
<table>
<tr>
    <td>用户名：</td><td><input name="name" type="text"/></td>
</tr>

<tr>
    <td>年龄：</td><td><input name="age" type="text"/></td>
</tr>

<tr>
    <td>兴趣爱好：</td>
    <td>
        <input type="checkbox" name="hobby" value="游泳"/>游泳<br>
        <input type="checkbox" name="hobby" value="阅读"/>阅读<br>
        <input type="checkbox" name="hobby" value="旅游"/>旅游<br>
    </td>
</tr>
<tr>
    <td colspan="2" align="center">
        <button type="submit">
            提交
        </button>
    </td>
</tr>
</table>
</form>
</body>
</html>
