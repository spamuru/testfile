package Practice;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=430021;
		int temp=430021;
		int reversenum=0;
		while(temp>0) {
			reversenum=reversenum*10 + (temp%10);
			temp=temp/10;
		}
		System.out.println(reversenum);
	}

}
