package poketheoffer;

public class TreeDepth {
	public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
