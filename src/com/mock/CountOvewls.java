package com.mock;

public class CountOvewls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ovewls ="aeiou";
		int ovlen=ovewls.length();
		String str ="I WANT TO COUNT OVEWLS";
		str =str.toLowerCase();
		int len=str.length();
		int count=0;
		for(int n=0;n<len;n++) {
			char ch=str.charAt(n);
			for(int i=0;i<ovlen;i++) {
				char ovch=ovewls.charAt(i);
				if(ch==ovch)
				{
					count++;
				}
			}

		}
		System.out.println(count);		
		}

	}


