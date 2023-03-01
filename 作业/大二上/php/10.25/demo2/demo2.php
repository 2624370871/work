<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?
		setcookie("mr","li",time()+60);
		if(isset($_COOKIE['mr'])){
			echo"读取cookie：".$_COOKIE['mr'];
		}
		?>
	</body>
</html>
