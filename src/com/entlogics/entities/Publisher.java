package com.entlogics.entities;

import java.util.Date;
import java.util.Set;

public class Publisher {
	private int publisherId;
	private String publisherName;
	private String address;
	private long phone;
	private String email;
	private Set<Book> books;
	private Date dateCreated;
	private Date dateUpdated;

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
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
		return "Publisher [publisherId=" + publisherId + ", publisherName="
				+ publisherName + ", address=" + address + ", phone=" + phone
				+ ", email=" + email + ", books=" + books + ", dateCreated="
				+ dateCreated + ", dateUpdated=" + dateUpdated + "]";
	}

}
