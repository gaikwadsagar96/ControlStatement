package com.hefshine.cw;

import java.util.Scanner;

/*Consider a situation below of the electricity unit charges. 
 * Now input electric units by the user and calculate total electricity bill according to the given condition.
 *  For first 50 units Rs. 0.50/unit 
 *  For next 100 units Rs.0.75/unit 
 *  For next 100 units Rs. 1.20/unit 
 *  For unit above 250 Rs.1.50/unit 
 *  An additional surcharge of 20% is added to the bill*/
public class ElectricityBill 
{
	public static void main(String[] args) 
	{
		double unit_charge,surcharge,total_bill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Units: ");
		int units=sc.nextInt();
		if(units<=50)
		{
			unit_charge=units*0.50;
			surcharge=(unit_charge*20)*100;
			total_bill=unit_charge+surcharge;
			System.out.println("Totla Bill: "+total_bill);
		}
		if(units>50&& units<=150)
		{
			unit_charge=units*0.50;
			int nextUnit=units-50;
			float nuc=(float) (nextUnit*0.75);
			float tunitch=(float) (unit_charge+nuc);
			surcharge=(tunitch*20)*100;
			total_bill=unit_charge+tunitch+surcharge;
			System.out.println("Totla Bill: "+total_bill);
		}
		if(units>150 && units<=250)
		{
			unit_charge=50*0.50+100*0.75;
			float nuc=units-150;
			float nunitch=(float) (nuc*1.20);
			float tunitch=(float) (unit_charge+nunitch);
			surcharge=(tunitch*20)*100;
			total_bill=unit_charge+surcharge+tunitch;
			System.out.println("Totla Bill: "+total_bill);
		}
		if(units>250)
		{
			unit_charge=50*0.50+100*0.75+100*1.20;
			float nu=units-250;
			float nuch=(float) (nu*1.50);
			float tunitch=(float) (unit_charge+nuch);
			surcharge=(tunitch*20)*100;
			total_bill=unit_charge+surcharge+tunitch;
			System.out.println("Totla Bill: "+total_bill);
		}
		
	}

}
