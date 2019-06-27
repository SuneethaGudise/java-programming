package com.mock;

import java.util.Scanner;

public class SimpleprogAreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the length=");
          double l= s.nextDouble();
         System.out.println("Enter the Width =");
          double w=s.nextDouble();
          double area = l*w;
          System.out.println("The Area is =" +area);

	}

}
