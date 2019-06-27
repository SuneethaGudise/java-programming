package com.mock;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "STRING";
		int n = s.length();
		System.out.println(s);
		System.out.println(n);
		// for(int i=0;i<=n;i++)
		// {
		for (int j = n-1; j >= 0; j--) {

			char c = s.charAt(j);

			System.out.print(c);

		}

	}
}

//}
