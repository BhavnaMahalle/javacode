package conditional.statment;

public class If_else_if_Ex_Block {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		 
	if (a==b) //false
	{
		System.out.println("condition 1");
	}
	else if (a==19) //false
		{
		System.out.println("condition 2");
	}
	else if (a==20) //true : it will execute
		{
		System.out.println("condition 3");
	}
	else {
		System.out.println("NO condition");
		
	}
	}

}
