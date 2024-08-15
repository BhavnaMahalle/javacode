package string.functions;

import java.util.Arrays;

//check if two strings equal or not

public class TocharArrray_ex1 {
	
	public static void main(String[] args) {
		
	String name [] = new String [3];
	name[0] = "Bhavna";
	name[1] = "Suraj";
	name[2] = "Anaya";
	
	
	String name1 [] = new String [3];
	name1[0] = "Ram";
	name1[1] = "Lakshaman";
	name1[2] = "Sita";
	
	String name2 [] = new String [3];
	name2[0] = "Bhavna";
	name2[1] = "Suraj";
	name2[2] = "Anaya";
	
	System.out.println(Arrays.equals(name, name1));
	System.out.println(Arrays.equals(name, name2));
	
		
		
	}

}
