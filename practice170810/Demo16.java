package leetcode.practice170810;

import java.util.Arrays;

//https://leetcode.com/problems/3sum-closest/description/
//	16. 3Sum Closest 
//	Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//    For example, given array S = {-1 2 1 -4}, and target = 1.
//    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

public class Demo16 {
	/**
	 * 跟Demo15一个思路
	 * @param nums
	 * @param target
	 * @return
	 */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE, result = 0;
        for(int i = 0; i < nums.length-2; i++) {
        	int lo = i+1, hi = nums.length-1;
        	while(lo<hi) {
	        	if(min>Math.abs(target-nums[i]-nums[lo]-nums[hi])) {
	        		min=Math.abs(target-nums[i]-nums[lo]-nums[hi]);
	        		result = nums[i]+nums[lo]+nums[hi];
	        	}
	        	if(target-nums[i]-nums[lo]-nums[hi]==0){
	        		return result;
	        	}
	        	if(target-nums[i]-nums[lo]-nums[hi]>0) {
	        		lo++;
	        	}
	        	if(target-nums[i]-nums[lo]-nums[hi]<0) {
	        		hi--;
	        	}
	        }
        }
    	return result;
    }

}
