package searchingajob.bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ByteDanceTest2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int c = in.nextInt();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i = 0;i < n;i++){
			int num_i = in.nextInt();
			for(int j = 0;j < num_i;j++){
				int color = in.nextInt();
				if(map.containsKey(color)){
					map.get(color).add(i);
				}else{
					List<Integer> list = new ArrayList<>();
					list.add(i);
					map.put(color, list);
				}
			}
		}
		
		int count = 0;
		Map<Integer, Boolean> resultMap = new HashMap<>();
		for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
			int color = entry.getKey();
			List<Integer> list = entry.getValue();
			int last = list.get(0);
			int current;
			for(int k = 1;k < list.size();k++){
				current = list.get(k);
				if(current - last < m || last + n - current < m && !resultMap.containsKey(color)){
					count++;
					resultMap.put(color, true);
					break;
				}
				last = current;
			}
		}
		System.out.println(count);
	}
}
