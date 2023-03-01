<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		
		<title></title>
	</head>
	<body>
		<?
		define("PI",3.1415926);
		function a($r){
			 return $r*$r*PI;
			 }
			 echo"圆的面积为：".a(10)."<br>";
			 function b($r){
			 	 return $r*2*PI;
			 	 }
			 	 echo"圆的周长为：".b(10);
		?>
	</body>
</html>
