package leetcode.practice170809;

//https://leetcode.com/problems/3sum/description/
//	15. 3Sum 
//	Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//	Note: The solution set must not contain duplicate triplets.


import java.util.Arrays;
import java.util.LinkedList;

//https://leetcode.com/problems/3sum/description/
//	15. 3Sum 
//	Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

import java.util.List;

public class Demo15 {
	/**
	 * Your input
		[-1,0,1,2,-1,-4]
		Your answer
		[[-1,0,1],[-1,2,-1],[0,1,-1]]
		Expected answer
		[[-1,-1,2],[-1,0,1]]
		会有重复的结果
	 */
//	public List<List<Integer>> threeSum(int[] nums) {
//		List<List<Integer>> res = new LinkedList<>(); 
//	    for(int i = 0; i < nums.length; i++) {
//	    	for(int j = i+1; j < nums.length; j++ ) {
//	    		for(int k = j+1; k < nums.length; k++) {
//	    			if(isSumZero(nums, i, j, k))
//	    				res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//	    		}
//	    	}
//	    }
//		
//		return res;
//	}
//	public boolean isSumZero(int[] num,int i, int j,int k) {
//		if(num[i]==num[j] &&num[i]==num[k])
//			return false;
//		if(num[i]+num[j]+num[k]==0)
//			return true;
//		return false;
//	}
	/**
	 * 
	 */
	public List<List<Integer>> threeSum(int[] num) {
	    Arrays.sort(num);
	    List<List<Integer>> res = new LinkedList<>(); 							//定义链表
	    for (int i = 0; i < num.length-2; i++) {								//第一个数字到length-2就可以了，因为后面还要留两个数
	        if (i == 0 || (i > 0 && num[i] != num[i-1])) {						//为了保证不含重复的元素
	            int lo = i+1, hi = num.length-1, sum = 0 - num[i];		
	            while (lo < hi) {
	                if (num[lo] + num[hi] == sum) {
	                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
	                    while (lo < hi && num[lo] == num[lo+1]) lo++;			//排序后，把重复的因素取消
	                    while (lo < hi && num[hi] == num[hi-1]) hi--;			
	                    lo++; hi--;
	                } else if (num[lo] + num[hi] < sum) lo++;					//如果相加小于0，则把num[lo]变大，即索引增加
	                else hi--;													//如果相加大于0，则把num[hi]变小，即索引减小
	           }
	        }
	    }
	    return res;
	}
	
}
