package poketheoffer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindNumsAppearOnce {
	public void findNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		Set<Integer> set = new HashSet<Integer>();
        for(int i = 0;i < array.length;i++){
        	int num = array[i];
        	if(set.contains(num)){
        		set.remove(num);
        	}else{
        		set.add(num);
        	}
        }
        Iterator<Integer> iterator = set.iterator();
        num1[0] = iterator.next();
        num2[0] = iterator.next();
    }
}
