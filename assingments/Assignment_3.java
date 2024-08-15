package assingments;

public class Assingment_3 {

	// the age of person is 17 ,does he eligible for voting
	// the age of person is 25 ,does he eligible for voting
	
	public static void main(String[] args) {
		int person1 = 17;
		int person2 = 25;
		int eligibleage = 18; // eligible age for voting		
				
	if(person1 >=  eligibleage) //case 1 : age of person is 17
	{
		 System.out.println("Eligible for voting");
		 	 
	}
	else {
		
		System.out.println("Person 1:" + "Not Eligible for voting ");
	}
	
	if(person2 >= eligibleage) //case 2 : age of person is 25
	{
	  
		System.out.println("Person 2:" + "Eligible for voting");
			
	}
	else 
	{
		System.out.println("Not Eligible for voting");
	}

	}

}
