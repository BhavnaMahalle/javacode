package methodoverriding;

class Gmail{
	
	void Sign_in() 
	{                               
		
		System.out.println("Sign in with emailid");
				 
	}
}
public class Google extends Gmail {
	
   void Sign_in() {                
		
		System.out.println("Sign in with username");		 
	}

	public static void main(String[] args) {
			

	Google G1 = new Google ();
	G1.Sign_in();	
}
}

// this is a method overriding in which parent sign in method supressed 
//by child sign in method because of same name "sign in"
//so only child method will execute & if you want to execute parent method
//with child method then write super keyward in child method.