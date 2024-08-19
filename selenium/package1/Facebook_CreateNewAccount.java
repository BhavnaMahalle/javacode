package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_CreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver ();
	    driver.get("https://www.facebook.com");
	    
	    WebElement create_new_acct = driver.findElement(By.linkText("Create new account"));
	    create_new_acct.click();
	   
	    Thread.sleep(1000);
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Aarya");
    
        WebElement surname = driver.findElement(By.name("lastname"));
	    surname.sendKeys("Sigh");
    
       WebElement emailid = driver.findElement(By.name("reg_email__"));	   
       emailid.sendKeys("aaryasigh@23gmail.com");
	    
        WebElement passward = driver.findElement(By.id("password_step_input"));
 	    passward.sendKeys("12345");
	       
	    
	}

}
      //create new fecebook account: create new account botton is disable here 
      //so we cannt get inspect option here for that press fn+f12,click on square symbol,
      //then click on create new account it will show you piece of code
		