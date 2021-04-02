package com.hefshine.hw;

import java.util.Scanner;

//Write a program to display whether the triangle is equilateral, isosceles or scalene triangle.
public class Q7_Triangle {

	public static void main(String[] args) 
	{
		System.out.println("Enter sides of triangle");
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		if(s1==s2||s1==s3)
		{
			if(s1==s2&&s1==s3)
			{
				System.out.println("Triangle is equilateral");
			}
			else {
				System.out.println("Triangle is isosceles");
			}
			
		}
		else {
			System.out.println("triangle is scaene");
		}

	}

}
