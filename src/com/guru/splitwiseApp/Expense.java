package com.guru.splitwiseApp;

import java.util.*;

public class Expense {
	private int expId;
	private SplitStrategy splitStrategy;
	private Currency currencyType;
	private String description;
	private List<User> users;
	private int amt;
	private User paidBy;
	
	public Expense(int amt,User paidBy,int id,String splitStrategyId,String currencyType,String des,List<User> users,Map<Integer,Integer> stategyMap) {
		this.expId=id;
		this.description=des;
		this.currencyType=Currency.valueOf(currencyType);
		this.users=users;
		this.splitStrategy=SplitStrategy.valueOf(splitStrategyId);
		this.amt=amt;
		this.paidBy=paidBy;
		splitBill();
	}
	
	public int getExpId() {
		return expId;
	}

	public void setExpId(int expId) {
		this.expId = expId;
	}

	public SplitStrategy getSplitStrategy() {
		return splitStrategy;
	}

	public void setSplitStrategy(SplitStrategy splitStrategy) {
		this.splitStrategy = splitStrategy;
	}

	public Currency getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(Currency currencyType) {
		this.currencyType = currencyType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String toString() {
		return "Exp Id "+expId+" Amount "+amt+" description "+description+" splitStrategy "+splitStrategy.toString()+" User List"+users;
	}

	public void splitBill() {
		if(this.getSplitStrategy().getId()==1) {
			splitEqually();
		}else {
			splitUnEqually();
		}
		
	}

	private void splitUnEqually() {
		
	}

	private void splitEqually() {
		
		int t=amt/users.size();
		for(int i=0;i<users.size();i++) {
			paidBy.addAmount(users.get(i), t*(1));
			users.get(i).addAmount(paidBy, t*(-1));
		}
		
	}

}
