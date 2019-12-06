package squash.tf_sample;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class NationWeatherSteps {
    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;
    private String ENDPOINT_NATIONALWEATHER = "https://api.weather.gov/";


    @Given("Je selectionne l API National Weather")
    public void enter_endpoint(){
      RestAssured.baseURI = ENDPOINT_NATIONALWEATHER;
      request = given();
    }

    @Given("Je selectionne la zone {string}")
    public void addParam(String area) {
        request.param("area", area);
    }

    @When("j envoie une requete GET sur l endpoint {string}")
    public void pull_request_endpoint(String endpoint){
        response = request.when().get(endpoint);
        System.out.println("response: " + response.prettyPrint());
    }

    @Then("Le code retour est {int}")
    public void verify_status_code(int statusCode){
        json = response.then().statusCode(statusCode);
    }


}
