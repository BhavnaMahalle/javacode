package popup.pkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Increase_Quantity_cart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    
	    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("plant"+ Keys.ENTER);
		Thread.sleep(2000);
		
		 WebElement plant = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[6]"));
		 plant.click();
		 
		 Set<String> s1 = driver.getWindowHandles();
			
			Iterator<String> i1 = s1.iterator();
			
			String parentid =  i1.next();
			String childid  =  i1.next();
			
			System.out.println(parentid);
			System.out.println(childid);
			
			driver.switchTo().window(childid);
			
			Thread.sleep(2000);
			
			WebElement quantity = driver.findElement(By.name("quantity"));
			 Select s2 = new Select(quantity);
			 s2.selectByVisibleText("4");
			 quantity.click();
			 Thread.sleep(2000);
			 
			 WebElement addtocart = driver.findElement(By.name("submit.add-to-cart"));
			 addtocart.click();
			 
			    

	}

}
