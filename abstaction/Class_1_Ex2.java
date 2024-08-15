package abstaction;

import accesspecifier.method.Class1;
import accesspecifier.method.Class2;

abstract class Class_3{             // 2AM
	
	abstract void add();
	abstract void mul();
}
 class Class_2 extends Class_3 {                     // 2CM

    void login() 
    {
    	
    System.out.println("login");	
    }
   
    static void logout() 
    {
     System.out.println("logout");	
    }

	@Override
	void add() {
		
		System.out.println("Addition");
	}

	@Override
	void mul() {
		
	System.out.println("Multiply");	
	}
    
}
public class Class_1_Ex2 extends Class_2 {
	
	 void voice_chat() 
	    {
	    	
	    System.out.println("Voice Chat");	
	    }
	   
	    static void vedio_chat() 
	    {
	     System.out.println("Vedio Chat");	
	    }
	

	public static void main(String[] args) {
		
		Class_1_Ex2 C1 = new Class_1_Ex2 ();
		C1.voice_chat();         //non static
		vedio_chat();            //static
		C1.add();                //non static
		C1.mul();                //non static
		C1.login();              //non static
	     logout();               //static
		
	  
		
		

	}

}

// here i am additing unimplemted method in my parent class from granparent class
//but if want to add it in your child class then you have to make your parent class
//as abstract class by writting abstract in front of it and then only 
//you can use unimplemented method of grandparent class
