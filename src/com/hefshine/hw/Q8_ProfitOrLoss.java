package com.hefshine.hw;
//Write a program to display and calculate profit or loss by a suitable example
public class Q8_ProfitOrLoss {

	public static void main(String[] args) 
	{
		
		Q8_ProfitOrLoss pl=new Q8_ProfitOrLoss();
		pl.claculate(11000,20000);
		pl.claculate(7000, 6000);
		
		
	}

	private void claculate(int sell, int buy) {
		int profit,loss;
		System.out.println("buy value: "+buy+" sell value:"+sell);
		if(sell>buy)
		{
		profit=((sell-buy)*100)/sell;
		System.out.println("Profit: "+profit+"%");
		}
		if(sell<buy)
		{
			loss=((buy-sell)*100)/buy;
			System.out.println("Loss: "+loss+"%");
		}
	}

}
