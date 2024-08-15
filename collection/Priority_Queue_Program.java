package collection;


import java.util.PriorityQueue;
public class Priority_Queue_Program {

	public static void main(String[] args) {
		  
		//it does not store heterogenous value in same object or you have to 
		//mention it explicitly which value you are passing like string ,integer ,float 
		
		PriorityQueue P1 = new PriorityQueue(); 
		P1.add("Bhavna");
		P1.add("Suraj");
		P1.add("Anaya");
		//P1.add(1);
		System.out.println(P1);
		
		PriorityQueue<Integer> P2 = new PriorityQueue<>();
		P2.add(30);
		P2.add(34);
		P2.add(4);
		System.out.println(P2);
		
		PriorityQueue<Boolean> P3 = new PriorityQueue<>();
     	P3.add(true);
     	System.out.println(P3);
     	
     	PriorityQueue<Double> P4 = new PriorityQueue<>();
     	P4.add(97.99);
     	System.out.println(P4);
     	
		PriorityQueue<Character> P5 = new PriorityQueue<>();
		P5.add('F');
     	System.out.println(P5);
	
	
       //		P1.add(null);
       //		P1.add(null);			
	}	
	}

