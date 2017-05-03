package poketheoffer;

import java.util.LinkedList;
import java.util.Queue;

public class HasSubTree {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root1 == null || root2 == null) return false;
        queue.add(root1);
        TreeNode current;
        while(!queue.isEmpty()){
        	current = queue.poll();
        	if(current.val == root2.val && hasSameConstructure(current, root2)){
        		return true;
        	}
        	if(current.left != null) queue.add(current.left);
        	if(current.right != null) queue.add(current.right);
        }
        return false;
    }
	
	public boolean hasSameConstructure(TreeNode root1, TreeNode root2){
		//idiot way.
//		if(root2 == null){
//			return true;
//		}else if(root1 == null){
//			return false;
//		}
		//strongbuffer's way.
		if(root2 == null) return true;
		if(root1 == null) return false;
		if(root1.val != root2.val) return false;
		return hasSameConstructure(root1.left, root2.left) && hasSameConstructure(root1.right, root2.right);
	}
	
	public static void main(String[] args){
		
	}
}
