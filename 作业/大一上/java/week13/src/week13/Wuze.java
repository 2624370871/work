package week13;

import java.security.PublicKey;
import java.util.Iterator;

public class Wuze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String[] arr1;//????һ??һά????
//arr1=new String[8];
//arr1[0]="???Ӻ?";
//arr1[1]="??????";
//arr1[2]="ŷ????";
//arr1[3]="?¼???";
//arr1[4]="??¶¶";
//arr1[5]="??˶";
//arr1[6]="???ڽ?";
//arr1[7]="??????";
//System.out.println("arr1[0]"+arr1[0]);
//System.out.println("arr1[1]"+arr1[1]);
//System.out.println("arr1[2]"+arr1[2]);
//System.out.println("arr1[3]"+arr1[3]);
//System.out.println("arr1[4]"+arr1[4]);
//System.out.println("arr1[5]"+arr1[5]);
//System.out.println("arr1[6]"+arr1[6]);
//System.out.println("arr1[7]"+arr1[7]);
//		double[] arr1;//????һ??һά????
//		arr1=new double[10];
//		arr1[0]=77.3;
//		arr1[1]=84.2;
//		arr1[2]=64.9;
//		arr1[3]=87.2;
//		arr1[4]=77.9;
//		arr1[5]=85.2;
//		arr1[6]=91.7;
//		arr1[7]=81.9;
//		arr1[8]=79.9;
//		arr1[9]=90.5;
//		System.out.println("name1 "+arr1[0]);
//		System.out.println("name2 "+arr1[1]);
//		System.out.println("name3 "+arr1[2]);
//		System.out.println("name4 "+arr1[3]);
//		System.out.println("name5 "+arr1[4]);
//		System.out.println("name6 "+arr1[5]);
//		System.out.println(arr1);
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println("?ɼ?Ϊ"+arr1[i]);
//		}
//		String[] arr2={"??????","??????","???ı?","??˿??","????","????","????"};
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		//??ά????
//	boolean arr3[][]=new boolean[7][5];
//		int arr3[][]= {{1,2,3,4,3,2,1},{5,6,7,8,7,6,5},{9,10,11,12,11,10,9},{13,14,15,16,15,14,13},{17,18,19,20,19,18,17}};
//            for (int i = 0; i <arr3.length; i++) {
//				for (int j = 0; j < arr3.length+1; j++) {
//					System.out.print(arr3[i][j]+"\t");
//				}
//				System.out.println();
//			}
//		int[][] arr3=new int[3][2];
//		   for (int i = 0; i <arr3.length; i++) {
//				for (int j = 0; j <arr3[i].length; j++) {
//					System.out.print(arr3[i][j]+"\t");
//				}
//				System.out.println();
//		
//			}
//		String name1[]= {"???","??????","????","??˿??","??¶¶"};
//		String name2[]= {"????","ŷ????","??????","½??ɫ","?¼???","????"};
//		System.arraycopy(name1, 2,name2, 1, 3);
//		System.out.print("name2:");
//		for(int i=0;i<name2.length;i++){
//			System.out.print(name2[i]+"\t");
//	}//?????ĸ???
//		int[] arr1= {87,78,94,92,89,71,79,82,90,99};
//		int max=arr1[0],x=1;
//		for (int i = 0; i < arr1.length; i++) {
//			if(arr1[i]>max) {
//				max=arr1[i];
//				x=i+1;
//			}
//		}
//		System.out.println("max:"+max);
//		System.out.println("????ֵ??λ???ǵ?"+x+"??");
//	}//??????????ֵ??????ֵλ??
		int[] arr1= {87,78,94,92,89,71,79,82,90,99};
		int max=getmax(arr3);
		System.out.println("max:"+max);
		}
public static int getmax(int[] arr3) {
	int max=arr3[0];
	int x=1;
	for (int i = 0; i < arr3.length; i++) {
		if(arr3[i]>max) {
			max=arr3[i];
		x++;
		}
	}
	return max;
}
}