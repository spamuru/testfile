package Practice;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 18;
		fib(18);
	}

	private static void fib(int j) {
		// TODO Auto-generated method stub
		int x=1;
		int y=0;
		int z=0;
		for(int i=0;i<=j;i++) {
			z=x+y;
			System.out.println(z);
			y=x;
			x=z;
		}
	}

}
