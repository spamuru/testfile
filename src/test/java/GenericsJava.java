import java.util.ArrayList;
import java.util.List;

public class GenericsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ia = {1,2,3,4,5};
		String[] sa = {"sai","baba"};
		
		printArray(ia);
		printArray(sa);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(6);
		System.out.println(nums);
		nums.add(0,4);
		System.out.println(nums);
		
	}
	public static <T> void printArray(T[] input) {
		for(T ele:input) {
			System.out.print(ele); 
		}
	}
}
