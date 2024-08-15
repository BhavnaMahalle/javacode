package method.overloading;

public class NonStatic_Overloading {
	
	 void add() 
	{
	      System.out.println("1");
	}
	
	 void add(int a)
	{
		 System.out.println("2");

	}
	 void add(int a, double b) 
	 {
		 System.out.println("3");

	 }
	  void add(double a, int b)
	 {
		 System.out.println("4");

	 }

	  void add(double a, int b , String name) {
	 
		 System.out.println("5");

	 }
	  
	  
	  void add(int a, int b,int c) {
		  
		  int x=10;
		  int y= 20;
		  int z = 40;
		  
		  System.out.println(x+y+z);
	  }
	public static void main(String[] args) {
	
		NonStatic_Overloading N1 = new NonStatic_Overloading();
		N1.add();
		N1.add(45);
		N1.add(56.9, 990);
		N1.add(650, 99.9);
		N1.add(129.8, 778, "Hi");
		N1.add(10, 20, 40);
	}

}
