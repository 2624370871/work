<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?php
		$a=3+"abc10";
		$b=3+"10abc";
		$c="abc10"+3;
		$d="10abc"+3;
		echo"<br>3+'abc10'的值是".$a;
		echo"<br>3+'10abc'的值是".$b;
		echo"<br>'abc10'+3的值是".$c;
		echo"<br>'abc10'+3的值是".$d;
		$e=3+true;
		echo("<br>3+true的值是".$e);
		$f=false+"10abc";
		echo"<br>false+'10abc'的值是".$f;
		?>
	</body>
</html>
