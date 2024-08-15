package string.functions;

public class Palindrome_Method {
	
	public static void main(String[] args) {
		
		
		String input = "mom";         //madam ,radar, wow, dad : are palindrome
		String output = "";
		
		for (int i = input.length()-1; i >= 0 ; i-- ) {
			
			char c1 = input.charAt(i);
			output = output + c1;
		}
		
		System.out.println(output);
		
		if(input.equals(output)) {
			
			System.out.println("Its Palindrome");
		}
		else {
			
			System.out.println("Its not a Palindrome");
		}
			
	}
	

}
