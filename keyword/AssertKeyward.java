package keyword;

public class AssertKeyward {

	public static void main(String[] args) {
		int age = 29;
		assert age == 12 :"not eligible";   
		
		// To enable assert keyword  : run as :run configuration : argument : vm argument (-ea)
		// for every class we have to enable it
		
		System.out.println("Eligible");

	}

}
