package popup.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewestArrival_Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    
	    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("kurtis"+ Keys.ENTER);
		Thread.sleep(2000);
	    
		 WebElement sortby = driver.findElement(By.name("s"));
		 Select s1 = new Select(sortby);
		 s1.selectByVisibleText("Newest Arrivals");
		 sortby.click();
		 Thread.sleep(2000);
		    
	    
	}

}
