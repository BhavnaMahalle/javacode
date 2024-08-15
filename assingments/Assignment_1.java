package assingments;

public class Assingment_1 {
	
	//how to call static method in main method
	
	static void  add() {
	
		System.out.println("addition");
		System.out.println("1+1");
	}

	static void sub() {
		
		System.out.println("substraction");
	
	}
	
	static void mul() {
		
		System.out.println("multiplication");
	}
public static void main(String[] args) {
	
	System.out.println("main method");
    add();
    sub();
    mul();
    System.out.println("main method");
    add();
    
}	
}
