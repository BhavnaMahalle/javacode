package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Xpath {

	public static void main(String[] args) {
		
		ChromeDriver a1 = new ChromeDriver ();
		a1.get("https://www.amazon.in/");
		
		a1.manage().window().maximize();
		
		
		WebElement search = a1.findElement(By.xpath("(//input)[5]"));
		search.sendKeys("Shoes");
		
	}

}
