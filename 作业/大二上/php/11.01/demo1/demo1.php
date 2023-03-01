<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			.style3{
				font-size: 15px;
			}
		</style>
	</head>
	<body>
		<table width="995" height="626" border="0" cellpadding="0" cellspacing="0" background="img/bg.jpg">
			<tr>
				<td width="204" height="267">&nbsp;</td>
				<td width="550">&nbsp;</td>
				<td width="219">&nbsp;</td>
			</tr>
			<tr>
			<td height="220">&nbsp;</td>
			<td class="style1">
				<span class="style3">
					<?
					session_start();
					$array=array('php从入门到精通','php网络编程自学手册','php函数参考大全','php开发典型模块大全','php网络编程标准教程','php程序开发范例宝典');
					$_SESSION['mr_book']=$array;
					foreach($_SESSION['mr_book'] as $key=>$value){
						if($value=="php开发典型模块大全"){
							$br="<br><br>";
						}else{
							$br="&nbsp;&nbsp;";
						}
						echo $value.$br;
					}
					?>
				</span>
			</td>
			<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
	</body>
</html>
