package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver a1 = new ChromeDriver ();
		a1.get("https://www.amazon.com/");
		
		a1.manage().window().maximize();
		
		a1.findElement(By.name("email")).sendKeys("testaccount@9.gmail.com");
		a1.findElement(By.id("continue")).click();
		
		a1.findElement(By.name("password")).sendKeys("12345");
		a1.findElement(By.id("signInSubmit")).click();
		
	}

}
