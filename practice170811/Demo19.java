package leetcode.practice170811;


//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
//	19. Remove Nth Node From End of List 
//	Given a linked list, remove the nth node from the end of list and return its head.
//			For example,
//			   Given linked list: 1->2->3->4->5, and n = 2.
//
//			   After removing the second node from the end, the linked list becomes 1->2->3->5.
//			Note:
//			Given n will always be valid.
//			Try to do this in one pass. 


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Demo19 {
	/*
	 * 定义listnode
	 */
	 public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	/*
	 * Two pass algorithm
	 */
//	public ListNode removeNthFromEnd(ListNode head, int n) {
//	    ListNode dummy = new ListNode(0);
//	    dummy.next = head;						//忽略初始化的0，直接将设为head接为0的next
//	    int length  = 0;
//	    ListNode first = head;
//	    while (first != null) {					//求出head的长度
//	        length++;
//	        first = first.next;
//	    }
//	    length -= n;							//去倒数第n个
//	    first = dummy;							
//	    while (length > 0) {
//	        length--;
//	        first = first.next;
//	    }
//	    first.next = first.next.next;			//到第n个的时候直接跳过
//	    return dummy.next;						
//	}
//	 

	/*
	 * One pass algorithm
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode first = dummy;
	    ListNode second = dummy;
	    // Advances first pointer so that the gap between first and second is n nodes apart
	    for (int i = 1; i <= n + 1; i++) {		//用first来标注多少个之后结束
	        first = first.next;
	    }
	    // Move first to the end, maintaining the gap
	    while (first != null) {					//然后first和second同时移动，first到头的时候即second到达距第一个元素n的位置
	        first = first.next;
	        second = second.next;
	    }
	    second.next = second.next.next;			//second跳过这个元素
	    return dummy.next;						//first和second操纵的是同一个list，只是指针不同，所以返回dummy即可
	}
}
