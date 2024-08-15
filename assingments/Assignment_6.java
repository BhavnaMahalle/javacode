package assingments;

public class Assignment_6 {
	
//write a program to calculate the area and circumference of circle by using final global variable pi
	
	final static double pi = 3.14;  // final global variable
	 static int r = 8;  // radius can be change so i am not making it as final global variable, its just global variable.
	
	static void area()
	{
		
	double area = pi * r * r ;
	System.out.println(area);
	}
	  
	static void circumference()
	{
			
	double circumference = 2 * pi * r ;	
    System.out.println(circumference);
  
	}

	public static void main(String[] args) {
		
		area();
		circumference();
			
	}

}
