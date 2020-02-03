package AandA;

public class Modifiers extends Accesers {
	public void test(){
		//no need class declaration here
		System.out.println(a);
		System.out.println(ant);
		System.out.println(bat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Need class declaration here
		Accesers accesers = new Accesers();
		System.out.println(accesers.a);
		System.out.println(accesers.ant);
 		System.out.println(accesers.bat);

	}

}
