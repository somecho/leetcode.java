package binaryTreeInorderTraversal;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BinaryTreeInorderTraversalTest {
	@Test
	void nullExample() {
		Integer[] expected = {};
		List<Integer> middle = Solution.inorderTraversal(null);
		Integer[] result = middle.toArray(new Integer[0]);
		assertArrayEquals(expected, result);
	}

	@Test
	void noChildrenExample() {
		Integer[] expected = { 1 };
		List<Integer> middle = Solution.inorderTraversal(new TreeNode(1));
		Integer[] result = middle.toArray(new Integer[0]);
		assertArrayEquals(expected, result);
	}

	@Test
	void example1() {
		Integer[] expected = { 1, 3, 2 };
		TreeNode input = new TreeNode(1,
				null,
				new TreeNode(2, new TreeNode(3), null));
		List<Integer> middle = Solution.inorderTraversal(input);
		Integer[] result = middle.toArray(new Integer[0]);
		assertArrayEquals(expected, result);
	}
}
