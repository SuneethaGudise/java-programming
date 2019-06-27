package com.mock;

public class Area1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RectangleArea ra=new RectangleArea(0, 0);
		
	//	RectangleArea ar1= new RectangleArea();
		RectangleArea ar = new RectangleArea(40,5);
		
		int result = ar.Area();
		 Area1.displayRec1(ar);
		
	
		System.out.println(result);
				
	}
	
	// display only when len > 50
	public static void displayRec1(RectangleArea obj ) {
		RectangleArea temp=obj;
		
		int len = obj.getLength();
		if (len > 50)
			System.out.println("displaying rect");
		//return temp;
	 }
	
	 public int displayRec(int len,int wid ) {
		 int a=len*wid;
		 return a;
	 }
	

}
