package poketheoffer;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class GetLeastNumbers {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        if(k > input.length) return resultList;
        PriorityQueue<Integer> heap = new PriorityQueue();
        for(int i : input) heap.add(i);
        for(int i = 0;i < k;i++) resultList.add(heap.poll());
        return resultList;
    }
}
