package AandA;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = {9,5,7,4,2,8,6,1,0,3,45,21,56,78,32};
		selectup(ia);
	}

	private static void selectup(int[] ia) {
		// TODO Auto-generated method stub
		int least;
		int temp;
		
		for(int i=0;i<ia.length-1;i++) {
			least=i;
			for(int j=i+1;j<=ia.length-1;j++) {
				if(ia[j]<ia[least]) {
					least=j;
					}
			}
			temp=ia[i];
			ia[i]=ia[least];
			ia[least]=temp;
		}
		
		for(int i=0;i<=ia.length-1;i++) {
			System.out.println(ia[i]);
		}
	}

}
