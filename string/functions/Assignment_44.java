package string.functions;

import java.util.Arrays;

public class Assignment_44 {
	// find out how many alphabets present in given string
	
     
	public static void main(String[] args) {
	    int count_of_alpha = 0 ;
		String name = "50cent";
		 char c1 [] = name.toCharArray();
		 
		 System.out.println(Arrays.toString(c1));
		 
		 for (int i = 0;i < name.length(); i++) {
			 
			 boolean b1 = Character.isAlphabetic(c1[i]);
			 // System.out.println(b1); 
			 
			 if(b1== true) {
				 
				 count_of_alpha++;
			 }
		 }
		 		 
        System.out.println(count_of_alpha);
	}

}
