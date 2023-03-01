<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?php
		echo "今天是".date("Y-m-d")."<br>";
		$a=date("l");
		switch($a){
			case "Monday";
			echo"今天星期一";
			break;
			case "Tuesday";
			echo"今天星期二";
			break;
			case "Wednesday";
			echo"今天星期三";
			break;
			case "Thursday";
			echo"今天星期四";
			break;
			case "Friday";
			echo"今天星期五";
			break;
			case "Saturday";
			echo"今天星期六";
			break;
			case "Sunday";
			echo"今天星期天";
		}
		?>
	</body>
</html>
