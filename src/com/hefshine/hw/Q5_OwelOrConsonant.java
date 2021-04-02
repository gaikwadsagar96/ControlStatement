package com.hefshine.hw;
//Write a program to input an alphabet and display whether it is a vowel or a consonant. 
import java.util.Scanner;

public class Q5_OwelOrConsonant {

	public static void main(String[] args) 
	{
		System.out.println("Enter char");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("'"+ch+"'"+" is owel");
		}
		else {
			System.out.println("'"+ch+"'"+" is consonant");
		}

	}

}
