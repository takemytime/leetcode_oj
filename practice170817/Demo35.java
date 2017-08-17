package leetcode.practice170817;

//https://leetcode.com/problems/search-insert-position/description/
//	35. Search Insert Position 
//	Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//			You may assume no duplicates in the array.
//			Here are few examples.
//			[1,3,5,6], 5 → 2
//			[1,3,5,6], 2 → 1
//			[1,3,5,6], 7 → 4
//			[1,3,5,6], 0 → 0 

public class Demo35 {
    public static int searchInsert(int[] nums, int target) {
        if(nums[0] > target)								//第一个都小于target，返回值一定是0
        	return 0;
    	for(int i = 0; i < nums.length-1; i++) {			//如果位于中间
        	System.out.println(i);
    		if(nums[i] == target)							//等于则返回该值
        		return i;
        	if(nums[i]<target && nums[i+1]>target)			//如果target在nums[i]和nums[i+1]之间，则插入
        		return i+1;
        }
    	if(nums[nums.length-1] == target)					//与最后一个值比较，值可能是等于或者大于
    		return nums.length-1;
    	else
    		return nums.length;
    }
    public static void main(String[] args) {
		int[] num = {1,3};
		int target = 3;
    	int ans = 0;
		ans = searchInsert(num,target);
		System.out.println(ans);
	}
}
