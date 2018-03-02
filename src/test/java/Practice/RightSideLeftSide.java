package Practice;

public class RightSideLeftSide {
	
	public static void main(String[] args) {
		
		int[] ia = {1,2,3,4,5,6,1,5,6,4,3,2};
		int right; //right should be reset every time
		int left=0;
		for (int i=0;i<=ia.length-1;i++) {
			left = left+ia[i];
			right=0;
			for (int j=i+1;j<=ia.length-1;j++) {
				right = right+ia[j];
			}
			if(left==right){
				System.out.println("the index is " + ia[i] + " at " + i + "th position");
				break;	
			}
			
		}
		
	}

}
