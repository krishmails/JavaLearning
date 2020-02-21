package com.java.learn;

public class UserDefinedException {

	public static void main(String[] args) {
		
		int age=-1;
		try {

			if(age<0) {
				
				throw new InvalidAgeException("Age cannot be negative");
				
			}
			
			
		}
		catch(Exception ex) {
			System.out.println("exception caught:"+ex);
		}
		

	}

}
