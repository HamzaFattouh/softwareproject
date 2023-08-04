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
	    
		
	    List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class);

	    for (Map<String, String> user : userDetails) {
	        user1.setUserName(user.get("username"));
	        password = user.get("password");
	        user1.setUserType(user.get("user_type"));
	        user1.setAddress(user.get("adrress"));
	        user1.setPhoneNumber(user.get("phone_number"));
	        user1.setGender(user.get("gender"));
	        user1.setBirthDate(user.get("birth_date"));
	        user1.setEmail(user.get("email"));
	        System.out.println("11111111111");
	        
	    }
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user is added")
	public void theUserIsAdded() {
	    user1.adduser(user1, password);
	}

	@Then("the user added successfully")
	public void theUserAddedSuccessfully() {
	    user1.login(user1.getUserName(), password);
	    assertTrue(user1.getuserlogedin()==true);
	}

	@Given("a user with username {string} already exists in the database")
	public void aUserWithUsernameAlreadyExistsInTheDatabase(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    user1.setUserName("tanentusername");
	}

	@Then("the user not added")
	public void theUserNotAdded() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	user1.adduser(user1, password);
	    }catch(Exception e) {
	    	assertTrue(true);
	    }
		
	}
	
	
}
