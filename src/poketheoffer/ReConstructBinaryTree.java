package poketheoffer;

public class ReConstructBinaryTree {
	
	public static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn){
		if(startPre > endPre){
			return null;
		}else if(startPre == endPre){
			return new TreeNode(pre[startPre]);
		}
		
		TreeNode root = new TreeNode(pre[startPre]);
		int index = startIn;
		for(;index <= endIn;index++){
			if(in[index] == root.val) break;
		}
		root.left = reConstructBinaryTree(pre, startPre + 1, startPre + index - startIn, in, startIn, index - 1);
		root.right = reConstructBinaryTree(pre, startPre + index - startIn + 1, endPre, in, index + 1, endIn);
		return root;
	}
	
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in){
		if(pre.length == 0 || in.length == 0) return null;
		return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}
	/**
	 * rubbish way.
	 * @param pre
	 * @param in
	 * @return
	 */
	public static TreeNode reConstructBinaryTreeRubbish(int [] pre,int [] in) {
		if(pre.length == 0 && in.length == 0){
			return null;
		}
        TreeNode root = new TreeNode(pre[0]);
        int i = 0;
        int length = in.length;
        for(;i < length;i++){
        	int current = in[i];
        	if(current == root.val){
        		break;
        	}
        }
        int[] leftIn = new int[i];
        System.arraycopy(in, 0, leftIn, 0, i);
        int[] leftPre = new int[i];
        System.arraycopy(pre, 1, leftPre, 0, i);
        
        int[] rightIn = new int[length - i - 1];
        System.arraycopy(in, i + 1, rightIn, 0, length - i - 1);
        int[] rightPre = new int[length - i - 1];
        System.arraycopy(pre, i + 1, rightPre, 0, length - i - 1);
        
        root.left = reConstructBinaryTree(leftPre, leftIn);
        root.right = reConstructBinaryTree(rightPre, rightIn);
        return root;
    }
	
	public static void main(String[] args){
		int[] pre = {1,2,3,4,5,6,7};
		int[] in = {3,2,4,1,6,5,7};
		reConstructBinaryTree(pre, in);
	}
}
