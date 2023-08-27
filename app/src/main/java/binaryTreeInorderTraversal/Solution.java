package binaryTreeInorderTraversal;

// 94. Binary Tree Inorder Traversal
// https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.List;
import java.util.ArrayList;

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
	public static List<Integer> inorderTraversal(TreeNode root, List<Integer> result) {
		if (root.left != null) {
			inorderTraversal(root.left, result);
		}
		result.add(root.val);
		if (root.right != null) {
			inorderTraversal(root.right, result);
		}
		return result;
	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		inorderTraversal(root, result);
		return result;
	}
}
