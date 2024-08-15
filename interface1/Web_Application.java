package interface1;

interface Google{
	
	void login();
	void logout();
}

public class Web_Application implements Google {

	@Override
	public void login() {
		
	System.out.println("login");	
	}

	@Override
	public void logout() {
		
		System.out.println("logout");	
	}
	
	public static void main(String[] args) {
		
		Web_Application w1 = new Web_Application();
		w1.login();
		w1.logout();
		
	}

	

}
