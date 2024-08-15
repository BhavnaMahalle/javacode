package string.functions;

public class ReversString {

	public static void main(String[] args) {
		
		String input = "School";
		String output = "";
		
		for(int i = input.length()-1 ; i >=0 ; i--) {
			
			char c1 = input.charAt(i);
			//System.out.println(c1);
			output = output + c1;
			
		}
		
		System.out.println(output);
		

	}

}