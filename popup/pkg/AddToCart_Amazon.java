package popup.pkg;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart_Amazon{
	
			
	public static void main(String[] args) throws InterruptedException 
			
	    {
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.in");
		    driver.manage().window().maximize();
				  
			WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("shoe");
			Thread.sleep(2000);
				  
		    List<WebElement> suggetion= driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
				 
		    int count =suggetion.size();
			System.out.println(count);
			suggetion.get(3).click();
				 
			WebElement select =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"));
			select.click();

			Set<String> s1=driver.getWindowHandles();
			
				Iterator <String> i1 = s1.iterator();
				
				String parentid =  i1.next();         //parent window id
				String childid  =  i1.next();        //any child window id
				
				System.out.println(parentid);
				System.out.println(childid);
				
				driver.switchTo().window(childid);
				Thread.sleep(2000);
				 
				WebElement addtocart =driver.findElement(By.id("add-to-cart-button"));
				
				addtocart.click();
				
				Thread.sleep(7000);
				driver.quit();
						
				
			}

		}
	
	
	
	


