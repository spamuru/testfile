package Practice;

public class SwappingInsideArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sa[] = {"sa","re","ga","ma","pa","da","ne","sa"};
		String temp;
		for (int i=0;i<=(sa.length-1)/2;i++) {
			temp=sa[i];
			sa[i]=sa[(sa.length-1)-i];
			sa[(sa.length-1)-i]=temp;
		}
		for (int i=0;i<=(sa.length-1);i++) {
			System.out.println(sa[i]);
		}
	}

}
