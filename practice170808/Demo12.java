package leetcode.practice170808;

//https://leetcode.com/problems/integer-to-roman/description/
//	Given an integer, convert it to a roman numeral. 
//	Input is guaranteed to be within the range from 1 to 3999.
//
//	罗马数字共有七个，即I(1)，V(5)，X(10)，L(50)，C(100)，D(500)，M(1000)。按照下面的规则可以表示任意正整数。
//
//	重复数次：一个罗马数字重复几次，就表示这个数的几倍。 
//
//	右加左减：在一个较大的罗马数字的右边记上一个较小的罗马数字，表示大数字加小数字。在一个较大的数字的左边记上一个较小的罗马数字，表示大数字减小数字。但是，左减不能跨越等级。比如，99不可以用IC表示，用XCIX表示。 
//
//	加线乘千：在一个罗马数字的上方加上一条横线或者在右下方写M，表示将这个数字乘以1000，即是原数的1000倍。同理，如果上方有两条横线，即是原数的1000000倍。 
//
//	单位限制：同样单位只能出现3次，如40不能表示为XXXX，而要表示为XL。

public class Demo12 {
	/**
	 * 用switch会超时
	 */
//public static String intToRoman(int num) {
//    String str = "";
//    String tempstr = "";
//    int temp = 0;
//    if(num>=1000) {
//    	temp = num/1000;
//    	switch (temp) {
//		case 1:
//			tempstr="M";
//			break;
//		case 2:
//			tempstr="MM";
//			break;
//		case 3:
//			tempstr="MMM";
//		default:
//			break;
//		}
//    	num = num - temp*1000;
//    	str = tempstr;
//    }
//    if(num>=100) {
//    	temp = num/100;
//    	switch (temp) {
//		case 1:
//			tempstr = "C";
//			break;
//		case 2:
//			tempstr = "CC";
//			break;
//		case 3:
//			tempstr = "CCC";
//			break;
//		case 4:
//			tempstr = "CD";
//			break;
//		case 5:
//			tempstr = "D";
//			break;
//		case 6:
//			tempstr = "DC";
//			break;
//		case 7:
//			tempstr = "DCC";
//			break;
//		case 8:
//			tempstr = "DCCC";
//			break;
//		case 9:
//			tempstr = "CM";
//			break;
//
//		default:
//			break;
//		}
//    	num = num - temp*100;
//    	str += tempstr;
//    }
//    if(num>=10) {
//    	temp = num/10;
//    	switch (temp) {
//		case 1:
//			tempstr = "X";
//			break;
//		case 2:
//			tempstr = "XX";
//			break;
//		case 3:
//			tempstr = "XXX";
//			break;
//		case 4:
//			tempstr = "XL";
//			break;
//		case 5:
//			tempstr = "L";
//			break;
//		case 6:
//			tempstr = "LX";
//			break;
//		case 7:
//			tempstr = "LXX";
//			break;
//		case 8:
//			tempstr = "LXXX";
//			break;
//		case 9:
//			tempstr = "XC";
//			break;
//
//		default:
//			break;
//		}
//    	num = num - temp*10;
//    	str += tempstr;
//    }
//    if(num!=0) {
//	switch (num) {
//	case 1:
//		tempstr = "I";
//		break;
//	case 2:
//		tempstr = "II";
//		break;
//	case 3:
//		tempstr = "III";
//		break;
//	case 4:
//		tempstr = "IV";
//		break;
//	case 5:
//		tempstr = "V";
//		break;
//	case 6:
//		tempstr = "VI";
//		break;
//	case 7:
//		tempstr = "VII";
//		break;
//	case 8:
//		tempstr = "VIII";
//		break;
//	case 9:
//		tempstr = "IX";
//		break;
//
//	}
//	str += tempstr;
//	}
//	return str;
//}
	/**
	 * 看了提示，这种数字类型的选择可以用数字来完成选择，空间事件都可以节省
	 */
	public String intToRoman(int num) {
	    String M[] = {"", "M", "MM", "MMM"};
	    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	    return M[num/1000] + C[(num%1000)/100]+ X[(num%100)/10] + I[num%10];
	}
	
}
