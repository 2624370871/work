<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>学生信息管理系统</title>
		<style>
			a{
				text-decoration: none;
				color: #ffffff;
			}
			.top{
				display: flex;
				justify-content: space-evenly;
				background-color:#2F7AD7;
				height:50px;
				line-height:50px;
				
			}
			.top div{
				display: flex;
				justify-content: space-between;
				margin: 0 10px;
			}
		</style>
	</head>
	<body style="margin:0px;">
		<div class="top">
			<div>学生信息管理系统</div>
			<div>
				<div><a href="main.php">学生信息</a></div>
				<div><a href="action.php">修改学生</a></div>
				<div><a href="">查询学生</a></div>
				<div><a href="add.php">添加学生</a></div>
			</div>
			<div>
				<?php
				if($_SESSION['user']!=""){
				echo $_SESSION['user'].",欢迎来到系统管理平台！";
			}
				else{
					echo "<script>alert('登陆超时,请重新登录!');window.location.href='login.php';</script>";
				}
				?>
			</div>
		</div>
		
		<table width="600" border="1">
         <tr>
             <th>姓名</th>
			 <th>学号</th>
             <th>性别</th>
             <th>班级</th>
             <th>操作</th>
         </tr>
		 <?php
		 try {
            $pdo = new PDO("mysql:host=localhost;dbname=;", "root", "root");
        } catch (PDOException $e) {
            die("数据库连接失败" . $e->getMessage());
        }
        $pdo->query("SET NAMES 'UTF8'");
		 $sql = "SELECT * FROM student";
		 foreach ($pdo->query($sql) as $row) {
		     echo "<tr>";
		     echo "<td>{$row['id']}</td>";
		     echo "<td>{$row['name']}</td>";
		     echo "<td>{$row['sex']}</td>";
		         echo "<td>{$row['class']}</td>";
		            echo "<td>
		                   <a href='javascript:doDel({$row['id']})'>删除</a>
		                 <a href='edit.php?id=({$row['id']})'>修改</a>
		             </td>";
		            echo "</tr>";
		        }
		 		
		        ?>
   </table>
	</body>
</html>
