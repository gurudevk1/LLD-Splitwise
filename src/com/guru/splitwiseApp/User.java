package com.guru.splitwiseApp;

import java.util.*;

public class User {
	private String name;
	private int id;
	private String email;
	private String phone;
	private int amount;
	private List<Group> listOfGroup;
	private int owetotal;
	private Map<User,Integer> userVsAmount=new HashMap<User,Integer>();
	
	public User(String n,int id,String email,String phone) {
		this.email=email;
		this.id=id;
		this.name=n;
		this.phone=phone;
		this.amount=0;
		owetotal=0;
		listOfGroup=new ArrayList<Group>();
	}
	public void addGroup() {
		
	}
	public String toString() {
		return "User Id "+id+" Name "+name;
	}
	public void addAmount(User u,int amt) {
		userVsAmount.put(u, amt);
		owetotal+=amt;
	}
	public void userOweDetails() {
		System.out.println(this.toString()+"Total Amt " +amount+" Detailed Owes Amount");
		for(Map.Entry<User, Integer>e :userVsAmount.entrySet()) {
			System.out.println("User "+e.getKey().toString()+" Amount "+e.getValue());
		}
		
	}
	
}
