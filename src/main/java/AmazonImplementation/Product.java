package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
private	String productname;
	private int price;
	public Product(String productname, Integer price) {
		this.productname = productname;
		this.price = price;
	
	
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
public List<String> getProductList()
{
	List<String> productList = new ArrayList<>();
	productList.add("Iphone");
	productList.add("Micromax");
	productList.add("Oneplus");
	productList.add("Samsung");
	return productList;


}
	
	
	
	
	
	
}
