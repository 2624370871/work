<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>学生管理系统</title>
	</head>
	<style>
		body{
			padding: 0;
			margin: 0;
		}
		.main {
			
			margin: 0 auto;
		}
	</style>
	<body>
		<div class="main">
			<form action="login_do.php" method="post">
				<span>用户名:</span><input type="text" name="txt_username"><br>
				<span>密码:</span><input type="password" name="txt_pwd"><br>
				<input type="submit" value="登录">
			</form>
		</div>
	</body>
</html>
