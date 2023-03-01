<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<form action="" method="post" name="form1">
			网页计算器<br>
			数值1：<input type="text" id="" name="num1" /><br>
			数值2：<input type="text" id="" name="num2" /><br>
			<input type="submit" id="" name="submit" value="+"/>
			<input type="submit" id="" name="submit" value="-"/>
			<input type="submit" id="" name="submit" value="*"/>
			<input type="submit" id="" name="submit" value="/"/>
		</form>
		<?
		if($_POST['num1']!=null&&$_POST['num2']!=null){
			$num1=$_POST['num1'];
			$num2=$_POST['num2'];
			switch($_POST['submit']){
				case"+":$num3=$num1+$num2;break;
				case"-":$num3=$num1-$num2;break;
				case"*":$num3=$num1*$num2;break;
				case"/":$num3=$num1/$num2;break;
				default:break;
			}
			
			echo "结果：".$num3;
			
		}
		else{
			echo"<script>alert('数值不能为空！')</script>";
		}
		?>
	</body>
</html>
