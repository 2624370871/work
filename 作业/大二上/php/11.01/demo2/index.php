<?
SESSION_start();
header("Content-type:text/html;charset=utf-8");
date_default_timezone_set('PRC');
?>
<!!DOCTYPE html>
<html>
	<head>
		<title>
			登录成功
		</title>
	</head>
	<body>
		<?
		$role=$_GET['role'];
		if($role=="admin"){
			if(!empty($_SESSION["time"])){
				echo "您好，".$_SESSION["name"]."<br>";
				echo"你的密码：".$_SESSION["name"]."<br>";
				echo"您的ip：".$_SESSION["ip"]."<br>";
				echo"SESSION登录成功！您上次访问的时间是：".$_SESSION["time"]."<br>";
				echo"<form>
				<input type='submit' name='unlink' value='销毁'/>
				</form>";
			}else{
				echo"<script>alert(’未登录)</script>";
				header("location:login.php");
			}
		}elseif($role=="teacher"||$role=="student"){
			if(!empty($_COOKIE["time"])){
				echo "您好，".$_COOKIE["name"]."<br>";
				echo "你的密码：".$_COOKIE["pas"]."<br>";
				echo "您的ip：".$_COOKIE["ip"]."<br>";
				echo "SESSION登录成功！您上次访问的时间是：".$_COOKIE["time"]."<br>";
				echo "<form>
				<input type='submit' name='unlinkCok' value='销毁'/>
				</form>";
			}else{
				echo"<script>alert('未登录')</script>";
				header("location:login.php");
			}
		}else{
				echo"<script>alert('非法用户')</script>";
				header("location:login.php");
			}
		?>
	</body>
</html>