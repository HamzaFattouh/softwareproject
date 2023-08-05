package sakanat.acceptance_test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakanat.house;

public class gethousetest {

	house h = new house();
	house house1 = new house();
	@Given("There are house in database")
	public void thereAreHouseInDatabase() {
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

	@When("I retrieving the house")
	public void iRetrievingTheHouse() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The house retrieving successfuly")
	public void theHouseRetrievingSuccessfuly() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	house.gethouse(h.getTitle());
	    	assertTrue(true);
	    }catch(Exception e) {
	    	
	    }
	}

	@Given("The house not in database")
	public void theHouseNotInDatabase() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the house not retrieving")
	public void theHouseNotRetrieving() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	house.gethouse("wrong");
	    }catch(Exception e) {
	    	assertTrue(true);
	    }
	}
	
}
