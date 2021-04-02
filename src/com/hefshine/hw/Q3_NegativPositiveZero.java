package com.hefshine.hw;
//Write a program to display whether a number is negative, positive or zero.
import java.util.Scanner;

public class Q3_NegativPositiveZero {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
			System.out.println("number is negative");
		else if (n>0) {
			System.out.println("NUmber is positive");
		}
		else {
			System.out.println("number is zero");
		}

	}

}
