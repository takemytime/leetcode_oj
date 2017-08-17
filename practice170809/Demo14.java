package leetcode.practice170809;

//https://leetcode.com/problems/longest-common-prefix/description/
//	14. Longest Common Prefix 
//	Write a function to find the longest common prefix string amongst an array of strings. 

public class Demo14 {
	/*
	 * 水平扫描
	 */
//	public String longestCommonPrefix(String[] strs) {
//		if(strs.length == 0) return "";
//		String prefix = strs[0];
//		if(int i = 1; i < strs.length; i++) {				//从第二个开始匹配
//			while (strs[i].indexOf(prefix) != 0) {			//之前的prefix不是后面字符串的开头，则缩小prefix再去匹配
//				prefix = prefix.substring(0, prefix.length() - 1);
//				if (prefix.isEmpty()) return "";			//如果其中任何两个没有公共前缀，即全部字符串没有公共前缀
//			}
//		}
//		return prefix;
//	}
	
	/*
	 * 垂直扫描
	 */
//	public String longestCommonPrefix(String[] strs) {
//		if (strs == null || strs.length == 0) return "";
//		for (int i = 0; i < strs[0].length(); i++) {		//预设立场，最长的前缀最长的可能也就是第一个（或者任何一个）的完整字符串
//			char c = strs[0].charAt(i);						//取出第一个字符串的第一个字母
//			for(int j = 1; j < strs.length; j++) {			//与后面的length-1个字符串比较
//				if(i == strs[j].length() || strs[j].charAt(i) != c) //从第一个字母开始找，只要有不符合的就跳出，得到结果
//					return strs[0].substring(0, i);
//			}
//		}
//		
//		
//		return strs[0];
//	}
	/*
	 * 分而治之
	 */
	
//	public String longestCommonPrefix(String[] strs) {
//	    if (strs == null || strs.length == 0) return "";    			//判断是否为空
//	    return longestCommonPrefix(strs, 0 , strs.length - 1);			//否则调用longestCommonPrefix
//	}
//
//	private String longestCommonPrefix(String[] strs, int l, int r) {	//分成两组字符串组进行判断
//	    if (l == r) {													//只有一个字符串则不用分组
//	        return strs[l];
//	    }
//	    else {
//	        int mid = (l + r)/2;										//以mid为界，分组
//	        String lcpLeft =   longestCommonPrefix(strs, l , mid);		//分别对两组用longestCommonPrefix再不停拆分，最终拆为两个一组 或者一个一组
//	        String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
//	        return commonPrefix(lcpLeft, lcpRight);						//通过使用commonPrefix求两个字符串的最长匹配
//	   }
//	}
//
//	String commonPrefix(String left,String right) {						//求两个字符串的最长匹配实现
//	    int min = Math.min(left.length(), right.length());       		//选择最短的那个进行循环
//	    for (int i = 0; i < min; i++) {									//从第一个字符开始匹配测试
//	        if ( left.charAt(i) != right.charAt(i) )
//	            return left.substring(0, i);							
//	    }
//	    return left.substring(0, min);									//得出匹配的最长前缀字符串
//	}
	
	/*
	 * Binary search
	 */
	
	public String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0)							//判断是否为空
	        return "";
	    int minLen = Integer.MAX_VALUE;									//设置长度，设为整型的最大值
	    for (String str : strs)											//遍历strs
	        minLen = Math.min(minLen, str.length());					//找出最小的字符串长度
	    int low = 1;
	    int high = minLen;
	    while (low <= high) {											//把最短的长度拆成两等分，先匹配，如果符合就增加长度，再匹配，直到找到最长的前缀
	        int middle = (low + high) / 2;							
	        if (isCommonPrefix(strs, middle))
	            low = middle + 1;
	        else														//如果不匹配，则减少长度再去匹配，直到找到符合的最长匹配前缀
	            high = middle - 1;
	    }
	    return strs[0].substring(0, (low + high) / 2);					//把符合的截取出来，提交
	}

	private boolean isCommonPrefix(String[] strs, int len){				//判断是否符合为通用前缀
	    String str1 = strs[0].substring(0,len);							//把需要判断的字符串截取出来
	    for (int i = 1; i < strs.length; i++)
	        if (!strs[i].startsWith(str1))								//使用String.startWith()方法进行判断
	            return false;
	    return true;
	}
}
