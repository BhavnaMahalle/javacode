package typecasting.program;

public class widning {

	public static void main(String[] args) {
		//convert int to double
		// it can be done implicit and explicit manner
		
		int a = 100;
		double wt = a;
		System.out.println(wt);     // implicit widning
		 
		int a1 = 26;
		double height = (double) a1;
		System.out.println(height);    //implicit widning
		

	}

}
