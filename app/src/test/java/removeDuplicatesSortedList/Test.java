package removeDuplicatesSortedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DuplicatesTest {

	@Test
	void example1() {
		ListNode input = new ListNode(1);
		input.next = new ListNode(1);
		input.next.next = new ListNode(2);

		ListNode expected = new ListNode(1);
		expected.next = new ListNode(2);

		ListNode output = Solution.deleteDuplicates(input);

		ListNode curA = output;
		ListNode curB = expected;

		while (curA.next != null) {
			assertEquals(curA.val, curB.val);
			curA = curA.next;
			curB = curB.next;
		}
	}

	@Test
	void example2() {
		ListNode input = new ListNode(1);
		input.next = new ListNode(1);
		input.next.next = new ListNode(2);
		input.next.next.next = new ListNode(3);
		input.next.next.next.next = new ListNode(3);

		ListNode expected = new ListNode(1);
		expected.next = new ListNode(2);
		expected.next.next = new ListNode(3);

		ListNode output = Solution.deleteDuplicates(input);

		ListNode curA = output;
		ListNode curB = expected;

		while (curA.next != null) {
			assertEquals(curA.val, curB.val);
			curA = curA.next;
			curB = curB.next;
		}
	}
}
