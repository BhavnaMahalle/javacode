package methodoverriding;

import java.util.Scanner;

class Fecebook{
	void Login() {                 //method overridden
		
		System.out.println("Login through emailid");
		
		 Scanner s1 = new Scanner(System.in);
		 System.out.println("Entre email id");
   	     String emailid = s1.next(); 
	}
}

public class MethodOverride extends Fecebook {
	
     void login() {
    	 
    	 super.Login();        //super keyword to call parent method
    	 System.out.println("Login through mobile number");
    	 
    	 Scanner s1 = new Scanner(System.in);
    	 System.out.println("Entre mobile number");
    	 int mobilenumber = s1.nextInt(); 
    	 
     }  
	public static void main(String[] args)
	{
		
		MethodOverride M1 = new MethodOverride();
    	M1.login();		
	}

}
