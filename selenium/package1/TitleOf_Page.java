package selenium.package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOf_Page {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver C = new ChromeDriver ();
		C.get("https://www.flipkart.com");
		
		System.out.println(C.getWindowHandle());
		System.out.println(C.getWindowHandles());
		
		System.out.println(C.getTitle());
		C.manage().window().maximize();
	   
		Thread.sleep(2000);
		
		C.manage().window().minimize();
	}

}
