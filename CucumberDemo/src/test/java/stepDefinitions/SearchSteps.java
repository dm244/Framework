package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	
	
	
	@Given("I have a seach page on amazon page")
	public void i_have_a_seach_page_on_amazon_page() {
	   System.out.println("i am on search page");
	}

	@When("I search a product with the name {string}")
	public void i_search_a_product_with_the_name(String string) {
	    System.out.println("step 2- search the product with name");
	    
	    
	}

	@Then("Product with name {string} should display")
	public void product_with_name_should_display(String string) {
	   System.out.println("step 3- product name will display");
	}

}

