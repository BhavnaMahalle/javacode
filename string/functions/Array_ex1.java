package string.functions;

import java.util.Arrays;

public class Array_ex1 {
	
public static void main(String[] args) {
	String name [] = new String [3];
	name[0] = "Bhavna";
	name[1] = "Suraj";
	name[2] = "Anaya";
	
	System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);
	
	//OR
	
	for(int i = 0;i<=2;i++)
	{
		System.out.println(name[i]);
	}
	
	
	//OR
	
	System.out.println(Arrays.toString(name));
	//This output is actually in form of array 
	
}	
	
	

}
