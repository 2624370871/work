<?
SESSION_start();
header("Content-type:text/html;charset=utf-8");
date_default_timezone_set('PRC');
if(isset($_POST['login'])){
	$name=$_POST['name'];
	$pas=$_POST['pas'];
	$role=$_POST['role'];
	$time=date("Y:m:d H:i:s",time());
	$ip=$_SERVER['SERVER_ADDR'];
	if($name==" " && $pas==" "){
		echo "<script>alert('用户名和密码不能为空')</script>";
		header("location:login.php");
	}else{
		if($role=="admin"&&$name="Rarin"){
			$_SESSION['name']=$name;
			$_SESSION['pas']=$pas;
			$_SESSION['role']=$role;
			$_SESSION['ip']=$ip;
			$_SESSION['time']=$time;
			header("location:index.php"."?role=$role");
		}elseif($pas=="2002"&&($role=="teacher"||$role=="student")){
			setcookie("name",$name,time()+3600);
			setcookie("pas",$pas,time()+3600);
			setcookie("role",$role,time()+3600);
			setcookie("ip",$ip,time()+3600);
			setcookie("time",$time,time()+3600);
			header("location:index.php"."?role=$role");
		}
	}
}
?>