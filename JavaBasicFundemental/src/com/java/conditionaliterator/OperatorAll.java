package com.java.conditionaliterator;
import java.util.*;
public class OperatorAll {
public static void main(String args[]) {
	int a,b,c,d,e,f,g,h;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value for a");
	a=sc.nextInt();
	System.out.println("entr the value for b");
	b=sc.nextInt();
	System.out.println("enter the value for c");
	c=sc.nextInt();
	
	
	
	//unary operator:
	d=a++ + ++b;
	e=d++;
	System.out.println(d);
	System.out.println(e);
	
	//airhtmetic operator:
	f=d+e;
	g=a-b;
	c=a*b;
	System.out.println("the airhtmetic operator of all is "+f+g+c);
	
	//ternary operator
	int t=g>b?a:b;
	System.out.println(t);
	
	//shift operator:
	c=a>>b;
	System.out.println("the right shift operator is "+c);
	d=a<<b;
	System.out.println("the left shift operator is "+d);
	
	//assignment operator:
	a+=b;
	System.out.println("the updated value of the a is "+a);
	
	//bitwise operator:
	int x=2,y=3;
	int z=x&y;
	
	System.out.println("the bitwise operator of the z is "+z);
	
	//relational and logical operator:
	
	if(a>b&&a>c&&a>d&&a>e&&a>f) {
		System.out.println("the value of the a is greater");
	}
	else if(b>a&&b>c&&b>d&&b>e&&b>f) {
		System.out.println("the value of the b is greater");
	}
	else if(c>b&&c>a&&c>d&&c>e&&c>f) {
		System.out.println("the value of the c is greater");
	}
	else if(d>b&&d>c&&d>a&&d>e&&d>f) {
		System.out.println("the value of the d is greater");
	}
	else if(e>b&&e>c&&e>d&&e>a&&e>f) {
		System.out.println("the value of the e is greater");
	}
	else {
		System.out.println("the value of the f is greater");
	}
	
	
	
	
	
	
}
}
