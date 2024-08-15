package string.functions;

import java.util.Arrays;

public class Special_Charecters {

	public static void main(String[] args) {
		
		
		 
		  int alphabates = 6;
		  int number = 2;
		  int space = 1;
			
		    String input = "Bhavna11 #@%$@";
					
			char c1[] = input.toCharArray()	;
			
			System.out.println(Arrays.toString(c1));
			
			for(int i = 0 ; i < input.length();i++) {
			
			}
			
			
			
			int special_character = input.length() - (alphabates + number + space);
			
			System.out.print(special_character); 
	}

}

