package poketheoffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PrintListFromTailToHead {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
        Deque<ListNode> stack = new LinkedList<ListNode>();
        while(listNode != null){
        	stack.push(listNode);
        	listNode = listNode.next;
        }
        while(!stack.isEmpty()){
        	resultList.add(stack.pop().val);
        }
        return resultList;
    }
}
