package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	
	
	
//ChromeDriver driver;
	
	public static ChromeDriver openBrowser(ChromeDriver driver,String browsername,String URI) {
		//this.driver=driver;
		if(browsername.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver.get(URI);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return driver;
		}
		else if(browsername.equals("Firefox")){
			//this.driver=driver;
			
			System.setProperty("webdriver.gecko.driver", "D:\\Anusha_Automation\\geckodriver.exe");
			driver.get(URI);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return driver;
		}
		return null;
		
		
		
		
		
	}

}
