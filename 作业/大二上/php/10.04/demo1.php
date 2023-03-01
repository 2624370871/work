<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<form  method="post">
			学号：<input type="text" name="xh" /><br>
			姓名：<input type="text" name="xm" /><br>
			<input type="submit"  name="postmethod" value="post方法提交" /><br>
		</form>
		<form  method="get">
			性别：男<input type="radio" name="sex" value="男" />
			女<input type="radio" name="sex" value="女" /><br>
			专业：<select name="zy">
				<option>计算机应用</option>
				<option>android开发</option>
				<option>php开发</option>
			</select><br>
			<input type="submit"  name="getmethod" value="get方法提交" />
		</form>
		<?
		if(isset($_POST['postmethod'])){
			$xh=$_POST['xh'];
			$xm=$_POST['xm'];
			echo"接收post变量：<br>";
			echo"学号:".$xh."<br>";
			echo"姓名:".$xm."<br>";
		}
		if(isset($_GET['getmethod'])){
			$sex=$_GET['sex'];
			$zy=$_GET['zy'];
			echo"<br>接收get变量：<br>";
			echo"性别:".$sex."<br>";
			echo"专业:".$zy."<br>";
		}
		echo"<br>接收request变量：<br>";
		echo"学号：".@$_REQUEST['xh']."<br>";
		echo"姓名：".@$_REQUEST['xm']."<br>";
		echo"性别：".@$_REQUEST['sex']."<br>";
		echo"专业：".@$_REQUEST['zy']."<br>";
		?>
	</body>
</html>
