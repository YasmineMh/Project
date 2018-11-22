package com.booky.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;



@Entity
@DiscriminatorValue("VISIT")
@Table(name = "visitors")
public class Visitor extends User {

	@Column(name = "phoneNumber")
	private String phoneNumber;
	@Column(name = "address")
	private String address;
	
	@OneToMany(mappedBy="visitor",fetch=FetchType.LAZY)
	private Collection<Order> orders;
	 
	 @OneToMany(mappedBy="visitor",fetch=FetchType.LAZY)
		private Collection<Review> reviews;
	
	 
	 
	public Visitor(String login, String password, @Email String email, String name, String lastname) {
		super(login, password, email, name, lastname);
	}
	public Visitor(String login, String password, @Email String email, String name, String lastname, String phoneNumber,
			String address) {
		super(login, password, email, name, lastname);
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Collection<Order> getOrders() {
		return orders;
	}
	public void setOrders(Collection<Order> orders) {
		this.orders = orders;
	}
	public Collection<Review> getReviews() {
		return reviews;
	}
	public void setReviews(Collection<Review> reviews) {
		this.reviews = reviews;
	}
	
	
	
	
}
