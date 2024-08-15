package nonstatic.method;

public class Parameterized {

	void add(int a, int b) {
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		Parameterized P1 = new Parameterized();
		P1.add(110, 110);
		P1.add(4.35, 900);
		
	}
		
    void add(double a,int b) {
    	
    	System.out.println(a+b);
     
	}

}
