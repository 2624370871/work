<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>添加商品信息</title>
	</head>
	<body style="margin:0px;">
	<form action="product_add_do.php" method="post" enctype="multipart/form-data">
		<table border="1" style="width:100%">
			<tr>
				<td><font color="red">*</font>商品名称:</td>
				<td><input type="text" name="txt_name"/></td>
			</tr>
			<tr>
				<td><font color="red">*</font>商品图片</td>
				<td><input type="file" name="txt_image"/></td>
			</tr>
			<tr>
				<td><font color="red">*</font>价格</td>
				<td><input type="text" name="txt_price"/></td>
			</tr>
			<tr>
				<td>简介:</td>
				<td><textarea name="txt_intro" rows="8" cols="30"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="保存"/></td>
			</tr>
		</table>
	</form>
	</body>
</html>
