package string.functions;

import java.util.Arrays;

// how many numbers present in given string
public class Numeric_IsDigit {
     
	
	public static void main(String[] args) {
	 
	   int count_of_numeric =0;
		String input = "Name123";
				
		char c1[] = input.toCharArray()	;
		
		System.out.println(Arrays.toString(c1));
		
		for(int i = 0 ; i < input.length();i++) {
		
	
		boolean b1 = Character.isDigit(c1[i]);
		
		
		if(b1==true) {
			
			count_of_numeric++;
		}
		
		}
		
		System.out.print(count_of_numeric); 
	}

}
