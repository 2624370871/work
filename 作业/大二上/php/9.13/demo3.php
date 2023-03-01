<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?php
		$value="100";echo"\$value=\"$value\"";
		echo"<p>\$value==100: ";
		var_dump($value==100);//结果为bool(true)
		echo"<p>\$value==true: ";
		var_dump($value==true);//结果为bool(true)
		echo"<p>\$value==true: ";
		var_dump($value!=null);//结果为bool(true)
		echo"<p>\$value==false: ";
		var_dump($value==false);//结果为bool(false)
		echo"<p>\$value===100: ";
		var_dump($value===100);//结果为bool(false)
		echo"<p>\$value===true: ";
		var_dump($value===true);//结果为bool(true)
		echo"<p>(10/2.0!==5): ";
		var_dump(10/2.0!==5);//结果为bool(true)
		?>
	</body>
</html>
