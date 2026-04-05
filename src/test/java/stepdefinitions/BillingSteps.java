package stepdefinitions;

import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import io.cucumber.java.en.When; import junit.framework.Assert;

public class BillingSteps {
	 double taxAmount; double billingAmount; double finalAmount;

	@Given("User is on billing page")
	public void user_is_on_billing_page() {
	}
	@When("User enters billingamount {string}")
	public void user_enters_billingamount(String billingAmount) {
	    this.billingAmount = Double.parseDouble(billingAmount);}

	@When("User enters taxamount {string}")
	public void user_enters_taxamount(String taxAmount) {
		this.taxAmount = Double.parseDouble(taxAmount);
	}

	@When("User clicks on calculate button")
	public void user_clicks_on_calculate_button() {
			System.out.println("Clicked on calculate");   
	}

	@Then("It gives final amount {string}")
	public void it_gives_final_amount(String expFinalAmount) 
	{  this.finalAmount = this.billingAmount + this.taxAmount;
	    System.out.println("Actual Final Amt" + this.finalAmount );
	    System.out.println("Exp Fianl Amt" + Double.parseDouble(expFinalAmount));
	    Assert.assertTrue(this.finalAmount == Double.parseDouble(expFinalAmount) );
	}
}
