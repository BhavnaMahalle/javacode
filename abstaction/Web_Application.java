package abstaction;

//Write a program using with abstract class-Abstract class 
//(2 abstract methods,2 concrete methods) and 
// class have 2 concrete methods(As per class 20 )

abstract class Amazone{
	
	abstract void women_clothing();
	abstract void men_clothing();
	
	void kids_clothing() {
		System.out.println("Cloths for kids");    }
	
	void newborn_clothing() {
		System.out.println("Cloths for new born baby");
	}	
}
public class Web_Application extends Amazone  {
	
	void home_product() {
		System.out.println("Home applience");	
	}
	static void beauty_product() {
	System.out.println("Makeup product for me");		
	}
	void women_clothing() {
		
		System.out.println("Cloths for Women");
	}
	void men_clothing() {
		
		System.out.println("Cloths for men");		
	}
	public static void main(String[] args) {
		
		 Web_Application w1 = new  Web_Application();
		  w1.women_clothing();
		  w1.men_clothing();
		  w1.kids_clothing();
		  w1.newborn_clothing();
		  w1.home_product();
		  beauty_product();	

	}
	
}
