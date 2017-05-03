package poketheoffer;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Stack {
	private int min = Integer.MAX_VALUE;
	private ArrayList<Integer> elements = new ArrayList<Integer>();
	private PriorityQueue<Integer> forMin = new PriorityQueue<Integer>();
	private int size = 0;
	
	public void push(int node) {
        elements.add(node);
        forMin.add(node);
        size++;
        if(min > node) min = node;
    }
    
    public void pop() {
    	if(elements.get(--size) == min){
    		forMin.poll();
    		min = forMin.peek();
    	}
    }
    
    public int top() {
        return elements.get(size - 1);
    }
    
    public int min() {
        return min;
    }
}
