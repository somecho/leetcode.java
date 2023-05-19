package middleNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MiddleNodeTest {

	@Test
	void example1(){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		int expected = 3;
		ListNode output = Solution.middleNode(head);
		assertEquals(expected, output.val);
	}

	@Test
	void example2(){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		int expected = 4;
		ListNode output = Solution.middleNode(head);
		assertEquals(expected, output.val);
	}
	
}

