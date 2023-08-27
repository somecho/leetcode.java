package sameTree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SameTreeTest {
	@Test
	void leftNull() {
		assertFalse(Solution.isSameTree(null, new TreeNode()));
	}

	@Test
	void rightNull() {
		assertFalse(Solution.isSameTree(new TreeNode(), null));
	}

	@Test
	void bothNull() {
		assertTrue(Solution.isSameTree(null, null));
	}

	@Test
	void bothEmpty() {
		assertTrue(Solution.isSameTree(new TreeNode(), new TreeNode()));
	}

	@Test
	void sameSimpleTree() {
		TreeNode t = new TreeNode(99, new TreeNode(12), new TreeNode(14));
		TreeNode u = new TreeNode(99, new TreeNode(12), new TreeNode(14));
		assertTrue(Solution.isSameTree(t, u));
	}

	@Test
	void differentSimpleChildSwap() {
		TreeNode t = new TreeNode(99, new TreeNode(12), new TreeNode(14));
		TreeNode u = new TreeNode(99, new TreeNode(14), new TreeNode(12));
		assertFalse(Solution.isSameTree(t, u));
	}

	@Test
	void differentSimpleLeftNull() {
		TreeNode t = new TreeNode(99, new TreeNode(12), new TreeNode(12));
		TreeNode u = new TreeNode(99, null, new TreeNode(14));
		assertFalse(Solution.isSameTree(t, u));
	}

	@Test
	void differentSimpleRightNull() {
		TreeNode t = new TreeNode(99, new TreeNode(12), new TreeNode(12));
		TreeNode u = new TreeNode(99, new TreeNode(12), null);
		assertFalse(Solution.isSameTree(t, u));
	}

	@Test
	void differentSizeTrees() {
		TreeNode t = new TreeNode(99, new TreeNode(12), null);
		TreeNode u = new TreeNode(99, null, new TreeNode(12));
		assertFalse(Solution.isSameTree(t, u));
	}
}
