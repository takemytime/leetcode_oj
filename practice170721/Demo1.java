package leetcode.practice170721;

public class Demo1 {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for(int i=0;i<length-1;i++) {
        	for(int j=i+1;j<length;j++) {
        		if(nums[i]==target-nums[j]) {
                    return new int[]{i,j};
        		}
        	}
        }
 	    throw new IllegalArgumentException("No two sum solution");
     }
}
