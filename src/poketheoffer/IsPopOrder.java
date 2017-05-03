package poketheoffer;

import java.util.Deque;
import java.util.LinkedList;

public class IsPopOrder {
	public static boolean isPopOrder(int [] pushA,int [] popA) {
		Deque<Integer> stack = new LinkedList<Integer>();
		int j = 0;
		for(int i = 0;i < popA.length;i++){
			int num = popA[i];
			while(j < pushA.length && pushA[j] != num){
				stack.push(pushA[j++]);
			}
			if(j == pushA.length) {
				if(stack.isEmpty()) return false;
				while(!stack.isEmpty()){
					if(stack.pop() != popA[i++]) return false;
				}
				return true;
			}
			if(i == pushA.length - 1) return true;
			num = popA[i + 1];
			if(stack.peek() == num){
				j++;
				continue;
			}
			while(pushA[++j] != num){
				stack.push(pushA[j]);
				if(j == pushA.length) return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args){
		int[] pushA = {1};
		int[] popA = {1};
		System.out.println(isPopOrder(pushA, popA));
	}
}
