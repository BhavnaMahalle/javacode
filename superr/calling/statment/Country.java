package superr.calling.statment;


class City{
	
	City(){                                   //constructor 1 - Parameterized
		
		System.out.println("Nagpur");
	}
}
class State extends City{
	                                          //constructor - non parameterized
	State(int a){
		
		System.out.println("Maharashtra");
	}
}
public class Country extends State {
	 
	Country(){                                //constructor
		super (10);
		System.out.println("India");
	}

	public static void main(String[] args) {
		
		new Country();
		

	}

}
