package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver a1 = new ChromeDriver ();
         a1.get("https://www.amazon.in/");
		
		a1.manage().window().maximize();
		
		//store method in variable is good habbit 
		//the return type of find element is web element 
		//so we have to store with that return type 
		//ex. int a =10 ;in the place of int we can write webelement
		
		WebElement signin = a1.findElement(By.id("nav-flyout-ya-signin"));
		signin.click();
		
		WebElement username = a1.findElement(By.name("email"));
		username.sendKeys("testaccount@9.gmail.com");
		Thread.sleep(2000);
		
		WebElement w1 = a1.findElement(By.id("continue"));
		w1.click();
		Thread.sleep(2000);
		
		WebElement passward = a1.findElement(By.name("password"));
		passward.sendKeys("12345");
		Thread.sleep(2000);
		
		//WebElement signin = a1.findElement(By.id("signInSubmit"));
		//signin.click();
		
		
		
	}

}
