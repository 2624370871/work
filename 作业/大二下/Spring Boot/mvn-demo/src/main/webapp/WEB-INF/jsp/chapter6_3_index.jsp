<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/4/19
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        function testJson() {
            console.log("hello")
            var name = $("#name").val();
            var age = $("#age").val();
            var custId = $("#custId").val();
            var ids=document.getElementsByName("hobby");
            var str=[];
            for (i=0;i<ids.length;i++){
                if(ids[i].checked){
                    str.push(ids[i].value);
                }
            }
            var hobby=str;
            $.ajax(
                {
                    url: "${pageContext.request.contextPath}/newJson",
                    type: "post",
                    data: JSON.stringify({custId:custId,name: name, age: age,hobby:hobby}),
                    contentType: "application/json;charset=UTF-8",
                    dataType: "json",
                    success: function (data) {
                        if (data != null) {
                            $("#msg").empty();
                            $("#msg").append("从返回的JSON格式数据：" + JSON.stringify(data) +"<br>"+ data.name +"<br>"+ "年龄为:" + data.age);
                        }
                    }
                }
            )
        }
    </script>
</head>
<body>
<form>
    客户编号:<input type="text" name="custId" id="custId"><br>
    客户姓名:<input type="text" name="name" id="name"><br>
    客户年龄:<input type="text" name="age" id="age"><br>
    <tr>
        <td>兴趣爱好：</td><br>
        <td>
            <input type="checkbox" name="hobby" value="游泳"/>游泳<br>
            <input type="checkbox" name="hobby" value="阅读"/>阅读<br>
            <input type="checkbox" name="hobby" value="旅游"/>旅游<br>
        </td>
    </tr>
    <input type="button" value="提交json数据" onclick="testJson()">
</form>
<br>
<div id="msg"></div>
</body>
</html>
