<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<div style="width:500px;height:300px;border:solid 1px red;background-color:#f9ff54;line-height:25px">
		<?
		$page_curr=$_GET['page']==""? 1:$_GET['page'];
		if($page_curr){
			$contents=file_get_contents("./data.txt");
			$length=strlen($contents);
			$page_count=ceil($length/800);
			echo substr($contents,($page_curr-1)*800,800);
		}
		?>
		</div>
		
		<?
		echo"共".$page_count."页 第".$page_curr."页";
		if($page_count!=1 && $page_curr!=1){
			echo "<a href='demo2.php?page=1'>首页</a>";
			echo "<a href='demo2.php?page=".($page_curr-1)."'>上一页</a>";
		}
		
		if($page_curr<$page_count){
			echo "<a href='demo2.php?page=".($page_curr+1)."'>下一页</a>";
			echo "<a href='demo2.php?page=".($page_count)."'>尾页</a>";
		}
		?>
	</body>
</html>