package utilities;




import java.io.File;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	ChromeDriver driver;
	
@Before //(order=1)
public void beforeScenario1() {
	System.out.println("this will run before scenario ");
	
}


//@After //(order=0)
//public void takesscreenshot(String filename) throws Exception {
//	//take screenshot and store it as file format
//	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	//copy screenshot to desired location using copyfile method
//	FileHandler.copy(file, new File("C:\\Users\\anush\\git\\Eclipseworkspace\\cucumberFramework\\src\\test\\java\\utilities"+filename+".jpg"));


//we can give the order to the anotations if there are more than i before or after tests.
//@Before(order=0)
//public void beforeScenario0() {
//	System.out.println("this will run before scenario ");
//	
//}
//
@After(order=1)
public void afterScenario1() {
	System.out.println("this will run afetr scenario ");
}
}