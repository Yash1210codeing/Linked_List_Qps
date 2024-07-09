package Linked_List_Qps;
import Linked_List_Qps.Linked_List_Cycle_Leetcode_141.ListNode;
public class Intersection_Of_Two_Linked_List_Leetcode_160 {
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
	public class solution{
		public ListNode getintersectionNode(ListNode headA,ListNode headB) {
			ListNode B=headB;
			ListNode A=headA;
			while(A!=B) {
			if(A==null) {
				A=headB;
			}else {
				A=A.next;
			}
			if(B==null) {
				B=headA;
			}else {
				B=B.next;
			}
			}
			return A;
		}
	}
}
