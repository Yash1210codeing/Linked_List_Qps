package Linked_List_Qps;
import Linked_List_Qps.Middle_Linked_List_Leetcode_876.ListNode;
public class Reverse_Linked_List_Leetcode_206 {
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
	class solution{
		public ListNode reverseList(ListNode head) {
			ListNode curr=head;
			ListNode prev=null;
			while(curr!=null) {
				ListNode ahead=curr.next;
				curr.next=prev;	
				prev=curr;
				curr=ahead;
			}
			return prev;
		}
	}
}