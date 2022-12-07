package com.marketingapp.dto;

public class Lead {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String city;
	private String mobile;
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
