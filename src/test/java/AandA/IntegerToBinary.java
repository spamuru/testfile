package AandA;

import java.util.Scanner;

public class IntegerToBinary {
	public static void main(String[] args) {
		/*45  000101101*/
		String s="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer");
		int num=scanner.nextInt();
		while(num>0) {
			if(num%2==1) {
			s='1'+s;	
			}
			if(num%2==0) {
				s='0'+s;
			}
			num=num/2;
		}
		System.out.println(s);
	}

}
