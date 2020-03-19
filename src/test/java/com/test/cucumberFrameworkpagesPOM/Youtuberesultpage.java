package com.test.cucumberFrameworkpagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtuberesultpage {
	ChromeDriver driver;

	 private WebElement clickonlink;
	 
	public Youtuberesultpage(ChromeDriver driver) {
		this.driver=driver;
		clickonlink=driver.findElement(By.xpath("//a[@id='video-title']"));
		
	}
	
	
	
	public void clickonmydancelink() {
		clickonlink.click();
	}
}
