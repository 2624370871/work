<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?
		date_default_timezone_set("Asia/Hong_Kong");
		if(!isset($_COOKIE["visit_time"])){
			setcookie("visit_time",date("Y-m-d H:i:s"));
			echo"欢迎您第一次访问网站！";
			echo"<br>";
		}else{
			setcookie("visit_time",date("Y-m-d H:i:s"),time()+3);
			echo"您上次访问网站的时间为：".$_COOKIE["visit_time"];
			echo"<br>";
		}
		echo"您本次访问网站的时间为：".date("Y-m-d H:i:s");
		?>
	</body>
</html>
