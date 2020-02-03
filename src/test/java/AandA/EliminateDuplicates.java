package AandA;

public class EliminateDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = {1,3,5,7,8,2,5,1,6,9,3,6};
		eliminatedup(ia);
	}

	private static void eliminatedup(int[] ia) {
		// TODO Auto-generated method stub
		int shiftleft=0;
		int end=ia.length;
		for (int i=0;i<=end-1;i++) {
			//System.out.println(ia[i]);
			for(int j=i+1;j<=end-1;j++) {
				
				if(ia[j]==ia[i]) {
					//System.out.println(ia[j]+"  "+ ia[i]);
					shiftleft=j;
					for(int k=shiftleft+1;k<=end-1;shiftleft++,k++) {
						ia[shiftleft] = ia[k];
					}
					j--;
					end--;
				}
			}
			
		}
	//Able to print just non duplicates	
		for (int i=0;i<=end-1;i++) {
			System.out.println(ia[i]);
		}
	//Copy the distinct ones in a new array
		
		int newarray[] = new int[end];
		for (int i=0;i<=end-1;i++) {
			newarray[i]=ia[i];
			
		}
		System.out.println("++++++++++++++++");
	//printing from new array
		for (int i=0;i<=newarray.length-1;i++) {
			System.out.println(newarray[i]);
		}
	}

}
