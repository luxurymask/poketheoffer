package poketheoffer;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {
	public static int FirstNotRepeatingChar(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] bytes = str.toCharArray();
		for(char c : bytes){
			if(map.containsKey(c)){
				map.put(c, map.get(c) + 1);
			}else{
				map.put(c, 1);
			}
		}
		
		for(int i = 0;i < bytes.length;i++){
			if(map.containsKey(bytes[i]) && map.get(bytes[i]) == 1){
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
