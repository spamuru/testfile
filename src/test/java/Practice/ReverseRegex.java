package Practice;

public class ReverseRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "e1lep,hant";
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
		StringBuilder sbb = new StringBuilder(str);
		
		System.out.println(sbb.reverse());
		char[] ca = str.toCharArray();
		
		for (int i=ca.length-1;i>=0;i--) {
			System.out.print(ca[i]);
		}
		System.out.println();
		for (int i=ca.length-1;i>=0;i--) {
		if((ca[i] >= 'A' &&  ca[i] <= 'Z') || (ca[i] >= 'a' &&  ca[i] <= 'z')) {
			System.out.print(ca[i]);
		}
		}
	}

}
