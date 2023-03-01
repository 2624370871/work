package week142;

public class Wz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum[][]= {{7,5,8},{4,8,1},{6,9,3}};
		int a=0,b=0;
		for (int i = 0; i < sum.length; i++) {
			b=0;
			for (int j = 0; j < sum.length; j++) {
				b=b+sum[i][j];
			}
			System.out.println("ตฺ"+(i+1)+"ื้"+b);
		}System.out.println();
	}

}
