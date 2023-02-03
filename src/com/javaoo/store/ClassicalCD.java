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
	 * @return the perfomers
	 */
	public String[] getPerfomers() {
		return perfomers;
	}

	/**
	 * @param perfomers the perfomers to set
	 */
	public void setPerfomers(String[] perfomers) {
		this.perfomers = perfomers;
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
	private String[] perfomers = new String[5];
	private String recordingLocation;
	private Date releaseDate = new Date();

}
