package Step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_search_Steps
{
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open - Step1");
	}

	@And("user is on google home page")
	public void user_is_on_google_home_page() {
		System.out.println("user is on google home page - Step2");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("user enters a text in search box - Step3");
	}
	

	@And("hits enter")
	public void hits_enter() {
		System.out.println("hits enter - Step4");
	}

	@Then("user is navigated to the search page")
	public void user_is_navigated_to_the_search_page() {
		System.out.println("user is navigated to the search page - Step5");
	}

}
