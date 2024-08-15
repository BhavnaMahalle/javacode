package logical.operator;

public class And_Operator {

	public static void main(String[] args) {
		int age = 19;
		char gender = 'M';
//case 1		
		if  (age >= 18 && gender == 'M' ) {
			System.out.println("Full Ticket");
		}
		else {
			System.out.println("Half Ticket");
		}
		
//case 2
		if  (age >= 18 && gender == 'F' ) {
			System.out.println("Full Ticket");
		}
		else {
			System.out.println("Half Ticket");
		}
		
//case 3		
	age = 3 ; //(initializing age again)
		
		if (age <= 5 && gender == 'M') {
			 
			System.out.println("Tickets are free for kids under 5");
		}
		else {
			System.out.println("Full Ticket");
		}
		
		int ageoffemale = 17;
		int ageofmale = 22;
		char gender_1 = 'M';
		char gender_2 = 'F';
		
//case 1		
		if  (ageofmale >= 18 && gender_1 == 'M' ) {
			System.out.println("Eligible for marriage");
		}
		else {
			System.out.println("Can not marry");
		}
		
//case 2
		if  (ageoffemale >= 21 && gender_2 == 'F' ) {
			System.out.println("Eligible for marriage");
		}
		else {
			System.out.println("Not Eligible");
		}	
			
		
	}

}
