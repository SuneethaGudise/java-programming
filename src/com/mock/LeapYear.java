package com.mock;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1990;
		int j=2000;
		while(i<=j)
		{
			if(i%4==0)
			{
				if(i%100==0 )
				{
					if(i%400==0)
					{ 
						System.out.println("Leapyear=" + i);	
					}
					
				}
				else
					System.out.println(" LeapYear=" +i );
				
			}
			i++;
		}
		

	}

}
