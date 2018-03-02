package AandA;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort ms = new MergeSort();
		int[] A = {2,5,9,8,7,4,1,3,6,34,0,25,43,12};
		int[] B =ms.mergeSort(A);
		for(int i=0;i<=B.length-1;i++) {
			System.out.println(B[i]);
		}

	}
	int[] B;
	public int[] mergeSort(int[] A) {
		
		int fulllength=A.length;
		int middlelength=A.length/2;
			if(fulllength<2) {
				return A;
			}else {
				int[] LA = new int[middlelength];
				int[] RA = new int[fulllength-middlelength];

				for(int i=0;i<=middlelength-1;i++) {
					LA[i]=A[i];
				}

				for(int i=middlelength;i<=fulllength-1;i++) {
					RA[i-middlelength] = A[i];
				}
				
				mergeSort(LA);
				mergeSort(RA);
				
				 B = Merge(LA,RA,A);
			}
		return B;
	}
	
	
	public int[] Merge(int[] LA,int[] RA, int[] A) {
		int ll=LA.length;
		int rl=RA.length;
		int i=0,j=0,k=0;
		
		while(i<ll && j<rl) {
			
			if(LA[i]<=RA[j]) {
				A[k]=LA[i];
				k=k+1;
				i=i+1;
			}
			else {
				A[k]=RA[j];
				k=k+1;
				j=j+1;
			}
		}
		
		while(i<ll) {
			A[k]=LA[i];
			k=k+1;
			i=i+1;
		}
		
		while(j<rl) {
			A[k]=RA[j];
			k=k+1;
			j=j+1;
		}
		
		return A;
	}
}
