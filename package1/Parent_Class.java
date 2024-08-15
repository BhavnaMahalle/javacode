package package1;
//What happen outside the pacakge with becoming subclass
//(relation create with extends keyword)- calling static method

public class Parent_Class {
	public static void method1() {                // static
		System.out.println("public will execute");
	}
	
	protected static void method2() {         //static
	System.out.println("protected will execute");
	}
	 
	private static void method3() {              // static
		System.out.println("Private will not execute");
	}
	
	 static void method4() {                // static
		System.out.println("Default will not execute");
	}
}
  