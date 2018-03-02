package AandA;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {7,2,1,6,3,5,4};
		QuickSort qs = new QuickSort();
		A=qs.sort(A,0,6);
		
		for (int i=0;i<=A.length-1;i++) {
			System.out.println(A[i]);
		}
	}

	public int[] sort(int[] A,int start,int end) {
		if(start<end) {
			int pIndex=partition(A,start,end);
			sort(A,start,pIndex-1);
			sort(A,pIndex+1,end);
		}
		return A;
		
	}
	
	public int partition(int[] A,int start,int end) {
		int pIndex=start;
		int pivot=A[end];
		for(int i=start;i<=end-1;i++) {//not 0 its start and end && end-1
			if(A[i]<=pivot) {
				int temp=A[i];
				A[i]=A[pIndex];
				A[pIndex]=temp;
				pIndex++;
			}
		}
		int temp1=A[pIndex];
		A[pIndex]=A[end];
		A[end]=temp1;
			
		return pIndex;
		
	}

	
}
