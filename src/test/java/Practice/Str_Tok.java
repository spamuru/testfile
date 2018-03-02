package Practice;

import java.util.StringTokenizer;

public class Str_Tok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The dog has two legs , two eyes, one tail and two ears";
		StringTokenizer st=new StringTokenizer(s," ");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
