package com.mock;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="WELCOME TO JAVA";
		int len = str.length();
		System.out.println("the number of characters:" +len);
		String words[] =str.split(" ");//splits whitespaces
		System.out.println("Number of words:"+ words.length);
		

	}


	}


