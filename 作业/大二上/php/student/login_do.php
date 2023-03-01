<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>系统登录处理页</title>
	</head>
	<body>
		<?php
			if($_POST["txt_username"]!="" && $_POST["txt_pwd"]!=""){
				$name=$_POST["txt_username"];	//获取提交的用户名
				$pwd=$_POST["txt_pwd"];		//获取提交的密码
				$conn=mysql_connect("localhost","root","root");	//链接MySQL服务器
				$select=mysql_select_db("student",$conn);	//选择数据库
				if($select){
					$str="select * from Admin_Info where UserName='$name' and Pwd='$pwd'";
					$result = mysql_query($str);	//查询语句
					if(mysql_num_rows($result)>0){	//查看返回的行数
						session_start();
						$_SESSION['user']=$_POST['txt_username'];
						echo "<script>window.location='main.php';</script>";
					}
					else{
						echo "<script>alert('用户名或密码错误!');window.location='login.php';</script>";
					}
				}
				else{
					echo "<script>alert('数据库选择失败,请联系系统管理员!');window.location='login.php';</script>";
				}
			}
			else{
				echo "<script>alert('请填写用户名和密码!');window.location='login.php';</script>";
			}
		?>
	</body>
</html>
