package scanner;

import java.util.Scanner;

public class Scanner_Class {
	

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner (System.in) ;  
		                                                   // first create an object with
		System.out.println("Enter the value of a");       //parameterized predefined sys.in to import data 
		int a = s1.nextInt();
		
		System.out.println("Enter a value of b");
		int b = s1.nextInt();
     	
		System.out.println("Entre total");
		int sum = a+b;
     	
     	System.out.println(sum);		
	}

}
