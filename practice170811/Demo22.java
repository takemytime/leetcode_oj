package leetcode.practice170811;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/generate-parentheses/description/
//	22. Generate Parentheses 
//
//	Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses. 
//	For example, given n = 3, a solution set is: 
//	[
//	  "((()))",
//	  "(()())",
//	  "(())()",
//	  "()(())",
//	  "()()()"
//	]

public class Demo22 {
	 public List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<String>();
	        backtrack(list, "", 0, 0, n);
	        return list;
	    }
	    
	    public void backtrack(List<String> list, String str, int open, int close, int max){			
	        
	        if(str.length() == max*2){											//每个分支到达长度后入队列，然后空return结束
	            list.add(str);
	            return;
	        }
	        
	        if(open < max)														//到这里产生分支(第二轮才产生分支)，然后递归，每次递归也会分支，就会产生所有的情况
	            backtrack(list, str+"(", open+1, close, max);
	        if(close < open)
	            backtrack(list, str+")", open, close+1, max);
	    }
}
