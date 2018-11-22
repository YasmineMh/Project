package com.booky.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


@Entity
@DiscriminatorValue("ADMIN")
@Table(name = "admins")
public class Admin extends User {

	@Column(name = "type")
    @NotEmpty
	private String type;

	@OneToMany(mappedBy="admin",fetch=FetchType.LAZY)
	private Collection<Publisher> publishers;
	
	
	public Admin() {
		super();
	}

	public Admin(String login, String password, @Email String email, String name, String lastname,
			@NotEmpty String type) {
		super(login, password, email, name, lastname);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Collection<Publisher> getPublishers() {
		return publishers;
	}

	public void setPublishers(Collection<Publisher> publishers) {
		this.publishers = publishers;
	}

	
	
	
	
}
