
package inheritance;


// non static example

class Alphabete_Auth  // grandparent
{
      void auth1() {
    	    
    	  System.out.println("1");
      }	
}

class Amz_Google_Auth extends Alphabete_Auth{ //father
       void auth2() 
       {
    	
    	 System.out.println("2");  
       }
       
}

public class Amazon_Website extends Amz_Google_Auth {  //child
	
	   void auth3() {
		   
		   System.out.println("3");
	   }

	public static void main(String[] args) {
		
		Amazon_Website A1 = new Amazon_Website();
		A1.auth3();
		A1.auth2();
		A1.auth1();

		
	}

}
