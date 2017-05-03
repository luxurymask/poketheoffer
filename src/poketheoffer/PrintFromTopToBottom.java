package poketheoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root == null) return resultList;
		queue.add(root);
		TreeNode current;
		while (!queue.isEmpty()) {
			current = queue.poll();
			resultList.add(current.val);
			if (current.left != null) queue.add(current.left);
			if (current.right != null) queue.add(current.right);
		}
		return resultList;
	}

	public static void printFromTopToBottom(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode current;
		while (!queue.isEmpty()) {
			int length = queue.size();
			for (int i = 1; i <= length; i++) {
				current = queue.poll();
				System.out.print(current.val);
				if (current.left != null)
					queue.add(current.left);
				if (current.right != null)
					queue.add(current.right);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(7);
		printFromTopToBottom(root);
	}
}
