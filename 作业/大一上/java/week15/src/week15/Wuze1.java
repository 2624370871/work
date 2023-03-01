package week15;

import java.util.Random;
import java.util.Scanner;

public class Wuze1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] students=new String[3];//定义一个数组变量存放录入学生姓名
		//存储姓名
		addstudentsname(students);
		//总览姓名
		printstudentsname(students);
		//随机点名
		String randomname=randomnstudentsname(students);
		System.out.println("被点到的姓名是"+randomname);
			}
		//随机点名的方法
			private static String randomnstudentsname(String[] students) {
				// TODO Auto-generated method stub
				int index= new Random().nextInt(students.length);
				String name=students[index];//将值赋给name
				return name;//返回name
			}

			private static void printstudentsname(String[] students) {
				// TODO Auto-generated method stub
				for (int i = 0; i < students.length; i++) {//遍历数组
					String name=students[i];//将students的长度赋给name
				}
			}

			private static void addstudentsname(String[] students) {
				// TODO Auto-generated method stub
				Scanner sca=new Scanner(System.in);//扫描器接收输入的数据并赋值给sca
				for (int i = 0; i < students.length; i++) {//遍历数组
					System.out.println("存入第"+(i+1)+"个学生姓名");//输出学生姓名
					students[i]=sca.next();//将sca赋值给students的长度
				}
	}

}
