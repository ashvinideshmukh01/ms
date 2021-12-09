package com.test.array.programs;

import java.util.Arrays;

public class Highest_5_th_ele {

	public static void main(String[] args) {
		int temp, size;
		   int array[] = {10, 20, 25, 63, 96, 57};
		   size = array.length;
		   
//		   for(int i = 0; i<size; i++ ){
//		      for(int j = i+1; j<size; j++){
//		         if(array[i]>array[j]){
//		            temp = array[i];
//		            array[i] = array[j];
//		            array[j] = temp;
//		         }
//		      }
//		   }
		   Arrays.sort(array);
		   System.out.println("Third largest number is:: "+array[size-5]);
		   }
	}


