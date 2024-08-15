package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_Program {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Anaya");
		a1.add("Kavya");
		a1.add("Yogini");
		a1.add("Yuvika");
		a1.add(17);
		a1.add("Lumbini");
		
		System.out.println("a1 is :" +a1);
		
		Iterator i1 =	a1.iterator();
		while (i1.hasNext()) 
		{
			
			System.out.println(i1.next());
		}
		
		System.out.println("   ");	
		
		ListIterator i2 = a1.listIterator();
		while(i2.hasNext())
		{
			System.out.println("Forward Iteration -> " +i2.next());	
			
		}
		
		System.out.println("   ");	
		
		while(i2.hasPrevious()) 
		{
		
			System.out.println("Backward Iteration -> " +i2.previous());	
			
		}
		
	}

}
