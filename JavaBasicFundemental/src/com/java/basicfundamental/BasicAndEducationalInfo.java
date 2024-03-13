package com.java.basicfundamental;

import java.util.Scanner;

public class BasicAndEducationalInfo {
	public static void main(String args[]) {
		String name;
		String email;
		String phone;
		String address;
		String age;
		String gender;
		
		//edu info:
		String sscschool;
		String hscschool;
		String sscpercentage;
		String hscpercentage;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the student ");
		name=sc.nextLine();
		System.out.println("enter the email of the student");
		email=sc.nextLine();
		System.out.println("enter the phone number of the student");
		phone=sc.nextLine();
		System.out.println("enter the address of the student");
		address=sc.nextLine();
		System.out.println("enter the age of the student");
		age=sc.nextLine();
		System.out.println("enter the gender of the student");
		gender=sc.nextLine();
		
		//educational info :
		System.out.println("enter the sscschool of the student");
		sscschool=sc.nextLine();
		System.out.println("enter the hscschool of the student");
		hscschool=sc.nextLine();
		System.out.println("enter the ssc percentage of the student");
		sscpercentage=sc.nextLine();
		System.out.println("enter the hsc percenatge of the student");
		hscpercentage=sc.nextLine();
		
		System.out.println("the info of the student:"+name);
		System.out.println("------------------------BASIC INFO --------------------------------------");
		System.out.println("|************************************************************************");
		System.out.printf("| the name of the student is           :: %-40s|\n", name);
		System.out.printf("| the email of the student is          :: %-40s|\n", email);
		System.out.printf("| the phone number  of the student is  :: %-40s|\n", phone);
		System.out.printf("| the address of the student is        :: %-40s|\n", address);
		System.out.printf("| the age of the student is            :: %-40s|\n", age);
		System.out.printf("| the gender of the student is         :: %-40s|\n", gender);
		System.out.println("|************************************************************************");
		
		System.out.println("------------------------EDUCATIONAL INFO --------------------------------------");
		System.out.println("|************************************************************************");
		System.out.printf("| the name of the student is           :: %-40s|\n", name);
		System.out.printf("| the email of the student is          :: %-40s|\n", email);
		System.out.printf("| the 10Th school  of the student is   :: %-40s|\n", sscschool);
		System.out.printf("| the 10Th percentage of the student is:: %-40s|\n", sscpercentage);
		System.out.printf("| the 12Th school of the student is    :: %-40s|\n", hscschool);
		System.out.printf("| the 12Th percentage of the student is:: %-40s|\n", hscpercentage);
		System.out.println("|************************************************************************");
	}

}
