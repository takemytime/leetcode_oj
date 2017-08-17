package leetcode.practice170816;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageTypeSpecifier;

//https://leetcode.com/problems/search-for-a-range/description/
//	34. Search for a Range
//	Given an array of integers sorted in ascending order, find the starting 
//	and ending position of a given target value.
//	Your algorithm's runtime complexity must be in the order of O(log n).
//	If the target is not found in the array, return [-1, -1].
//	For example,
//	Given [5, 7, 7, 8, 8, 10] and target value 8,
//	return [3, 4]. 


public class Demo34 {
	/*
	 * Time Limit Exceeded 
	 */
//	public int[] searchRange(int[] nums, int target) {
//		 int start = 0, end = nums.length-1, mid = nums.length/2;
//		 int[] notfound = {-1,-1};
//		 int[] res = new int[nums.length];
//		 int ind = 0;
//		 if(nums.length == 0 || (nums.length == 1 && nums[0] != target))
//			 return notfound;
//		 
//		 
//		 if(nums[mid] > target) 					//缩小一半的范围
//				end = mid;
//		 else if(nums[mid] < target) 
//			 	start = mid;
//		 
//		 while(start <= end) {
//			 if(nums[start] == target)
//				 res[ind] = start;
//			 
//			 if(nums[start] <= target)
//				 start ++;
//			 
//		 }
//		 return res;
//	 }
	/*
	 * 自己写的accept
	 */
//	public int[] searchRange(int[] nums, int target) {
//		 int[] notfound = {-1,-1};
//		 int[] ans = new int[2];
//		 int ind = 0;
//		for(int i = 0; i < nums.length; i++) {			//正向找start
//			if(nums[i] == target) {
//				ans[ind] = i;
//				ind++;
//				break;
//			}
//		}
//		for(int j = nums.length-1 ; j >= 0 ; j--) {		//反向找end
//			if(nums[j] == target) {
//				ans[ind] = j;
//				ind++;
//				break;
//			}
//		}
//		if(ind == 0)									//没找到则返回[-1;-1]
//			return notfound;
//		else
//			return ans;
//	}
	/*
	 * discussion里面排第一个的
	 */
	public int[] searchRange(int[] A, int target) {
		int start = Solution.firstGreaterEqual(A, target);
		if (start == A.length || A[start] != target) {
			return new int[]{-1, -1};
		}
		return new int[]{start, Solution.firstGreaterEqual(A, target + 1) - 1};
	}

	//find the first number that is greater than or equal to target.
	//could return A.length if target is greater than A[A.length-1].
	//actually this is the same as lower_bound in C++ STL.
	private static int firstGreaterEqual(int[] A, int target) {
		int low = 0, high = A.length;
		while (low < high) {
			int mid = low + ((high - low) >> 1);
			//low <= mid < high
			if (A[mid] < target) {
				low = mid + 1;
			} else {
				//should not be mid-1 when A[mid]==target.
				//could be mid even if A[mid]>target because mid<high.
				high = mid;
			}
		}
		return low;
	}
}	

