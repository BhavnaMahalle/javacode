package string.functions;

public class Reverse_Program {

	public static void main(String[] args) {
		String input = "Selenium";
		String output = "";
		
		for(int i = input.length()-1;i >= 0 ; i--) {
			
			char a1 = input.charAt(i);
			output = output + a1;
			
		}
		
		System.out.println(output);
		
	}

}
