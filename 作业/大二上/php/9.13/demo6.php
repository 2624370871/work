<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?php
					echo"前置自增运算:";
					$a=10;				//声明变量并赋值
					echo";运算前的a值:".$a;
					$b=++$a;
					echo";运算后的a值:".$a;
					echo";运算后的b值:".$b;
					echo"<br/>前置自增,先自增,再赋值";
					
					echo"<br/>后置自增运算:";
					$a=10;				//声明变量并赋值
					echo"运算前的a值:".$a;
					$b=--$a;
					echo";运算后的a值:".$a;
					echo";运算后的b值:".$b;
					echo"<br/>前置自增,先自增,再赋值";
					
					echo"<br/>后置自增运算:";
					$a=10;
					echo"运算前的a值:".$a;
					$b=$a--;
					echo";运算后的a值:".$a;
					echo";运算后的b值:".$b;
					echo"<br/>后置自增,先赋值,再自减";
				?>
	</body>
</html>
