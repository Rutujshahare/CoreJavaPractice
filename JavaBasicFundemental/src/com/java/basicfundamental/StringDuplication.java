package com.java.basicfundamental;
import java.util.*;

public class StringDuplication {
public static void main(String args[]) {
	String sentence;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence for the finding duplicate word");
	sentence=sc.nextLine();
	
	//converting the string to array :
	String[]stringarray=sentence.split("\\s+");
	
	for(int i=0;i<stringarray.length;i++) {
		for(int j=i+1;j<stringarray.length;j++) {
			
			if(stringarray[i].equals(stringarray[j])) {
				System.out.println("the duplication of the String  is "+stringarray[j]);
				break;
			}
		}
	}
}
}
