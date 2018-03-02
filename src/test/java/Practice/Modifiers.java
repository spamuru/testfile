package Practice;

import AandA.Accesers;

public class Modifiers extends Accesers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accesers accesers = new Accesers();
		Modifiers m = new Modifiers();
       //System.out.println(accesers.a); does not work
        System.out.println(accesers.ant);
		//System.out.println(accesers.bat);does not work
		// System.out.println(m.a);//this is default cant access
	        System.out.println(accesers.ant);
			System.out.println(m.bat);
	}

}
