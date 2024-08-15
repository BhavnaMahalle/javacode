package package1;

//what happen in different package without becoming subclass(No relation)
public class Class1 {

	public void method1() {                //non static
		System.out.println(" Only public will execute");
	}
	
	protected static void method2() {         //static
	System.out.println("protected will execute");
	}
	 
	private static void method3() {              //static
		System.out.println("Private will not execute");
	}
	
	static void method4() {                //static
		System.out.println("Default will not execute");
	}
}
