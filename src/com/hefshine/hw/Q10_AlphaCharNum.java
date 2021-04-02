// Write a program to display if a character is an alphabet, number or special character. 
package com.hefshine.hw;

import java.util.Scanner;
public class Q10_AlphaCharNum {

	public static void main(String[] args) 
	{
		System.out.println("Enter char");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<'z'||ch>='A'&&ch<'Z') {
			System.out.println("alphabet");
		}
		else if (ch>='0'&&ch<='9') {System.out.println("Number");
			System.out.println("Number");
		}
		else {
			System.out.println("Special character");
		}

	}

}
