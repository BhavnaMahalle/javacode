package accesspecifier.method;

// inside package but 2 different class :only private method will not execute 

public class Class2 {

	public static void main(String[] args) {
		
		Class1.addition();   // public method
		Class1.multiply();   //default method
		Class1.subtract();   //protected method
	}

}

