package Practice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = {1,3,5,6,8,23,45,67,78,87,98,101};
		int n = 67;

		int high=ia.length-1;
		int low=0;
		
		 while (low<=high) {
			 int middle=(low+high)/2;//middle should be declared inside low +high should be inside bracket
			 if(n>ia[middle]) {
				 low=middle+1;
				 System.out.println("low:" + low);
			 }else if(n<ia[middle]) {
				 high=middle-1;
				 System.out.println("high:" + high);
			 }else {
				 System.out.println("number 67 is present at the index " + middle); //break in main class or return from a method
				break;
			 }
		 }
		
	}

}
