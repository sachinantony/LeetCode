package com.sachin.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = {3,2,4};
		twoSum(inp,6);

	}
	
	public static void twoSum(int[] nums, int target) {
		Map<Integer,Integer> valueMap = new HashMap<Integer,Integer>();
		int[] outputArray = new int[2];
		for(int i = 0; i<nums.length; i++) {
			valueMap.put(nums[i], i);
		}
		System.out.println(valueMap);
		for(int j = 0; j<nums.length;j++) {
			if(valueMap.get(target-nums[j]) != null && valueMap.get(target-nums[j]) != j) {
				outputArray[0] = j;
				outputArray[1] = valueMap.get(target-nums[j]);
				break;
			}
		}
		System.out.println(outputArray[0]+","+outputArray[1]);
	}
}
