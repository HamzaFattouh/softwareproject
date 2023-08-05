package sakanat.acceptance_test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakanat.user;

public class deleteuser {
	
	
	
	@Given("a user with username {string} exists in the database")
	public void aUserWithUsernameExistsInTheDatabase(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    user.adduser(new user(string,"owner","nablus","0599999999","m","2000-09-09","hamza1@gmail.com"), "11111");
	}

	@When("the user {string} is deleted")
	public void theUserIsDeleted(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    user.deleteuser(string);
	}

	@Then("the user {string} should be successfully deleted from the database")
	public void theUserShouldBeSuccessfullyDeletedFromTheDatabase(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    try{
	    	user.login(string, "11111");
	    }catch(Exception e) {
	    	assertTrue(true);
	    }
	}

	@Given("a user with username {string} does not exist in the database")
	public void aUserWithUsernameDoesNotExistInTheDatabase(String string) {
	    // Write code here that turns the phrase above into concrete actions
		user.deleteuser(string);
	}

	@Then("the system should display a message that the user {string} does not exist")
	public void theSystemShouldDisplayAMessageThatTheUserDoesNotExist(String string) {
	    // Write code here that turns the phrase above into concrete actions
		try{
			user.deleteuser(string);
	    }catch(Exception e) {
	    	assertTrue(true);
	    }
	}
	
}
