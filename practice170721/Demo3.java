package leetcode.practice170721;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given a string, find the length of the longest substring without repeating characters.
//Examples:
//Given "abcabcbb", the answer is "abc", which the length is 3.
//Given "bbbbb", the answer is "b", with the length of 1.
//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class Demo3 {
	/**
	 * �Լ�д�Ĵ��󷽷���ֻ���ǵ�һ����ĸ�ͺ������ĸ�Ƿ��غϣ�����û���ǳ��˵�һ��֮�������ַ��������ظ���char��������󳤶�Ҳ�����������ʾ��ֱ����һ������ʾ������г������ľ͸�ֵ����
	 */
//    public int lengthOfLongestSubstring(String s) {
//        int length = s.length();	
//		 char[] str = new char[length];
//		 str = s.toCharArray();
//		 int[] max = new int[length-1];
//		 for(int i=0;i<length-1;i++) {
//			 max[i]=1;
//			 for(int j=i+1;j<length;j++) {
//				 if(str[i]!=str[j])
//					max[i]++;
//                 if(str[i]==str[j])
//                     break;
//			 }
//         }
//		int maxlength = 0;
//		int index = 0;
//		for(int k=0; k<length; k++) {
//			maxlength = max[0];
//			if(maxlength<max[k]) {
//				maxlength=max[k];
//				index = k;}
//			}
//        return maxlength;
//    }
	
	
	/**
	 * Time complexity : O(n^3)
	 */
//	public int lengthOfLongestSubstring(String s) {
//		int n = s.length();
//		int maxlength = 0;
//		int ans = 0;
//		for(int i=0;i<n-1;i++) {
//			for(int j=i+1;j<n;j++) {
//				if (allUnique(s,i,j)) ans = Math.max(ans, j-i);
//			}
//		return ans;
//		}
//		
//	}	
//		public boolean allUnique(String str,int start,int end) {
//			Set<Character> set = new HashSet<>();
//			for(int i = start;i<end;i++) {
//				Character ch = s.charAt(i);
//				if(set.contains(ch)) return false;
//				set.add(ch);	
//			}
//			return true;
//		}
	
	/**
	 * Sliding Window 
	 */
//	public int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < n && j < n) {
//            // try to extend the range [i, j]
//            if (!set.contains(s.charAt(j))){
//                set.add(s.charAt(j++));	//��ȡj������j+1
//                ans = Math.max(ans, j - i);
//            }
//            else {
//                set.remove(s.charAt(i++));
//            }
//        }
//        return ans;
//    }
	/**
	 * Sliding Window Optimized 
	 * ��Ҫ�ص����(���ڻ�����̫���)
	 */
	 public int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);//���񷽷�������������ֱ�����Ż�
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	 
	 StringBuffer sb = new  StringBuffer("");

	
}
		 
