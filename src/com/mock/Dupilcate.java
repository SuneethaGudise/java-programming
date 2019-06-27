package com.mock;

public class Dupilcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String [] month = {"jan","feb","mar","apr","may","june","july","mar","jan","aug","july"};
     int len =month.length;
     int arr [] =new int[10];
     arr[0]=10;
     int temp=0;
     for(int n=0;n<len;n++) {
    	 for(int i =n+1;i<len;i++) {
    		 if(month[n].equals(month[i])) {
    			
    			 arr[temp]=i;
    			 temp++;
    		 }
    	 }
    	 
     }
     for(int a=0; a<=len;a++) {
    	 
     
     System.out.println(arr[a]);
	}
	}

}
