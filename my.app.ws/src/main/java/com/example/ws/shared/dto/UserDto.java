package com.example.ws.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encryptpass;
	private String emailver;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
