package com.guru.splitwiseApp;

import java.util.*;

public class User {
	private String name;
	private int id;
	private String email;
	private String phone;
	private int amount;
	private List<Group> listOfGroup;
	private Map<User,Integer> userVsAmount=new HashMap<User,Integer>();
	
	public User(String n,int id,String email,String phone) {
		this.email=email;
		this.id=id;
		this.name=n;
		this.phone=phone;
		this.amount=0;
		listOfGroup=new ArrayList<Group>();
	}
	public void addGroup() {
		
	}
	public String toString() {
		return "user Details Id "+id+" Name "+name+" Email "+email+ " Phone "+phone;
	}
	public void addAmount(User u,int amt) {
		userVsAmount.put(u, amt);
	}
	
}
