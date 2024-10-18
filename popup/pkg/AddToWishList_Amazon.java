package popup.pkg;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToWishList_Amazon {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
		    
		    WebElement accountlist = driver.findElement(By.id("nav-link-accountList-nav-line-1"));        //hoverover
			Actions a1 = new Actions(driver);
			a1.moveToElement(accountlist).perform();
			
			WebElement clicksignin = driver.findElement(By.xpath("//a[@class='nav-action-signin-button'][1]")); 
		    clicksignin.click();

		    WebElement emailid = driver.findElement(By.name("email")); 
		    emailid.sendKeys("7387035692");
		   
		    WebElement conti = driver.findElement(By.id("continue")); 
		    conti.click();
		    Thread.sleep(2000);
		    
		    WebElement passward = driver.findElement(By.name("password")); 
		    passward.sendKeys("Test@12345");
		    
		    WebElement signin = driver.findElement(By.id("signInSubmit")); 
		    signin.click();	  

		    Thread.sleep(1000);
			
		    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("womens watch" + Keys.ENTER);
			
			Thread.sleep(2000);
			
			
			WebElement watch = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[9]"));
			watch.click();
			
       Set<String> s1 = driver.getWindowHandles();
			
			Iterator<String> i1 = s1.iterator();
			
			String parentid =  i1.next();
			String childid  =  i1.next();
			
			System.out.println(parentid);
			System.out.println(childid);
			
			driver.switchTo().window(childid);
			
			Thread.sleep(2000);
			
			WebElement wishlist = driver.findElement(By.id("add-to-wishlist-button-submit"));
			wishlist.click();
			
			Thread.sleep(3000);
 
			WebElement viewwishlist = driver.findElement(By.partialLinkText("View Your List"));
			viewwishlist.click();
			
			Thread.sleep(4000);
			
			
			WebElement accountlist1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));        //hoverover
			Actions a2 = new Actions(driver);
			a2.moveToElement(accountlist1).perform();
			
			WebElement logout = driver.findElement(By.id("nav-item-signout"));
			logout.click();
			
			Thread.sleep(5000);
			driver.quit();
	
			
	}

}
