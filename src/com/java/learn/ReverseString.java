package com.java.learn;

public class ReverseString {
	public static void main(String[] args)
	{
		String str="shasana";
//		for(int i=1;i<=str.length();i++) {
//			System.out.print(str.charAt(str.length()-i));
//		}
StringBuffer str1=new StringBuffer(str);

//		for(int i=1;i<=str.length();i++) {
//		str1+=str.charAt(str.length()-i);
//	}
//		System.out.println(str1);

System.out.println(str1.reverse());
	}


}
