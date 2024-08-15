package practice.classes;

public class TryCatchExample {
	
	public static void main(String[] args) {
		
	System.out.println("start of the program");
	
	method1();
	
	System.out.println("end of main method..");

	}
	
	public static void method1(){
		System.out.println("in method 1");
		
	try {
		
//		int a = 1/0;
//		System.out.println("value of a  : "+a);
		 throw new ArithmeticError("Getting error beacuse you are trying to devide by zero");
		
	} catch (ArithmeticError exception) {
		// TODO: handle exception
		System.out.println("Error in method1 : "+exception);
	} 
	finally {
		
		System.out.println("in finally block.......");
	}
		
	
	
		
		System.out.println("finish executing method1");
	}

}
