package leetcode.practice170813;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
//	26. Remove Duplicates from Sorted Array 
//	Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//	Do not allocate extra space for another array, you must do this in place with constant memory. 
//	For example,
//	Given input array nums = [1,1,2], 
//	Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
//	It doesn't matter what you leave beyond the new length. 


public class Demo26 {
	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {	
	        if (nums[j] != nums[i]) {				//不停地和nums[i]比较
	            i++;								//同时i还负责计数，同时也担任索引
	            nums[i] = nums[j];					//如果nums[i]和nums[j]不同，就把nums[i]设成nums[j]，方便和后面的nums[j]比较	
	        }
	    }
	    return i + 1;								//最后i+1就是最后的数
	}
}
