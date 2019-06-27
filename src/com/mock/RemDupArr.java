package com.mock;

import java.util.ArrayList;
import java.util.Iterator;

public class RemDupArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =new ArrayList();
		list.add("JAN");
		list.add("FEB");
		list.add("MAR");
		list.add("APR");
		list.add("MAY");
		list.add("JAN");
		list.add("Mar");
		list.add("FEB");
		System.out.println(list);
		Iterator itr=list.iterator();
		int len =list.size();
		System.out.println(len);
		while(itr.hasNext()) {
			for(int i=0;i<len;i++) {
				for(int n=i+1;n<len;n++) {
					
						
					}
				}
			}
			
			String str = (String)itr.next();
			
		}
		
		
	}


