package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypaster {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement fn = driver.findElement(By.name("fname"));
		fn.sendKeys("Bhavna");
		fn.sendKeys(Keys.COMMAND +"a");
		Thread.sleep(1000);
		fn.sendKeys(Keys.COMMAND +"c");
		
		
		WebElement ln = driver.findElement(By.name("lname"));
		//ln.sendKeys("Mahalle");
		Thread.sleep(1000);
		ln.sendKeys(Keys.COMMAND+"v");
		
		
		
	}

}
