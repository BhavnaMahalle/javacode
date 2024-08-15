package logical.operator;

public class Not_Operator {

	public static void main(String[] args) {
		
		int age = 25;
		char gender = 'F';
		
		if (! (age >= 18 || gender == 'F' ) )    //  (! (true)) = False then else will execute
		{ 
			System.out.println("Full Ticket");
		}
		else {
			System.out.println("Half Ticket");
		}
			
		
	}

}
