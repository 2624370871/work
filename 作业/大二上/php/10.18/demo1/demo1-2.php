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
				<td height="150" rowspan="3">&nbsp;</td>
				<td height="40" align="left" valign="middle"><table width="451" border="0" cellspacing="0" cellpadding="0">
				<form action="" method="post" enctype="multipart/form-data">
					<tr>
						<td width="136" height="30" align="right" valign="middle">请选择上传文件：</td>
						<td width="235"><input type="file" name="up_file" id="" value="" /></td>
						<td width="80"><input type="submit" name="submit" id="" value="上传" /></td>
					</tr>
				</form>
				</table></td>
				<td rowspan="3">&nbsp;</td>
			</tr>
			<tr>
				<td height="300" align="left" valign="top">
					<?
					if(!empty($_FILES['up_file']['name'])){
						$fileinfo=$_FILES['up_file'];
						if($fileinfo['size']<2097152 && $fileinfo['size']>0){
							$path="upfile/".$_FILES["up_file"]["name"];
							move_uploaded_file($fileinfo['tmp_name'],$path);
							echo"文件上传成功";
						}else{
							echo"文件大小不符合要求";
						}
					}
					?>
				</td>
			</tr>
			<tr>
				<td height="135">&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
	</body>
</html>

