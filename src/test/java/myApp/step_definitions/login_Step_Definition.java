package myApp.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Step_Definition {


    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("user is on landing page");
    }


    @When("use enters credentials")
    public void use_enters_credentials() {
        System.out.println("user enter credential ");
    }


    @When("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("user clicks login button");
    }


    @Then("user supposed to se welcome message")
    public void user_supposed_to_se_welcome_message() {
        System.out.println("user supposed to se welcome message");
    }

}
