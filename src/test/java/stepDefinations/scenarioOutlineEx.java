package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenarioOutlineEx {
	

ChromeDriver driver;
WebElement reg;
WebElement fname;
WebElement lname;
WebElement submit;

@Given("^I navigate to home page$")
public void i_navigate_to_home_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}

@Given("^I click on register link$")
public void i_click_on_register_link() throws Throwable {
    reg=driver.findElement(By.xpath("//a[text()='REGISTER']"));
    reg.click();
}

@When("^I enter anushakasu(\\d+) and anushakasu$")
public void i_enter_anushakasu_and_anushakasu(int arg1) throws Throwable {
	 fname=driver.findElement(By.xpath("//input[@name='firstName']"));
	    fname.sendKeys("anushakasu44");
	    lname=driver.findElement(By.xpath("//input[@name='lastName']"));
	    lname.sendKeys("anushakasu");
}

@When("^I click on signin button$")
public void i_click_on_signin_button() throws Throwable {
	 submit=driver.findElement(By.xpath("//input[@type='submit']"));
	    submit.click();
	
}

@Then("^I can able to login sucessfully$")
public void i_can_able_to_login_sucessfully() throws Throwable {
    System.out.println("sucessfull");
}

@When("^I enter anushareddy(\\d+) and anushareddy$")
public void i_enter_anushareddy_and_anushareddy(int arg1) throws Throwable {
	 fname=driver.findElement(By.xpath("//input[@name='firstName']"));
	    fname.sendKeys("anushareddy55");
	    lname=driver.findElement(By.xpath("//input[@name='lastName']"));
	    lname.sendKeys("anushareddy");
}


}