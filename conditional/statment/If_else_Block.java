package conditional.statment;

public class If_else_Block {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		int c = 40;
		
		if(a==b)  // case 1 : condition is false then it will execute else only 
		{ 
			 System.out.println(" case 1 :if will execute");
			
		}
		else  // no condition
		{ 
			System.out.println( "case 1 : else will execute");
		}
		
		if (b<=c)  // case 2 : condition is true then it will execute if only
			{
			System.out.println(" case 2 : if will execute ");
			
		}
		else {
			System.out.println("case 2: else will execute");
		}
	}

}
