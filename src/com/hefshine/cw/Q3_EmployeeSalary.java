package com.hefshine.cw;

import java.util.Scanner;

/*Write a program to input basic salary of an employee and calculate its Gross salary according to following:
 *  Basic Salary <= 10000: HRA = 20%, DA =80%
 *   Basic Salary <= 20000 : HRA = 25%, DA =90% 
 *   Basic Salary > 20000 : HRA = 30%, DA =95% 
 *  */
public class Q3_EmployeeSalary {

	public static void main(String[] args) 
	{
		float hra,da,GrossSallary;
		System.out.println("Enter sallary to calculate Gross Sallary:");
		Scanner sc=new Scanner(System.in);
		int sallary=sc.nextInt();
		if(sallary<=10000)
		{
			hra=(sallary*20)/100;
			da=(sallary*80)/100;
			GrossSallary=sallary+hra+da;
			System.out.println("GrossSallary: "+GrossSallary);
		}
		if(sallary>10000 && sallary<20000)
		{
			hra=(sallary*25)/100;
			da=(sallary*90)/100;
			GrossSallary=sallary+hra+da;
			System.out.println("GrossSallary: "+GrossSallary);
		}
		if(sallary>=20000)
		{
			hra=(sallary*30)/100;
			da=(sallary*95)/100;
			GrossSallary=sallary+hra+da;
			System.out.println("GrossSallary: "+GrossSallary);
		}
		

	}

}
