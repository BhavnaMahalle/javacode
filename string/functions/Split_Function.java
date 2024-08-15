package string.functions;

import java.util.Arrays;

public class Split_Function {

	public static void main(String[] args) {
		
		String intro = "my name is khan";
		
		String [] a1 = intro.split(" ");
		String [] a2 = intro.split(" ", 3);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		


	}

}
