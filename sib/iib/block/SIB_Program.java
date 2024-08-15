package sib.iib.block;

public class SIB_Program {
	
	static {
		
		System.out.println("SIB ");   //sib
	}

	{
		
		System.out.println("IIB");     //iib
		
	}
	
	SIB_Program(){                     // constructor
		
	   System.out.println("Constructor");
	}
	public static void main(String[] args) {
	
		
		new SIB_Program();
		System.out.println("Main Method");
		new SIB_Program();

	}

}
