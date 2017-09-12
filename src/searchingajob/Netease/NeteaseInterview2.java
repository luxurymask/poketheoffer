package searchingajob.Netease;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 2个栈实现一个队列。
 */
public class NeteaseInterview2<T> {
	private Deque<T> stack1 = new LinkedList<>();
	private Deque<T> stack2 = new LinkedList<>();
	
	public void offer(T elem){
		stack1.push(elem);
	}
	
	public T poll(T elem){
		while(stack1.size() > 1){
			stack2.push(stack1.pop());
		}
		T result = stack1.pop();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		return result;
	}
}
