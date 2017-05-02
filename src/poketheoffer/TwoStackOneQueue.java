package poketheoffer;

import java.util.Stack;

public class TwoStackOneQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		while (!stack2.isEmpty()) {
			stack1.add(stack2.pop());
		}
		stack1.add(node);
	}

	public int pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.add(stack1.pop());
			}
		}
		int node = stack2.pop();
		return node;
	}
}
