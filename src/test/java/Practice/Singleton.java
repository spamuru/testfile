package Practice;

public class Singleton {

	private Singleton() {
		//constructor made private
	}
	public static Singleton a = null;
	
	 public static Singleton getInstance() {
		 if(a == null) {
			 a=new Singleton();
		 } 
			 return a; 
	 }
	
}
