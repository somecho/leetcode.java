package symmetricTree;

// 101. Symmetric Tree
// https://leetcode.com/problems/symmetric-tree/

import java.util.ArrayList;
import java.util.Arrays;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Solution {
	static boolean isSymmetric(TreeNode left, TreeNode right) {
		boolean symmetric = true;
		if (left == null && right != null) {
			return false;
		}
		if (left != null && right == null) {
			return false;
		}
		if (left.val != right.val) {
			return false;
		}
		if (left.left == null && right.right != null) {
			return false;
		}
		if (left.left != null && right.right == null) {
			return false;
		}
		if (left.right != null && right.left == null) {
			return false;
		}
		if (left.right == null && right.left != null) {
			return false;
		}
		if (left.left != null && right.right != null) {
			symmetric = isSymmetric(left.left, right.right);
		}
		if (!symmetric) {
			return false;
		}
		if (left.right != null && right.left != null) {
			symmetric = isSymmetric(left.right, right.left);
		}
		return symmetric;
	}

	static boolean isSymmetric(TreeNode root) {
		if (root.left == null && root.right == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}
}
