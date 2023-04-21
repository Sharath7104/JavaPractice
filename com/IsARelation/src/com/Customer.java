package com;

public class Customer extends User{
	private String name;
	private String email;
	private int mobile;
	public Customer(String city, String state, int pincode, String name, String email, int mobile) {
		super(city, state, pincode);
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public Customer(String city, String state, int pincode) {
		super(city, state, pincode);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", mobile=" + mobile + " "+super.toString() +"]";
	}
	
	
	
}
