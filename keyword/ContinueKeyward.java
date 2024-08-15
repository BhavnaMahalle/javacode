package keyword;

public class ContinueKeyward {

	public static void main(String[] args) {
		
		for(int i = 0;i<=5;i++) {
			
			if (i==4) {
				continue;     //skip 4
			}
		System.out.println("Skip 4 number :" +i);	
		
		}
		
		
		
for(int i = 0;i<=5;i++) {
			
			if (i==2) {
				continue;     //skip 2
			}
		System.out.println("Skip 2 number :" +i);		
		}
		
	}

}


// Skip 4 number : [1,2,3,5]