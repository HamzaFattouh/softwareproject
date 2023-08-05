package sakanat.acceptance_test;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakanat.user;

public class getuserstest {

	ArrayList<user> al = new ArrayList<user>();
	user user1 = new user();
	String password = null;
	@Given("there are users in the database")
	public void thereAreUsersInTheDatabase() {
	    // Write code here that turns the phrase above into concrete actions
		user1.setUserName("hamza1");
        password = "12345";
        user1.setUserType("owner");
        user1.setAddress("nablus");
        user1.setPhoneNumber("0599999999");
        user1.setGender("m");
        user1.setBirthDate("2000-09-09");
        user1.setEmail("hamza1@gmail.com");
        user.adduser(user1, password);
        
	}

	@When("I retrieve the list of users")
	public void iRetrieveTheListOfUsers() {
	    // Write code here that turns the phrase above into concrete actions
		al=user.getuser();
	}

	@Then("the list of users should not be empty")
	public void theListOfUsersShouldNotBeEmpty() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(al.isEmpty());
	}
	
}
