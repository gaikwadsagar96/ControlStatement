// Write a program to display if the entered year is a leap year or not. 
package com.hefshine.hw;

import java.util.Scanner;

public class Q11_LeapYear {

	public static void main(String[] args) 
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		year=sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
				System.out.println("leap year");	
		}
		else {
			System.out.println("Not leap year");
		}
	}

}
