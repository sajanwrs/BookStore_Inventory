/**
 * 
 */
package com.javaoo.store;

/**
 * @author waris
 *
 */
public class Book extends Item {
	/**
	 * @param title
	 * @param price
	 * @param quantity
	 * @param author
	 * @param publisher
	 * @param category
	 */
	public Book(String title, double price, int quantity, String author, String publisher, String category) {
		super(title, price, quantity);
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setCategory(category);
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	private String author;
	private String publisher;
	private String category;

}
