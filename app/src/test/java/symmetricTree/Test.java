package symmetricTree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SymmetricTreeTest {
	@Test
	void noChildren() {
		TreeNode input = new TreeNode(0);
		boolean result = Solution.isSymmetric(input);
		assertTrue(result);
	}

	@Test
	void noLeftChild() {
		TreeNode input = new TreeNode(0, null, new TreeNode(0));
		boolean result = Solution.isSymmetric(input);
		assertFalse(result);
	}

	@Test
	void noRightChild() {
		TreeNode input = new TreeNode(0, new TreeNode(0), null);
		boolean result = Solution.isSymmetric(input);
		assertFalse(result);
	}

	@Test
	void symmetricLv2() {
		TreeNode input = new TreeNode(1,
				new TreeNode(2, new TreeNode(4), new TreeNode(3)),
				new TreeNode(2, new TreeNode(3), new TreeNode(4)));
		assertTrue(Solution.isSymmetric(input));
	}

	@Test
	void asymmetricLv2() {
		TreeNode input = new TreeNode(1,
				new TreeNode(2, new TreeNode(4), new TreeNode(3)),
				new TreeNode(2, new TreeNode(3), new TreeNode(99)));
		assertFalse(Solution.isSymmetric(input));
	}

	@Test
	void asymmetricLv2missing() {
		TreeNode input = new TreeNode(1,
				new TreeNode(2, null, new TreeNode(3)),
				new TreeNode(2, null, new TreeNode(3)));
		assertFalse(Solution.isSymmetric(input));
	}

	@Test
	void testcase170() {
		TreeNode input = new TreeNode(2,
				new TreeNode(3, new TreeNode(4), new TreeNode(5)),
				new TreeNode(3, null, new TreeNode(4)));
		assertFalse(Solution.isSymmetric(input));
	}

	@Test
	void testcase173() {
		TreeNode input = new TreeNode(7,
				new TreeNode(-64,
						new TreeNode(-6,
								new TreeNode(88),
								new TreeNode(-44)),
						new TreeNode(-90,
								new TreeNode(68),
								new TreeNode(-65))),
				new TreeNode(-64,
						new TreeNode(-90,
								new TreeNode(-76),
								new TreeNode(68)),
						new TreeNode(-6,
								new TreeNode(-44),
								new TreeNode(88))));
		assertFalse(Solution.isSymmetric(input));
	}

}
