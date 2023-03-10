/**
 * 
 */
package com.javaoo.store;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author waris
 *
 */
public class Artist {
	/**
	 * default Constructor
	 */
	public Artist() {
		memberNames = new TreeSet();
		memberInstruments = new TreeMap();
	}
	/**
	 * @param name
	 * @param memberNames
	 * @param memberInstruments
	 */
	public Artist(String name, SortedSet<String> memberNames, Map<String, SortedSet<String>> memberInstruments) {
		super();
		setName(name);
		this.memberNames = memberNames;
		this.memberInstruments = memberInstruments;
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
	
	/*
	 * Method for adding members to the collections
	 */
	public void addMember(String name, SortedSet<String> instruments) {
		memberNames.add(name);
		memberInstruments.put(name, instruments);
	}
	
	/*
	 * Method to get members of the collection
	 */
	public SortedSet<String> getMembers(){
		return memberNames;
	}

	/*
	 * Method to get  instruments
	 */
	public SortedSet<String> getInstruments(String memberNames){
		return memberInstruments.get(memberNames);
	}
	

	private String name;
	/*
	 * Converting both Arrays to Collections
	 */
	//private String[] memberNames = new String[20];
	private SortedSet<String> memberNames;
	//private String[] memberInstruments = new String[20];
	private Map<String, SortedSet<String>> memberInstruments;
}
