package day7.question8;

import java.io.Serializable;

public class Student implements Serializable{

	private int roll;
	private String name;
	private String email;
	private transient String password;
	private Address address;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int roll, String name, String email, String password, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
				+ address + "]";
	}
	public Student() {
		super();
	}
	
}
