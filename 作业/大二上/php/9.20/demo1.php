<html>
	<head>
		<meta charset="utf-8">
		<title>留言板</title>
	</head>
	<body>
		<form action="" method="post">
			留言内容:
			<textarea cols="20" rows="6" name="txt1"></textarea>
			<input type="submit" name="sub1" value="提交">
		</form>
		<?php
			function Match_Str($str){	//自定义函数
				$arr=array('傻子','弱智');
				for($i=0;$i<count($arr);$i++){
					$str=str_replace($arr[$i],"请文明用语！！",$str);
				}
				echo $str;
			}
				if($_POST["sub1"]){
					Match_Str($_POST["txt1"]);
				}
		?>
	</body>
<ml>
