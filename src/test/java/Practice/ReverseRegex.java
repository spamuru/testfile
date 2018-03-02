package Practice;

public class ReverseRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "e1lep,hant";
		char[] ca = str.toCharArray();
		String rstr="";
		for (int i=ca.length-1;i>=0;i--) {
		if((ca[i] >= 'A' &&  ca[i] <= 'Z') || (ca[i] >= 'a' &&  ca[i] <= 'z')) {
			System.out.print(ca[i]);
			rstr+=ca[i];
		}
		}
		System.out.println();
		System.out.print(rstr);
		
	}

}
