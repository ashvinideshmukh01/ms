package com.test.array.programs;

public class primenumberprogram {

	public static void main(String[] args) {
		int number = 34;
		int flag = 0;
		if(number == 0||number == 1||number==2) {
			System.out.println("number is not prime");
		}
		for(int i = 2;i<=number/2;i++) {
			if(number%i==0) {
				System.out.println("number is not prime");
				flag =1;
				break;
			}
			
		}
		if(flag==0)
		System.out.println("number is prime");
	}

}
