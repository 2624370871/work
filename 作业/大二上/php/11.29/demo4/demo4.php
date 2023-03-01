<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<?
		class Teacher{
			public $Name;
			public $Sex;
			public $Coursename;
			public function __construct($namel,$sexl,$coursenamel){
				$this->Name=$namel;
				$this->Sex=$sexl;
				$this->Coursename=$coursenamel;
				}
				public function SayHello(){
					echo"<br>同学们,我的名字是：".$this->Name;
					echo"<br>我的主讲课程是：".$this->Coursename;
				}
			}
			$teacherl=new Teacher("陈丹",'女','软件界面设计');
			$teacherl->SayHello();
		?>
	</body>
</html>