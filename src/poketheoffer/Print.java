package poketheoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(pRoot);
		TreeNode current;
		while (!queue.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int length = queue.size();
			for (int i = 1; i <= length; i++) {
				current = queue.poll();
				list.add(current.val);
				if (current.left != null)
					queue.add(current.left);
				if (current.right != null)
					queue.add(current.right);
			}
			resultList.add(list);
		}
		return resultList;
    }
    
}
