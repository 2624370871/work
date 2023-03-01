	<!DOCTYPE html>
	<html>
		<head>
			<meta charset="utf-8">
			<title></title>
		</head>
		<body>
	<?
	class Student{
		public $Name;
		public $Sex;
		public $Age;
		public $Number;
		public $Specail;
		public $Classes;
		public function LinsenCourse($timel,$classl,$coursename){
			echo"<br/>大家好，我叫：".$this->Name;
			echo"<br/>我将于".$timel."在".$classl."教室听课：课程名称是:".$coursename;
		}
		public function PlayBall($timel,$address,$ballname){
			echo"<br/>大家好，我叫：".$this->Name;
			echo"<br/>我将于".$timel."在".$address.$ballname;
		}
	}
	?>
	</body>
	</html>
	