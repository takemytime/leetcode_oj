package leetcode.practice170726;

//https://leetcode.com/problems/palindrome-number/description/

public class Demo9 {
//	public static boolean isPalindrome(int x) {
//		int y = Math.abs(x);
//        String str = Integer.toString(y);
//        char[] ch = str.toCharArray();
//        int n = str.length();
//        for(int i=0;i<=n/2;i++) {
//        	if(ch[i]!=ch[n-i-1]) {
//        		return false;
//        	}
//        }
//        return true;
//    }
	/**
	 * ����ȫ�����ǻ���
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		if(x<0)
			return false;
        String str = Integer.toString(x);
        char[] ch = str.toCharArray();
        int n = str.length();
        for(int i=0;i<=n/2;i++) {
        	if(ch[i]!=ch[n-i-1]) {
        		return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		if(isPalindrome(1)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
