package com.java.basicfundamental;

import java.util.*;

public class MatchWinner {
	public static void main(String[] args) {
String teamname1;
String teamname2;
int t11,t12,t13,t14,t15;
int t21,t22,t23,t24,t25;

Scanner sc=new Scanner(System.in);
System.out.println("enter the team 1 name that has match today!");
teamname1=sc.nextLine();
System.out.println("enter the team 2 name that has a match today!");
teamname2=sc.nextLine();

System.out.println("the match is between the team are "  +teamname1+  " "+teamname2);

System.out.println("enter the run scored by each team player of the team1 "+teamname1);
System.out.println("------------------------------------------------------------");
System.out.println("enter the run scored by the player 1 of team "+teamname1);
t11=sc.nextInt();
System.out.println("enter the run scored by the player 2 of team "+teamname1);
t12=sc.nextInt();
System.out.println("enter the run scored by the player 3 of team "+teamname1);
t13=sc.nextInt();
System.out.println("enter the run scored by the player 4 of team "+teamname1);
t14=sc.nextInt();
System.out.println("enter the run scored by the player 5 of team "+teamname1);
t15=sc.nextInt();

int total1=t11+t12+t13+t14+t15;
System.out.println("the total score of the "+teamname1+" is "+total1);
System.out.println("-------------------------------------------");
System.out.println(teamname2+ " need to score more than "+total1+" run to win the game ");

System.out.println("enter the run scored by each team player of the team2 "+teamname2);
System.out.println("------------------------------------------------------------");
System.out.println("enter the run scored by the player 1 of team "+teamname2);
t21=sc.nextInt();
System.out.println("enter the run scored by the player 2 of team "+teamname2);
t22=sc.nextInt();
System.out.println("enter the run scored by the player 3 of team "+teamname2);
t23=sc.nextInt();
System.out.println("enter the run scored by the player 4 of team "+teamname2);
t24=sc.nextInt();
System.out.println("enter the run scored by the player 5 of team "+teamname2);
t25=sc.nextInt();

int total2=t21+t22+t23+t24+t25;

if(total1>total2) {
	int diff=total1-total2;
	System.out.println("team 1 :"+teamname1+" has won the match by "+diff+" runs");
	
	if(t11>t12&&t11>t13&&t11>t14&&t11>t15) {
		System.out.println("the man of the match is the player 1 of "+teamname1);
	}
	if(t12>t13&&t12>t14&&t12>t15&&t12>t11) {
		System.out.println("the man of the match is the player 2 of "+teamname1);
	}
	if(t13>t11&&t13>t12&&t13>t14&&t13>t15) {
		System.out.println("the man of the match is the player 3 of "+teamname1);
	}
	if(t14>t11&&t14>t12&&t14>t13&&t14>t15) {
		System.out.println("the man of the match is the player 4 of "+teamname1);
	}
	else {
		System.out.println("the man of the match is the player 5 of "+teamname1);
	}
}
else {
	int diff=total2-total1;
	System.out.println("team 2 :"+teamname2+" has won the match by "+diff+"runs");
	
	if(t21>t22&&t21>t23&&t21>t24&&t21>t25) {
		System.out.println("the man of the match is the player 1 of "+teamname2);
	}
	else if(t22>t23&&t22>t24&&t22>t25&&t22>t21) {
		System.out.println("the man of the match is the player 2 of "+teamname2);
	}
	else if(t23>t21&&t23>t22&&t23>t24&&t23>t25) {
		System.out.println("the man of the match is the player 3 of "+teamname2);
	}
	else if(t24>t21&&t24>t22&&t24>t23&&t24>t25) {
		System.out.println("the man of the match is the player 4 of "+teamname2);
	}
	else {
		System.out.println("the man of the match is the player 5 of "+teamname2);
	}
}

}




	}


