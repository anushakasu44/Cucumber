package com.test.cucumberFrameworkpagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSearch {
ChromeDriver driver;
	private WebElement searchTextbox;
	private WebElement Clickbutton;
	
	public YoutubeSearch(ChromeDriver driver) {
		this.driver=driver;
		
		searchTextbox=driver.findElement(By.xpath("//input[@id='search']"));
		Clickbutton= driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		
	}
	
	public void entersearchTextbox(String value) {
		searchTextbox.sendKeys(value);
	}
	
	public void Clickbutton() {
		Clickbutton.click();
	}
	
	
}
