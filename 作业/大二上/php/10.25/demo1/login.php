<html>
	<head>	 
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <title></title>
	</head>
	<body>
		<form action="login.php" method="post">
		<table border="0" align="center">
		<tr><td colspan="2" align="center">用户登录</td></tr>
		<tr><td align="center">用户名:</td><td><input type="text" name="username"></td></tr>
		<tr><td align="center">密码:</td><td><input type="password" name="pw"></td></tr>
		<tr><td colspan="2" align="center">
		<input type="submit" name="submit" value="登录">
		<input type="reset" name="submit2" value="重置"></td></tr>
		</table>
		</form>
		<?php
			session_start();
			if(isset($_POST['submit'])){
				$username=$_POST['username'];
				$pw=$_POST['pw'];
				if($username=="admin"&&$pw=="123"){
					$_SESSION['username']=$username;
					$_SESSION['pw']=$pw;
					header("location:main.php");
				}
				else
					echo"<script>alert('登录失败');location.href='login.php'</script>";
			}
		?>
		
	</body>
</html>	