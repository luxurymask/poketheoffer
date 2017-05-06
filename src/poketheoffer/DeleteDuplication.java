package poketheoffer;

public class DeleteDuplication {
	
	public ListNode deleteDuplication(ListNode pHead)
	{
		if(pHead == null) return null;
		ListNode dummy = new ListNode(0);
		dummy.next = pHead;
		ListNode pre = dummy;
		ListNode current = pHead;
		ListNode next = current.next;
		while(next != null){
			next = current.next;
			while(next != null && current.val == next.val){
				next = next.next;
			}
			if(next != current.next){
				pre.next = next;
				current = next;
			}else{
				pre = pre.next;
				current = pre.next;
			}
		}
		return dummy.next;
	}
	
	/**
	 * 保留一个。
	 * @param pHead
	 * @return
	 */
	public ListNode deleteDuplicationSave(ListNode pHead)
    {
		if(pHead == null) return null;
		ListNode pre = pHead;
		ListNode after = pHead.next;
		while(after != null){
			after = pre.next;
			while(after != null && pre.val == after.val){
				after = after.next;
			}
			pre.next = after;
			pre = after;
		}
		return pHead;
    }
}
