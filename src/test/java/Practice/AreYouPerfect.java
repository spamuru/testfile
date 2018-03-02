package Practice;

public class AreYouPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =28;
		findIfPerfect(num);
	}

	private static void findIfPerfect(int num) {
		// TODO Auto-generated method stub
		int n=num;
		int x=0;
		for (int i=1;i<=num/2;i++) {
			if(num%i==0) {
				x +=i;
			}
		}
		if(x==num) {
			System.out.println(num + " is a perfect number  :) ");
		}else {
			System.out.println(num + " ITS NOT A  PERFECT NUMBER !!!!!  :( ");
		}
	}

}
