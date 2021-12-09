package stack.impl;

import java.util.HashMap;

public class Test {
	public static int findFirstUnique(int [] array) {
		   
		   HashMap<Integer, Integer> countElements = new HashMap<>();
		   for(int i = 0; i < array.length; i++){
		     countElements.put(array[i],0);
		   }
		   for(int i = 0; i < array.length; i++){
		     countElements.put(array[i],countElements.get(array[i])+1);
		   }
		   for(int i = 0; i < array.length; i++){
		     if(countElements.get(array[i]) <= 1){
		       return array[i];
		     }
		   }
			 return - 1;
		 }     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,3,5,8,1};
		int findFirstUnique = findFirstUnique(array);
		System.out.println(findFirstUnique);

	}

}
