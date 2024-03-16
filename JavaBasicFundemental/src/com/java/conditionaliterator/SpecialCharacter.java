package com.java.conditionaliterator;

import java.io.*;
import java.util.*;
public class SpecialCharacter {
public static void main(String args[]) {
	String sentence;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence for which you want to see special character ");
	sentence=sc.nextLine();
	
	for(int i=0;i<sentence.length();i++) {
		if(!Character.isDigit(sentence.charAt(i))&&!Character.isLetter(sentence.charAt(i))&&!Character.isWhitespace(sentence.charAt(i))) {
			count++;
			System.out.println("the special caracter are :"+sentence.charAt(i));
		}
	}
	
	if(count>0) {
		System.out.println(count+" character is found");
	}
}
}
