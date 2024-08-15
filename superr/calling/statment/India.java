package superr.calling.statment;

// parameterized super calling

class South_Africa {
	
	South_Africa (int totalrun){
		
		System.out.println("South Africa lost in world cup 2024");
	}
	
}

public class India extends South_Africa {
	 
	India(int totalrun){
	    super(169);
		System.out.println("India win world cup 2024 by 7 run");
	}


	public static void main(String[] args) {
		
		new India(176);
		
		
	}

}
