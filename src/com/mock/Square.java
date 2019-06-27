package com.mock;


public class Square {
	public static void main(String[] args) {
		int userInput; // The number input by the user.
		int square; // The userInput, multiplied by itself.
		System.out.print("Please type a number: ");
		userInput = TextIO.getlnInt();
		square = userInput * userInput;
		System.out.print("The square of that number is ");
		System.out.println(square);
	} // end of main()
} // end of class PrintSquare

