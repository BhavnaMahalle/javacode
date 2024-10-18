package popup.pkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart_FlipCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("girls bag"+ Keys.ENTER);
		
		WebElement girlsbag = driver.findElement(By.xpath("(//div[@class='cPHDOP col-12-12']/div/div)[4]"));
		girlsbag.click();
		
		Set<String> s1=driver.getWindowHandles();
		
		Iterator <String> i1 = s1.iterator();
		
		String parentid =  i1.next();         //parent window id
		String childid  =  i1.next();        //any child window id
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		
		WebElement addtocart = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		addtocart.click();
		
		
	}

}
