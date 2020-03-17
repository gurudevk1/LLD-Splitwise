package com.guru.splitwiseApp;

import java.util.*;
import java.util.List;
import java.util.Map;

public class Group implements ITypeOfGroup {
	private int id;
	private List<User>users;
	private List<Expense> expenseList;
	private String des; 
	
	@Override
	public int getGrpId() {
		return 0;
	}
	@Override
	public List<User> getListofUser() {
		
		return users;
	}
	public void addExpenses(int eid,String des) {
		Map<Integer,Integer> stategyMap=new HashMap<Integer,Integer>();
		Expense ex=new Expense(eid,"SPILT_EQUALLY","RUPEE",des,users,stategyMap);
		expenseList.add(ex);
	}
	
}
