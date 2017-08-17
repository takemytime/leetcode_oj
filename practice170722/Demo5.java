package leetcode.practice170722;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-palindromic-substring/#/description

//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//Example: 
//Input: "babad"
//
//Output: "bab"
//
//Note: "aba" is also a valid answer.
//
//Example: 
//Input: "cbbd"
//
//Output: "bb"

/**
 * 
 * @author ZongwenZuo
 *
 */

public class Demo5 {
//	public String longestPalindrome(String s) {
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int i = 0, j = 0, maxl = 0, index = 0;
//        String result = "";
//        while(i<n && j<n) {
//        	if(!set.contains(s.charAt(j))){
//        		set.add(s.charAt(j++));			//��ȡj������j+1
//        		if(0<(j-i+1-maxl)) {
//        		maxl =  j-i+1;
//        		index = i;
//        		}
//        	}else 
//        		set.remove(s.charAt(i++));        	
//        }
//        result = s.substring(index, index+maxl-1);
//        return result;
//    }
//	public String longestPalindrome(String s) {
//        String result = "";
//    	int length = s.length();	
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
//		result = s.substring(index, index+maxlength-1);
//		return result;
//    }
	
	/*
	 * Expand Around Center
	 */
	public String longestPalindrome(String s) {
	    int start = 0, end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);   //ѡ���s.charAt(i)��ʼ�������ң��ж������Ƿ���ͬ
	        int len2 = expandAroundCenter(s, i, i + 1);//�ֱ��s.charAt(i)��s.charAt(i+1)�ֱ��������ң��ж������Ƿ���ͬ
	        int len = Math.max(len1, len2);				//�ж�len1��len2���ֳ��ȸ���
	        if (len > end - start) {					//�����εĳ��ȴ���֮ǰ�ĳ��ȣ��������ж����ͽ��
	            start = i - (len - 1) / 2;				//������Ҫע��һ�£����len�����������ǵ�һ�������end��Ϊ������2���Ի���1����startһ��
	            										//���len��ż�������ǵڶ��������start��end��1
	            end = i + len / 2;
	        }
	    }
	    return s.substring(start, end + 1);				//��substring����һ���ַ���
	}

	private int expandAroundCenter(String s, int left, int right) {	//�ж��Ƿ��ǻػ���
	    int L = left, R = right;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}
	
	/*
	 * Manacher's Algorithm
	 */
	
	
}
