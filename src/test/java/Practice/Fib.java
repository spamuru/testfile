package Practice;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 18;
		fib(18);
		//System.out.println(fibRecursive(num));
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

	public static long fibRecursive(long n) {
		if ((n == 0) || (n == 1))
			return n;
		else
			return fibRecursive(n - 1) + fibRecursive(n - 2);
	}

}
