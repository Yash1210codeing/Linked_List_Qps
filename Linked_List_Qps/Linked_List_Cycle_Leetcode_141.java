package Linked_List_Qps;
import Linked_List_Qps.Middle_Linked_List_Leetcode_876.ListNode;
public class Linked_List_Cycle_Leetcode_141 {
public class ListNode{
	int val;
	ListNode next;
	ListNode(){		
	}
	ListNode(int val){
		this.val=val;
	}
	ListNode(int val,ListNode next){
		this .val=val;
		this.next=next;
	}
}
public class Solution {
	public boolean hascycle(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
}
}