package constructor;

public class Constructor_Overloading {
	
	Constructor_Overloading()
	{
		System.out.println("Login to Amazon");
	}
	
	
	Constructor_Overloading(int a,int b) 
	{
		System.out.println("Logout from Amazon");
	}
	
	Constructor_Overloading(int a,String name) 
	{
		System.out.println("Sing UP");
	}
	
	
	
	public static void main(String[] args) {
		
      new Constructor_Overloading();
      new Constructor_Overloading( 20,20);	
      new Constructor_Overloading (10,"Hi");
      
}
}