//grade 12th
package com.java.basicfundamental;

import java.util.*;
public class Grade12th {
public static void main(String args[]) {
	String name;
	String username="admin12";
	int m1,m2,m3,m4,m5,m6;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of the student ");
	name=sc.nextLine();
	
	System.out.println("enter the username of the student to see the result");
	String username1=sc.nextLine();
	
	if(username.equalsIgnoreCase(username1)) {
		System.out.println("the user named "+name+" has been succesfully logged in !!");
		System.out.println("-----------------------------------------------------");
		System.out.println("enter the marks in subject1  of the student");
		m1=sc.nextInt();
		System.out.println("enter the marks in subject2  of the student");
		m2=sc.nextInt();
		System.out.println("enter the marks in subject3  of the student");
		m3=sc.nextInt();
		System.out.println("enter the marks in subject4  of the student");
		m4=sc.nextInt();
		
		int total1=m1+m2;
		int total2=m3+m4;
		int total=total1+total2;
		
		if(total1<=168) {
			m5=35;
		}
		else {
			m5=45;
		}
		
		if(total2<=168) {
			m6=35;
		}
		else {
			m6=45;
		}
		
		int finaltotal =m1+m2+m3+m4+m5+m6;
		int practical=m5+m6;
		
		System.out.println("the name of the student is "+name);
		System.out.println("the marks obtained in the group is "+total);
		System.out.println("the marks obtained in the practical is "+practical);
		
		float perc=(finaltotal)*100/500;
		System.out.println("the percenatge of the student obtained is "+perc+"%");
		
		if(total1>total2) {
			System.out.println("good or enginnering");
			
		}
		else {
			System.out.println("good for medical");
		}
	
		
	}
	else {
		System.out.println("username is not authenicated for it please check the valid username or password");
	}
	
	
}
}
