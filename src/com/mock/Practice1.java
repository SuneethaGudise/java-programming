package com.mock;

public class Practice1 {
//NUMBER DIVISIBLE BY 3=FUZZ AND 5=BUZZ AND BOTH=FUZZBUZZ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FUZZBUZZ" + i);
			}
			else
			
			if (i % 3 == 0) {
				System.out.println("FUZZ" + i);
			
			}
			else
				
			if (i % 5 == 0) {
				System.out.println("BUZZ" + i);
			}
			
				
		}
	}

}
