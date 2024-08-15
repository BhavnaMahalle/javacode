package typesof.variable;

public class Global_Variable_Nonstatic {
      
      double pi = 3.14; // both nonstatic global variable
	  int no_of_days;  //  global variable has default value as 0
     
       void add () {
    	   
    	   System.out.println(pi);
    	   
       }
	  public static void main(String[] args) {
		
		
		Global_Variable_Nonstatic G1 = new Global_Variable_Nonstatic(); //nonstatic variable calling 
		                                                                //by creating object
		System.out.println(G1.no_of_days);
		
		G1.no_of_days =365;  // update the value
		System.out.println(G1.no_of_days);
		
		G1.add();
		
	  }
}
