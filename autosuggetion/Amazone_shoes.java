package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone_shoes {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver a1 = new ChromeDriver ();
		a1.get("https://www.amazon.in/");
		
		a1.manage().window().maximize();
		
		
		WebElement search = a1.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		Thread.sleep(2000);
		
		List<WebElement> e2 = a1.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = e2.size();
		System.out.println(count);
		
		e2.get(2).click();
		
	}

}
