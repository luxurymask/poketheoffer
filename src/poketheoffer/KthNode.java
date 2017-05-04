package poketheoffer;

import java.util.Deque;
import java.util.LinkedList;

public class KthNode {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
    	Deque<TreeNode> stack = new LinkedList<TreeNode>();
    	TreeNode lastVisit = null;
    	int count = 0;
    	while(!stack.isEmpty() || pRoot != null){
    		while(pRoot != null){
    			stack.push(pRoot);
    			pRoot = pRoot.left;
    		}
    		
    		pRoot = stack.pop();
    		while(pRoot != null && (pRoot.right == null || lastVisit == pRoot.right)){
    			if(++count == k) return pRoot;
    			lastVisit = pRoot;
    			if(stack.isEmpty()) return null;
    			pRoot = stack.pop();
    		}
    		if(++count == k) return pRoot;
    		pRoot = pRoot.right;
    	}
    	return null;
    }
	
}
