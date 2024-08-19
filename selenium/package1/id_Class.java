package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_Class {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver b1 = new ChromeDriver ();
        b1.get("https://www.google.com/");
		
		b1.manage().window().maximize();
		
		WebElement google = b1.findElement(By.id("APjFqb"));
		google.sendKeys("Gmail");
		
		Thread.sleep(2000);
		google.sendKeys(Keys.ENTER);
		
		
	}

}
