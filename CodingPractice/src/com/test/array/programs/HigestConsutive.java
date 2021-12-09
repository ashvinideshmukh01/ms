package com.test.array.programs;

public class HigestConsutive {

	public static void main(String[] args) {
		
		String s = "Helliiiokkkkk";
		int count = 1;
		int maxCount = 0;
		char[] charArray = s.toLowerCase().toCharArray();
		for(int i = 0 ; i<charArray.length-1;i++) {
			if(charArray[i]==charArray[i+1]) {
				count++;
				maxCount = count;
			}else {
				count = 1;
			}
		}
		System.out.println(maxCount);
	}

}
