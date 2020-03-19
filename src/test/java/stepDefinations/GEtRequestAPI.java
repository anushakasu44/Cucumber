package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GEtRequestAPI {
Response response;


@Given("^user specifies base URI$")
public void user_specifies_base_URI() throws Throwable {
	 RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
}

@And("^user creates request object and gets the response by creating response object$")
public void user_creates_request_object_and_gets_the_response_by_creating_response_object() throws Throwable {
    RequestSpecification httprequest=RestAssured.given();
     response=httprequest.request(Method.GET,"/hyderabad");
}

@When("^user gets the responsebody$")
public void user_gets_the_responsebody() throws Throwable {
	System.out.println(response.getBody().asString());
}

@And("^user gets the response of status code and status line validation$")
public void user_gets_status_code_and_status_line_validation() throws Throwable {
	int statuscode=response.getStatusCode();
    System.out.println(statuscode);
   // Assert.assertEquals("city", equals("hyderabad"));
    Assert.assertEquals(statuscode,200);
    System.out.println(response.getStatusLine());
}


@Then("^user should able to get succesfull message dislayed$")
public void user_should_able_to_get_succesfull_message_dislayed() throws Throwable {
    System.out.println("sucessfull");
}


}
