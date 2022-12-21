package project_Training_day1;
interface interf{

	default void m1() {
		System.out.println("default method");
	}
	
	public static void m2() {
		System.out.println("static method");
	}
}
class interf1 implements interf{

}

public class default_static_method {
	
	public static void main(String [] args) {
		interf1 obj  = new interf1();

		obj.m1();
		interf.m2();
		
	}
}

