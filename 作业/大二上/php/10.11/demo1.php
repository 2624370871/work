<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<form action="" method="post">
			以下属web开发语言的有哪几种?<br /><br />
			<input type="checkbox" name="answer[]" value="C语言" />C语言<br>
			<input type="checkbox" name="answer[]" value="PHP" />PHP<br>
			<input type="checkbox" name="answer[]" value="FLASH" />FLASH<br>
			<input type="checkbox" name="answer[]" value="ASP" />ASP<br>
			<input type="checkbox" name="answer[]" value="JSP" />JSP<br>
			<input type="submit" id="" name="bt_answer" value="提交"/>
		</form>
		<?
		if(isset($_POST['bt_answer'])){
			$answer=@$_POST['answer'];
			if(!$answer){
				echo"<script>alert('请选择答案')</script>";
			}else{
				$num=count($answer);
				$anw="";
				for($i=0;$i<$num;$i++){
					$anw=$anw.$answer[$i];
				}
				if($anw=="PHPASPJSP"){
					echo"<script>alert('回答正确')</script>";
				}else{
					echo"<script>alert('回答错误')</script>";
				}
			}
		}
		?>
	</body>
</html>
