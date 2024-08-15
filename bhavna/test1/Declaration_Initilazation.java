package bhavna.test1;

public class Declaration_Initilazation {
	
	public static void main(String[] args) {
		
		// if we write like this (int age = 25; ) c/a declaration initilization 
		// int age ; declaration
		//( syntax of declaration : datatype (int) variable(age);)
		// age = 25 ; initilization 
		//( syntax of initilization : variable(age) = value (25);)
		
		int age = 20;   
		System.out.println(age);
		
		byte ageofmother = 50;
		System.out.println(ageofmother);

		short salaryofbrother = 30000;
		System.out.println(salaryofbrother);

	    long yearlypackage = 1000000;
	    System.out.println(yearlypackage);

	    float weightofdaughter = 14.5f;
	    System.out.println(weightofdaughter);

	    double pivalue = 3.14567894234;
	    System.out.println(pivalue);

	    char gender = 'F';
	    System.out.println(gender);

	    boolean myanswer = true;
	    System.out.println(myanswer);

	    String myname = "Bhavna Suraj Mahalle";
	    System.out.println(myname);
	    
	    myage();
	    
    
	}
	
    static void myage() {
	int myage = 25;
	System.out.println(myage);
	}
}
