package com.java.conditionaliterator;

import java.util.Calendar;
import java.util.Scanner;

public class TravelFare {
	public static void main(String args[]) {
		String name;
		String email;
		String phone;
		String username;
		String password;
		String transport;
		String source;
		String destination;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the customer ");
		name = sc.nextLine();
		System.out.println("enter the email of the customer ");
		email = sc.nextLine();
		System.out.println("enter the phone number of the customer");
		phone = sc.nextLine();

		System.out.println("-----:welcome to the travel advisory:-----");
		System.out.println("1.BUS");
		System.out.println("2.TRAIN");
		System.out.println("3.PLANE");
		System.out.println("4.SHIP");

		System.out.println("please choose your boking by the transport provide above");
		transport = sc.nextLine();

		switch (transport) {
		case "BUS": {
			username = transport + name;
			System.out.println(username);
			int year = Calendar.getInstance().get(Calendar.YEAR);
			password = transport + year;
			System.out.println(password);

			System.out.println("enter the username to book the ticket");
			String username1 = sc.nextLine();
			System.out.println("enter the password to login");
			String password1 = sc.nextLine();

			if (username1.equalsIgnoreCase(username1) && password1.equalsIgnoreCase(password)) {
				System.out.println("you have been succesfully logged in ");
				System.out.println("-----------------TRAVEL ADVISORY--------------------");
				System.out.println("enter the source of the trip of your " + transport);
				source = sc.nextLine();
				System.out.println("enter the destination of the trip of your " + transport);
				destination = sc.nextLine();
				System.out.println("enter the distance of the travelling");
				int distance = sc.nextInt();
				float amount = (distance * 8);

				if (distance > 500) {
					float discount = (distance * 4);
					amount = amount - discount;

				} else {
					amount = amount - 0;
				}
				System.out.println("|---------------------------------TICKET----------------------------|");
				System.out.printf("|the Name of the passenger is         : %-40s|\n", name);
				System.out.printf("|the Email of the passenger is        : %-40s|\n", email);
				System.out.printf("|the Phone of the passenger is        : %-40s|\n", phone);
				System.out.printf("|the Source of the passenger is       : %-40s|\n", source);
				System.out.printf("|the Destination of the passenger is  : %-40s|\n", destination);
				System.out.printf("|the Mode of transport is             : %-40s|\n", transport);
				System.out.printf("|the price of the passenger is        :%-40f|\n", amount);
				System.out.println("--------------------------------------------------------------------|");

			} else {
				System.out.println("you have not been authnicated");
			}
		}
			break;

		case "TRAIN": {
			username = transport + name;
			int year = Calendar.getInstance().get(Calendar.YEAR);
			password = transport + year;

			System.out.println("enter the username to book the ticket");
			String username1 = sc.nextLine();
			System.out.println("enter the password to login");
			String password1 = sc.nextLine();

			if (username1.equalsIgnoreCase(username1) && password1.equalsIgnoreCase(password)) {
				System.out.println("you have been succesfully logged in ");
				System.out.println("-----------------TRAVEL ADVISORY--------------------");
				System.out.println("enter the source of the trip of your " + transport);
				source = sc.nextLine();
				System.out.println("enter the destination of the trip of your " + transport);
				destination = sc.nextLine();
				System.out.println("enter the distance of the travelling");
				int distance = sc.nextInt();
				float amount = (distance * 9);

				if (distance > 500) {
					float discount = (distance * 5);
					amount = amount - discount;

				} else {
					amount = amount - 0;
				}
				System.out.println("|---------------------------------TICKET----------------------------|");
				System.out.printf("|the Name of the passenger is         : %-40s|\n", name);
				System.out.printf("|the Email of the passenger is        : %-40s|\n", email);
				System.out.printf("|the Phone of the passenger is        : %-40s|\n", phone);
				System.out.printf("|the Source of the passenger is       : %-40s|\n", source);
				System.out.printf("|the Destination of the passenger is  : %-40s|\n", destination);
				System.out.printf("|the Mode of transport is             :%-40s|\n", transport);
				System.out.printf("|the price of the passenger is        :%-40d|\n", amount);
				System.out.println("--------------------------------------------------------------------|");

			} else {
				System.out.println("you have not been authnicated");
			}
		}
			break;

		case "PLANE": {
			username = transport + name;

			int year = Calendar.getInstance().get(Calendar.YEAR);
			password = transport + year;

			System.out.println("enter the username to book the ticket");
			String username1 = sc.nextLine();
			System.out.println("enter the password to login");
			String password1 = sc.nextLine();

			if (username1.equalsIgnoreCase(username) && password1.equalsIgnoreCase(password)) {
				System.out.println("you have been succesfully logged in ");
				System.out.println("-----------------TRAVEL ADVISORY--------------------");
				System.out.println("enter the source of the trip of your " + transport);
				source = sc.nextLine();
				System.out.println("enter the destination of the trip of your " + transport);
				destination = sc.nextLine();
				System.out.println("enter the distance of the travelling");
				int distance = sc.nextInt();
				float amount = (distance * 13);

				if (distance > 500) {
					float discount = (distance * 6);
					amount = amount - discount;

				} else {
					amount = amount - 0;
				}
				System.out.println("|---------------------------------TICKET----------------------------|");
				System.out.printf("|the Name of the passenger is         : %-40s|\n", name);
				System.out.printf("|the Email of the passenger is        : %-40s|\n", email);
				System.out.printf("|the Phone of the passenger is        : %-40s|\n", phone);
				System.out.printf("|the Source of the passenger is       : %-40s|\n", source);
				System.out.printf("|the Destination of the passenger is  : %-40s|\n", destination);
				System.out.printf("|the Mode of transport is             : %-40s|\n", transport);
				System.out.printf("|the price of the passenger is        : %-40f|\n", amount);
				System.out.println("--------------------------------------------------------------------|");

			} else {
				System.out.println("you have not been authnicated");
			}
		}
			break;

		case "SHIP": {
			username = transport + name;
			int year = Calendar.getInstance().get(Calendar.YEAR);
			password = transport + year;

			System.out.println("enter the username to book the ticket");
			String username1 = sc.nextLine();
			System.out.println("enter the password to login");
			String password1 = sc.nextLine();

			if (username1.equalsIgnoreCase(username1) && password1.equalsIgnoreCase(password)) {
				System.out.println("you have been succesfully logged in ");
				System.out.println("-----------------TRAVEL ADVISORY--------------------");
				System.out.println("enter the source of the trip of your " + transport);
				source = sc.nextLine();
				System.out.println("enter the destination of the trip of your " + transport);
				destination = sc.nextLine();
				System.out.println("enter the distance of the travelling");
				int distance = sc.nextInt();
				float amount = (distance * 5);

				if (distance > 500) {
					float discount = (distance * 2);
					amount = amount - discount;

				} else {
					amount = amount - 0;
				}
				System.out.println("|---------------------------------TICKET----------------------------|");
				System.out.printf("|the Name of the passenger is         : %-40s|\n", name);
				System.out.printf("|the Email of the passenger is        : %-40s|\n", email);
				System.out.printf("|the Phone of the passenger is        : %-40s|\n", phone);
				System.out.printf("|the Source of the passenger is       : %-40s|\n", source);
				System.out.printf("|the Destination of the passenger is  : %-40s|\n", destination);
				System.out.printf("|the Mode of transport is             : %-40s|\n", transport);
				System.out.printf("|the price of the passenger is        : %-40f|\n", amount);
				System.out.println("--------------------------------------------------------------------|");

			} else {
				System.out.println("you have not been authnicated");
			}
		}
			break;
		default:
			System.out.println("No choice is found");
		}
	}

}
