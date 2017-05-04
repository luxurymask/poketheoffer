package poketheoffer;

import java.util.Deque;
import java.util.LinkedList;

public class Convert {
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree == null) return null;
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		TreeNode current = pRootOfTree;
		TreeNode pre = null;
		TreeNode head = null;
        while(current != null || !stack.isEmpty()){
        	while(current != null){
            	stack.push(current);
            	current = current.left;
        	}
        	
        	while(!stack.isEmpty()){
            	current = stack.pop();
            	if(pre != null){
            		pre.right = current;
            		current.left = pre;
            	}else{
            		head = current;
            	}
            	
            	pre = current;
            	if(current.right != null){
            		current = current.right;
            		break;
            	}
            	current = null;
            }
        }
        return head;
    }
}
