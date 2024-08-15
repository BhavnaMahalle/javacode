package inheritance;

interface Google1
{
	void sign_in();
	
    void sign_out();	
	
}

interface Chrome
{
	
	void login();
	void logout();
	
}
public class Multiple_Level_Inheritance implements Chrome,Google1 {

	
	@Override
	public void sign_in() {
		
		System.out.println("Sign in");
	}

	@Override
	public void sign_out() {
		
		System.out.println("Sign out");	
	}

	@Override
	public void login() {
		
		System.out.println("login");
	}

	@Override
	public void logout() {
		System.out.println("logout");
		
	}

	public static void main(String[] args) {
		

		Multiple_Level_Inheritance m1 = new Multiple_Level_Inheritance();
		m1.sign_in();
		m1.sign_out();
		m1.login();
		m1.logout();
			
		
	}

	
}
