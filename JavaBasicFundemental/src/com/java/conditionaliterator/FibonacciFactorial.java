package com.java.conditionaliterator;
import java.util.*;
public class FibonacciFactorial {
public static void main(String args[]) {
	int n;
	int choice;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number for which you want to perform action:");
	n=sc.nextInt();
	
	System.out.println("1.Factorial");
	System.out.println("2.Fibonacci");
	System.out.println("choose the choice from the above ");
	choice=sc.nextInt();
	switch(choice) {
	case 1:{
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=(fact*i);
		}
		System.out.println("the factorial of the " +n+ " is "+fact);
	}
	break;
	case 2:{
		int t1=1,t2=2;
		int temp = 0;
		System.out.println("the number upto which you want fibonacci are ");
		System.out.print(t1+" "+t2);
		for(int i=2;i<=n;i++) {
			temp=t1+t2;
			t1=t2;
			t2=temp;
			
			System.out.print(temp+" ");
		}
	}
	break;
	default:
		System.out.println("Incorrect choice");
	}
	
}
}
