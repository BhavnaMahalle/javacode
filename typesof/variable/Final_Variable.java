package typesof.variable;

public class Final_Variable {

	final static double pi = 3.14;  //final global variable
	
	
	public static void main(String[] args) {
		
		final int min = 60 ; // final local variable 
		//its final means nobody can not change is value its fixed
		
		System.out.println(min);
		System.out.println(pi);
	}

}
