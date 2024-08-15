package string.functions;

import java.util.Arrays;

public class Array_Assignment {

	public static void main(String[] args) {
		
		char gender[] = new char[2];
		gender[0] = 'M' ;
		gender[1] = 'F' ;
		
		System.out.println(Arrays.toString(gender));
		
		
	   boolean myanswer[] = new boolean[5];
	   myanswer[0] = true ;
	   myanswer[1] = true ;
	   myanswer[2] = false ;
	   myanswer[3] = false ;
	   myanswer[4] = true ;
	   
	   System.out.println(Arrays.toString(myanswer));
	}

}
