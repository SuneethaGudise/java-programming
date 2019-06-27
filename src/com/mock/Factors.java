package com.mock;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factors;
		int num=1;
		int mod;
		System.out.println("Enter the Number =" );
		Scanner scanner =new Scanner(System.in);
		factors = Factors1.fact();
		
		for(int i=1;i<=10;i++)
		{
			mod=factors% num;
			if(mod==0)
			{
				System.out.println("The factors are=" + mod);
				
			}
			
		}
   num++;
	}

}
