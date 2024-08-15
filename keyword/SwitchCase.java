package keyword;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Press 1 for launching Chrome");
		System.out.println("Press 2 for launching Firfox");
		System.out.println("Press 3 for launching Edge");
		System.out.println("Press 4 for launching Safari");
		
		Scanner s1 = new Scanner (System.in);
		int value = s1.nextInt();
		
		switch(value) {
		
		case 1 :
			System.out.println("chrome");
			break;
		
		case 2 :
			System.out.println("Firfox");
		    break;
		    
		case 3 :
			System.out.println("Edge");
		    break;
		    
		
		case 4 :
			System.out.println("safari");
		    break;
		        
		default:
			System.out.println("Sorry your selection is wrong");
		}

	}

}
