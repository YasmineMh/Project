package com.booky.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "reviews")
public class Review {

	@Id
    @GeneratedValue
	private Long id;
	@Lob 
	@Column(name = "comment", length=512)
	private String comment;
	@Column(name = "stars")
	private int stars;
	@Column(name = "date")
	private String date;
	
	@ManyToOne
	@JoinColumn(name="VISITOR")
	private Visitor visitor;
	@ManyToOne
	@JoinColumn(name="REVIEW")
	private Visitor review;
	public Review() {
		super();
	}
	public Review(String comment, int stars, String date) {
		super();
		this.comment = comment;
		this.stars = stars;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Visitor getVisitor() {
		return visitor;
	}
	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}
	public Visitor getReview() {
		return review;
	}
	public void setReview(Visitor review) {
		this.review = review;
	}
	
	
}
