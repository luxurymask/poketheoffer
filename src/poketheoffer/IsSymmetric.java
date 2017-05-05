package poketheoffer;

public class IsSymmetric {
	boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null) return true;
        return helper(pRoot.left, pRoot.right);
    }
	
	boolean helper(TreeNode left, TreeNode right){
		if(left == null || right == null) return left == right;
		if(left.val != right .val) return false;
		return helper(left.left, right.right) && helper(left.right, right.left);
	}
}
