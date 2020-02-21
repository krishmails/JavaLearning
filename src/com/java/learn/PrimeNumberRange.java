package com.java.learn;

public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start=10,end =100;
		boolean flag=false;
		if(start>end) {
			int i =2;
			while(i<=start/2) {
				if(start%i==0) {
					flag=true;
					break;
				}
			}		
			i++;

			if(!flag) {
	System.out.println("prime number:"+start);
	start++;
}
		}
	}

}
