package searchingajob.ZTE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 邀请n个人出席圆桌会议，每个人都有一个喜欢的人，并且只有被安排坐在喜欢的人身边才会出席。
 * 求最大出席人数。
 * 问题归约为有向图中寻找最大环。
 * @author liuxl
 */
public class ZTETest2 {
	public static int function(int n, int[] array){
		Set<Integer> set1 = new HashSet<>();
		int max = 0;
		int doubleCount = 0;
		
		for(int i = 0;i < n;i++){
			if(set1.contains(i + 1)) continue;
			int like = array[i];
			
			int count = 0;
			Map<Integer, Integer> map = new HashMap<>();
			while(!set1.contains(like)){
				set1.add(like);
				map.put(like, count);
				count++;
				like = array[like - 1];
			}
			count -= map.get(like);
			//TODO max == 2的情况，考虑能不能 + 1。测试用例：4， 2 3 4 3  应输出3。
			if(max < count) max = count;
		}
		return max;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for(int i = 0;i < n;i++){
			array[i] = in.nextInt();
		}
		System.out.println(function(n, array));
	}
}
