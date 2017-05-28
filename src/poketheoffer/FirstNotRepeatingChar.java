package poketheoffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNotRepeatingChar {
	public static int FirstNotRepeatingChar(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set<Character> result = new HashSet<Character>();
		char[] bytes = str.toCharArray();
		for(char c : bytes){
			if(map.containsKey(c)){
				map.put(c, map.get(c) + 1);
			}else{
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			if(entry.getValue() == 1){
				result.add(entry.getKey());
			}
		}
		
		for(int i = 0;i < bytes.length;i++){
			if(result.contains(bytes[i])){
				return i;
			}
		}
		return -1;
    }
	
	public static void main(String[] args){
		String str = "google";
		System.out.println(FirstNotRepeatingChar(str));
	}
}
