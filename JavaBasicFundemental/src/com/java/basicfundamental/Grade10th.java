//10th grade program 
package com.java.basicfundamental;

import java.util.*;

public class Grade10th {
	public static void main(String args[]) {
		String name;
		String school;
		String age;
		String username;
		int m1, m2, m3, m4, m5, m6;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the student");
		name = sc.nextLine();

		System.out.println("enter the age of the student");
		age = sc.nextLine();

		username = name + age;

		System.out.println("enter the username of the student to authenicate(name+age)");
		String username1 = sc.nextLine();

		if (username1.equalsIgnoreCase(username)) {
			System.out.println("the user has been authenicated " + name);

			System.out.println("enter the school name of the " + name);
			school = sc.nextLine();
			
			System.out.println("enter the marks of the student named as "+name);
			
			System.out.println("enter the marks got in the 1 language ");
			m1=sc.nextInt();
			System.out.println("enter the marks got in the 2 language ");
			m2=sc.nextInt();
			System.out.println("enter the marks got in the English ");
			m3=sc.nextInt();
			System.out.println("enter the marks got in the Maths");
			m4=sc.nextInt();
			System.out.println("enter the marks got in the Science");
			m5=sc.nextInt();
			System.out.println("enter the marks got in the Social ");
			m6=sc.nextInt();
			
			int total=m1+m2+m3+m4+m5+m6;
			System.out.println("the name is "+name);
			System.out.println("the age is "+age);
			System.out.println("the School  is "+school);
			System.out.println("the total marks obtained  is "+total);
			
			if(total<=256) {
				System.out.println("the student is failed");
				
			}
			else if(total>256 &&total<=320) {
				System.out.println("the student got 6.0 pointer");
			}
			else if(total>320 &&total<=380) {
				System.out.println("the student got 7.3 pointer");
			}
			else if(total>380 &&total<=420) {
				System.out.println("the student got 8.0 pointer");
			}
			else if(total>420 &&total<=450) {
				System.out.println("the student got 9.5 pointer");
			}
			else {
				System.out.println("the student got 10.0 pointer");
			}
			
			
			
			
		
			
			

		}
		else {
			System.out.println("the user"+name+" is not authenicated please check the username");
		}

	}
}
