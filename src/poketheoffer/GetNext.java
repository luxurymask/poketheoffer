package poketheoffer;

public class GetNext {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		if (pNode.right != null) {
			pNode = pNode.right;
			while (pNode.left != null)
				pNode = pNode.left;
			return pNode;
		}
		while (pNode.next != null && pNode.next.left != pNode) {
			pNode = pNode.next;
		}
		return pNode.next;
	}
}
