<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?php
		function sum(){
			$a=1;
			$sum=0;
			for($i=1;$i<=10;$i++){
			 $a=$a*$i;
			 $sum=$sum+$a;		
			}	
			echo "1!+2!+3!+4!+......+10!=".$sum;		
		}
		 sum();
		?>
	</body>
</html>
