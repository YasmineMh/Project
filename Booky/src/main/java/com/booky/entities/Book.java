package com.booky.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
    @GeneratedValue
	private Long id;
	@Column(name = "author")
	private String author;
	@Lob 
	@Column(name = "description", length=512)
	private String description;
	@Column(name = "kind")
	private String kind;
	@Column(name = "price")
	private double price;
	@Column(name = "discount")
	private double discount;
	@Column(name = "title")
	private String title;
	@Column(name = "edition")
	private String edition;
	@Column(name = "category")
	private String category;
	@Column(name = "availability")
	private String availability;
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "books")
	private Collection<Order> orders;
	@OneToMany(mappedBy="visitor",fetch=FetchType.LAZY)
	private Collection<Review> reviews;
	@ManyToOne
	@JoinColumn(name="PUBLISHER")
	private Publisher publisher;
	
	public Book() {
		super();
	}
	public Book(String author, String description, String kind, double price, double discount, String title,
			String edition, String category, String availability) {
		super();
		this.author = author;
		this.description = description;
		this.kind = kind;
		this.price = price;
		this.discount = discount;
		this.title = title;
		this.edition = edition;
		this.availability = availability;
		this.category=category;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
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
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
