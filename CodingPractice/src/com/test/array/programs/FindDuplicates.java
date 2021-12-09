package com.test.array.programs;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		FindDuplicates duplicates = new FindDuplicates();
		int[] array = {2,2,1,4,1,5,6,3,1,1,1,3};
//		duplicates.findDup(array);
		List<Integer> findDuplicates = duplicates.findDuplicates(array);
		findDuplicates.stream().forEach(s->System.out.println(s));
//	}
//
//	private void findDup(int[] array) {
//		
//		Arrays.sort(array);// 1,1,2,2,3,4,5,6
//		int i =0;
//		
//		for(;i<array.length-1;i++) {
//			if(array[i] == array[i+1])
//				System.out.println(array[i]);
//		}
		
	}
		 public List<Integer> findDuplicates(int[] nums) {
		        for(int i = 0; i < nums.length; i++) {
		            // nums[i] - 1 is the index of nums[i] should be
		            // if the value on the index position != nums[i], do swap
		            // otherwise continue
		            while(nums[nums[i] - 1] != nums[i]) {
		                swap(nums, i, nums[i] - 1);
		            }
		        }
		        
		        List<Integer> ans = new ArrayList<>();
		        for(int i = 0; i < nums.length; i++) {
		            if(nums[i] != i + 1) {
		                ans.add(nums[i]);
		            }
		        }
		        return ans;
		    }
		    
		    private void swap(int[] nums, int a, int b) {
		        int temp = nums[a];
		        nums[a] = nums[b];
		        nums[b] = temp;
		    }
		

		
	}
	
	
	


