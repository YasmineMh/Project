package com.booky.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@DiscriminatorValue("PUBLI")
@Table(name = "publishers")
public class Publisher extends User{

	@Lob 
	@Column(name = "description", length=512)
	private String description;

	@OneToMany(mappedBy="publisher",fetch=FetchType.LAZY)
	private Collection<Book> books;

	@ManyToOne
	@JoinColumn(name="ADMIN")
	private Admin admin;
	
	
	public Publisher() {
		super();
	}

	public Publisher(String login, String password, @Email String email, String name, String lastname,
			String description) {
		super(login, password, email, name, lastname);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Book> getBooks() {
		return books;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
}
