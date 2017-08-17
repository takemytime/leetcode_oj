package leetcode.practice170808;

//https://leetcode.com/problems/roman-to-integer/description/
//	Given a roman numeral, convert it to an integer.
//	Input is guaranteed to be within the range from 1 to 3999.

public class Demo13 {
	public int romanToInt(String s) {
	    int nums[]=new int[s.length()];
	    for(int i=0;i<s.length();i++){		//遍历数组，把所有的字母都提取出来转换成数字
	        switch (s.charAt(i)){
	            case 'M':
	                nums[i]=1000;
	                break;
	            case 'D':
	                nums[i]=500;
	                break;
	            case 'C':
	                nums[i]=100;
	                break;
	            case 'L':
	                nums[i]=50;
	                break;
	            case 'X' :
	                nums[i]=10;
	                break;
	            case 'V':
	                nums[i]=5;
	                break;
	            case 'I':
	                nums[i]=1;
	                break;
	        }
	    }
	    int sum=0;
	    for(int i=0;i<nums.length-1;i++){
	        if(nums[i]<nums[i+1])
	            sum-=nums[i];
	        else
	            sum+=nums[i];
	    }
	    return sum+nums[nums.length-1];
	}
	/**
	 * 这两个方法利用的都是如果前者小于后者，就减去一部分，但我觉得第一部分更具有通用性，
	 * 即如果范围扩大，再加上更大的字母，前者的改动比较小
	 */
	
//	public int romanToInt(String s) {
//	     int sum=0;
//	    if(s.indexOf("IV")!=-1){sum-=2;}
//	    if(s.indexOf("IX")!=-1){sum-=2;}
//	    if(s.indexOf("XL")!=-1){sum-=20;}
//	    if(s.indexOf("XC")!=-1){sum-=20;}
//	    if(s.indexOf("CD")!=-1){sum-=200;}
//	    if(s.indexOf("CM")!=-1){sum-=200;}
//	    
//	    char c[]=s.toCharArray();
//	    int count=0;
//	    
//	   for(;count<=s.length()-1;count++){
//	       if(c[count]=='M') sum+=1000;
//	       if(c[count]=='D') sum+=500;
//	       if(c[count]=='C') sum+=100;
//	       if(c[count]=='L') sum+=50;
//	       if(c[count]=='X') sum+=10;
//	       if(c[count]=='V') sum+=5;
//	       if(c[count]=='I') sum+=1;
//	       
//	   }
//	   
//	   return sum;
//	    
//	}
}
