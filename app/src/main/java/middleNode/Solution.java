package middleNode;

// 876. Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list

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

class Solution {
	public static int getListCount(ListNode head) {
		int count = 1;
		ListNode cur = head;
		while (cur.next != null) {
			count++;
			cur = cur.next;
		}
		return count;
	}

	// O(n)
	public static ListNode middleNode(ListNode head) {
		int middle = getListCount(head) / 2;
		ListNode cur = head;
		for (int i = 0; i < middle; i++) {
			cur = cur.next;
		}
		return cur;
	}
}
