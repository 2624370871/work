package class13;

public class Wuze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {87,78,94,92,89,71,79,82,90,99};
int max=arr1[0];
for (int i = 0; i < arr1.length; i++) {
	if(arr1[i]>max) {
		max=arr1[i];
	}
}System.out.println("max:"+max);
	}

}
