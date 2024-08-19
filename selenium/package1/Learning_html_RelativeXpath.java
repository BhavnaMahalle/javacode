package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_html_RelativeXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver ();
		driver.get("file:///Users/surajmahalle/Desktop/learningHTML1.html");
		
		 driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("(//input)[1]"));
		username.sendKeys("bhavna@11");
		
		WebElement hint = driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("name");
		
		
		WebElement passward = driver.findElement(By.xpath("(//input)[3]"));
		passward.sendKeys("1122");
		
		
	     WebElement firstname = driver.findElement(By.xpath("(//input)[4]"));
    	 firstname.sendKeys("Bhavna");
		
//		WebElement lastname = driver.findElement(By.xpath("(//input)[5]"));
//		lastname.sendKeys("Mahalle");
		
//		WebElement submit = driver.findElement(By.xpath("(//input)[6]"));
//		submit.click();
		
		WebElement checkBoxField = driver.findElement(By.xpath("(//input)[8]"));
		checkBoxField.click();
		
		WebElement gender = driver.findElement(By.xpath("(//input)[12]"));
		gender.click();
		
		WebElement relocate = driver.findElement(By.xpath("(//input)[13]"));
		relocate.click();
		

		
	}

}
