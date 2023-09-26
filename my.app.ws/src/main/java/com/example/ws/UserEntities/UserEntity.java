package com.example.ws.UserEntities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="users")
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 2714611840658463304L;
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false)
	private String userId;
	
	@Column(nullable = false,length = 50)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	//unique=true pour empecher user to save another same
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String encryptpass;
	
	@Column(nullable = true)
	private String emailver;
	
	@Column(nullable = false)
	private Boolean emailstatut=false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptpass() {
		return encryptpass;
	}

	public void setEncryptpass(String encryptpass) {
		this.encryptpass = encryptpass;
	}

	public String getEmailver() {
		return emailver;
	}

	public void setEmailver(String emailver) {
		this.emailver = emailver;
	}

	public Boolean getEmailstatut() {
		return emailstatut;
	}

	public void setEmailstatut(Boolean emailstatut) {
		this.emailstatut = emailstatut;
	}
	
	
	

	
}
