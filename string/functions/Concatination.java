package string.functions;

public class Concatination {

	public static void main(String[] args) {
	
		
		
		String firstname = "Bhavna";
		String lastname = "Mahalle";
		
		System.out.println(firstname.concat(lastname));
		System.out.println(firstname.concat(" ").concat(lastname)); // for space add one more concat
		System.out.println(firstname + (" ") + lastname);  // + same thing like concat
	}

}
