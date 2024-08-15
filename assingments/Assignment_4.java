package assingments;

public class Assingment_4 {
	
	public static void main(String[] args) {
		
   boolean job = false;
   char bhavna = 'F';
   char suraj ='M';
   String myname = "Bhavna";

   // 1.boolean example
   
   if(job == true) //make a change as false then it print if statement as working
   { 
	   System.out.println("working");
   }
   else {
	   System.out.println("not woirking");
   }
 
   // 2.char example  (if both condition true then it will only execute 1st true condition)
  
   if(bhavna == 'F') {
	   System.out.println("Bhavna is female");
   }
   else if (suraj == 'M') {
	   System.out.println("Suraj is male");
   }
   
   else {
	   System.out.println("if else if");
	  
	   
   }
   //3.char example with && (if both true then only it will execute otherwise else will execute)
   
   if(bhavna == 'F'&& suraj != 'M')//( 1 condition is true & 1 is false = false)
   {
	   System.out.println("false");
   }
   else {
	   System.out.println("true");
   }
   
   
   //4.string example
   
   if(myname != "Bhavna") {
	   System.out.println("false");
	  
 }
   else
   {
	   System.out.println("true");
   }
	}

}
