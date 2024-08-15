package string.functions;

public class BhavnaReverseStringDemo {
	
   public static void main(String[] args) {
	
	  String originalString = "Suraj";
	  System.out.println("Original String : "+originalString);
	  
	  String result= "";
	  for(int i = 4; i >=0; i--) {
		  System.out.println(originalString.charAt(i));
		  result = result+originalString.charAt(i);
	  }
	  System.out.println("result : "+ result);

	  
}

}
