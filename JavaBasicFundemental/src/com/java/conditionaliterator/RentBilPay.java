package com.java.conditionaliterator;
import java.util.*;
public class RentBilPay {
public static void main(String args[]) {
	String name;
	String phone;
	String pin;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of the customer");
	name=sc.nextLine();
	System.out.println("enter the phone number of the customer");
	phone=sc.nextLine();
	String phone1=phone.substring(6);
	System.out.println("the pin is "+phone1);
	System.out.println("enter the pin to mach the account");
	pin=sc.nextLine();
	if(pin.equals(phone1)) {
		System.out.println("you have been authenicated");
		System.out.println("enter the amount that has been deposited");
		int deposit=sc.nextInt();
		System.out.println("enter the month you have been stayed and as not paid the bills");
		int month=sc.nextInt();
		int bills=(month*5500);
		System.out.println("enter the amount in the credit cards");
		int cards=sc.nextInt();
		cards+=deposit;
		if(cards>bills) {
			System.out.println("you have a sufficent amount to pay the bills ");
			cards=cards-bills;
			System.out.println("the balance amount after the paying rent is "+cards);
		}
		else {
			System.out.println("insufficent amount in the cards");
			cards=bills-cards;
			System.out.println("you need "+cards+" more money to pay the rent");
			
		}
		
	}
	else {
		System.out.println("you have not been authenicated");
	}
	
}
}
