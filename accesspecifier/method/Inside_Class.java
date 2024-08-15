package accesspecifier.method;
//what happen inside one class with different method

public class Inside_Class {
	
	public static void name() {
		System.out.println("Bhavna");
	}
	
	protected static void age() {
	System.out.println("Age:30");
	}
	
	private static void weight() {
		System.out.println("Weight :55");
	}
	
	static void emailid() {
		System.out.println("bhavna.kohale@gmail.com");
	}

	
	public static void main(String[] args) {
		name();
		age();
		weight();
		emailid();

	}

}
