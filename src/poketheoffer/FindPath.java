package poketheoffer;

import java.util.ArrayList;

/**
 * see leetcode 113.
 * @author liuxl
 *
 */
public class FindPath {
	/**
	 * rubbish solution.
	 */
	private ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> list = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
		if (root == null)
			return resultList;
		findPath(root, target, list, 0);
		return resultList;
	}

	public void findPath(TreeNode root, int target, ArrayList<Integer> list, int sum) {
		if (root != null) list.add(root.val);
		sum += root.val;
		if (root.left == null && root.right == null) {
			if (sum == target) {
				resultList.add(new ArrayList(list));
			}
			return;
		}
		if (root.left != null) findPath(root.left, target, new ArrayList(list), sum);
		if (root.right != null) findPath(root.right, target, new ArrayList(list), sum);
	}
}
