package AandA;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = {9,5,7,4,2,8,6,1,0,3,45,21,56,78,32};
		insertselected(ia);

	}

	private static void insertselected(int[] ia) {
		// TODO Auto-generated method stub
		int j=0;
		for(int i=1;i<=ia.length-1;i++) {
			j=i;
			while(j>0 && ia[j]<ia[j-1]  ) {
				int temp =ia[j];
				ia[j]=ia[j-1];
				ia[j-1]=temp;
				j--;
				
			}
		}
		for(int i=0;i<=ia.length-1;i++) {
			System.out.print(ia[i]+ " , ");
		}
	}

}
