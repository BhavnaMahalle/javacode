package abstaction;

// Abstract method : 2 AM in Parent class

abstract class Delhi
{
	abstract void delhi_roads();   // abstract method
	abstract void delhi_hospital();
	
}

public class Banglore_Ex1 extends Delhi {// overover on child class to get abstract method
		
   void delhi_roads()                 // method overridden to store actual logic
  {
		System.out.println("My actual logic is here - delhi_roads");
		
	}

	void delhi_hospital() 
	{
		
		System.out.println("My actual logic is here - delhi_hospital");
	}
	
	
	public static void main(String[] args) {
		
		Banglore_Ex1 B1 = new Banglore_Ex1();
		B1.delhi_hospital();
		B1.delhi_roads();
		
	}
	

}
