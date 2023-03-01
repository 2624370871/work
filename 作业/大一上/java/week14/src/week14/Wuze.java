package week14;

import java.util.logging.Formatter;

public class Wuze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1= {87,78,94,92,89,71,79,82,90,99};
//		int max=arr1[0];
//		for (int i = 0; i < arr1.length; i++) {
//			if(arr1[i]>max) {
//				max=arr1[i];
//			}
//		}System.out.println("max:"+max);
//		int[] arr= {87,78,94,92,89,71,79,82,90,99};
//			int max =arr[0];
//			int count=0;
//			for(int i=0;i<arr.length;i++) {
//				if(arr[i]>max) {
//					max=arr[i];
//					count=i+1;
//				}
//				
//	}
//	System.out.print("最大值"+max+"在第"+count+"个");//最大值及其位置
		int[] arr1= {2,1,5,9,4,7};
		for (int i = 0; i < arr1.length; i++) {
			int temp=0;
			for (int j = arr1.length-1; j>0;j--) {
				if(arr1[j]>arr1[j-1]) {
				temp=arr1[j];
				arr1[j]=arr1[j-1];
				arr1[j-1]=temp;
			}
		}
		}
		System.out.print("排序后：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
}
}