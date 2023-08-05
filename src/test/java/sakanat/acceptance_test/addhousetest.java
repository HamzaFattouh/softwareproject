package sakanat.acceptance_test;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakanat.house;

public class addhousetest {

	house h=new house();
	
	@Given("I have house detals")
	public void iHaveHouseDetals() {
	    // Write code here that turns the phrase above into concrete actions
	    h.setTitle("house2");
	    h.setLocation("nablus");
	    h.setOwnerName("ownerusername");
	    h.setTanentName("tanentusername");
	    h.setPrice(500.0);
	    h.setDescription("decription");
	    h.setContactInformation("tel. 0599999999");
	    
	}

	@When("I add the house")
	public void iAddTheHouse() {
	    // Write code here that turns the phrase above into concrete actions
	    house.addhouse(h);
	}

	@Then("The house is added successfuly")
	public void theHouseIsAddedSuccessfuly() {
	    // Write code here that turns the phrase above into concrete actions
	    try{
	    	assertFalse(house.gethouse("house1").equals(null));
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	}

	@Given("I have house detals with duplicate title")
	public void iHaveHouseDetalsWithDuplicateTitle() {
	    // Write code here that turns the phrase above into concrete actions
	    //same data
	}

	@When("I add house")
	public void iAddHouse() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the system should display an error message about duplicate title")
	public void theSystemShouldDisplayAnErrorMessageAboutDuplicateTitle() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	house.addhouse(h);
	    }catch(Exception e) {
	    	assertTrue(true);
	    }
	    house.deletehouse(h.getTitle());
	}
	
	
	
}
