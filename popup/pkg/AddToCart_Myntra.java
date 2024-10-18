package popup.pkg;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart_Myntra {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.myntra.com/");
	    driver.manage().window().maximize();
	  
	    WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	    search.sendKeys("Dress");
	    
	   Thread.sleep(2000);
	   List<WebElement> autosuggetion = driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li"));
	   int count= autosuggetion.size();
	   System.out.println(count);
	   
	    autosuggetion.get(2).click();
	    
	    
//	    WebElement select = driver.findElement(By.id("28546340"));
//	    select.click();
	    
	    WebElement select = driver.findElement(By.xpath("//li[@id='28546340']"));
	    select.click();
	    
	    Set<String> s1=driver.getWindowHandles();
		
		Iterator <String> i1 = s1.iterator();
		
		String parentid =  i1.next();       //parent window id
		String childid  =  i1.next();        //any child window id
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		 
		WebElement addtocart =driver.findElement(By.xpath("//a[@class='desktop-cart']"));
		
		addtocart.click();
		
		Thread.sleep(7000);
		driver.quit();
	    
	    
	    
	}

}
