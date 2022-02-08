package com.dolphin.sortmanager;

import com.dolphin.tree.TreeNode;

public class SortManager {
	
	public SortManager() {
		TreeNode root = new TreeNode( 50 );
		root.setLeft( new TreeNode(30) );
		root.setRight( new TreeNode(60) );
		root.getLeft().setLeft( new TreeNode(10) );
		root.getRight().setLeft( new TreeNode(55) );
		
		if(root != null) {
			displayInorderTraversal(root);
		}
	}
	
	private void displayInorderTraversal(TreeNode node) {
		if(node.getLeft() == null && node.getLeft() == null) {
			System.out.println(node.getData());
		}
		else{
			if(node.getLeft() != null) {
				displayInorderTraversal(node.getLeft());
			}
			
			System.out.println(node.getData());
			
			if(node.getRight() != null) {
				displayInorderTraversal(node.getRight());
			}
		}
	}
}
