package methodoverriding;
 //make a parent method as final and checkout
  class Sign_in{
	
	  void Registration() { 
		  
		  //write a final keyword in front of parent method and checkout error that
		  //final method cannot override
		
		System.out.println("Register via mobile number");
	}
  }

 public class Final_MethodOverriding extends Sign_in {
	
	 void Registration() {
		 
		super.Registration();
		System.out.println("Register via email");
	}

	public static void main(String[] args) {
		
		Final_MethodOverriding F1 = new Final_MethodOverriding();
		F1.Registration();
	}

}
