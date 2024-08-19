package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_Login {

		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver = new ChromeDriver ();
	        driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
			
			driver.manage().window().maximize();
			
			WebElement continue_to_login = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
			
			Thread.sleep(2000);
			
			continue_to_login.click();
			
			WebElement username = driver.findElement(By.name("userName"));
			username.sendKeys("test@123");
			Thread.sleep(2000);
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("123");
			
	}

}
