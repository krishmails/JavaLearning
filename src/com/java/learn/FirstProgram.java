package com.java.learn;

import java.util.Arrays;

public class FirstProgram {

	public static void main(String[] args) {

		// int a[]= new int[5];
		int a[] = { 5, 20, 15, 10, 25 };
		int sum = 0;
		boolean flag=false;
		for (int i : a) {
			if(i==40) {
				flag=true;
				System.out.println("value is present"+ i);
				break;
			}			
			//sum = sum + i;
		}
		if (!flag) //if(flag) == if(flag==true)
		 {
			System.out.println("the value is not present");

		}
		
		System.out.println("sum of array values = " + sum);
		int avg = (sum / a.length);
		System.out.println("average if sum=" + avg);
		Arrays.sort(a);
	//s	Arrays.fitoString(a);
		
		System.out.println(a);
		// for(int i=0; i<a.length;i++) {
		//
		// System.out.println(a[i]);
		// }

	}

}
