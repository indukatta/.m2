package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.PostcodeAPIStatusCheckSteps;

public class PostcodeAPISearch {

    @Steps
    PostcodeAPIStatusCheckSteps statusSteps;

    @Given("User set postcode service api endpoint")
    public void user_set_postcode_api_endpoint(){
        statusSteps.setPostcodeAPIEndpoint();
    }

    @When("User send a Get HTTP request to search postcode : {string}")
    public void user_selects_visit_family_option(String postcode){
        statusSteps.searchPostcode(postcode);
    }

    @Then("User should receive response status 200")
    public void verify_response_status(){
        statusSteps.searchIsExecutedSuccessfully();
    }
}
