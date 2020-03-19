package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAndProperties {
	
	ChromeDriver driver;
	Properties prob;

	public BrowserAndProperties() throws Exception {
		try{
			
			prob=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\anush\\git\\Eclipseworkspace\\cucumberFramework\\target\\confg.properties");
		prob.load(fis);
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ChromeDriver browser(String browsername,String URL ) {
		prob.getProperty(browsername);
		
		if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			prob.getProperty(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return driver;
		}
	
	else if(browsername.equals("Firefox")){
		
		System.setProperty("webdriver.gecko.driver", "D:\\Anusha_Automation\\geckodriver.exe");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
		return null;
	}
	}
	

