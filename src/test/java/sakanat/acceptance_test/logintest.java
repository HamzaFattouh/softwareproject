package sakanat.acceptance_test;

import static org.junit.Assert.*;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.*;
import sakanat.user;

public class logintest {
	public user u;
	String username=null;
	
 
	
	@Given("user not logedin")
	public void userNotLogedin() {
	    // Write code here that turns the phrase above into concrete actions
	    u.logout();
	    
	}

	@When("tanent user name is {string}")
	public void tanentUserNameIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    username=string;
	}

	@When("tanent password is  {string}")
	public void tanentPasswordIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    u.login(username, string);
	}

	@Then("tanent is login succeeds")
	public void tanentIsLoginSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(u.getusertype()=="tanent");
	}

	@When("owner user name is {string}")
	public void ownerUserNameIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    username=string;
	}

	@When("owner password is {string}")
	public void ownerPasswordIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    u.login(username, string);
	}

	@Then("owner login succeeds")
	public void ownerLoginSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(u.getusertype()=="owner");
	}
////////////////////////////////////////////////////////////////////////////////
	@When("admin user name is {string}")
	public void adminUserNameIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    username=string;
	}

	@When("admin password is {string}")
	public void adminPasswordIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    u.login(username, string);
	}

	@Then("Administrator login succeeds")
	public void administratorLoginSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(u.getusertype()=="admin");
	}

	@When("wrong user name is {string}")
	public void wrongUserNameIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
		username=string;
	}

	@When("wrong password is {string}")
	public void wrongPasswordIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
		u.login(username, string);
	}

	@Then("show Wrong data massage")
	public void showWrongDataMassage() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(u.getuserlogedin()==true);
	}

}
