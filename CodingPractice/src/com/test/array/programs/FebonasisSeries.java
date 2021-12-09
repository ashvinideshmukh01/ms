package com.test.array.programs;

public class FebonasisSeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int sum=1;
		for(int i=2;i<=5;i++) {
			sum = first +second;
			System.out.println(sum);
			first = second;
			second = sum;
			
		}
		
	}

}
