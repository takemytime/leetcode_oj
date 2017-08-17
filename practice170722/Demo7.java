package leetcode.practice170722;

/**
 * https://leetcode.com/problems/reverse-integer/#/description
 * @author ZongwenZuo
 *
 */

//Reverse digits of an integer.
//Example1: x = 123, return 321
//Example2: x = -123, return -321 
//click to show spoilers.
//Note:
//The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows. 

public class Demo7 {
	/*
	 * ��һ��
	 * �ȸ��ӣ����ֲ���
	 */
//	 public int reverse(int x) {
//	        String xStr = Integer.toString(x);
//	        int n = xStr.length();
//	        String arry = null;
//	        int result = 0;
//      int[] num = new int[n];
//	        for(int i= n-1; i>=0;i--) {
//          for(int j=0;j<n;j++){
//	        	    arry = String.valueOf(xStr.charAt(i));
//                 num[j] = Integer.parseInt(arry);}
//	        }
//	        for(int k=0;k<n;k++) {
//	        	result+=num[k];
//          result*=10;
//	        }
//	        return result/10;
//	    }
	/*
	 * �ڶ���
	 * ��������ֵû��Խ�磬��������ֵ��Խ����
	 */
//	public int reverse(int x) {
//        int newnum = x;
//		int length = Integer.toString(x).length();
//		int result = 0;
//		int curr = 0;
//		for(int i = 0;i<length ;i++) {
//			curr = x%10;
//			x = x/10;
//            result*=10;
//            result += curr;
//		}
//        if (result > Math.pow(2,31) || x < -1*Math.pow(2,31))        
//             return 0; 
//		if(result>0)
//            return result;
//        else 
//            return result/10;
//    }
	/*
	 * ��discussion������
	 */
	public int reverse(int x)
	{
	    int result = 0;

	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result)		//���Խ���ˣ��ͻᶪʧֵ������������Ͳ������ԭ����ֵ
	        { return 0; }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
	}
}
