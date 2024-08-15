package conditional.statment;

public class Nested_Ifelse {

	public static void main(String[] args) {
		
		char gender_1 = 'M';
		char gender_2 = 'F';
		int age_kid = 4;
		int age_adult_male = 64;
		
		//1. example
		
		if (gender_1 == 'M') {
			            
			                if(age_kid <= 4) {
			                	
			                	System.out.println("tickets under age 4 is free");
			                }
			               
			                else {
			                	System.out.println("full ticket");
			                }
		}
		
		else {
			System.out.println("tickets for female is free");
		}
		
		
		//2.example
		
		if(gender_1 == 'M') {
			               if(age_adult_male == 64) {
			            	   System.out.println("ticket is free");
			               }
			               else {
			            	   System.out.println("full ticket");
			               }
		}
		else {
			System.out.println("tickes are not free");
			}
	}

}
