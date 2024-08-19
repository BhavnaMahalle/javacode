package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arowdown_Assignment {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver ();
	    driver.get("https://www.google.com/");
	    
	    driver.manage().window().maximize();
	    
	    
	    WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		
		Thread.sleep(1000);
		
//		WebElement search = driver.findElement(By.id("input")); //getting error of google sign in
//		search.sendKeys("India");
		
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		search.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(500);
		search.sendKeys(Keys.ENTER);
	
		// or
		//search.sendKeys(Keys.ARROW_DOWN + "" + Keys.ARROW_DOWN);
		//search.sendKeys(Keys.ENTER);
		
		//or
		//search.sendKeys(Keys.ARROW_DOWN , Keys.ARROW_DOWN);
		
	}

}
