package com.dto;

public class StudentImpl implements Student{
	private int rollNo;
	private String name;
	private String email;
	private double xPer;
	private String state;
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	public StudentImpl() {
		super();
	}
	public StudentImpl(int rollNo, String name, String email, double xPer, String state) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.xPer = xPer;
		this.state = state;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the xPer
	 */
	public double getxPer() {
		return xPer;
	}
	/**
	 * @param xPer the xPer to set
	 */
	public void setxPer(double xPer) {
		this.xPer = xPer;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "RollNo=" + rollNo + ", Name=" + name + ", Email=" + email + ", X_Per=" + xPer + ", State="
				+ state + "\n";
	}
	
	
	
	
}
