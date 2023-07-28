package com.bitlabs.modal;

public class Student {

	private int id;
	private String name;
	private int Age;
	private String Email;
	private String Address;
	private String branch;
	public Student(int id, String name,int Age,String Email,String Address, String branch) {
		super();
		this.setAge(Age);
		this.setName(name);
		this.setAge(Age);
		this.setEmail(Email);
		this.setAddress(Address);
		this.setBranch(branch);
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", Age="+ Age+",Email="+Email+",Address="+Address+" branch=" + branch + "]";
//	}
}
