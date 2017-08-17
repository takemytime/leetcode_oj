package leetcode.practice170729;

public class Demo11 {
	/**
	 *  Time Limit Exceeded 
	 *  时间复杂度n^2
	 */
//	public int maxArea(int[] height) {
//		int n = height.length;
//		int contain = 0;
//		int max = 0;
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(height[i]>height[j])
//					contain = height[j]*(j-i);
//				else
//					contain = height[i]*(j-i);
//				if(max<contain)
//					max = contain;
//			}
//		}
//		return max;
//	}
	
	/**
	 * 事件复杂度 n
	 * @param height
	 * @return
	 */
	
	public int maxArea(int[] height) {
		int maxarea = 0, l = 0, r = height.length - 1;
		while(l<r) {
			maxarea = Math.max(maxarea, Math.min(height[l], height[r])*(r-l));
			if (height[l] < height[r])     //保留较高的，否则如果保留最低的，缩小横轴，容量一定降低
				l++;
			else
				r--;
		}
		return maxarea;
	}
}
