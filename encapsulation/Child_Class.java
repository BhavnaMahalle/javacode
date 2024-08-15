package encapsulation;

class Parent_Class{
	int age = 20;
	public void setAge(int age) {
		
		this.age= age;
	}
	
      public int getAge() {
		
		return age;
	}
}

public class Child_Class {

	public static void main(String[] args) {
		
		Parent_Class p1 = new Parent_Class ();
		p1.setAge(35);
		System.out.println(p1.getAge());
		
		
	}

}
