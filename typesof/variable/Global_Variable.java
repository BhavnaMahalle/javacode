package typesof.variable;

public class Global_Variable {
	
	static double pi = 3.14;   //static global variable
	static String name; //default value
	
	
	static void daughter() {
		int radius = 10;
		double areaofcircle = pi * radius * radius;
		System.out.println(areaofcircle);
	}

	public static void main(String[] args) {
		
		int r = 7 ;      // local variable
		double area = pi * r * r;
		System.out.println(area);
		
		daughter();
	    
		System.out.println(name);
		
		
	}

}
