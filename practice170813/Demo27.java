package leetcode.practice170813;
//https://leetcode.com/problems/remove-element/description/
//	27. Remove Element 
//	Given an array and a value, remove all instances of that value in place and return the new length. 
//	Do not allocate extra space for another array, you must do this in place with constant memory.
//	The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//	Example:
//	Given input array nums = [3,2,2,3], val = 3 
//	Your function should return length = 2, with the first two elements of nums being 2.
public class Demo27 {
//	public int removeElement(int[] nums, int val) {
//		int ans = 0;
//		int[] r = new int[0];
//		if(nums.length == 1 && nums[0] == val) {			
//			nums = r;			
//			return 1;
//		}
//		int n = nums.length;
//		for(int i = 0 ; i < n; i++) {
//			if(nums[i] == val ){
//				ans ++;
//            if(i != n-1)
//				nums[i] = nums[i+1];
//            }
//		}
//		return ans;	        
//	}
	/*
	 * 
	 */
//	public int removeElement(int[] nums, int val) {
//	    int i = 0;
//	    for (int j = 0; j < nums.length; j++) {
//	        if (nums[j] != val) {
//	            nums[i] = nums[j];
//	            i++;
//	        }
//	    }
//	    return i;
//	}
	/*
	 * 
	 */
	public int removeElement(int[] nums, int val) {
	    int i = 0;
	    int n = nums.length;
	    while (i < n) {
	        if (nums[i] == val) {
	            nums[i] = nums[n - 1];
	            // reduce array size by one
	            n--;							//如果有重复的就缩减长度n
	        } else {
	            i++;							//没有重复的就i向右滑
	        }
	    }
	    return n;
	}
}
