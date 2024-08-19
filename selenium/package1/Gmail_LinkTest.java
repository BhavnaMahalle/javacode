package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_LinkTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver a1 = new ChromeDriver ();
        a1.get("https://www.google.com");
		
		a1.manage().window().maximize();
		
		WebElement gmail = a1.findElement(By.linkText("Gmail"));
		gmail.click();
		
		
		
	}

}
//launch google and click on gmail using linktext