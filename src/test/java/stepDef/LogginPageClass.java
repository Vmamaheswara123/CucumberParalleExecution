package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import perPackages.TestBase;

public class LogginPageClass extends TestBase {

	@Given("I want to write a step with precondition in Chrome Browser")
	public void i_want_to_write_a_step_with_precondition_in_Chrome_Browser() {
		System.out.println("Chrome Browser");
		chrome_browserSetup();
	}

	@Given("I want to write a step with precondition in Edge Browser")
	public void i_want_to_write_a_step_with_precondition_in_Edge_Browser() {
		System.out.println("Edge Browser");
		edge_browserSetup();
	}

	@Given("I want to write a step with precondition in firefoxBrowser")
	public void i_want_to_write_a_step_with_precondition_in_firefoxBrowser() {
		System.out.println("firefoxBrowse");
		geko_browserSetup();
	}

	@And("some other precondition")
	public void some_other_precondition() {
		System.out.println("some other precondition");
		
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("I complete action");
		
	}

	@And("some other action")
	public void some_other_action() {
		System.out.println("some other action");
		
	}

	@And("yet another action")
	public void yet_another_action() {
		System.out.println("yet another action");
		
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("I validate the outcomes");
		
	}

	@And("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("check more outcomes");
		tearDown();
	}

}
