<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			table,div,td{
				text-align: center;
			}
			table{
				margin: 0 auto;
			}
			p{
				font-size: 18px;
				color: #ff0000;
			}
		</style>
	</head>
	<body>
		<form name="fr1" method="post">
			<table border="1">
				<tr>
				<td><div>学号</div></td>
				<td><div>姓名</div></td>
				<td><div>成绩</div></td>
				</tr>
				 <?php 
				   		for ($i=0; $i < 5; $i++) { 
				     ?>
				   	<tr>
					<td><input type='text' name='XH[]'></td>
					<td><input type='text' name='XM[]'></td>
				   	<td><input type='text' name='CJ[]'></td>
				   	</tr>
				   <?php 
				   }
				   ?>
					<tr>
						<td colspan="3">
							<input type="submit" id="" name="bt_stu" value="提交"/>
						</td>
					</tr>
			</table>
		</form>
		<p align="center">注意，学号值不能重复</p><br>
		<?
		if(isset($_POST['bt_stu'])){
			$XH=$_POST['XH'];
			$XM=$_POST['XM'];
			$CJ=$_POST['CJ'];
			array_multisort($CJ,$XH,$XM);
			for($i=0;$i<count($XH);$i++){
				$sum[$i]=array($XH[$i],$XM[$i],$CJ[$i]);
			}
			echo"<div>排序后成绩表如下：</div>";
			echo "<table border=2><tr><td>学号</td><td>姓名</td><td>成绩</td></tr>";
			foreach($sum as $value){
				list($stu_number,$stu_name,$stu_score)=$value;
				echo"<tr><td>$stu_number</td><td>$stu_name</td><td>$stu_score</td></tr>";
			}
			echo"</table><br>";
			reset($sum);
			while(list($key,$value)=each($sum)){
				list($stu_number,$stu_name,$stu_score)=$value;
				if($stu_number=="081101"){
					echo"<p align=center>";
					echo $stu_number."的姓名为：".$stu_name.",";
					echo"成绩为：".$stu_score;
					break;
				}
			}
		}
		?>
	</body>
</html>
