package com.test.array.programs;

public class Factorial {

	public int findFact(int num) {
		int fact = 1;
//		for(int i=1;i<=num;i++)
//		fact = fact*i;
//		return fact;
		while(num>0) {
		fact = num * findFact(num-1);
		}
		return fact;
		
	}
	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		int findFact = fact.findFact(5);
		System.out.println(findFact);
	}

}
