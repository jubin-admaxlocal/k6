package com.entlogics.entities;

import java.util.Date;
import java.util.List;

public class Rack {
	private int rackId;
	private int capacity;
	private int shelfId;
	private List<Book> books;
	private Date dateCreated;
	private Date dateUpdated;

	public int getRackId() {
		return rackId;
	}

	public void setRackId(int rackId) {
		this.rackId = rackId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getShelfId() {
		return shelfId;
	}

	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
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
		return "Rack [rackId=" + rackId + ", capacity=" + capacity
				+ ", shelfId=" + shelfId + ", books=" + books
				+ ", dateCreated=" + dateCreated + ", dateUpdated="
				+ dateUpdated + "]";
	}

}
