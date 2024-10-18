package popup.pkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Registration {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.naukri.com/registration/createAccount");
		    driver.manage().window().maximize();

		WebElement cngoogle = driver.findElement(By.xpath("//span[.='Google']"));   
		cngoogle.click();
		Thread.sleep(3000);
		
		Set<String> s1 =driver.getWindowHandles();
		    
		 Iterator<String> i1 =s1.iterator() ;
		String parentid = i1.next();
		String childid = i1.next();
		
		driver.switchTo().window(parentid);
		
		
		
	}

}
