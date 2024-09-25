package autosuggetion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrowDown_SelectShoes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver a1 = new ChromeDriver ();
		a1.get("https://www.amazon.in/");
		
		a1.manage().window().maximize();
		
		
		WebElement search = a1.findElement(By.name("field-keywords"));
		search.sendKeys("Shoes for");
		Thread.sleep(2000);
		search.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		search.click();
		
		//WebElement shoes = a1.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		//shoes.click();
	
	}

}
