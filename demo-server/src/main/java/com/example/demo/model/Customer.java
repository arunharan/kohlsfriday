package com.example.demo.model;

public class Customer {
	public Customer(String firstName, String lastName, String dob, String postCode, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.postCode = postCode;
		this.city = city;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	String firstName;
	String lastName; 
	String dob;
	String postCode; 
	String city;
		
	
}
