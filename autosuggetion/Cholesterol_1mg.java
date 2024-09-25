package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cholesterol_1mg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver(); 
		driver.get("https://www.1mg.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("name"));
		search.sendKeys("Cholesterol");
		
		Thread.sleep(5000);
		
		List<WebElement> medicine = driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
		int count = medicine.size();
		
		System.out.println(count);
		
		medicine.get(5).click();
		
		

	}

}
