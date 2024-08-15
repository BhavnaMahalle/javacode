package assingments;

import java.util.Scanner;

public class Assignment_9 {
    final static double pi = Math.PI ;
	public static void main(String[] args) {
	
		
     Scanner a1 = new Scanner(System.in);
     System.out.println("Note : value of pi is constant(3.14) for all");
     
     System.out.println("Calculate Area of Circle");
     System.out.println("Entre the value of radius (r)");
     int r1 = a1.nextInt();
     double area_of_circle = pi*r1*r1 ;
     System.out.println("Area of Circle is(pi*r*r) :"+ area_of_circle);
     
     
     
     Scanner a2 = new Scanner(System.in);
     System.out.println("Calculate Circumference of circle");
     System.out.println("Entre the value of radius(r)");
     int r2 = a2.nextInt();
     double circum_circle = 2*pi*r2 ;
     System.out.println("circumference of Circle is(2*pi*r) :"+ circum_circle);
     
     
     Scanner a3 = new Scanner(System.in);
     System.out.println("Calculate Area of squre");
     System.out.println("Entre the value of area");
     int area = a3.nextInt();
     double area_of_squre = area*area ;
     System.out.println("Area of squre is(a*a) :"+ area_of_squre);
     
     Scanner a4 = new Scanner(System.in);
     System.out.println("Calculate Circumference of squre");
     System.out.println("Entre the value of A");
     int A = a4.nextInt();
     double circum_squre = 4*A ;
     System.out.println("circumference of squre is(4*A) :"+ circum_squre);
     
     
     Scanner a5 = new Scanner(System.in);
     System.out.println("Calculate Area of triangle");
     System.out.println("Entre the value of base");
     int b = a5.nextInt();
     System.out.println("Entre the value of height");
     int h = a5.nextInt();
     // b = base , h = height
     double area_of_triangle = (b * h)/2 ;
     System.out.println("Area of triangle is(b*h)/2 :"+ area_of_triangle);
     
     
     Scanner a6 = new Scanner(System.in);
     System.out.println("Calculate Circumference of triangle");
     System.out.println("Entre the value of x");
     int x = a6.nextInt();
     System.out.println("Entre the value of y");
     int y = a6.nextInt();
     System.out.println("Entre the value of z");
     int z = a6.nextInt();
    
     // x,y,z are the 3 side of triangle
     
     double circum_triangle = x+y+z ;
     System.out.println("circumference of triangle is(x+y+z) :"+ circum_triangle);
     
     
     Scanner a7 = new Scanner(System.in);
     System.out.println("Calculate Area of trepezium");
     System.out.println("Entre the length of base1");
     int l1 = a7.nextInt();
     System.out.println("Entre the length of base2");
     int l2 = a7.nextInt();
     System.out.println("Entre height of trepezium");
     
     // l1 = lengh of base ,l2 = length of base2  , h = height
    
     double area_of_trepezium =  ((l1+l2)/2)*h ;
     System.out.println("Area of trepezium is((l1+l2)*h :"+ area_of_trepezium);
     
     
     Scanner a8 = new Scanner(System.in);
     System.out.println("Calculate Circumference of trepezium");
     System.out.println("Entre the lengh of ab ");
     int ab = a8.nextInt();
     System.out.println("Entre the length of bc");
     int bc = a8.nextInt();
     System.out.println("Entre the length of cd");
     int cd = a8.nextInt();
     System.out.println("Entre the length of ad");
     int ad = a8.nextInt();
     double circum_trepezium = ab+bc+cd+ad ;
     System.out.println("circumference of trepezium is(ab+bc+cd+ad) :"+ circum_trepezium);
        
      
     
	}

}
