package com.java.learn;

public class NullPointerException1 {
	static String s =null;
	
	public static void findingLength(){
	try {
		int a = s.length();

		System.out.println(a);

	}
	catch(Exception ex) {
	ex.getClass();	
	}
}
	
	public static void main(String args[]) {
		findingLength();
	}
}

	
