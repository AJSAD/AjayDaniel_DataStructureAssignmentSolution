package com.dolphin.tree;

public class TreeNode {
		int data;
		TreeNode left, right;
		
		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public TreeNode getLeft() {
			return left;
		}

		public void setLeft(TreeNode left) {
			this.left = left;
		}

		public TreeNode getRight() {
			return right;
		}

		public void setRight(TreeNode right) {
			this.right = right;
		}

		public TreeNode(int nodeData) {
			this.data = nodeData;
			this.left = null;
			this.right = null;
		}
}
