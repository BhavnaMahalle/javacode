package string.functions;

import java.util.Arrays;
// lets copy one array into another array using iteration
public class ReverseString_Ex2 {

	public static void main(String[] args) {
		int input [] = new int[3];
		input[0] = 89;
		input[1] = 11;
		input[2] = 56;
		
		int output[] = new int[3];
		
		for (int i = 0; i<=2; i++) {
			
			output[i] = input[i];
		}
		
		System.out.println(Arrays.toString(input));
		
		System.out.println(Arrays.toString(output));
		
	}

}
