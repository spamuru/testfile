package AandA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindWithDiff_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ia = {2,9,4,23,8};
		int k=2;
		int length=ia.length-1;
		int start=0;
		//findSetsWithDiff(ia,length,k);
		findSetsWithDiffbyRec(ia,start,length,k);
	}

	private static void findSetsWithDiff(int[] ia,int length,int k)
	{
		List<Integer> la = Arrays.stream(ia).boxed().collect(Collectors.toList());
		
	    Collections.sort(la);
	    int prev = -1;
	    for (int a:la)
	    {
	    	   if (prev == -1)
	    	   { 
	    		   prev = a; 
	    		   continue;
	    		   }
	    	   
	    	   if ((a-prev) <= k) {
	    		   System.out.println("Prev:" + prev + "Next:" + a);   
	    	   }
	    	   prev = a;
	    }
	}
	static  List<Integer> lla = new ArrayList<Integer>();
	
			static void findSetsWithDiffbyRec(int[] ia,int start,int length,int k) {
				if(start==length) {
					return;
				}
				
				if(lla.isEmpty()) {
		 lla = Arrays.stream(ia).boxed().collect(Collectors.toList());
		 Collections.sort(lla);
				}
		 if (start!=0) {
			 if(lla.get(start) - lla.get(start-1) <=k) {
				 System.out.println(lla.get(start-1) + " " + lla.get(start));
			 }
			  
		 }
		 findSetsWithDiffbyRec(ia,start+1,length,k);
	}
}
