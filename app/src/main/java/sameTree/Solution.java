package sameTree;

// 100. Same Tree
// https://leetcode.com/problems/same-tree/

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
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p != null && q == null) {
			return false;
		}
		if (p == null && q != null) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}

		if ((p.left == null && q.left != null) ||
				p.left != null && q.left == null) {
			return false;
		} else if (p.left != null && q.left != null) {
			if (!isSameTree(p.left, q.left)) {
				return false;
			}
		}
		if ((p.right == null && q.right != null) ||
				p.right != null && q.right == null) {
			return false;
		} else if (p.right != null && q.right != null) {
			if (!isSameTree(p.right, q.right)) {
				return false;
			}
		}
		return true;
	}
}
