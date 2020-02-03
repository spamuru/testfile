package testfile.testfile;

public class Child extends Adult {
	int ci = 3;
	void child_test() {
		System.out.println("childtest");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child c = new Child();
      Human H = new Child();
      Adult A = new Child();
      Human nc = new Human();
      
    int d = c.au;
    //since Child has extended Adult and Adult has extended Human . Now Child can access all the methods as its own .
		// SO sepearte the methods in different packages but use it by extending them.
//by creating Human H = new child we are passing common object and can instantiate any method based on child that is coming in .
  
	}

}
