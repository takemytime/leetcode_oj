package leetcode.practice170810;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
//	17. Letter Combinations of a Phone Number 
//	Given a digit string, return all possible letter combinations that the number could represent. 
//			A mapping of digit to letters (just like on the telephone buttons) is given below.
//			Input:Digit string "23"
//			Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].


public class Demo17 {
	/**
	 * 不知道该如何循环
	 * @param digits
	 * @return
	 */
//    public List<String> letterCombinations(String digits) {
//        List<String> res = new LinkedList<String>();
//        String one[] = {""};
//        String two[] = {"a","b","c"};
//    	String three[] = {"d","e","f"};
//    	String four[] = {"g","h","i"};
//    	String five[] = {"j","k","l"};
//    	String six[] = {"m","n","o"};
//    	String seven[] = {"p","q","r","s"};
//    	String eight[] = {"t","u","v"};
//    	String nine[] = {"w","x","y","z"};
//    	String mapping[][] = {one,two,three,four,five,six,seven,eight,nine};
//    	
//    	return null;
//    }
	
	  public List<String> letterCombinations(String digits) {
		    LinkedList<String> ans = new LinkedList<String>();
		    if(digits == null || digits.length() == 0) 
		    	return ans;
		    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	        ans.add("");
		    for(int i =0; i<digits.length();i++){								//从次一个传入的数字开始查找对应的值
		        int x = Character.getNumericValue(digits.charAt(i));			//将传入的字符串转换成数字
		        while(ans.peek().length()==i){									//循环，直到到达正确的长度
		            String t = ans.remove();									//将上次传入的字符串取出(不能在list里直接相连，要取出后连接，然后再压入list)
		            for(char s : mapping[x].toCharArray())						//遍历本次循环对应的字符，将本次对应的字符取出与之前传入的相连
		                ans.add(t+s);
		        }
		    }
		    return ans;
	    }
}
