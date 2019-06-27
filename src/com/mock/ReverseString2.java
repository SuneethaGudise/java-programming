package com.mock;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str ="HELLO WORLD";
     int len =str.length();
     System.out.println(str);
     System.out.println(len);
     for(int rev =len-1;rev>=0;rev--) {
    	 char c = str.charAt(rev);
    	 System.out.print(c);
    	 
     }
	}

}
