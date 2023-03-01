<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?php
		echo"输出系统预定义变量:";
		echo"<br>当前操作系统为:".PHP_OS;
		echo"<br>当前php版本为:".PHP_VERSION;
		echo"<br>当前文件路径为:".__FILE__;
		
		echo"<br>输出自定义常量:";
		define("PI",3.14159);//定义常量PI
		$r=20;//定义变量r
		$c=PI*$r*2;//定义圆的周长
		echo"<br>圆的半径=".$r;
		echo"<br>圆的周长=".$c;
		?>
	</body>
</html>
