package stepdefinitions;



import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Product product;
	Search search;

	@Given(": I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	   System.out.println("step 1 - on search page");
	}

	@When(": I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productname, Integer price) 
	{
	    System.out.println("step 2 - search product name and price" + productname 
	    		 + "price" +price);
	    
	    product = new Product(productname, price);
	}

	@Then(": Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed (String productname) {
	    System.out.println("product name is displayed" +productname );
	    search = new Search();
	   String name =  search.displayProduct(product);
	System.out.println("Product is " + name);
	
	
	}
}
