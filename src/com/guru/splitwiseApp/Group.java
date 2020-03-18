package com.guru.splitwiseApp;

import java.util.*;
import java.util.List;
import java.util.Map;

public class Group implements ITypeOfGroup {
	private int id;
	private List<User>users;
	private Map<Integer,Expense> expIdvsExp=new HashMap<Integer,Expense>();
	private String des; 
	
	public Group(String d,List<User> l,int id) {
		this.id=id;
		this.des=d;
		this.users=l;
	}
	@Override
	public int getGrpId() {
		return 0;
	}
	@Override
	public List<User> getListofUser() {
		
		return users;
	}
	public void addExpenses(User paidBy,int eid,String des,int amount) {
		Map<Integer,Integer> stategyMap=new HashMap<Integer,Integer>();
		List<User> expUser=new ArrayList<User>(users);
		expUser.remove(paidBy);
		Expense ex=new Expense(amount,paidBy,eid,"SPILT_EQUALLY","RUPEE",des,expUser,stategyMap);
		ex.splitBill();
		System.out.println(ex.toString());
		expIdvsExp.put(eid,ex);
	}
	public void editExpenses(User paidBy,int eid,String des,int amount) {
		Expense e=expIdvsExp.get(eid);
	}
	
}
