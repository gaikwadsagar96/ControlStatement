package com.hefshine.cw;

import java.util.Scanner;

// Write a program to input a number from the user and display the corresponding day of the week. 
public class Q2_CurrespondingDay {

	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("Enter number (1-7)");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
			System.out.println("Sunday");
		if(n==2)
			System.out.println("Monday");
		if(n==3)
			System.out.println("Tuesday");
		if(n==4)
			System.out.println("wensday");
		if(n==5)
			System.out.println("Thursday");
		if(n==6)
			System.out.println("Friday");
		if(n==7)
			System.out.println("Saturday");

	}
	}
}
