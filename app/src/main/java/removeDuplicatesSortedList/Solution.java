package removeDuplicatesSortedList;

// 83. Remove Duplicates from Sorted List
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
	public static ListNode deleteDuplicates(ListNode head){
		if(head == null){
			return head;
		}
		if(head.next == null){
			return head;
		} else {
			if(head.val == head.next.val){
				head.next = head.next.next;
				deleteDuplicates(head);
			} else {
				deleteDuplicates(head.next);
			}
		}
		return head;
	}
}
