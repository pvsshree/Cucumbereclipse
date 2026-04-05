 package stepdefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {
	
	
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	    
	System.out.println("Datatable example");
	
	
	}
	
	
	
	@When("User enters following details")
	public void user_enters_following_details(DataTable dataTable) {
		
		List<List<String>> userList = dataTable.asLists(String.class);
		System.out.println(userList);
		
		for(List<String> e : userList)
		{
			
			System.out.println(e);
		}
	    
	}
	
	
	@When("User enters following details with coloumns")
	public void user_enters_following_details_with_coloumns(DataTable dataTable) {
	    List<Map<String, String>> userList = dataTable.asMaps(String.class,String.class);
	    System.out.println("What is stored in userList " + userList);
	    
	    
	    for (Map<String, String> e : userList)
	    {
 System.out.println("What is stored in e " + e);
	   // System.out.println("Individual entry");
	    
	    System.out.println(e.get("Firstname"));
	    
	    System.out.println(e.get("Lastname"));
	    System.out.println(e.get("Email"));
	    System.out.println(e.get("Phone"));
	    System.out.println(e.get("City"));
	    
	    }

	}

	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
	    System.out.println("Enteries added");
	}


}
