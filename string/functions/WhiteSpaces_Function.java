package string.functions;

import java.util.Arrays;

public class WhiteSpaces_Function {

	public static void main(String[] args) {
		
		    int count_of_space =0;
			
		    String input = "17 july 2018";
					
			char c1[] = input.toCharArray()	;
			
			System.out.println(Arrays.toString(c1));
			
			for(int i = 0 ; i < input.length();i++) {
			
		
			boolean b1 = Character.isWhitespace(c1[i]);
			
			
			if(b1==true) {
				
			count_of_space++;
			}
			
			}
			
			System.out.print(count_of_space); 
		}	

	}


