<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?php
			date_default_timezone_set("Asia/ShangHai");	//设置时区为上海
			$date=date('Y/m/d H:i:s');					//使用date()函数获取当前系统时间
			echo"当前系统时间:".$date;					//输出变量值
		?>
	</body>
</html>
