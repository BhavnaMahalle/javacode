package practice.classes;

public class Class_02 {
	
		public static void main(String[] args) 
		{
		String a="manish kumar";	
			System.out.println(a.isEmpty());
			System.out.println(a.lastIndexOf('a'));
			
			String new1=	a.replace('m', 'a');
			System.out.println(new1);
			String new12=	a.replaceAll(" ", "");
			System.out.println(new12);
			
			System.out.println(a.replaceAll("kumar", "Tiwari"));
			String b="school123";
			System.out.println(	b.replaceAll("[0-9]", ""));
				System.out.println(b.replaceAll("[a-z]", ""));
				//ASCI values		a.replace(' ', '');
				
			String c="Manish123 School";
			System.out.println(c.replaceAll("[A-Z]", ""));
			
			String a1="manish kumar tiwari";
			// %i
			System.out.println(a1.matches("(.*)i"));
			System.out.println(a1.matches("(.*)k"));

			System.out.println(a1.matches("m(.*)"));
			System.out.println(a1.matches("(.*)z(.*)"));
			String a3="tommy";
			//_
			System.out.println(a3.matches("..."));
			
			
			
			
		}

}
