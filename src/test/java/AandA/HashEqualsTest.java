package AandA;

import java.util.HashMap;
import java.util.Map;

public class HashEqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name a = new Name(10);
		Name a1 = new Name(10);
		a.equals(a1);
		
       Map<Name,Integer> map = new HashMap<Name,Integer>();
       map.put(a, 1);
       map.put(a1, 2);
       
       System.out.println(map);
	}

}

class Name{
	
	int i;
	
public Name(int i) {
	
	this.i=i;
}
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
public boolean equals(Object o) {
	
	if(o!=null && o instanceof Name) {
		int n=((Name)o).getI();
		if(n==this.getI()) {
			return true;
		}
	}
	System.out.println("false");
	return false;
	
}

public int hashCode() {
	//System.out.println(this.i.hashCode() );
	
	return this.i;
}
}