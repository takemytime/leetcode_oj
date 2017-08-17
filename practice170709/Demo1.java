package leetcode.practice170709;

import java.util.Scanner;

//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//Given two integers x and y, calculate the Hamming distance.
//Note:
//0 �� x, y < 231. 

public class Demo1{
    public static int hammingDistance(int x, int y) {
        int answer = 0;
        String charString = Integer.toBinaryString(x ^ y);
        for (int i = 0; i < charString.length(); i++) {
            if (charString.charAt(i) == '1') {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
		int result,x,y=0;
		Scanner scanner = new Scanner(System.in);
		x=scanner.nextInt();
		y=scanner.nextInt();
		result = hammingDistance(x,y);
		System.out.printf("%d,%d\n", x, y);
		System.out.println(result);
	}
    
}