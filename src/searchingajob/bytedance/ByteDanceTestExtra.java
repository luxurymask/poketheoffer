package searchingajob.bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ByteDanceTestExtra {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int m = in.nextInt();
		char[] array = s.toCharArray();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i = 0;i < s.length();i++){
			int numIndex = array[i] - 'a';
			if(map.containsKey(numIndex)){
				map.get(numIndex).add(i);
			}else{
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(numIndex, list);
			}
		}
		
		for(int i = 0;i < 26;i++){
			List<Integer> list = map.get(i);
			int money = m;
		}
	}
}
