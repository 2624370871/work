<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		国家节假日提醒<br />
		<?
		echo "当前日期：".date("Y年m月d日");
		$a=array("元旦"=>"01月01日","妇女节"=>"03月08日","劳动节"=>"05月01日","儿童节"=>"06月01日","教师节"=>"09月10日","国庆节"=>"10月01日");
		foreach($a as $key=>$value){
			if(date("m月d日")==$value){
				echo"<br>今天是".$key;
			}
		}
		?>
	</body>
</html>
