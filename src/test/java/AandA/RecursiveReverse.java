package AandA;

public class RecursiveReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "z*yxwvutsrqponmlkjihgfedcb+a";
		RecursiveReverse r = new RecursiveReverse();
		System.out.println(r.reversing(str));
		
	}
	String reverse="";
	public String reversing(String str) {
		
		// TODO Auto-generated method stub
		if(str.length()==1) {
			return str;
		}
		else {
			reverse += str.charAt(str.length()-1)+reversing((str.substring(0, str.length()-1)));
			 return reverse;
		}
		
		
}

}

