package com.minipod.model;

public class UserProfile {
	
	private String firstName; //mandatory
	private String lastName;
	private int age;
	private String address;
	private int mobile;
	private String email; //mandatory
	private String country;
	
	// Default Constructor
	public UserProfile() {

	}


	// Paramterized Constructor
	public UserProfile(String firstName, String email) {
		this.firstName = firstName;
		this.email = email;
	}
	
	
	// Paramterized Constructor
	// Polymorphism - Function with the same name
	// Varieties of Constrcutor
	public UserProfile(int age, String email) {
		this.age = age;
		this.email = email;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
	

}
