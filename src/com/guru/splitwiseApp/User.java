package com.guru.splitwiseApp;

public class User {
	private String name;
	private int id;
	private String email;
	private String phone;
	private int amount;
	public User(String n,int id,String email,String phone) {
		this.email=email;
		this.id=id;
		this.name=n;
		this.phone=phone;
		this.amount=0;
	}
	public String toString() {
		return "user Details Id "+id+" Name "+name+" Email "+email+ " Phone "+phone;
	}
	
}
