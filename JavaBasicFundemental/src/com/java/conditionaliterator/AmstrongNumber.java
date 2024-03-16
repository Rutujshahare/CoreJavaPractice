package com.java.conditionaliterator;

import java.util.*;
public class AmstrongNumber {
public static void main(String args[]) {
	int n,digit=0,last=0,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to check weither it is amstrong or not");
	n=sc.nextInt();
	int temp=n;
	while(temp>0) {
		temp=temp/10;
		digit++;
	}
	temp=n;
	while(temp>0) {
		last=temp%10;
		sum+=Math.pow(last, digit);
		temp=temp/10;
	}
	
	if(sum==n) {
		System.out.println("the number is amstrong number");
	}
	else {
		System.out.println("the number is not a amstrong");
	}
	
	
}
}
