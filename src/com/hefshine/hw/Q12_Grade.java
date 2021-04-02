/* Write a program to input marks of five subjects by the user. 
 Now calculate sum and percentage of the marks. 
 Find the grade according to following:
	 a. Percentage >= 90% : Grade A 
	 b. Percentage >= 80% : Grade B 
	 c. Percentage >= 70% : Grade C 
	 d. Percentage >= 60% : Grade D 
	 e. Percentage >= 40% : Grade E 
	 f. Percentage < 40% : Grade 
*/
package com.hefshine.hw;

import java.util.Scanner;

public class Q12_Grade {

	public static void main(String[] args) 
	{
		int s1,s2,s3,s4,s5,sum,average,per;
		System.out.println("Enter marks of five sub:");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		sum=s1+s2+s3+s4+s5;
		average=sum/5;
		per=(sum*100)/500;
		if(per>=90)
			System.out.println("A grade "+per+" %");
		if(per<90&&per>=80)
			System.out.println("B grade "+per+" %");
		if(per<80&&per>=70)
			System.out.println("C grade "+per+" %");
		if(per<70&&per>=60)
			System.out.println("D grade "+per+" %");
		if(per<60&&per>=40)
			System.out.println("E grade "+per+" %");
		if(per<40)
			System.out.println("F grade "+per+" %");
	}

}
