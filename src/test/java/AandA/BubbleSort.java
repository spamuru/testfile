package AandA;

public class BubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = {9,5,7,4,2,8,6,1,0,3,45,21,56,78,32};
		bubbleup(ia);
		
	}

	private static void bubbleup(int[] ia) {
		// TODO Auto-generated method stub
		for(int i=0;i<=ia.length-1;i++) {
			for(int j=i+1;j<=ia.length-1;j++) {
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

}
