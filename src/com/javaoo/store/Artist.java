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

	/**
	 * @return the memberNames
	 */
	public String[] getMemberNames() {
		return memberNames;
	}

	/**
	 * @param memberNames the memberNames to set
	 */
	public void setMemberNames(String[] memberNames) {
		this.memberNames = memberNames;
	}

	/**
	 * @return the memberInstruments
	 */
	public String[] getMemberInstruments() {
		return memberInstruments;
	}

	/**
	 * @param memberInstruments the memberInstruments to set
	 */
	public void setMemberInstruments(String[] memberInstruments) {
		this.memberInstruments = memberInstruments;
	}

	private String name;
	private String[] memberNames = new String[20];
	private String[] memberInstruments = new String[20];

}
