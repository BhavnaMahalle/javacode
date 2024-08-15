package string.functions;

public class String_Method_21 {

	public static void main(String[] args) {
		
		String name = "Bhavna";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('n'));
		
		String full_name =  "     Bhavna Mahalle     ";
		System.out.println(full_name.trim());	
		
		String name_1 = "Bhavna";
		String name_2 = "bhavna";
		System.out.println(name.equals(full_name));
		System.out.println(name.equals(name_1));
		System.out.println(name_1.equals(name_2));
		
		System.out.println(name_1.equalsIgnoreCase(name_2));
		
		String my_name = "My Name Is Bhavna";
		System.out.println(my_name.contains("Bhavna"));
		System.out.println(my_name.contains("bhavna"));
		System.out.println(my_name.contains("Priya"));
		
		System.out.println(my_name.substring(3));
		System.out.println(my_name.substring(0,2));	
		
	}
}
