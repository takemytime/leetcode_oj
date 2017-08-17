package leetcode.practice170813;

//https://leetcode.com/problems/next-permutation/description/
//	31. Next Permutation 
//	Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers. 
//	If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order). 
//	The replacement must be in-place, do not allocate extra memory. 
//	Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
//	1,2,3 → 1,3,2
//	3,2,1 → 1,2,3
//	1,1,5 → 1,5,1


public class Demo31 {
	/*
	 * 算法想错了
	 */
//	 public void nextPermutation(int[] nums) {
//		 int cur = 0;
//		 int mid = 0;
//		 for(int i = 0 ; i < nums.length-1; i++) {
//		 		if(nums[i]>nums[i+1])
//		 			cur++;
//		 		if(cur == nums.length-1) {
//		 			for(int j = 0; j < nums.length/2; j++) {
//		 				mid = nums[nums.length-1-j];
//		 				nums[nums.length-1-j] = nums[j];
//		 				nums[j] = mid;
//		 			}
//		 			return ;
//		 		}
//		 	}
//		for(int k = nums.length; k > 0; k--) {
//			if(nums[k] > nums[k-1]) {
//				for(int p = k-1; p < nums.length; p++) {
//					if(nums[k-1]>nums[p]) {
//						mid = nums[k-1];
//						nums[k-1] = nums[p];
//						nums[p] = mid;
//						return;
//					}
//				}
//			}
//		}
//	}
	/*
	 * 参考solution
	 */
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;											//i不仅可以用来判断是否数组是最大值，还能找到不符合的那个索引位置
        }
        if (i >= 0) {										//如果倒叙比较每一次都符合(length-1)，则i=-1
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {			//再从后往前找，找到一个比nums[i]小的数，交换nums[i]和nums[j]
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);								//如果i=-1，则反转这个数组，变成最小数值,start从0开始，即i+1
    }

    private void reverse(int[] nums, int start) {			//头和尾相交换
        int i = start, j = nums.length - 1;
        while (i < j) {										//头小于尾的时候就交换(奇数个元素结束情况是i==j,偶数则是i>j)
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {			//定义一个交换函数
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
