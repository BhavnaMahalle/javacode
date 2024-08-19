package selenium.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {

	public static void main(String[] args) {
		
		//launch google - type india - click on search botton
		
		ChromeDriver C = new ChromeDriver ();
		C.get("https://www.google.com");
		
		C.findElement(By.name("q")).sendKeys("India");
		C.findElement(By.name("btnk")).click();
		
		//launch google - type india - press entre
		C.findElement(By.name("q")).sendKeys("India");
		C.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	
		
	}

}
