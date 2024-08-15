package package1;
//What happen outside the pacakge with becoming subclass
//(relation create with extends keyword) -calling nonstatic method

public class NonStatic_Parent {
	
	public void method1() {                // non static
		System.out.println("public will execute");
	}
	
	protected void method2() {         //non static
	System.out.println("protected will execute");
	}
	 
	private void method3() {              // non static
		System.out.println("Private will not execute");
	}
	
	 void method4() {                //non  static
		System.out.println("Default will not execute");
	}

}
