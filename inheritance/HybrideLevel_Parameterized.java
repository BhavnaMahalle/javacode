package inheritance;



class Parent_Class {	
 
    Parent_Class (int a){      // constructor parent method
		
		System.out.println("Parent Constructure ");
	}
	
}


public class HybrideLevel_Parameterized extends Parent_Class{
	 
	HybrideLevel_Parameterized (){     // constructor child method
	     
			super(25);   //because parent constructor is para we need to pass value in super calling 
			
			System.out.println("Child Constructor");
	}
			
			
	public static void main(String []args) {	
	      
		new HybrideLevel_Parameterized ();
	
}
}