package poketheoffer;

public class Mirror {
	/**
	 * see leetcode 226. Invert Binary Tree.
	 * @param root
	 */
	public void mirror(TreeNode root) {
		mirrorWithReturn(root);
    }
	
	public TreeNode mirrorWithReturn(TreeNode root){
		if(root == null) return null;
		TreeNode left = root.left;
		root.left = mirrorWithReturn(root.right);
		root.right = mirrorWithReturn(left);
		return root;
	}
}
