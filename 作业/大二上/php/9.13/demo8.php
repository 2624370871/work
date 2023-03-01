<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?php
		date_default_timezone_set("Asia/ShangHai");//设置时区为上海
		$date1=strtotime("now");//获取当前时间
		$date2=strtotime("01 Jun 2011");//获取2011年的时间戳
		echo"高考日期：".date("Y-m-d",$date2);//获取$date2的时间值
		echo"<br>今天日期：".date("Y-m-d",$date1);//获取$date1的时间值
		$num=ceil($date2-$date1)/(60*60*24);//计算相差天数
		echo"<br>距高考还剩".$num."天";
		?>
	</body>
</html>
