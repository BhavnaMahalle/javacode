package assingments;

import java.util.Scanner;

public class Assignment_8 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner (System.in) ;
	
		System.out.println("Fill the Information");
		System.out.println("Fist Name");
		String firstname = s1.next();
		
		System.out.println("Last Name");
		String lastname = s1.next();
		
		System.out.println("Email");
		String emailid = s1.next();
				
		System.out.println("Passward");
		String passward = s1.next();
		
		System.out.println("Current Address");
		String currentaddress = s1.next(); 
		 
		s1.nextLine();
		System.out.println("Permanent Address");
		String permanantaddress = s1.next();
		
		s1.nextLine();
		System.out.println("Pincode");
		String pincode = s1.next();
	
		
	}

}
