package constructor;

public class Amazon {
	
          // access specifier : default
           // modifier : non static
           // return type : no return type
           // method : amazon
          // argument : non para
	
	Amazon()  // whaterver the class name is the constructor name   
       {
    	 System.out.println("Login to Amazon");  
       }
       
     
	public static void main(String[] args)
	{
		
      // constructor can be call just by creating an object

		
		Amazon A1 = new Amazon();
		Amazon A2 = new Amazon();
	
		// other way to call constructor 
		
		new Amazon ();
	   }

      }
