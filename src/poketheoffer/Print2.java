package poketheoffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Print2 {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null)
			return resultList;
		int layer = 1;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> list;
		Deque<Integer> stack = null;
		queue.add(pRoot);
		while (!queue.isEmpty()) {
			int layerSize = queue.size();
			list = new ArrayList<Integer>();
			stack = new LinkedList<Integer>();
			for (int i = 0; i < layerSize; i++) {
				pRoot = queue.poll();
				if(layer % 2 == 0){
					list.add(pRoot.val);
				}else{
					stack.push(pRoot.val);
				}
				if (pRoot.left != null) queue.add(pRoot.left);
				if (pRoot.right != null) queue.add(pRoot.right);
			}
			if(stack.size() != 0) list = new ArrayList<Integer>(stack);
			layer++;
			resultList.add(list);
		}
		return resultList;
	}
}
