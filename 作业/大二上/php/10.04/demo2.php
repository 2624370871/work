<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<form action="" method="post">
			请输入圆的半径：<input type="text" name="R" id="" value="" /><br>
			<input type="submit" name="postmethod" id="" value="post方法提交" /><br>
		</form>
		<form action="" method="get">
			请输入梯形的上底:<input type="text" name="s" id="" value="" /><br>
			请输入梯形的下底:<input type="text" name="x" id="" value="" /><br>
			请输入梯形的高:<input type="text" name="g" id="" value="" /><br>
			<input type="submit" name="getmethod" id="" value="get方法提交" />
		</form>
		<?
		define("PI",3.1415926);
		if(isset($_POST['postmethod'])){
			$r=$_POST['R'];
			$C_area=PI*$r*$r;
			echo"接收post变量：<br>";
			echo"圆的面积为：".$C_area."<br>";
		}
		if(isset($_GET['getmethod'])){
			$s=$_GET["s"];
			$x=$_GET["x"];
			$g=$_GET["g"];
			$T_area=($s+$x)*$g/2;
			echo"<br>接收GET变量：<br>";
			echo"梯形面积为：".$T_area."<br>";
		}
		?>
	</body>
</html>
