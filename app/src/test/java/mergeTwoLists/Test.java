package mergeTwoLists;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class MergeTwoListsTest {
	ListNode list1 = listNodeFromArray(new int[] { 1, 2, 4 });
	ListNode list2 = listNodeFromArray(new int[] { 1, 3, 4 });
	ListNode list1andlist2 = listNodeFromArray(new int[] { 1, 1, 2, 3, 4, 4 });
	ListNode mergedlist1list2 = Solution.mergeTwoLists(list1, list2);

	public static void appendNode(ListNode list, int val) {
		if (list.next == null) {
			list.next = new ListNode(val);
		} else {
			appendNode(list.next, val);
		}
	}

	public static ListNode listNodeFromArray(int[] values) {
		if (values.length == 0) {
			return new ListNode();
		}
		ListNode output = new ListNode(values[0]);
		for (int i = 1; i < values.length; i++) {
			appendNode(output, values[i]);
		}
		return output;
	}

	public static boolean listNodeEquals(ListNode list1, ListNode list2) {
		if ((list1 == null && list2 != null) || (list1 != null && list2 == null)) {
			return false;
		}
		if (list1.val != list2.val) {
			return false;
		}
		if (list1.next != null && list2.next != null) {
			return listNodeEquals(list1.next, list2.next);
		}
		return true;
	}

	@Test
	void listEqualsList() {
		assert listNodeEquals(list1andlist2, mergedlist1list2);
	}

	@Test
	void fromNullArrayEqualsFromNullArray() {
		int[] nulls = new int[] {};
		assert listNodeEquals(listNodeFromArray(nulls), listNodeFromArray(nulls));
	}

	@Test
	void list1NotEqualsList2() {
		assertFalse(listNodeEquals(list1, list2));
	}

	@Test
	void differentLengthListsAreNotEqual() {
		assertFalse(listNodeEquals(list1, mergedlist1list2));
	}

	@Test
	void emptyNodeEqualsEmptyNode() {
		assert listNodeEquals(new ListNode(), new ListNode());
	}

	@Test
	void nodeAEqualsNodeA() {
		assert listNodeEquals(new ListNode(5), new ListNode(5));
	}

	@Test
	void nodeANotEqualsEmptyNode() {
		assertFalse(listNodeEquals(new ListNode(5), new ListNode()));
	}

	@Test
	void mergeWithNullNode() {
		assert listNodeEquals(
				Solution.mergeTwoLists(
						null,
						new ListNode(1, new ListNode(2, new ListNode(3)))),
				listNodeFromArray(new int[] { 1, 2, 3 }));
	}
}
