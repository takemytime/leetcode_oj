package leetcode.practice170811;

import practice170811.Demo19.ListNode;

//https://leetcode.com/problems/merge-two-sorted-lists/description/
//	21. Merge Two Sorted Lists 
//	Merge two sorted linked lists and return it as a new list. 
//	The new list should be made by splicing together the nodes of the first two lists.
	

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Demo21 {
	/*
	 * 定义listnode
	 */
	 public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	 /*
	  *  Time Limit Exceeded 
	  */
//	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		ListNode ans = new ListNode(0);
//		ListNode res = ans;
//		while(l1!=null || l2!=null) {
//			if(l1 == null && l2!= null) {
//				ans.next = l2;
//				ans = ans.next;
//				l2 = l2.next;
//				continue;
//			}
//			if(l2 == null && l1!= null) {
//				ans.next = l1;
//				ans = ans.next;
//				l1 = l1.next;
//				continue;
//			}		
//			if(l1.val < l2.val) {
//				ans.next = l1;
//				ans = ans.next;
//				l1 = l1.next;
//				continue;
//			}
//			if(l1.val > l2.val) {
//				ans.next = l2;
//				ans = ans.next;
//				l2 = l2.next;
//				continue;
//			}
//			if(l1.val == l2.val) {
//				ans.next = l1;
//				ans.next.next = l2;
//				ans = ans.next.next;
//				l1 = l1.next;
//				l2 = l2.next;
//				continue;
//			}
//		}	
//		return res.next;	     
//	 }
	 /*
	  * 
	  */
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2){		//递归算法，显而易见
			if(l1 == null) return l2;
			if(l2 == null) return l1;
			if(l1.val < l2.val){
				l1.next = mergeTwoLists(l1.next, l2);
				return l1;
			} else{
				l2.next = mergeTwoLists(l1, l2.next);
				return l2;
			}
	}
}
