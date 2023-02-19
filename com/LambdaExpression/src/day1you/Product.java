package day1you;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product {
	private int productId;
	private String productName;
	private int quantity;
	private int price;
	
	
	public Product(int productId, String productName, int quantity, int price) {
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}


	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}


	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}


	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}


	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}


	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "ProductId=" + productId + ", ProductName=" + productName + ", Quantity=" + quantity
				+ ", Price=" + price + "\n";
	}


	public static void main(String[] args) {
		List<Product> prod = new ArrayList<>();
		prod.add(new Product(1,"Product1",2,2000));
		prod.add(new Product(1,"Product2",1,3000));
		prod.add(new Product(1,"Product3",3,4000));
		prod.add(new Product(1,"Product4",4,5000));
		prod.add(new Product(1,"Product5",1,1000));
		
		
		Collections.sort(prod, (s1,s2) -> s1.getPrice() > s2.getPrice() ? 1 : -1);
		System.out.println(prod);
	}
	
}
