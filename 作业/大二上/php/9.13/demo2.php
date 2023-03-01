<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?php
			/*使用define函数来定义名为MESSAGE的常量，并为其赋值为"能看到一次"，然后分别输出常量MESSAGE和Message，因为没有设置Case_sensitive参数为true，所以表示大小写敏感，解析器会认为没有定义该常量*/
			define("MESSAGE","能看到一次");
			echo MESSAGE;
			echo Message;
			/*使用define函数来定义名为COUNT的常量，并为其赋值为"能看到多次"，表示大小写不敏感，分别输出常量COUNT和Count，因为设置了大小写不敏感，因此程序会认为它和COUNT是同一个常量*/
			define("COUNT","能看到多次",true);
			echo"<br>";
			echo COUNT;
			echo"<br>";
			echo Count;
			echo"<br>";
			echo constant("Count");
			echo"<br>";
			echo(defined("MESSAGE"));
		?>
	</body>
</html>
