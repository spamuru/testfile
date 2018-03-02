
public class Prefix_Suffix {

	public static void main(String[] args) {
		

		String a = "sanbnckd";
		int[] k=new int[256];
		for(int i=0;i<=a.length()-1;i++) {
			k[a.charAt(i)-'a']++;
		}
		
		
		
		
		/*
	
		// TODO Auto-generated method stub
		String a = "abcdef";
		String b="ghijklghijkl";
		char[] ca =a.toCharArray();
		
		String c = a.substring(0, 5) + b.substring(b.length()-5);
		//System.out.println(c);
		
        for(int i=0;i<=(ca.length-1)/2;i++) {
        	System.out.println(i);
        ca[i]=	(char) (ca[i] ^ ca[ca.length-(1+i)]);
        ca[ca.length-(1+i)]=	(char) (ca[i] ^ ca[ca.length-(1+i)]);
        	ca[i]=	(char) (ca[i] ^ ca[ca.length-(1+i)]);
        	
        }
		System.out.println(new String(ca));
		

	*/
		}

}
