/**
 * 
 */
package com.javaoo.store;

import java.util.Date;

/**
 * @author waris
 *
 */
public class ClassicalCD extends Item {
	/**
	 * @return the composer
	 */
	public String getComposer() {
		return composer;
	}

	/**
	 * @param composer the composer to set
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}

	/**
	 * @return the recordingLocation
	 */
	public String getRecordingLocation() {
		return recordingLocation;
	}

	/**
	 * @param recordingLocation the recordingLocation to set
	 */
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}

	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	private String composer;
	private String[] performers = new String[5];
	private String recordingLocation;
	private Date releaseDate;
	
	/*
	 * method for adding new performer
	 */
	private int performerCount = 0;
	
	public void addPerformer(String performer) {
			if(performerCount >= performers.length) {
				System.out.println("Error!! There is no room for new performer.");
			}
			else
			{
				performers[performerCount] = performer;
				performerCount++;
			}

		}
	
	/*
	 * method to Display performers
	 */
	public void showPerformers() {
		if(performerCount ==0)
			System.out.println("No performers have been added for this CD.");
		for(int i=0; i < performerCount; i++) {
			System.out.println("Performer is " + performers[i]);
		}
	}
	
	

}
