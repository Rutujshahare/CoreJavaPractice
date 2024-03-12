package com.java.basicfundamental;

import java.util.*;
public class DuplicationStringCheck {
public static void main(String args[]) {
	String sentence;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence to find the duplication of the character");
	sentence=sc.nextLine();
	
	//converting the string to character in ode to compare:
	char[] stringcompare=sentence.toCharArray();
	
	//checking the count to check 
	int count=0;
	for(int i=0;i<stringcompare.length;i++) {
		count=1;
		for(int j=i+1;j<stringcompare.length;j++) {
			if(stringcompare[i]==stringcompare[j]&&stringcompare[i]!=' ') {
				count++;
				stringcompare[j]='0';
			}
		}
		if(count>1&&stringcompare[i]!='0') {
			System.out.println(stringcompare[i]);
		}
	}
	
}
}
