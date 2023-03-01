<?
session_start();
$_SESSION['views']=1;
?>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?
		echo "浏览量:".$_SESSION['views'];
		?>
	</body>
</html>
<?
// session_start();

if(isset($_SESSION["views"])){
	$_SESSION['views']=$_SESSION["views"]+1;
}else{
	$_SESSION['views']=1;
}
echo"浏览量：".$_SESSION["views"];
?>

<?
// session_start();
if(isset($_SESSION["views"])){
	unset($_SESSION["views"]);
}
?>
