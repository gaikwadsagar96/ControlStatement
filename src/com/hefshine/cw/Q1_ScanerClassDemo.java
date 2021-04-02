package com.hefshine.cw;

import java.util.Scanner;

//How to accept different types of data using Scanner class.
public class Q1_ScanerClassDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile No");
		long mo=sc.nextLong();
		System.out.println("Enter name:");
		String name=sc.next();

		System.out.println("Enter Perrcentage:");
		float per=sc.nextFloat();
		System.out.println("Enter Address:");
		String addd=sc.nextLine();
		System.out.println("Name: "+name +"\tMobile no: "+mo+"\tAddress: "+addd+"\tPercentage: "+per);

	}

}
