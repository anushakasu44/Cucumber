package com.test.cucumberFrameworkpagesPOM;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import junit.framework.Assert;



public class YoutubeValidateURL {
ChromeDriver driver;
//private WebElement subscribe;

	public YoutubeValidateURL(ChromeDriver driver) {
		this.driver=driver;
		//subscribe=driver.findElement(By.xpath("//div[@id='subscribe-button']/ytd-subscribe-button-renderer"));
		
	}
	
//	//public void clickOnsubscribe() {
//		subscribe.click();
//		
//		
//	}
	
	public void validateURL() throws Exception {
		
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		Boolean bool=(driver.getTitle().contains("BALA"));
	System.out.println(bool);
	}
	 
	
	public void takesscreenshot(String filename) throws Exception {
	//take screenshot and store it as file format
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//copy screenshot to desired location using copyfile method
	FileHandler.copy(file, new File("C:\\Users\\anush\\git\\Eclipseworkspace\\cucumberFramework\\src\\test\\java\\utilities"+filename+".jpg"));

				
	}


}
