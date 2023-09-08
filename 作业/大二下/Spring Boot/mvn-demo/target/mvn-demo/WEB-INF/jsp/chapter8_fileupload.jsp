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
    <title>文件上传页面</title>
    <script>
        function check(){
            var name=document.getElementById("name").value;
            var file=document.getElementById("file").value;
            if(name=="") {
                alert("请填写名字！")
                return false
            }
            if(file.length==0||file==""){
                alert("请选择上传文件")
                return false;
            }
            return true;
        }
    </script>
</head>
<form action="${pageContext.request.contextPath}/chapter8/fileUpload" method="post"
enctype="multipart/form-data" onsubmit="return check()">
    文件上传人:<input type="text" name="name" id="name"/><br>
    选择文件:<input type="file" name="uploadfile" id="file" multiple/><br>
    <input type="submit" value="上传"/><br>
</form>

</body>
</html>
