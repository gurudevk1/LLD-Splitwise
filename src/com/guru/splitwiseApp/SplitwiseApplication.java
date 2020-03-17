package com.guru.splitwiseApp;

import java.util.List;
import java.util.*;

public class SplitwiseApplication {
	private static Map<Integer,Group> grpIdvsGroup=new HashMap<Integer,Group>();
	private static Map<Integer,User> userIdvsUser=new HashMap<Integer,User>();
	private static int userIDCnt=4;
	private static int groupIDCnt=1;
	private static int expid=0;
	
	public static void main(String[] args) {
		SplitwiseApplication sApp=new SplitwiseApplication();
		//User(String n,int id,String email,String phone) 
		User u1=new User("Guru",1,"gdevk11@gmail.com","780202");
		User u2=new User("Chetua",2,"chetna@gmail.com","780210");
		User u3=new User("Hitesh",3,"hitesh@gmail.com","780209");
		User u4=new User("Hitesh",3,"hitesh@gmail.com","780209");
		Scanner s=new Scanner(System.in);
		
		
		userIdvsUser.put(1,u1);
		userIdvsUser.put(2,u2);
		userIdvsUser.put(3,u3);
		userIdvsUser.put(4,u4);
		
		List<User> lst=new ArrayList<User>();
		Group g=new Group("Goa trip",lst,1);
		grpIdvsGroup.put(1,g);
		
		
		while(true) {
			System.out.println("Enter the operation \\n 1 Add user \\n2 Add/Edit Group \\n3 Add Expense to a group \\n 4 Add Expense to non group");
			int op=s.nextInt();
			switch(op) {
			case 1:
				addUser();
				break;
			case 2:
				addGroup();
				break;
			case 3:
				addGroupExpense();
				break;	
			case 4:
				addNonGroupExpense();
				break;		
			}
			
		}
		
	}

	private static void addNonGroupExpense() {
		
	}

	private static void addGroupExpense() {
		//get this id
		Group g=grpIdvsGroup.get(1);
		//get the input params
		g.addExpenses(userIdvsUser.get(1),++expid, "Pizza Party");
		
	}
	private static void showGroupExpense() {
		
	}

	private static void addGroup() {
		
	}

	private static void addUser() {
		
	}

}
