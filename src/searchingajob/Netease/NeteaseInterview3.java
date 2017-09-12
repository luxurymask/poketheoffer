package searchingajob.Netease;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 判断完全二叉树。
 * 当遇到没有左孩子或者右孩子的节点就设置标识位，再遇到有左孩子或者又孩子的节点就return false。
 */
public class NeteaseInterview3 {
	static class BinaryNode{
		BinaryNode left;
		BinaryNode right;
		int val;
		
		BinaryNode(int val){
			this.val = val;
		}
	}
	public static boolean isCompleteBinaryTree(BinaryNode root){
		Queue<BinaryNode> queue = new LinkedList<>();
		if(root == null) return true;
		queue.offer(root);
		BinaryNode current;
		boolean flag = false;
		while(!queue.isEmpty()){
			current = queue.poll();
			if(current.left != null){
				if(flag == true) return false;
				queue.offer(current.left);
			}
			if(current.right != null){
				if(flag == true) return false;
				queue.offer(current.right);
			}
			if(current.left == null || current.right == null){
				flag = true;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		BinaryNode root = new BinaryNode(1);
		root.left = new BinaryNode(2);
		root.right = new BinaryNode(3);
		root.left.left = new BinaryNode(4);
		//root.left.right = new BinaryNode(5);
		root.right.left = new BinaryNode(6);
		root.right.right = new BinaryNode(7);
		//root.left.right.left = new BinaryNode(10);
		System.out.println(isCompleteBinaryTree(root));
	}
}
