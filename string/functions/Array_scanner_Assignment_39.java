package string.functions;

import java.util.Arrays;
import java.util.Scanner;

//create array of index position 3 of double & boolean datatye and 
//write down their value from scanner class

public class Array_scanner_Assignment_39{

	public static void main(String[] args) {
	
		double percentage[] = new double [3];
		Scanner s1 = new Scanner(System.in);
		
		 for (int i = 0 ; i < 3; i++) {
			 
	          percentage[i] = s1.nextDouble();
		 }
				
		 System.out.println(Arrays.toString(percentage));	
		 
		 boolean b1 [] = new boolean [2];
			 for (int i = 0 ; i < 2; i++) {
				 
		          b1[i] = s1.nextBoolean();
			 }
					
			 System.out.println(Arrays.toString(b1));
	}

}
