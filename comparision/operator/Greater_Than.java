package comparision.operator;

public class Greater_Than {

	public static void main(String[] args) {  //only true statement will execute & print
		
//case 1 false statement ,it will not execute
		
		int a = 20;
		int b = 40;
		   
	if(a>b) {
		
		System.out.println("statment1");
	}


//case 2 true statement ,it will execute
	
	int A =50;
	int B =30;

	if(A>B) {
		
		System.out.println("statment2");
	}
	
	
	int a1 = 20;
	int b1 = 40;

	// case 1:  a1 is lesser than b1 then it will only execute ,you can write anything in print option 
	// if it will true then only it will print on console

	if (a1 < b1 ) {
		System.out.println("My Name Is Bhavna");
	}
	  
	// case 2 b is not lesser than a so the statement is false,it will not execute

	if(b1 < a1) {
		System.out.println(" My nama is Anaya");
	}
	
	}

}
