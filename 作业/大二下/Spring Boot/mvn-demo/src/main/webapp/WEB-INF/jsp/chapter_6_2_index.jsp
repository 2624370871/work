<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/4/10
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"  %>
<html>
<head>
    <title>JSON数据格式测试</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js">
    </script>
    <script type="text/javascript">
        function testJson(){
            console.log("测试结果")
            var name = $("#name").val();
            var age = $("#age").val();

            $.ajax({
                url : "${pageContext.request.contextPath}/testJson",
                type : "post",
                data :JSON.stringify({name:name,age:age}),
                contentType : "application/json;charset=UTF-8",
                dataType : "json",
                success : function(data){
                    if(data != null){
                        $("#msg").empty();
                        $("#msg").append("从返回的JSON格式数据："+JSON.stringify(data) + "name:" + data.name + ",age:" + data.age);
                    }
                }
            });
        }
    </script>

</head>
<body>
    <form>
        客户姓名：<input type="text" name="name" id="name"><br/>
        年龄：<input type="text" name="age" id="age"><br />
        <input type="button" value="提交JSON格式数据" onclick=" testJson()" />
    </form>

</body>
</html>
