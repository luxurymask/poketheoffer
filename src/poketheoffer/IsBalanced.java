package poketheoffer;

public class IsBalanced {
    public boolean IsBalanced_Solution(TreeNode root) {
        return helper(root) != -1;
    }
    
    public int helper(TreeNode root){
    	if(root == null) return 0;
    	int left = helper(root.left);
    	int right = helper(root.right);
    	return (Math.abs(left - right) > 1 || left == -1 || right == -1) ? -1 : Math.max(left, right) + 1;
    }
}
