<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<form action="index_do.php" method="post">
			<table>
				<tr>
					<td>用户身份</td>
					<td>
						<input type="radio" name="role" id="" value="admin" />管理员
						<input type="radio" name="role" id="" value="teacher" />任职教师
						<input type="radio" name="role" id="" value="student" />学生
					</td>
				</tr>
				<tr>
					<td>
						<label>用户：</label>
					</td>
					<td>
						<input type="text" name="name" id="" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>密码：</label>
					</td>
					<td>
						<input type="password" name="pas" id="" value="" />
					</td>
				</tr>
				<tr>
					<td style="text-align: center;" colspan="2">
						<input type="submit" name="login" id="" value="登录" />
						<input type="reset" name="reset" id="" value="取消" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
