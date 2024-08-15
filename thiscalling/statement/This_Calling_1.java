package thiscalling.statement;

public class This_Calling_1 {
	
	This_Calling_1 (int a){
		System.out.println("Age");
		
	}
	
	This_Calling_1 (double weight){
		this(29);                     // this() parameterized
		System.out.println("Weight");
		
	}
	
	
	This_Calling_1 (String name ){
		this(43.9);                 // this() parameterized
		System.out.println("Name");
		
	}
	
	public static void main(String[] args) {     
		
		new This_Calling_1("Bhavna");
		
		
	}

}
