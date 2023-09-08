<?php
 //1.连接数据库
 try {
     $pdo = new PDO("mysql:host=localhost;dbname=student;", "root", "root");
 
 } catch (PDOException $e) {
     die("数据库连接失败" . $e->getMessage());
 }
 //2.防止中文乱码
 $pdo->query("SET NAMES 'UTF8'");
 //3.通过action的值进行对应操作
 switch ($_GET['action']) {
     case 'add':{   //增加操作
         $name = $_POST['name'];
         $sex = $_POST['sex'];
         $class = $_POST['class'];
		 $id = $_POST['id'];
		 $phone = $_POST['phone'];
 
         //写sql语句
         $sql = "INSERT INTO stu VALUES (NULL ,{$id}','{$name}','{$sex}','{$phone}','{$class}')";
         $rw = $pdo->exec($sql);
         if ($rw > 0) {
             echo "<script> alert('增加成功');
                             window.location='main.php'; //跳转到首页
                  </script>";
         } else {
             echo "<script> alert('增加失败');
                             window.history.back(); //返回上一页
                  </script>";
         }
         break;
     }
     case "del": {    //1.获取表单信息
         $id = $_GET['id'];
         $sql = "DELETE FROM stu WHERE id={$id}";
         $pdo->exec($sql);
         header("Location:main.php");//跳转到首页
         break;
     }
     case "edit" :{   //1.获取表单信息
         $name = $_POST['name'];
         $sex = $_POST['sex'];
         $class = $_POST['class'];
         $id = $_POST['id'];
         $phone = $_POST['phone'];
 
         $sql = "UPDATE stu SET name='{$name}',sex='{$sex}',id='{$id}',class='{$class}',phone='{$phone}' WHERE id='{$id}'";
         $rw=$pdo->exec($sql);
         if($rw>0){
             echo "<script>alert('修改成功');window.location='main.php'</script>";
         }else{
             echo "<script>alert('修改失败');window.history.back()</script>";
         }
 
 
         break;
     }
 
 }
