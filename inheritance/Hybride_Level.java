package inheritance;

class State_Class{
	

      State_Class(){
		
		System.out.println("Constructure 1");
	}
	
	
}

public class Hybride_Level extends State_Class {
	
	    Hybride_Level(){
	     
		super();  // implicitly & explicitly  
		// non parameterized super calling because parent constructor
		System.out.println("Constructor 2");
		
	}
	

	public static void main(String[] args) {
		
		new Hybride_Level();
		

	}

}
