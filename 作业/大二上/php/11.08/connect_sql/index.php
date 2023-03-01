<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			body{
				margin: 0;
			}
			
		</style>
	</head>
	<body>
		<table width="760"border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td><img src="image/bg_01.jpg" alt="" width="760" height="254"></td>
			</tr>
			<tr>
			<td align="center"><table width="700" border="0">
			<tr>
				<td width="78" align="center"><span class="style1">ID</span></td>
				<td width="262" align="center"><span class="style1">图书名称</span></td>
				<td width="77" align="center"><span class="style1">价格</span></td>
				<td width="176" align="center"><span class="style1">出版日期</span></td>
				<td width="85" align="center"><span class="style1">类型</span></td>
			</tr>
			<?
			include_once("connect.php");
			$result=mysqli_query($connect,"select * from tb_demo01");
			while($myrow=mysqli_fetch_array($result)){
				?>
			
			<tr>
				<td align="center"><span class="style2"><? echo $myrow[0];?></span></td>
				<td align="center"><span class="style2"><? echo $myrow[1];?></span></td>
				<td align="center"><span class="style2"><? echo $myrow[2];?></span></td>
				<td align="center"><span class="style2"><? echo $myrow['date'];?></span></td>
				<td align="center"><span class="style2"><? echo $myrow['type'];?></span></td>
			</tr>
			<?
			}
			?>
		</table>
		</td>
		</tr>
		<tr>
			<td><img src="image/bg_09.jpg" alt="" width="760" height="34"></td>
		</tr>
		</table>
	</body>
</html>
