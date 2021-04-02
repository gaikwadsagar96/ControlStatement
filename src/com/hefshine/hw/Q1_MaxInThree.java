package com.hefshine.hw;
// Write a program to display maximum among three numbers. 
public class Q1_MaxInThree {

	public static void main(String[] args) 
	{
	int n1=40,n2=50,n3=30;
	if(n1>n2&& n1>n3)
	{
		System.out.println(n1+" is greater than "+n2+" & "+n3);
	}
	else if (n2>n1&& n2>n3) {
		System.out.println(n2+" is greater than "+n1+" & "+n3);
		
	}else {
		System.out.println(n3+" is greater than "+n1+" & "+n3);
	}

	}

}
