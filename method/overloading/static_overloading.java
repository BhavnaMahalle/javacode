package method.overloading;

public class static_overloading {
	
	static void add() 
	{
	      System.out.println("1");
	}
	
	static void add(int a)
	{
		 System.out.println("2");

	}
	 static void add(int a, double b) 
	 {
		 System.out.println("3");

	 }
	 static void add(double a, int b)
	 {
		 System.out.println("4");

	 }

	 static void add(double a, int b , String name)
	 {
		 System.out.println("5");

	 }

	public static void main(String[] args) {
	 add();
     add(500);
     add(250,33.7);
     add(456.7,134);
     add (33.5,667,"Bhavna");
	}

}
