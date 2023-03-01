<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
	</head>
	<body>
		<?php
		$a1=666;//十进制
		$a2=0666;//八进制
		$a3=0x666;//十六进制
		echo"整数666不同进制的输出结果如下：";
		echo"<br>十进制的结果是：".$a1;
		echo"<br>八进制的结果是：".$a2;
		echo"<br>十六进制的结果是：".$a3;
		
		$b1=-18.9;
		$b2=32.64E-5;
		echo"<br><br>下面是浮点数的输出";
		echo"<br>-18.9的输出".$b1;
		echo"<br>32.64E-5的输出".$b2;
		
		$c1=true;
		$c2=false;
		echo"<br><br>下面是布尔型的输出";
		echo"<br>true的输出".$c1;
		echo"<br>false的输出".$c2;
		?>
	</body>
</html>