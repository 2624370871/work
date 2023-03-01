<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<table border="0" cellspacing="0" cellpadding="0" background="file.jpg" width="1004" height="635">
			<tr>
				<td width="358" height="300">&nbsp;</td>
				<td width="469">&nbsp;</td>
				<td width="177">&nbsp;</td>
			</tr>
			<tr>
				<td height="150" rowspan="2">&nbsp;</td>
				<td height="50" align="left" valign="middle"><table width="451" border="0" cellspacing="0" cellpadding="0">
				<form action="" method="post" enctype="multipart/form-data">
					<tr>
						<td width="134" height="30" align="right" valign="middle">请选择上传文件：</td>
						<td width="237"><input type="file" name="upfile" id="" value="" /></td>
						<td width="80"><input type="submit" name="submit" id="" value="上传" /></td>
					</tr>
				</form>
				</table></td>
				<td rowspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td height="100" align="left" valign="middle">
					<?
					if(!empty($_FILES)){
						foreach($_FILES['upfile'] as $name => $value)
						echo $name."=".$value."<br>";
					}
					?>
				</td>
			</tr>
			<tr>
				<td height="185">&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
	</body>
</html>
