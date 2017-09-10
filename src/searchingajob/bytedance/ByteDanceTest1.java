package searchingajob.bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ByteDanceTest1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n + 1];
		for(int i = 1;i <= n;i++){
			array[i] = in.nextInt();
		}
		Map<Integer, List<Integer>> map = new HashMap<>();
		
		for(int i = 1;i <= n;i++){
			int k = array[i];
			if(map.containsKey(k)){
				map.get(k).add(i);
			}else{
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(k, list);
			}
		}
		
		int q = in.nextInt();
		for(int i = 0;i < q;i++){
			int l = in.nextInt();
			int r = in.nextInt();
			int k = in.nextInt();
			int count = 0;
			if(!map.containsKey(k)){
				System.out.println(0);
			}else{
				List<Integer> list = map.get(k);
				for(int index : list){
					if(index >= l && index <= r) count++;
				}
				System.out.println(count);
			}
		}
	}
}
