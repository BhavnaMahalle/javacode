package popup.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUpload_popup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		// get method used for url 
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Bhavna");
		
		Thread.sleep(500);
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("Mahalle");
		
		Thread.sleep(500);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Test@123.gmail.com");
		

		Thread.sleep(500);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345");
		
		
		Thread.sleep(500);
		WebElement gender = driver.findElement(By.id("Female"));
		gender.click();
		
		Thread.sleep(1000);
		WebElement skill = driver.findElement(By.name("Skills"));
		Select s1 = new Select (skill);
		s1.selectByVisibleText("Technical Skills");
		
		Thread.sleep(1000);
		WebElement course = driver.findElement(By.name("technicalskills c-s"));
		Select s2 = new Select (course);
		s2.selectByVisibleText("Selenium");
		
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.name("Country"));
		Select s3 = new Select (country);
		s3.selectByVisibleText("India");
		
		Thread.sleep(1000);
		WebElement present_address = driver.findElement(By.name("Present-Address"));
		present_address.sendKeys("San Diego ,California ,USA");
		
		Thread.sleep(1000);
		WebElement permanent_address = driver.findElement(By.name("Permanent-Address"));
		permanent_address.sendKeys("Sambhaji Nagar ,Nagpur, India");
		
		Thread.sleep(2000);
		WebElement pincode = driver.findElement(By.name("Pincode"));
	    pincode.sendKeys("441100");
		
		Thread.sleep(1000);
		WebElement relegion = driver.findElement(By.name("Relegion"));
		Select s4 = new Select (relegion);
		s4.selectByVisibleText("Hindu");
		
		Thread.sleep(1000);
		WebElement relocate = driver.findElement(By.name("relocate"));
	    relocate.click();
	    
	    Thread.sleep(1000);
		WebElement choosefile = driver.findElement(By.name("file"));
	    choosefile.sendKeys("/Users/surajmahalle/Downloads/Screenshot_test.PNG");
		
	
		
		
		
		
		
		
		
	}

}
