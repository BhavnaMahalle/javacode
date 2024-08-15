package typecasting.program;

public class Narrowing {

	public static void main(String[] args) {
		//it can  be done only explicit manner
		//convert double to int
		
		double wt = 54.33;
		int a1 = (int) wt;
		System.out.println(a1);
		
		//or
		
		int a2 = (int) 53.44;
		System.out.println(a2);
		
		
	}

}
