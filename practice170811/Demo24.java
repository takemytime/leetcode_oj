package leetcode.practice170811;

import practice170811.Demo21.ListNode;

//https://leetcode.com/problems/swap-nodes-in-pairs/description/
//	24. Swap Nodes in Pairs 
//	Given a linked list, swap every two adjacent nodes and return its head. 
//			For example,
//			Given 1->2->3->4, you should return the list as 2->1->4->3. 
//			Your algorithm should use only constant space. 
//			You may not modify the values in the list, only nodes itself can be changed. 


public class Demo24 {
	 public class ListNode{
			int val;
			ListNode next;
			ListNode(int x) { val = x; }
		}
	
	
//	    public ListNode swapPairs(ListNode head) {
//			ListNode ans = new ListNode(0);
//			ListNode res = ans;
//			ans.next = head;
//			ListNode first = head;
//			ListNode second = head;
//			if(head== null)
//	            return head;
//	        ans.next = second.next;	
//	        second = second.next;
//			ans = ans.next;
//			while(first == null || second == null) {
//				ans.next = first.next.next;
//				ans = ans.next;
//	            first = first.next.next;
//				ans.next = second.next.next;
//				ans = ans.next;
//	            second = second.next.next;
//			}
//	    	
//	    	return res.next;     
//	    }
	 
	 	/*
	 	 * 递归算法
	 	 */
	    public ListNode swapPairs(ListNode head) {
	        if ((head == null)||(head.next == null))		//如果节点为空，或者只有一个节点，则直接return head
	            return head;
	        ListNode n = head.next;							//把next设为第二个
	        head.next = swapPairs(head.next.next);			//从第三个开始用递归，然后设为head.next
	        n.next = head;									//然后把n的第二个设成head(head.next已经变成了第三个以后调整顺序后的list了)
	        return n;										//相当于n是把head的一二调换，然后head.next.next之后的全部再用递归
	    }
	 
	 
}
