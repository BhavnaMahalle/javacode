package typesof.variable;

public class Local_Variable {

	void add () {     // inside non static method
		int a = 100;
		int b = 50;
		int add = a+b;
		System.out.println(add);
	}
	
	static void div() {    // inside static method
		int a = 70 ;
		int b = 30;
		int div = a/b;
		System.out.println(div);
	}
	public static void main(String[] args) {
		  
		//any variable which is declare inside the method c/a local variable
		
		
		int a = 30;   // inside main method
		
		//method calling
		
		Local_Variable G1 = new Local_Variable ();
		G1.add();
		div();
		System.out.println(a);
		
		
		
	}

}
