package com.mock;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=6;
      int fact=n;
      for (int i=1;i<n;i++)
      {
    	  int x= n-i;
    	  fact=fact*x;
    	  System.out.println(fact);  
      }
      
	}

}
