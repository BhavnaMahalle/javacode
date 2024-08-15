package inheritance;

class Father{
	    
	   static void house() 
	   {
		 System.out.println("Father have house");  
	   }
	   
	   static void car() 
	   {
		System.out.println("Father have car");      
	   }
	
	
}

public class SingleLevel_Inheritance extends Father  {  // Child Class    // write extend and the classname from which you want property
	
	    static void laptop()
	    {
	    	System.out.println("Son have laptop");
	    }
	    
	    static void bike() 
	    {
	    	System.out.println("Son have bike");
	    }

	public static void main(String[] args) {
		
      laptop();
      bike();
      car();
      house();
      
	}

}
