package com.java.basicfundamental;

import java.util.*;
public class EncryptDecrypt {
public static void main(String args[]) {
	String name;
	String email;
	String phone;
	String aadhar;
	String company;
	String username;
	String password;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of the student");
	name=sc.nextLine();
	System.out.println("enter the company name of the student");
	company=sc.nextLine();
	company=company.toUpperCase();
    username=name+company;
    password="ADMIN";
    
    String username1;
    String password1;
    System.out.println("enter the username of the student");
	username1=sc.nextLine();
	System.out.println("enter the password  of the student");
	password1=sc.nextLine();
    
    
    if(username1.equals(username)&&password1.equals(password)) {
    	System.out.println("the user has been successfully logged in ");
    	
    	System.out.println("enter the phone number of the student");
    	phone=sc.nextLine();
    	System.out.println("enter the aadhar number of the student");
    	aadhar=sc.nextLine();
    	
    	email=name+"."+username+"@"+company+".net";
    	
    	System.out.println("------------the basic information of the student is ------");
    	System.out.println("-----------------------------------------------------------------------");
    	System.out.printf("the name of the person              : %-20s|\n", name);
    	System.out.printf("the email of the student is         : %-20s|\n",email);
    	String phone1=phone.substring(6);
    	phone1=phone1.replaceAll(phone1, "XXXX");
    	
    	phone=phone.substring(0,5);
    	phone=phone+phone1;
    	System.out.printf("the phone numbr of the student is   : %-20s|\n",phone);
    	String aadhar1=aadhar.substring(8);
    	aadhar1=aadhar1.replace(aadhar1, "XXXX");
    	aadhar=aadhar.substring(0,5);
    	aadhar=aadhar+aadhar1;
    	System.out.printf("the aadhar number of the student is : %-20s|\n",aadhar);
    	System.out.printf("the username of the student is      : %-20s|\n",username);
    	password=password.replaceAll(password, "*");
    	
    	System.out.printf("th password of the student is       : %-20s|\n",password);
    	
    	
    }
	
	
}
}
