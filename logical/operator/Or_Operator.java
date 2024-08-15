package logical.operator;

public class Or_Operator {

	public static void main(String[] args) {
		
		int age = 19;
		char gender = 'M';
		
		if  (age >= 18 || gender == 'F' ) 
		{
			System.out.println("Full Ticket");
		}
		else {
			System.out.println("Half Ticket");
		}
		
	//case 2		
		if  (age <= 18 || gender == 'F' ) 
		{
			System.out.println("Full Ticket");
		}
		else {
			System.out.println("Half Ticket");
		}		

	}

}
