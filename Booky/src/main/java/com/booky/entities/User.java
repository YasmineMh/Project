package com.booky.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;


@Entity
@DiscriminatorColumn(name="TYPE_USER",
discriminatorType=DiscriminatorType.STRING,length=5)
@Table(name = "users")
public abstract class User {

	@Id
    @GeneratedValue
	private Long id;
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	@Email
	private String email;
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastname;
	
	
	
	public User(String login, String password, @Email String email, String name, String lastname) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
		this.name = name;
		this.lastname = lastname;
	}
	public User() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
