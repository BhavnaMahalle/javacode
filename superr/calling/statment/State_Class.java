
package superr.calling.statment; //non parameterized super()

//Constructor can never be inherited but you can inherit it
//with the help of super()statement,it can be present implicitly & explicitly
  
class City_Class{
	   
	   City_Class(){         //constructor
		   
		System.out.println("City Class Constructor"); 
		   
	   }
   }
   public class State_Class extends City_Class {
	
	State_Class(){            //constructor
		
		super();             //implicitly & explicitly
		System.out.println("State Class Constructor");
		
	}

	public static void main(String[] args) {
		
		new State_Class();
		
	}
	
	
}
