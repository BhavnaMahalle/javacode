package popup.pkg;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyNow_Amazon {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.in");
		    driver.manage().window().maximize();
				  
			WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("Women shoes"+ Keys.ENTER);
			Thread.sleep(2000);
			
			WebElement choose=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[6]"));
			choose.click();
			
 			Set<String> s1=driver.getWindowHandles();       //to get parent & child id together
		
				Iterator <String> i1 = s1.iterator();
				
				String parentid =  i1.next();               //parent window id
				String childid  =  i1.next();               //any child window id
				
				System.out.println(parentid);
				System.out.println(childid);
								
				driver.switchTo().window(childid);
				Thread.sleep(2000);
				 
				WebElement buynow = driver.findElement(By.id("buy-now-button"));
				buynow.click();
				

				WebElement email =driver.findElement(By.id("ap_email_login"));
				email.sendKeys("bhavna.kohale@gmail.com");
				Thread.sleep(1000);

				WebElement con =driver.findElement(By.xpath("//input[@class='a-button-input']"));
				con.click();
				Thread.sleep(1000);

				WebElement passward =driver.findElement(By.id("ap_password"));
				passward.sendKeys("123");
				Thread.sleep(1000);

				WebElement signin =driver.findElement(By.id("signInSubmit"));
				signin.click();
				
				
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
