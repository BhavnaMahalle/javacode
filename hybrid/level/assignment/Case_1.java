package hybrid.level.assignment;

class Case_2{
	
	static void Open() {
		
		System.out.println("Entre URL");
		System.out.println("Open login page");
	}		 
}

class Case_3 extends Case_2 {
	
	static void Login() {
		System.out.println("Entre username");
		System.out.println("Entre passward");	
	}	
}

public class Case_1 extends Case_3 {
	
	static void Logout() {
		
		System.out.println("Click on Logout");
		System.out.println("Close the Application");	
	}
	
	public static void main(String[] args) {
		
		Open();
		Login();
		Logout();
		
	}

}
