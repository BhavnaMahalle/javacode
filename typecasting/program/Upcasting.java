package typecasting.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Upcasting{

	public static void main(String[] args) {
		
		// ArrayList To List
		
		List L1 = new ArrayList ();
		L1.add("Bhavna");
		L1.add(11);
		L1.add('F');
		L1.add(54.56);
		L1.add(null);
		L1.add(null);
		
		System.out.println("ArrayList TO List ->"  +L1);
		
		Iterator i1 = L1.iterator();         // iterator
       while (i1.hasNext()) {
    	   System.out.println("Iterator->" + i1.next());
       }
       
       
       ListIterator i3 = L1.listIterator();  // Listiterator
      
       while(i3.hasNext()) {
    	   
    	   System.out.println("Forward ListItarator -> " + i3.next()); 
       }
       
       while (i3.hasPrevious()) {
    	   System.out.println("Backward ListItarator -> " + i3.previous());
       }
		
		//HashSet To Set
		
		Set S1 = new HashSet();
		
		S1.add("Bhavna");
		S1.add(11);
		S1.add('F');
		S1.add(54.56);
		S1.add(null);
		S1.add(null);
		System.out.println("HashSet To Set ->" +S1);
		
		Iterator i2 = S1.iterator();
	       while (i2.hasNext()) {
	    	   System.out.println("Iterator->" +i2.next());
	       }
		
	}

}
