package mergeTwoLists;

// 21. Merge Two Sorted Lists
//https://leetcode.com/problems/merge-two-sorted-lists/description/

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) {
			return null;
		}
		if (list1 == null) {
			return new ListNode(list2.val, Solution.mergeTwoLists(list1, list2.next));
		}
		if (list2 == null) {
			return new ListNode(list1.val, Solution.mergeTwoLists(list1.next, list2));
		}
		if (list1.val >= list2.val) {
			return new ListNode(list2.val, Solution.mergeTwoLists(list1, list2.next));
		} else {
			return new ListNode(list1.val, Solution.mergeTwoLists(list1.next, list2));
		}
	}

}
