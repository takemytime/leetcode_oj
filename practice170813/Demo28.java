package leetcode.practice170813;

//https://leetcode.com/problems/implement-strstr/description/
//	28. Implement strStr() 
//	Implement strStr(). 
//	Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. 

public class Demo28 {
//	public int strStr(String haystack, String needle) {
//        char[] ha = haystack.toCharArray();
//        char[] ne = needle.toCharArray(); 
//        int i = 0;
//        while (ha.length - i -1 >= ne.length) {
//        	int j = 0;
//			for(int k = 0; k < ne.length; k++) {
//				if(ha[i] != ne[k]) {
//					i+=1;
//					break;
//				}
//				j++;
//				if(j == ne.length-1) {
//					return i;
//				}
//			}
//		}
//        return -1;
//    }
	
	public int strStr(String haystack, String needle) {
		  for (int i = 0; ; i++) {
		    for (int j = 0; ; j++) {
		      if (j == needle.length()) return i;							//循环j == needle.length()都没break说明在haystack中已经有符合needle长度的字符串
		      if (i + j == haystack.length()) return -1;					//i+j以及达到haystack的长度，haystack.charAt(i + j)以及取到了尽头
		      if (needle.charAt(j) != haystack.charAt(i + j)) break;		//两个都用charAt来取，就都是char类型，可以比较了
		    }
		  }
		}
}
