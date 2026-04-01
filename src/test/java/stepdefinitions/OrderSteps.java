package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	

@Given("A user should be registered user")
public void a_user_should_be_registered_user() {
	System.out.println("Step1");
    
}

@Given("User should be on Amazon login page")
public void user_should_be_on_amazon_login_page() {
	System.out.println("Step2");
    
}

@When("User enters username")
public void user_enters_username() {
	System.out.println("Step3");
    
}

@When("User enters password")
public void user_enters_password() {
	System.out.println("Step4");
    
}

@When("User clicks on login button")
public void user_clicks_on_login_button() {
	System.out.println("Step5");
    
}

@Then("USer navigates to order page")
public void u_ser_navigates_to_order_page() {
    
}

@When("user clicks on order link")
public void user_clicks_on_order_link() {
    
}

@Then("user navigates to order page")
public void user_navigates_to_order_page() {
   
}

@When("user clicks on open order link")
public void user_clicks_on_open_order_link() {
    
}

@Then("user navigates open to order page")
public void user_navigates_open_to_order_page() {
    
}

@When("user clicks on cancelled order link")
public void user_clicks_on_cancelled_order_link() {
   
}

@Then("user navigates to cancelled order page")
public void user_navigates_to_cancelled_order_page() {
   
}}
