package com.guru.splitwiseApp;

import java.util.List;
import java.util.*;

public class SplitwiseApplication {
	private static Map<Integer,Group> grpIdvsGroup=new HashMap<Integer,Group>();
	private static Map<Integer,User> userIdvsUser=new HashMap<Integer,User>();
	private static int userIDCnt=4;
	private static int groupIDCnt=1;
	private static int expid=0;
	public static Scanner s;
	
	public static void main(String[] args) {
		SplitwiseApplication sApp=new SplitwiseApplication();
		//User(String n,int id,String email,String phone) 
		User u1=new User("Guru",1,"gdevk11@gmail.com","780202");
		User u2=new User("Chetua",2,"chetna@gmail.com","780210");
		User u3=new User("Hitesh",3,"hitesh@gmail.com","780209");
		User u4=new User("Hitesh",3,"hitesh@gmail.com","780209");
		s=new Scanner(System.in);
		
		
		userIdvsUser.put(1,u1);
		userIdvsUser.put(2,u2);
		userIdvsUser.put(3,u3);
		userIdvsUser.put(4,u4);
		
		List<User> lst=new ArrayList<User>();
		lst.add(u1);
		lst.add(u2);
		lst.add(u3);
		
		Group g=new Group("Goa trip",lst,1);
		grpIdvsGroup.put(1,g);
		
		
		while(true) {
			System.out.println("Enter the operation "+'\n'+"1 Add user "+'\n'+"2 Add/Edit Group "+'\n'+"3 Add Expense to a group "+'\n'+"4 Add Expense to non group "+'\n'+" 5 ShowUserOweDetails");
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
			case 5:
				showUserOweDetails();
				break;	
			}
			
		}
		
	}

	private static void addNonGroupExpense() {
		
	}

	private static void addGroupExpense() {
		System.out.println("AddGroupExpense: Enter Deatils in order:GrpID PaidByUserId Description Amount");
		s.nextLine();
		String[] str=s.nextLine().trim().split("\\s+");
		Group g=grpIdvsGroup.get(Integer.parseInt(str[0]));
		g.addExpenses(userIdvsUser.get(Integer.parseInt(str[1])),++expid,str[2],Integer.parseInt(str[3]));
		
	}
	private static void showGroupExpense() {

		
	}
	private static void showUserOweDetails() {
		System.out.println("showGroupExpense: Enter Deatils in order:UserId");
		s.nextLine();
		String[] str=s.nextLine().trim().split("\\s+");
		User u=userIdvsUser.get(Integer.parseInt(str[0]));
		u.userOweDetails();
		
	}
	private static void addGroup() {
		
	}

	private static void addUser() {
		
	}

}
