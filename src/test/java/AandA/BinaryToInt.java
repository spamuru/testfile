package AandA;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryToInt  {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the binary number");
	int i = sc.nextInt();
	BinaryToInt bb =new BinaryToInt();
	//int i=0111; // cannot take as int starting with 
	bb.binarytoInt(i);
	
}
public void binarytoInt(int binary) {
	int decimal = 0;
	int pow=1;
	int bi=binary;
	while(bi>0) {
		int rem=bi%10;
		decimal=decimal+rem*pow;
		pow=pow*2;
		bi=bi/10;
	}
	System.out.println(decimal);
}
}
