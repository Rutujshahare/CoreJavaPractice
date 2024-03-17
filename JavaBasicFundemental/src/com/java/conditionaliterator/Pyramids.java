package com.java.conditionaliterator;
import java.util.*;
public class Pyramids {
public static void main(String args[]) {
	int rows;
	int choice;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the rows upto whih you want to print pyramids");
	rows=sc.nextInt();
	System.out.println("1.basic pyramids");
	System.out.println("2.inverted pyrmaids");
	System.out.println("choose the choice from the above option");
	choice=sc.nextInt();
	
	switch(choice) {
	case 1:{
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	break;
	case 2:{
		for(int i=0;i<rows;i++) {
			for(int j=rows;j>i;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	break;
	default:
		System.out.println("invalid attempts");
	}
}
}
