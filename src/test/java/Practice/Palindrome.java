package Practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pp= "psudhaBCDEFG";
		char ca[] = pp.toCharArray();
		for (int i=0;i<=ca.length-1;i++) {
			
			if(!(ca[i]==ca[ca.length-(i+1)])) {
				System.out.println("ca " + ca[i]);
				System.out.println("ca[ca.length-(i+1)]" + ca[ca.length-(i+1)]);
			}/*else {
				System.out.println("not a palindrome");
			}*/
			
		}
		
	}

}
