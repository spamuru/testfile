package AandA;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = {9,5,7,4,2,8,1,3,6};
		bubbleup(ia);
		noBrainSort(ia);

	}

	private static void bubbleup(int[] ia) {
		// TODO Auto-generated method stub
		for(int i=0;i<ia.length-1;i++) {
			for(int j=i+1;j<ia.length;j++) {
				if(ia[j]>ia[i]) {
					int temp = ia[j];
					ia[j]=ia[i];
					ia[i]=temp;
				}
			}
		}

		for(int i=0;i<=ia.length-1;i++) {
			System.out.println(ia[i]);
		}
	}

	public static void noBrainSort(int[] ia){
		Arrays.sort(ia);
		for(int i=0;i<=ia.length-1;i++) {
			System.out.println(ia[i]);
		}
		for(int i=0;i<=ia.length-1;i++) {
			System.out.println(ia[i]);
		}
	}

}
