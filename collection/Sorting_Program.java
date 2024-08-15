package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Program {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Bhavna");
		a1.add("Suraj");
		a1.add("Anaya");
		a1.add("Mahalle");
		
		Collections.sort(a1);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(29);
		a2.add(34);
		a2.add(4);
		a2.add(98);
		
		Collections.sort(a2);
		System.out.println(a2);
		
	}

}
