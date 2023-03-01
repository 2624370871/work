package week15;

public class Wuze {

	public static void main(String[] args) {
//		int a=1;
//		for (int i= 0; i <=20; i++) {
//			a=a*3;
//		}
//		System.out.println(a);
		int[][] arr = {{1,3,5},{2,4,6,8},{44,33,7,10}};
		int max=0,a=0,b=0;
		for (int i = 0; i<arr.length;i++) {
			for (int j = 0; j<arr[i].length;j++) { 
				if(arr[i][j]>max) {
					max=arr[i][j];
					a=i+1;
					b=j+1;
				}
				System.out.print(arr[i][j]+" ");
				}
			System.out.println(" ");
			}	
		System.out.println("最大值为"+max);
		System.out.println("最大值在第"+a+"行"+"第"+b+"列");
	}
}