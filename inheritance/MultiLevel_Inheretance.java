package inheritance;

    
    class Grandparent 
    {
    static void house() {
    	
    	System.out.println("Grandparent have house");
    }
    	
    }

    class My_Father extends Grandparent 
    {
    	static void car() {
    		System.out.println("Father have car");
    	}	
    	
    }

    public class MultiLevel_Inheretance extends My_Father  { // child class 

	static void laptop() {
		 System.out.println("Son have laptop");
	}
	
	
	public static void main(String[] args) {
		
		house();
		car();
		laptop();

	}

}
