package com.mock;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;
		int rev =0;
		System.out.println("Enter The Number :" );
		Scanner scan =new Scanner(System.in);
		num = scan.nextInt();
		
		while(num!=0) {
			rev = (rev*10) + (num%10);
			num = num/10;
		}
		System.out.println("The Reverse Number is :" +rev);

	}

}
