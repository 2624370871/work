<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
	<?php
	$zy="你好";
	$zyy="PHP语言";
	function lxt(){
		$zy="我喜欢";
		echo $zy;
		global $zyy;
		echo $zyy;
	}
	lxt();
	?>
	</body>
</html>
