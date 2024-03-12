package com.java.basicfundamental;
import java.util.*;
public class FibonacciSeries {
public static void main(String args[]) {
	int n;
	int t1=1,t2=2;
	int temp;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number upto which you want to find the fibonacci series:");
	n=sc.nextInt();
	System.out.println("the fibonacci series for the number "+n+" is :");
	System.out.print(t1+" "+t2);
	
	for(int i=2;i<=n;i++) {
		temp=t1+t2;
		t1=t2;
		t2=temp;
		System.out.print(" "+temp);
	}
	
	
}
}
