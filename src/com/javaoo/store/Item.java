/**
 * 
 */
package com.javaoo.store;

/**
 * @author waris
 *
 */
public class Item {

	/**
	 * 
	 */
	public Item() {
		super();
	}

	/**
	 * @param title
	 * @param price
	 * @param quantity
	 */
	public Item(String title, double price, int quantity) {
		super();
		this.setTitle(title);
		this.setPrice(price);
		this.setQuantity(quantity);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
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

	private String title;
	private double price;
	private int quantity;

}
