package popup.pkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaymentPage_amazon {

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
		search.sendKeys("womens purse" + Keys.ENTER);
		
		Thread.sleep(2000);
		
		
		WebElement purse = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[8]"));
		purse.click();
		
        Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		
		String parentid =  i1.next();
		String childid  =  i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		
		Thread.sleep(2000);
		
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		
		WebElement proceedtobuy = driver.findElement(By.name("proceedToRetailCheckout"));
		proceedtobuy.click();
		
		WebElement addresscheckbox = driver.findElement(By.xpath("(//input[@name='submissionURL'])[1]"));
		addresscheckbox.click();
		
		Thread.sleep(2000);
		WebElement useaddress = driver.findElement(By.id("shipToThisAddressButton"));
		useaddress.click();
		

	}

}
