package string.functions;

public class String_Methods_22 {

	public static void main(String[] args) {
		
		String a = "manish kumar";	
		System.out.println(a.isEmpty());
		
		String a1 = "";	
		System.out.println(a1.isEmpty());
		System.out.println(a.lastIndexOf('a'));
		System.out.println(a.replace('m', 'a'));
		System.out.println(a.replaceAll(" ", ""));
		System.out.println(a.replaceAll("kumar", "Tiwari"));
		
		String b = "school123";
		System.out.println(	b.replaceAll("[0-9]", ""));
		System.out.println(b.replaceAll("[a-z]", ""));
			
			
		String c="Manish123 School";
		System.out.println(c.replaceAll("[A-Z]",""));
		
		String c1="manish kumar tiwari";
        System.out.println(c1.matches("(.*)i"));
		System.out.println(c1.matches("m(.*)"));
		System.out.println(c1.matches("(.*)k(.*)"));
		
		String a3="tom";
		System.out.println(a3.matches("..."));
			
	}

}
