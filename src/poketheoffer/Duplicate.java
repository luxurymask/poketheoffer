package poketheoffer;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length == 0){
            duplication[0] = -1;
            return false;
		}
        
	    Set<Integer> set = new HashSet<Integer>();
	    for(int i : numbers){
	    	if(set.contains(i)){
	    		duplication[0] = i;
	    		return true;
	    	}
	    	set.add(i);
	    }
	    return false;
    }
}
