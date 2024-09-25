package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Bangalore {
 //Auto suggestion by find elements
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver a1 = new ChromeDriver ();
		a1.get("https://www.google.com");
		a1.manage().window().maximize();
		
		WebElement search = a1.findElement(By.name("q"));
        search.sendKeys("Bangalore");
        
        Thread.sleep(4000); 
        List<WebElement> e1 = a1.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        int count = e1.size();
        System.out.println(count);
        
        e1.get(3).click();
       //e1.get(count - 10).click();
	}

}
