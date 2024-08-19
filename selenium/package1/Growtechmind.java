package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growtechmind {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		//driver.get("https://grotechminds.com/");
		
		driver.get("https://grotechminds.com/registration/");
	
		WebElement fn = driver.findElement(By.name("fname"));
		fn.sendKeys("Bhavna");
		
		Thread.sleep(2000);
		WebElement ln = driver.findElement(By.name("lname"));
		ln.sendKeys("Mahalle");
		
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Test@123.gmail.com");
		

		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123");
		
		
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("Female"));
		gender.click();
		
		
		
		
		
	}

}
