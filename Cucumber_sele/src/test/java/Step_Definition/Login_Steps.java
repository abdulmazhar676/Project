package Step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page - step1");
	    
	}

	@When("enters username and password")
	public void enters_username_and_password() {
		System.out.println("enters username and password - step2");
		
	   
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		System.out.println("clicks on the login button - step3");
		
	}

	@Then("user navigate to the home page")
	public void user_navigate_to_the_home_page() {
		
		System.out.println("user navigate to the home page - step4");
	}

}
