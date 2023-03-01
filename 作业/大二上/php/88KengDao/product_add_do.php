<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>商品信息添加处理页</title>
	</head>
	<body>
		<?php
			if($_POST["txt_name"]!="" && $_FILES["txt_image"]!="" && $_POST["txt_price"]!=""){
				$name=$_POST["txt_name"];
				$image=$_FILES["txt_image"];
				$intro=$_POST["txt_intro"];
				$price=$_POST["txt_price"];
				$datetime=date('y-m-d h:i:s');
				echo $intro;
				if($image['size']>0 && $image['size']<1024*8000){
					$dir='upfiles/';
					$name2=$image['name'];
					$rand=rand(0,8000000);
					$name2=$rand.date('YmdHis').$name2;
					$path=$dir.$name2;
					if(!is_dir($dir)){
						mkdir($dir);
					}
					$i=move_uploaded_file($image['tmp_name'],$path);
					if($i==true)
					{
						$conn=mysql_connect("localhost","root","root");
						$select=mysql_select_db("88KengDao_db",$conn);
						if($select)
						{
							mysql_query("set names utf8");
							$str="insert into PRODUCT_Info(P_Name,P_Image,P_intro,P_Price,P_CreateTime,P_Status)values('$name','$path','$intro',$price,'$datetime',1)";
							if(mysql_affected_rows()>0)
							{
								echo "<script>alert('商品信息添加成功');window.location='product_add.php';</script>";
							}
							else
							{
								echo "<script>alert('商品信息添加失败');window.location='product_add.php';</script>";
							}
						}
						else
						{
							echo "<script>alert('数据库选择失败！');window.location='product_add.php';</script>";
						}
					}
					else 
					{echo "<script>alert('文件上传失败');</script>";}
					}
						else
						{echo "<script>alert('文件大小不合符网站要求');</script>";}
					}else{
						echo "<script>alert('请填写商品名称、图片和价格！');window.location='product_add.php';</script>";
					}
		?>
	</body>
</html>
