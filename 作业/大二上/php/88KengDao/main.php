<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>88坑道名酒店网站——网站管理平台</title>
	</head>
	<body style="margin:0px;">
		<table border="1" style="width:100%">
			<tr>
				<td colspan="2">88坑道名酒店网站——网站管理平台</td>
			</tr>
			<tr>
				<td colspan="2">
					<?php
						if($_SESSION['user']!=""){
							echo $_SESSION['user'].",欢迎来到系统管理平台！";
						}
						else{
							echo "<script>alert('登陆超时,请重新登录!');window.location.href='login.php';</script>";
						}
					?>
				</td>
			</tr>
			<tr>
				<td width="80px" valign="top">
					<a href="product_add.php" target="mainframe">添加商品</a><br>
					<a href="product_list.php" target="mainframe">商品管理</a><br>
				</td>
				<td><iframe name="mainframe" style="width:100%;height:300px"></iframe></td>
			</tr>
		</table>
	</body>
</html>
