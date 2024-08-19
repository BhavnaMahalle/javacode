package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fecebook_Login {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver chromeDriver = new ChromeDriver ();
		chromeDriver.get("https://www.facebook.com");
		
		chromeDriver.manage().window().maximize();
		
		chromeDriver.findElement(By.name("email")).sendKeys("bhavnakohale94@rediff.com");
		chromeDriver.findElement(By.name("pass")).sendKeys("bhavna");
		
		chromeDriver.findElement(By.name("login")).click();
			
	}

}
