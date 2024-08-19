package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		
		ChromeDriver a1 = new ChromeDriver ();
        a1.get("https://www.amazon.in/");
		
		a1.manage().window().maximize();
		
		
		WebElement cust = a1.findElement(By.partialLinkText("Customer Service"));
		cust.click();
		
		
		
	}

}
//launch amazon india & click on major tab customer service major tabs 
//using linktext & partial linktext