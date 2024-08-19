package selenium.package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Browser {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver C = new ChromeDriver ();
		C.get("https://www.amazon.com");
		
		C.manage().window().maximize();
		
		Thread.sleep(3000);
		C.manage().window().minimize();
		
		
		
	}

}
