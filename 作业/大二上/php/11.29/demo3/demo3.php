<!DOCTYPE html>
<html>
	<body>
	<?
	include('demo3-1.php');
	$studentl=new Student();
	$studentl->Name="张三";
	$studentl->Sex="男";
	$studentl->Age=18;
	$studentl->Number="2012081920202";
	$studentl->Specail="计算机科学与技术";
	$studentl->Classes="1班";
	$studentl->LinsenCourse(date('Y年m月d日h点'),"202","软件工程");
	$studentl->PlayBall(date('Y年m月d日h点'),"篮球场","打篮球");
	?>
	</body>
</html>