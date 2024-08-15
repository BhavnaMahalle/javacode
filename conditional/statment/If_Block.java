package conditional.statment;

public class If_Block {

	public static void main(String[] args) {
		
		
     int A = 50;
     int B = 70;
     
     if (A > B) {   // condition is false ,it will not execute
    	 
    System.out.println("A is  Lesser Than B ");	 
    	 
     }
     
     if( A < B) {   // condition is true , it will execute
    	 
    System.out.println(" A is lesser than B");	 
    	 
     }
     
    System.out.println(" I am Back to my main method"); 
    
    // (anything outside the if block not belong to true/ false ,it will execute in both condition)
	}

}
