<html>
	<head>	 
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
<?php
	session_start();
	$username=@$_SESSION['username'];
	$pw=@$_SESSION['pw'];
	if($username&&$pw){
		echo"欢迎管理员登录，您的密码为$pw";
	}else{
		echo"对不起，您没有权限登录本页";
	}
	
?>
		
	</body>
</html>	