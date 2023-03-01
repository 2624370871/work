<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		
		<?php
		define("MESSAGE","MESSAGE区分大小写");//默认区分大小写
		echo MESSAGE."<br>";
		echo message."<br>";
		
		define("ACCOUNT","ACCOUNT不区分大小写",true);//不区分大小写
		echo ACCOUNT."<br>";
		echo account."<br>";
		echo defined("Account")."<br>";//使用defined()函数判断常量是否被定义
		?>
	</body>
</html>
