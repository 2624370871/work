<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<script src="./js/xheditor0608/jquery/jquery-1.4.4.min.js" type="text/javascript" ></script>
		<script src="./js/xheditor0608/xheditor-1.1.12-zh-cn.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		$(pageInit);
		function pageInit () {
			var sVar,sJSInit;
			$('textarea[name=preview]').attr('id','eleml').xheditor(false);
			sJSInit="$('#eleml').xheditor("+(sVar?'{'+sVar+'}':'')+');';
			eval(sJSInit);
		}
	</script>
	</head>
	<body>
	<form action="" method="post">
	<textarea name="preview" id="preview" cols="100" rows="8"></textarea>
	<br>
	<input type="submit" value="提交" name="btn_submit"/>
	</form>
	<?
	if($_POST['btn_submit'])
	echo $_POST['preview'];
	?>
	</body>
</html>