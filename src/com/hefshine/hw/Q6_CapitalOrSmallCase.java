package com.hefshine.hw;

import java.util.Scanner;

//Write a program to display whether a character is an uppercase or lowercase alphabet
public class Q6_CapitalOrSmallCase {

	public static void main(String[] args) 
	{
		System.out.println("Enter alphabet: ");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<'z')
		{
			System.out.println("lowercase");
		}
		else if (ch>='A'&&ch<='Z') {
			System.out.println("Uppercase");
		}
		else {
			System.out.println("please enter valid alphabet");
		}

	}

}
