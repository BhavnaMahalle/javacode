package nonstatic.method;

public class Non_Parameterized {
	
	void add() {
		System.out.println("addition");
	}
	void sub () {
		System.out.println("subtraction");
	}

	public static void main(String[] args) {
		
		Non_Parameterized a1 = new Non_Parameterized();
		a1.add();
		a1.sub();
	}

}
