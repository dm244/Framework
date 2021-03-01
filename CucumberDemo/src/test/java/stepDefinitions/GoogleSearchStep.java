package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStep {
	
	@Given("user on google homepage")
	public void user_on_google_homepage() {
	  System.out.println("Step 1");
	}

	@When("user types  a topic name on search box")
	public void user_types_a_topic_name_on_search_box() {
	  System.out.println("step 2");
	}

	@Then("user hits the search button")
	public void user_hits_the_search_button() {
	    System.out.println("step 3");
	}

	@Then("user navigates to result page")
	public void user_navigates_to_result_page() {
		 System.out.println("step 4");
	}

}
