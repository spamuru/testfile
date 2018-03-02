package Practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=27;
		isPrime(num);
	}

	private static void isPrime(int num) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				x=x+1;
			}
		}
		if (x>0) {
			System.out.println("ITS NOT A PRIME NUMBER !! ");
		}else {
			System.out.println("ITS A PRIME NUMBER !! ");
		}
	}

}
