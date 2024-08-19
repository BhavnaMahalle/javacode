package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_html_AbsoluteXpath {

	public static void main(String[] args) {
	
	
		ChromeDriver driver = new ChromeDriver ();
		driver.get("file:///Users/surajmahalle/Desktop/learningHTML1.html");
		
		 driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("bhavna@11");
		
		
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("name");
		
		
		WebElement passward = driver.findElement(By.xpath("(/html/body/input)[3]"));
		passward.sendKeys("1122");
		
		
	     WebElement firstname = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
    	 firstname.sendKeys("Bhavna");
		

    	 WebElement checkBoxFieldboy = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		 checkBoxFieldboy.click();
    	 
		 WebElement checkBoxFieldgirl = driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		 checkBoxFieldgirl.click();
		 
		 WebElement checkBoxFieldbaby = driver.findElement(By.xpath("(/html/body/form/input)[6]"));
		 checkBoxFieldbaby.click();
		 
		 WebElement gendermale = driver.findElement(By.xpath("(/html/body/input)[4]"));
		 gendermale.click();
		 
		 WebElement genderfemale = driver.findElement(By.xpath("(/html/body/input)[5]"));
		 genderfemale.click();
		
		 WebElement relocate = driver.findElement(By.xpath("(/html/body/input)[6]"));
		 relocate.click();
		
		 WebElement aboutus = driver.findElement(By.linkText("Click to know about us"));
		 aboutus.click();
	

	
	}

}
