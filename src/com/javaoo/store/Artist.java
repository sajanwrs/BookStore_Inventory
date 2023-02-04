/**
 * 
 */
package com.javaoo.store;

/**
 * @author waris
 *
 */
public class Artist {
	/**
	 * @param name
	 */
	public Artist(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	private String name;
	private String[] memberNames = new String[20];
	private String[] memberInstruments = new String[20];

}
