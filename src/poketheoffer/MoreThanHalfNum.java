package poketheoffer;

import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNum {
	public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = array.length / 2;
        for(int i : array){
        	int count = map.getOrDefault(i, 0);
        	map.put(i, ++count);
        	if(count > length) return i;
        }
        return 0;
    }
	
	public int MoreThanHalfNum_SolutionJava7(int [] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = array.length / 2;
        for(int i : array){
        	int count = 0;
        	if(map.containsKey(i)){
        		count = map.get(i);
        	}
        	map.put(i, ++count);
        	if(count > length) return i;
        }
        return 0;
    }
}
