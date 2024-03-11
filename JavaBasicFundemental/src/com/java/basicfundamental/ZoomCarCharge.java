package com.java.basicfundamental;

import java.util.*;
public class ZoomCarCharge {
public static void main(String args[]) {
	String name;
	String username;
	String source;
	String destination;
	String password="ZOOMCAR";
	int totalkilomter;
	int deposit;
	int finalamount;
	int finalamount1;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the name of the passenger");
	name=sc.nextLine();
	
	System.out.println("enter the source location of the trip");
	source=sc.nextLine();
	
	System.out.println("emter the destination location of the trip");
    destination=sc.nextLine();
    
    System.out.println("in order to book the ticket please login to the account ");

	System.out.println("the username should be name +year");
	
	System.out.println("enter the username of th passenger");
	username=sc.nextLine();
	
	System.out.println("enter the password of th passenger");
	String password1=sc.nextLine();
	
	int year = Calendar.getInstance().get(Calendar.YEAR);
	String username1=name+year;
	
	if(username.equalsIgnoreCase(username1)&&password.equalsIgnoreCase(password1)){
		System.out.println("you have been login succesfully");
		System.out.println("enter the amount that is deposited ");
		deposit=sc.nextInt();
		
		System.out.println("enter the kilometer that the tip has been travelled");
		totalkilomter=sc.nextInt();
		
		if(totalkilomter<300) {
			int discount=410;
			finalamount=((totalkilomter)*9)-discount;
			if(finalamount<deposit) {
		    finalamount1=deposit-finalamount;
			}else {
			 finalamount1=finalamount-deposit;
			}
			System.out.println("the amount we need to pay is "+finalamount1);
		}
		
		else if(totalkilomter>=400) {
			int discount=710;
			finalamount=((totalkilomter)*9)-discount;
			if(finalamount<deposit) {
			    finalamount1=deposit-finalamount;
				}else {
				 finalamount1=finalamount-deposit;
				}
				System.out.println("the amount we need to pay is "+finalamount1);
		}
		
		else if(totalkilomter>=480) {
			int discount=910;
			finalamount=((totalkilomter)*9)-discount;
			if(finalamount<deposit) {
			    finalamount1=deposit-finalamount;
				}else {
				 finalamount1=finalamount-deposit;
				}
				System.out.println("the amount we need to pay is "+finalamount1);
		}
		
		else if(totalkilomter>=530) {
			int discount=1110;
			finalamount=((totalkilomter)*9)-discount;
			if(finalamount<deposit) {
			    finalamount1=deposit-finalamount;
				}else {
				 finalamount1=finalamount-deposit;
				}
				System.out.println("the amount we need to pay is "+finalamount1);
		}
		
		else if(totalkilomter>=650) {
			int discount=1210;
			finalamount=((totalkilomter)*9)-discount;
			if(finalamount<deposit) {
			    finalamount1=deposit-finalamount;
				}else {
				 finalamount1=finalamount-deposit;
				}
				System.out.println("the amount we need to pay is "+finalamount1);
		}
		
		else if(totalkilomter>=800) {
			int discount=1310;
			finalamount=((totalkilomter)*9)-discount;
			if(finalamount<deposit) {
			    finalamount1=deposit-finalamount;
				}else {
				 finalamount1=finalamount-deposit;
				}
				System.out.println("the amount we need to pay is "+finalamount1);
		}
		
		else if(totalkilomter>=890) {
			int discount=1710;
			finalamount=((totalkilomter)*9)-discount;
			if(finalamount<deposit) {
			    finalamount1=deposit-finalamount;
				}else {
				 finalamount1=finalamount-deposit;
				}
				System.out.println("the amount we need to pay is "+finalamount1);
		}
		
		else if(totalkilomter>=1100) {
			int discount=2110;
			finalamount=((totalkilomter)*9)-discount;
			if(finalamount<deposit) {
			    finalamount1=deposit-finalamount;
				}else {
				 finalamount1=finalamount-deposit;
				}
				System.out.println("the amount we need to pay is "+finalamount1);
		}
		
		else {
			int discount=2500;
			finalamount=((totalkilomter)*9)-discount;
			if(finalamount<deposit) {
			    finalamount1=deposit-finalamount;
				}else {
				 finalamount1=finalamount-deposit;
				}
				System.out.println("the amount we need to pay is "+finalamount1);
		}
		
		
	}
	else {
		System.out.println("you have not been authenicated");
	}
	
	
}
}
