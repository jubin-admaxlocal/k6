package com.entlogics.entities;

import java.util.Date;
import java.util.Set;

public class Shelf {
	private int shelfId;
	private String shelfName;
	private int noofracks;
	private Set<Rack> racks;
	private Date dateCreated;
	private Date dateUpdated;

	public int getShelfId() {
		return shelfId;
	}

	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}

	public String getShelfName() {
		return shelfName;
	}

	public void setShelfName(String shelfName) {
		this.shelfName = shelfName;
	}

	public int getNoofracks() {
		return noofracks;
	}

	public void setNoofracks(int noofracks) {
		this.noofracks = noofracks;
	}

	public Set<Rack> getRacks() {
		return racks;
	}

	public void setRacks(Set<Rack> racks) {
		this.racks = racks;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	@Override
	public String toString() {
		return "Shelf [shelfId=" + shelfId + ", shelfName=" + shelfName
				+ ", noofracks=" + noofracks + ", racks=" + racks
				+ ", dateCreated=" + dateCreated + ", dateUpdated="
				+ dateUpdated + "]";
	}

}
