package com.java.conditionaliterator;
import java.util.*;
public class DuplicateNumber {
public static void main(String args[]) {
	String number;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to check duplication from it");
	number=sc.nextLine();
	int count=0;
	
	//converting string to character:
	char[] numberchar=number.toCharArray();
	
	for(int i=0;i<numberchar.length;i++) {
		count=1;
		for(int j=i+1;j<numberchar.length;j++) {
			if(numberchar[i]==numberchar[j]&&numberchar[i]!=' ') {
				count++;
				numberchar[j]='0';//visited char 
			}
			
		}
		if(count>1&&numberchar[i]!='0') {
			System.out.println("the duplication of the number are :"+numberchar[i]);
		}
	}
	
	
	
}
}
