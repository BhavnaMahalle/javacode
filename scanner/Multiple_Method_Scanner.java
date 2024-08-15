package scanner;

import java.util.Scanner;

public class Multiple_Method_Scanner {

	public static void main(String[] args) {
		
    Scanner s1 = new Scanner(System.in);
    
       System.out.println("Entre Name");
       String name = s1.next();
       
       System.out.println("Entre Birth year");
       int birthyear = s1.nextInt();
       
       System.out.println("Entre Age");
       byte age = s1.nextByte();
       
       System.out.println("Entre Salary");
       short salary = s1.nextShort();
      
       System.out.println("Entre Yearly Package");
       long Package = s1.nextLong();
       
       System.out.println("Entre Percentage in 10th");
       float p1 = s1.nextFloat();
       
       System.out.println("Entre percentage in 12th");
       double p2 = s1.nextDouble();
       
       System.out.println("Entre Receponce");
       boolean R1 = s1.nextBoolean();
       	   
    		   
    
	}	

}
