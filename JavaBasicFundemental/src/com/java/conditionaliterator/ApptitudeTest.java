package com.java.conditionaliterator;

import java.util.*;
public class ApptitudeTest {
public static void main(String args[]) {
	String name;
	String email;
	String phone;
	String company;
	String age;
	String username;
	String password;
	String college;
	String username1;
	String password1;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of the student");
	name=sc.nextLine();
	System.out.println("ente the email of the student");
	email=sc.nextLine();
	System.out.println("enter the phone number of the student");
	phone=sc.nextLine();
	System.out.println("enter the company of which user is applied");
	company=sc.nextLine();
	System.out.println("entr the age of the student");
	age=sc.nextLine();
	System.out.println("enter the college name of the student");
	college=sc.nextLine();
	int year=Calendar.getInstance().get(Calendar.YEAR);
	int total;
	
	System.out.println("enter the username of the student");
	username1=sc.nextLine();
	System.out.println("enter the password of th student");
	password1=sc.nextLine();
	username=name+college+year;
	password=company+year;
	if(username1.equals(username)&&password.equals(password1)) {
		System.out.println("you have been authenicated");
		System.out.println("--------------------------------"+company+" Apptitude test ----------------------------------------------");
		System.out.println("the link has been send to "+email);
		
		System.out.println("enter the marks scored in quant apptitude");
		int quant=sc.nextInt();
		System.out.println("enter the marks scored in logical apptitude");
		int logical=sc.nextInt();
		System.out.println("enter the marks scored in the mathematics apptitude");
		int maths=sc.nextInt();
		total=maths+quant+logical;
		
		if(total>93) {
			System.out.println("Hurray! you have been passed in the apptitude test::");
			System.out.println("the name of the student is "+name);
			System.out.println("furthur round will be comunicate to you on the email :"+email);
			System.out.println("----------------------------------------------------------------------------------");
		}
		else {
			System.out.println("sorry !"+name+" you have not been selected in the apptitude of "+company);
			System.out.println("---------------------------------------------------------------------------");
		}
	}
else {
		System.out.println("you have not been authenicated");
	}
	
}
}
