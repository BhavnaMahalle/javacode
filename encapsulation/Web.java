package encapsulation;

class Network{
	private String password = "bhavi11";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
}

public class Web {

	public static void main(String[] args) {
		
    Network n1 = new Network();
    n1.setPassword("bhavi94");;
    System.out.println(n1.getPassword());
	}

}
