package bhavna.test1;

public class Add_Sub_Mul_Div {
	
	// multiple method which is exacute by calling main method
	
	static void add() {
	
	 int no1 = 40;
	 int no2 = 20;
     int addition = no1 + no2 ;
     System.out.println(addition);
	}
	
	static void sub() {
	
	  int no1 = 40;
	  int no2 = 20;
	  int subtraction = no1 - no2 ;
	     System.out.println(subtraction);	
	}
	
	static void mul() {
		
		  int no1 = 40;
		  int no2 = 20;
		  int multiply = no1 * no2 ;
		     System.out.println (multiply);	
		     
		}
	
	static void div() {
		
		  int no1 = 40;
		  int no2 = 20;
		  int divide = no1 / no2 ;
		     System.out.println(divide);	
		}
	
	static void modulus() {
		
		  int no1 = 40;
		  int no2 = 20;
		  int modulus = no1 % no2 ; // 4/2 , Q=2, R = 0
		     System.out.println(modulus);	
		}

	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		div();
		modulus();
		    
	          
	 
	}

}
