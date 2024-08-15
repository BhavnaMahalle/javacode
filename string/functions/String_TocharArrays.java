package string.functions;

import java.util.Arrays;

public class String_TocharArrays {

	public static void main(String[] args) {
		
		String name = "Anaya";
		char [] a1 = name.toCharArray();
		
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		System.out.println(a1[3]);
		System.out.println(a1[4]);
		
		//OR
		
		System.out.println(Arrays.toString(a1));
		
		//OR
		
		System.out.println(Arrays.toString(name.toCharArray()));
		
	}

}
