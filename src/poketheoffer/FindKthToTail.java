package poketheoffer;

public class FindKthToTail {
	public ListNode findKthToTail(ListNode head,int k) {
		ListNode preNode = head;
		int i = 1;
		for(;i <= k;i++){
			if(preNode == null){
				break;
			}
			preNode = preNode.next;
		}
		if(i != k){
			return null;
		}
		ListNode afterNode = head;
		while(preNode != null){
			afterNode = afterNode.next;
			preNode = preNode.next;
		}
		return afterNode;
    }
}
