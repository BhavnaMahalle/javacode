package inheritance;

class Google
{
	static void father1() {
		
		
		System.out.println("1");
	}
  
}

class Amazon
{
	static void father2() {
		
		System.out.println("2");
	}

}

public class Multiple_Level extends Amazon {

	public static void main(String[] args) {
		
		
		
		father2();
	}

}
