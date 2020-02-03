package Practice;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {26,45,87,4,54,23,5,86,32,79,34,23,56,89,53,9,609,8549,83489,44};
		MinMax(num);
	}

	private static void MinMax(int[] num) {
		// TODO Auto-generated method stub
		int min=num[0];
		int max=num[0];
		for (int i=0;i<=num.length-1;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("The max Number is : " + max);	System.out.println("The min Number is : " + min);
	}

}
