package assingments;

public class Assingment_7 {

	final static double pi = Math.PI ; //final global variable
	
	public static void main(String[] args) {
		
//find out the area of circle by using for loop where r is coming ftrom math.random and pi is comimg from math.pi
//total no of execution is 10 times
		
				 
	    for(double i = 1 ; i<=10 ; i++) {
	     
	     double r  = Math.random();  
	     double areaofcircle = pi * r * r ;
	     
         System.out.println( areaofcircle);
         
	    }
	}

}