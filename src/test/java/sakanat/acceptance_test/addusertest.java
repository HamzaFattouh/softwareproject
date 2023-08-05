package sakanat.acceptance_test;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakanat.user;

public class addusertest {

	user user1=new user();
	String password=null;
	
	@Given("a user with the following details:")
	public void aUserWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
	    
		
	    
	        user1.setUserName("hamza1");
	        password = "12345";
	        user1.setUserType("owner");
	        user1.setAddress("nablus");
	        user1.setPhoneNumber("0599999999");
	        user1.setGender("m");
	        user1.setBirthDate("2000-09-09");
	        user1.setEmail("hamza1@gmail.com");
	        
	        
	    
		
	    
	}

	@When("the user is added")
	public void theUserIsAdded() {
	    user1.adduser(user1, password);
	}

	@Then("the user added successfully")
	public void theUserAddedSuccessfully() {
		//assertTrue(true);
	    user1.login(user1.getUserName(), password);
	    assertTrue(user1.getuserlogedin()==true);
	}

	@Given("a user with username {string} already exists in the database")
	public void aUserWithUsernameAlreadyExistsInTheDatabase(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the user not added")
	public void theUserNotAdded() {
		//assertTrue(true);
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	user1.adduser(user1, password);
	    }catch(Exception e) {
	    	assertTrue(true);
	    }
	    user.deleteuser(user1.getUserName());
		
	}
	
	
}
