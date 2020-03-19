package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.test.cucumberFrameworkpagesPOM.YoutubeSearch;
import com.test.cucumberFrameworkpagesPOM.YoutubeValidateURL;
import com.test.cucumberFrameworkpagesPOM.Youtuberesultpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utilities.Browser;
import utilities.BrowserAndProperties;
import utilities.ReadPropertyFiles;

public class CucumberFrameworkPOMvalidateURL  {



ChromeDriver driver;
ReadPropertyFiles property=new ReadPropertyFiles();
//BrowserAndProperties property=new BrowserAndProperties();

	
@Given("^user opens the youtube browser$")
public void user_opens_the_youtube_browser() throws Throwable {
	//property.browser("browsername", "URL");
	
	//Browser.openBrowser(driver, property.get("browsername"), property.get("URI1"));
   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get(property.get("URL"));
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   
   }

@Given("^user clicks on search button$")
public void user_clicks_on_search_button() throws Throwable {
	YoutubeSearch search=new YoutubeSearch(driver);
	search.entersearchTextbox("prems cube");
	search.Clickbutton();
	
//	new YoutubeSearch(driver).entersearchTextbox("prems cube");
//	new YoutubeSearch(driver).Clickbutton();
	}

@When("^user navigates to results page and clicks on particular link$")
public void user_navigates_to_results_page_and_clicks_on_particular_link() throws Throwable {
	Youtuberesultpage result=new Youtuberesultpage(driver);
	result.clickonmydancelink();
	}

@Then("^user subscribe the channel and validates the URL$")
public void user_subscribe_the_channel_and_validates_the_URL() throws Throwable {
new YoutubeValidateURL(driver).validateURL();
new YoutubeValidateURL(driver).takesscreenshot("youtube12");
//String Expected= "Sia - Cheap Thrills || Prem's Cube || Hyderabad";
//Assert.assertEquals(Expected, new YoutubeValidateURL(driver).validateURL());

//	WebElement string=validate.validateURL();
//	System.out.println(string);

}


}
