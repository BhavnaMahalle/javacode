package string.functions;

import java.util.Arrays;

public class Anagram_Ex3 {

	public static void main(String[] args) {
		String s1 = "race";
		String s2 = "care";
		
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		System.out.println("After sorting : " +Arrays.toString(c1));
		
		Arrays.sort(c2);
		System.out.println( "After sorting : " +Arrays.toString(c2));
		
	boolean b1 = 	Arrays.equals(c1, c2);
	//System.out.println(b1);
	
	if(b1 == true) {
		System.out.println("They are Anagram");
	}
	else {
		System.out.println("They are not Anagram");
	}	
		
		
	}

}
