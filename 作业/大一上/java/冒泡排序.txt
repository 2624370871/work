package week14;

public class Wuze1 {
public  static	int demo(int []number) {
	for (int i = 0; i < number.length; i++) {
		int temp=0 ;
		for (int j = number.length-1; j>0;j--) {
			if(number[j]>number[j-1]) {
			temp=number[j-1];
			number[j-1]=number[j];
			number[j]=temp;
			}
		}
		System.out.print("µÚ"+(i+1)+"ÅÅĞòºó");
		for (int i1 = 0; i1 < number.length; i1++) {
			System.out.print(number[i1]+"");
		}
		System.out.println("");
	}
	return 0;
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[]number = {3,6,7,9,1,8,5,2,4};
	System.out.print("ÅÅĞòÇ°");
	for (int i = 0; i < number.length; i++) {
		System.out.print(number[i]+"");
	}
	System.out.println("");
	demo(number);
}

}