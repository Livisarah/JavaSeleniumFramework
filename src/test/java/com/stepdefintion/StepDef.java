package com.stepdefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	@Given("I am in the given step")
	public void i_am_in_the_given_step() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("in the given step");
	}

	@When("I am in the when step")
	public void i_am_in_the_when_step() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("in the when step");
	}

	@Then("I am in the then step")
	public void i_am_in_the_then_step() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("in the then step");
	}
}
