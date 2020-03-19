package stepDefinations;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Hooks;
import utilities.ReadPropertyFiles;

public class login  {

	 ChromeDriver driver;
	 Properties property=new Properties();
	 ReadPropertyFiles obj=new ReadPropertyFiles();
	 
@Given("^user opens newtours home page$")
public void user_opens_newtours_home_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(obj.get("URI"));
	//driver.get("http://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
    }

@And("^user enters username$")
public void user_enters_username() throws Throwable {
    WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
    username.sendKeys("anushakasu44");
}

@And("^user enters password$")
public void user_enters_password() throws Throwable {
	WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("anushakasu");
}

@When("^user click on signin button$")
public void user_click_on_signin_button() throws Throwable {
	WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
}

@Then("^user able to login in sucessfully$")
public void user_able_to_login_in_sucessfully() throws Throwable {
    System.out.println("sucessfull login");
}


}
