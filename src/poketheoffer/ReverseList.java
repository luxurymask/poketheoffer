package poketheoffer;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseList {
	public static ListNode reverseList(ListNode head){
		if(head == null || head.next == null) return head;
		
		ListNode i = head;
		ListNode j = i.next;
		ListNode k = j.next;
		
		i.next = null;
		while(j != null){
			j.next = i;
			i = j;
			j = k;
			k = ((k == null) ? null : k.next);
		}
		return i;
	}
	
	/**
	 * TLE.
	 * @param head
	 * @return
	 */
	public static ListNode reverseListTLE(ListNode head) {
		Deque<ListNode> stack = new LinkedList<ListNode>();
		while(head != null){
			stack.push(head);
			head = head.next;
		}
		ListNode newHead = stack.pop();
		ListNode p = newHead;
		while(!stack.isEmpty()){
			p.next = stack.pop();
			p = p.next;
		}
		return newHead;
    }
	
	public static void main(String[] args){
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		ListNode newHead = reverseList(head);
	}
}
