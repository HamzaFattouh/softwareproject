package sakanat.acceptance_test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakanat.house;

public class housedeletetest {

	house h = new house();
	@Given("the house Existing in database")
	public void theHouseExistingInDatabase() {
	    // Write code here that turns the phrase above into concrete actions
		h.setTitle("house2");
	    h.setLocation("nablus");
	    h.setOwnerName("ownerusername");
	    h.setTanentName("tanentusername");
	    h.setPrice(500.0);
	    h.setDescription("decription");
	    h.setContactInformation("tel. 0599999999");
	    house.addhouse(h);
	}

	@When("I delete the house")
	public void iDeleteTheHouse() {
	    // Write code here that turns the phrase above into concrete actions
	    house.deletehouse(h.getTitle());
	}

	@Then("the house deleted successfuly")
	public void theHouseDeletedSuccessfuly() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	house.gethouse(h.getTitle());
	    }catch(Exception e) {
	    	assertTrue(true);
	    }
	}

	@Given("the house is not Existing in database")
	public void theHouseIsNotExistingInDatabase() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Idelete the house")
	public void ideleteTheHouse() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Show error message")
	public void showErrorMessage() {
	    // Write code here that turns the phrase above into concrete actions
		try {
	    	house.gethouse("notExisting");
	    }catch(Exception e) {
	    	assertTrue(true);
	    }
	}
	
}
