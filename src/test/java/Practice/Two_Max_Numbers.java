package Practice;

public class Two_Max_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {26,45,87,4,54,23,5,86,32,79,34,23,56,89,53,9,609,999549,83489,44};
		Two_Max_Numbers(num);
	}

	private static void Two_Max_Numbers(int[] num) {
		// TODO Auto-generated method stub
		int max1 =0;
		int max2=0;
		for (int i=0;i<=num.length-1;i++) {
			if(num[i]>max1) {
				max2=max1;
				max1=num[i];
			}
			if(max2>num[i]) {//check with n
				max2=num[i];
			}
		}
		System.out.println("The max1 Number is : " + max1);	System.out.println("The max2 Number is : " + max2);
	}

}
