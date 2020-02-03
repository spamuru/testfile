package AandA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashEqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name a = new Name(10,5);
		Name a1 = new Name(10,7);
		System.out.println(a.equals(a1));
		
       Map<Integer,Name> map = new HashMap<Integer,Name>();
       map.put(1, a);
       map.put(2, a1);

		Iterator<Map.Entry<Integer,Name>> i = map.entrySet().iterator();
		while(i.hasNext()){
			Name x = i.next().getValue();
			int y = x.getI();
            System.out.println(y);

		}
	}

}

class Name{
	
	int i;
	int m;
	
public Name(int i,int m) {
	
	this.i=i;
	this.m=m;
}
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	
public boolean equals(Object o) {
	
	if(o!=null && o instanceof Name) {
		int n=((Name)o).getI();//if you compare with M , it will show as objects not equal
		if(n==this.getI()) {
			return true;
		}
	}
	System.out.println("false");
	return false;
	
}

public int hashCode() {
	return this.m;
}
}