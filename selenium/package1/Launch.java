package selenium.package1;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
	
	    FirefoxDriver F = new FirefoxDriver ();
        F.get("https://www.amazone.com");
      //F.get("https://www.google.com");
		
		ChromeDriver C = new ChromeDriver ();
		C.get("https://www.facebook.com");
	    
		Thread.sleep(2000);      // sleep for 2sec then close
	     //C.close();
        // C.quit();                //always use quit to close all tabs
		
        System.out.println(C.getWindowHandle());
        System.out.println(C.getWindowHandles());
        
        
	}
	}


