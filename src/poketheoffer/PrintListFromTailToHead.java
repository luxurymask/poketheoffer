package poketheoffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PrintListFromTailToHead {
	/**
	 * 用栈,不修改链表结构。
	 * @param listNode
	 * @return
	 * 时间复杂度：O(n),系数为2
	 * 空间复杂度：O(n)
	 */
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
	
	
	/*********************************************
	 * 递归实现
	 *********************************************/
	private ArrayList<Integer> resultList = new ArrayList<>();
	
	public ArrayList<Integer> print(ListNode listNode){
		printListFromTailToHeadRecursively(listNode);
		return resultList;
	}
	
	public void printListFromTailToHeadRecursively(ListNode listNode){
		if(listNode == null){
			return;
		}
		printListFromTailToHeadRecursively(listNode.next);
		resultList.add(listNode.val);
	}
}
