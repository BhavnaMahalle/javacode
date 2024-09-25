package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube_Modi {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver =new ChromeDriver(); 
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys("Modi");
		
		Thread.sleep(5000);
		
		List<WebElement> modi = driver.findElements(By.xpath("//div[@class='sbsb_a']/ul/li"));
		int count = modi.size();
		
		System.out.println(count);
		
		modi.get(4).click();
		
		
	}

}
