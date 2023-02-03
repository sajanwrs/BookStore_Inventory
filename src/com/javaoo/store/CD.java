/**
 * 
 */
package com.javaoo.store;

import java.util.Date;

/**
 * @author waris
 *
 */
public class CD extends Item {
	/**
	 * @return the artist
	 */
	public Artist getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
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

	private Artist artist = new Artist();
	private Date releaseDate = new Date();

}
