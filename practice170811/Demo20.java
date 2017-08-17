package leetcode.practice170811;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/description/
//	20. Valid Parentheses 
//	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//	The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	
	
public class Demo20 {
	/**
	 * 思路不对
	 * 
	 */
//    public boolean isValid(String s) {
//    	if(s.length()%2 == 1) {
//    		return false;
//    	}
//		for(int i = 0; i < s.length()-2; i+=2) {
//			if(s.charAt(i) == '(') {
//				if(s.charAt(i+1)!= ')' ) {
//					return false;
//				}		
//			}
//			if(s.charAt(i) == '{') {
//				if(s.charAt(i+1)!= '}' ) {
//					return false;
//				}		
//			}
//			if(s.charAt(i) == '[') {
//				if(s.charAt(i+1)!= ']' ) {
//					return false;
//				}
//			}
//			if(s.charAt(i)!='(' && s.charAt(i)!='{'&& s.charAt(i)!='[') {
//				return false;
//			}
//		}
//	return true;
//    }
	/**
	 * 自己写的第二遍
	 */
//    public boolean isValid(String s) {
//    	if(s.length()%2 == 1) {
//		return false;
//	}
//    	for(int i = 0; i < s.length()-1; i++) {
//			if(s.charAt(i)!='(' && s.charAt(i)!='{'&& s.charAt(i)!='[') {
//			return false;
//			}
//			if(s.charAt(i) == '(') {
//				for(int j=i+1; j < s.length()-1;j++) {
//					if(s.charAt(j)==')') {
//						s.replaceFirst(")", "");
//					}else
//						continue;						
//				}
//			}
//			if(s.charAt(i) == '{') {
//				for(int j=i+1; j < s.length()-1;j++) {
//					if(s.charAt(j)=='}') {
//						s.replaceFirst("}", "");
//					}else
//						continue;						
//				}
//			}
//			if(s.charAt(i) == '[') {
//				for(int j=i+1; j < s.length()-1;j++) {
//					if(s.charAt(j)==']') {
//						s.replaceFirst("]", "");
//					}else
//						continue;						
//				}
//			}
//			return false;
//    	}
//    	return true;    	
//    }
	/*
	 * 
	 */
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();		//stack是用来待对比的
		for (char c : s.toCharArray()) {		//将字符串变成数组，然后遍历(非常常用！！)
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)		//因为stack先进后出和这个括号的匹配正好相同，先出现的半个括号，最后再匹配
																//如果遇到的不是前半部分，将栈里的pop出，并且与本次循环的char比较，如果不对
																//或者stack是空(这种情况表示先遇到的是后半部分)，即判断是false
				return false;
		}
		return stack.isEmpty();
	}
}
