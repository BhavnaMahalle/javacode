package nonstatic.method;

public class Static_Nonstatic {
	
	static void add()
	{
		System.out.println("addition"); //static
	}
	void sub() {
		System.out.println("subtraction"); //non static
	}
	static void mul() {
		System.out.println("multiplication"); //static
	}
	void divide() {
		System.out.println("division"); // non static
	}
	

	public static void main(String[] args) {
		// static method call by its name
		add();
		mul();
		
		// creating an object for non satic method to call
		
		Static_Nonstatic S1 = new Static_Nonstatic ();
		S1.divide();
		S1.sub();
		
		
	}

}
