package com.hefshine.hw;

import java.util.Scanner;

public class Q2_EvenOddNumber {

	public static void main(String[] args)
	{
		System.out.println("Enter number to check even or odd: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("number is even");
		else
			System.out.println("Number is odd");
	}

}
