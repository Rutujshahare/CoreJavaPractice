package com.java.conditionaliterator;
import java.util.*;

public class MatrixAddition {
public static void main(String args[]) {
	int rows,column;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of the rows you want");
	rows=sc.nextInt();
	System.out.println("enter the numbr of column you want");
	column=sc.nextInt();
	
	int [][] matrix1=new int[rows][column];
	
	System.out.println("enter the element for the MATRIX1");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<column;j++) {
			matrix1[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("the element in the matrix1 is :");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<column;j++) {
			System.out.print(" "+matrix1[i][j]);
		}
		System.out.println(" ");
	}
	
	int [][] matrix2=new int[rows][column];
	
	System.out.println("enter the element for the MATRIX2");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<column;j++) {
			matrix2[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("the element in the matrix2 is :");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<column;j++) {
			System.out.print(" "+matrix2[i][j]);
		}
		System.out.println(" ");
	}
	
	int [][] matrix3=new int[rows][column];
	
	System.out.println("the addition of the matrix is getting performend:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<column;j++) {
			matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
		}
	}
	
	System.out.println("the addition of the matrix 1 and matrix 2  is :");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<column;j++) {
			System.out.print(" "+matrix3[i][j]);
		}
		System.out.println(" ");
	}
	
}
}
