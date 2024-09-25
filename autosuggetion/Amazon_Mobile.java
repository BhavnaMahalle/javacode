package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Mobile {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		Thread.sleep(4000);
		
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = e2.size();
		System.out.println(count);
		
		e2.get(4).click();
		
	}

}
