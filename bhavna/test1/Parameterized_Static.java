package bhavna.test1;

public class Parameterized_Static {

	static void add(int a, int b) {
		System.out.println("addition");
		System.out.println(a + b);
	}
	static void add (double a,int b) 
	{
		System.out.println(a+b);
	}
	
	static void add (int a,int b, String name) {
		System.out.println("Hellow");
	}
	
	public static void main(String[] args) {
		 add(25, 75);
		 add(9.9,76543);
		 add(90,98,"Hellow");
	}

}
