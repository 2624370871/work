package week1402;

public class Wuze {
		public static void main(String[] args) {
			int a=0,b=0,c=0;
			int xiaozu1[]= {7,6,2};//定义一维数组
			int xiaozu2[]= {8,6,1,7};
			int xiaozu3[]= {9,4,5,8};
			for (int i = 0; i < xiaozu1.length; i++) {//for循环求一维数组和
				a=a+xiaozu1[i];
			}
			System.out.print("第1组总分："+a+"\n");
			for (int i = 0; i < xiaozu2.length; i++) {
				b=b+xiaozu2[i];
			}
			System.out.print("第2组总分："+b+"\n");
			for (int i = 0; i < xiaozu3.length; i++) {
				c=c+xiaozu3[i];
			}
			System.out.print("第3组总分："+c+"\n");
			System.out.print("3个小组总分："+(c+a+b)+"\n");

	}

}
