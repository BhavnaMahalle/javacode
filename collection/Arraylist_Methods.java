package collection;

import java.util.ArrayList;

public class Arraylist_Methods {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Ram");
		a1.add("Lakshman");
		a1.add("Seeta");
		a1.add("Hanuman");
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		a2.add("Janaki");
		a2.add("Ravan");
		System.out.println(a2);
		
	    a2.add(1,"Valmiki");
	    System.out.println(a2);
	    
	    a2.addAll(4, a1);
	    System.out.println(a2);
	    
	    a2.remove("Ram");
	    System.out.println(a2);
	   
	    a2.removeAll(a1);
	    System.out.println(a2);
	    
	    a2.contains("Lakshaman");
	    a2.contains("Bhavna");
	    System.out.println(a2);
	    
	    System.out.println(a1.size());
	    System.out.println(a2.size());
	    
	    System.out.println(a1.isEmpty());
	    
	   
	    
	    System.out.println(a1.get(3));
	    
	    a2.set(0, "Ramayan");
	    System.out.println(a2);
	     
	    a2.clear();
	    System.out.println(a2);
	    
	    a1.indexOf("Ram");
	    System.out.println(a1);
	    
	 
	}

}
