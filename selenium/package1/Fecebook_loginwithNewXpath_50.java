package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fecebook_loginwithNewXpath_50 {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver ();
		chromeDriver.get("https://www.facebook.com");
		
		chromeDriver.manage().window().maximize();
		
		WebElement username = chromeDriver.findElement(By.xpath("//input[@id='email']"));
	    username.sendKeys("bhavnakohale94@rediff.com");
		
	    WebElement passward = chromeDriver.findElement(By.xpath("//input[@id='pass']"));
	    passward.sendKeys("bh12345");
	   
	    WebElement login = chromeDriver.findElement(By.xpath("//button[@name='login']"));
	    login.click();
	 

	}

}
