package package2;

import package1.NonStatic_Parent;
 
public class NonStatic_Child extends NonStatic_Parent  {

	public static void main(String[] args) {
		
		NonStatic_Child N1 = new NonStatic_Child();
		
		N1.method1();
		N1.method2();
		
		
	}

}
